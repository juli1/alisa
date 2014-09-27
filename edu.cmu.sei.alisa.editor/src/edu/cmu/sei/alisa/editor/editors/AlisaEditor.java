package edu.cmu.sei.alisa.editor.editors;

import java.io.IOException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.ResourceUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

import edu.cmu.alisa.sei.utils.AlisaDebug;
import edu.cmu.alisa.sei.utils.Utils;
import edu.cmu.sei.alisa.AlisaStandaloneSetup;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.ExternalDocuments;
import edu.cmu.sei.alisa.alisa.Goals;
import edu.cmu.sei.alisa.alisa.RequirementDocument;
import edu.cmu.sei.alisa.alisa.Requirements;
import edu.cmu.sei.alisa.alisa.Stakeholders;
import edu.cmu.sei.alisa.alisa.VerificationLibrary;
import edu.cmu.sei.alisa.editor.utils.AlisaDocumentedRequirementsContentProvider;
import edu.cmu.sei.alisa.editor.utils.AlisaEditorCellModifier;
import edu.cmu.sei.alisa.editor.utils.AlisaExternalDocumentsContentProvider;
import edu.cmu.sei.alisa.editor.utils.AlisaGoalsContentProvider;
import edu.cmu.sei.alisa.editor.utils.AlisaLabelProvider;
import edu.cmu.sei.alisa.editor.utils.AlisaRequirementsContentProvider;
import edu.cmu.sei.alisa.editor.utils.AlisaStakeholdersContentProvider;
import edu.cmu.sei.alisa.editor.utils.AlisaTableFilter;
import edu.cmu.sei.alisa.editor.utils.AlisaTextEditor;
import edu.cmu.sei.alisa.editor.utils.AlisaVerificationActivitiesContentProvider;

public class AlisaEditor extends MultiPageEditorPart implements IResourceChangeListener {

	private boolean isPageModified;

	/**
	 * Number of table viewers
	 */
	public static final int INDEX_TABLE_VERIFICATION_ACTIVITIES = 5;
	public static final int INDEX_TABLE_EXTERNAL_DOCUMENTS = 4;
	public static final int INDEX_TABLE_DOCUMENTED_REQUIREMENTS = 3;
	public static final int INDEX_TABLE_REQUIREMENTS = 2;
	public static final int INDEX_TABLE_GOALS = 1;
	public static final int INDEX_TABLE_STAKEHOLDERS = 0;
	public static final String[] TABLE_NAMES = { "Stakeholders", "Goals", "Requirements", "Documented Requirements",
			"External Documents", "Verification Activity" };
	public static final int NB_TABLE_VIEWERS = TABLE_NAMES.length;
	public static final int INDEX_SOURCE = 6;

	String[] columnsNamesStakeholders = { "Name", "Title", "Description", "Role" };
	String[] columnsNamesGoals = { "ID", "For", "Title", "Description", "Assertion", "Rationale", "Issues",
			"Assigned To", "Decomposes" };
	String[] columnsNamesRequirements = { "Kind", "ID", "For", "Title", "Description", "Assertion", "Rationale",
			"Issues", "Decomposes" };
	String[] columnsNamesDocumentedRequirements = { "ID", "Title", "Description", "Comment", "Assigned To",
			"Decomposed by" };
	String[] columnsNamesExternalDocuments = { "Name", "External Reference" };
	String[] columnsNamesVerificationActivities = { "ID", "Title", "Description", "Method", "Assigned To" };

	/** The text editor used in page 0. */
	protected AlisaTextEditor editor;

	/** The table viewer used in page 1. */
	protected TableViewer[] tableViewers = new TableViewer[NB_TABLE_VIEWERS];

	private Menu tableHeaderMenu;

	private AlisaModel alisaModel = null;

	public TableViewer getTableViewer(int id) {
		return tableViewers[id];
	}

	/**
	 * Creates a multi-page editor example.
	 */
	public AlisaEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}

	public AlisaTextEditor getTextualEditor() {
		return editor;
	}

	/**
	 * Creates the pages of the multi-page editor.
	 *
	 * @see org.eclipse.ui.part.MultiPageEditorPart#createPages()
	 */
	protected void createPages() {
		try {
			createStakeholderPage();
			createGoalsPage();
			createRequirementsPage();
			createRequirementDocumentPage();
			createExternalDocumentsPage();
			createVerificationActivitiesPage();
			createSourcePage();
			updateTitle();
			populateTablePage();
		} catch (Exception e) {
			System.err.println(e);
			e.printStackTrace();
		}
	}

	public void updateTextualEditor() {
		this.firePropertyChange(PROP_DIRTY);
		this.editor.setInput(getEditorInput());
		this.firePropertyChange(PROP_DIRTY);

//		Injector injector = Guice.createInjector(new  AlisaRuntimeModule());  
//		Serializer serializer = injector.getInstance(Serializer.class);  
//		String s = serializer.serialize(getRootObject());  
//    	editor.getDocumentProvider().getDocument(editor.getEditorInput()).set(s);
	}

	/**
	 * Creates page 0 of the multi-page editor, which contains a text editor.
	 */
	private void createSourcePage() {
		try {
			editor = new AlisaTextEditor();

			addPage(editor, getEditorInput());
			setPageText(INDEX_SOURCE, "Alisa Textual");
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(), "Error creating nested text editor", null, e.getStatus());
		}
	}

	private void createTablePage(final int index) {
		Composite parent = getContainer();

		// XXX move all the creation into its own component
		Canvas canvas = new Canvas(parent, SWT.None);

		GridLayout layout = new GridLayout(5, false);
		canvas.setLayout(layout);

		// create the header part with the search function and Add/Delete rows
		Label searchLabel = new Label(canvas, SWT.NONE);
		searchLabel.setText("Filter: ");
		final Text searchText = new Text(canvas, SWT.BORDER | SWT.SEARCH);
		searchText.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));

		/**
		 * Ability to add a new object into the model.
		 */
		Button add = new Button(canvas, SWT.PUSH | SWT.CENTER);
		add.setText("Add New");
		add.setToolTipText("Add a new row");
		GridData buttonAddGridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		buttonAddGridData.widthHint = 80;
		add.setLayoutData(buttonAddGridData);
		add.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				/**
				 * depending on which page is selected, we
				 * add the appropriate object into the Alisa Model.
				 */
				switch (getActivePage()) {
				case INDEX_TABLE_GOALS: {

					Utils.addNewGoal(getGoals());
					break;
				}
				case INDEX_TABLE_REQUIREMENTS: {

					Utils.addNewRequirement(getRequirements());
					break;
				}
				case INDEX_TABLE_DOCUMENTED_REQUIREMENTS: {

					Utils.addNewDocumentedRequirement(getReqDoc());
					break;
				}
				case INDEX_TABLE_EXTERNAL_DOCUMENTS: {

					Utils.addNewExternalDocument(getExternalDocuments());
					break;
				}
				case INDEX_TABLE_STAKEHOLDERS: {
					Utils.addNewStakeholder(getStakeholders());
					break;
				}
				case INDEX_TABLE_VERIFICATION_ACTIVITIES: {
					Utils.addNewVerificationActivity(getVerificationLibrary());
					break;
				}
				}
				updateTables();
			}
		});

		/**
		 * Add the delete button to remove the selected item
		 * from the requirements content.
		 */
		Button delete = new Button(canvas, SWT.PUSH | SWT.CENTER);
		delete.setText("Delete");
		delete.setToolTipText("Delete the current row");
		GridData buttonDelGridData = new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING);
		buttonDelGridData.widthHint = 80;
		delete.setLayoutData(buttonDelGridData);
		delete.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				Object o = ((IStructuredSelection) tableViewers[getActivePage()].getSelection()).getFirstElement();
				if (o != null && o instanceof EObject) {
					Utils.deleteObjectFromModel((EObject) o);
					updateTables();
				}
			}
		});

		tableViewers[index] = new TableViewer(canvas, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION
				| SWT.BORDER);
		tableViewers[index].setUseHashlookup(true);
		final Table table = tableViewers[index].getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);

		final AlisaTableFilter tableFilter = new AlisaTableFilter();
		tableViewers[index].addFilter(tableFilter);

		searchText.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent ke) {
				tableFilter.setSearchText(searchText.getText());
				String filterText = searchText.getText();
				for (int i = 0; i < tableViewers[index].getColumnProperties().length; i++) {
					CellLabelProvider labelProvider = tableViewers[index].getLabelProvider(i);
					((AlisaLabelProvider) labelProvider).setSearchText(filterText);
				}
				tableViewers[index].refresh();
			}
		});

		// Layout the viewer
		GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 5;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		tableViewers[index].getControl().setLayoutData(gridData);

		addPage(canvas);
		setPageText(index, TABLE_NAMES[index]);
	}

	private void createStakeholderPage() {
		createTablePage(INDEX_TABLE_STAKEHOLDERS);
	}

	private void createRequirementDocumentPage() {
		createTablePage(INDEX_TABLE_DOCUMENTED_REQUIREMENTS);
	}

	private void createRequirementsPage() {
		createTablePage(INDEX_TABLE_REQUIREMENTS);
	}

	private void createGoalsPage() {
		createTablePage(INDEX_TABLE_GOALS);
	}

	private void createExternalDocumentsPage() {
		createTablePage(INDEX_TABLE_EXTERNAL_DOCUMENTS);
	}

	private void createVerificationActivitiesPage() {
		createTablePage(INDEX_TABLE_VERIFICATION_ACTIVITIES);
	}

	/**
	 * Set Name of the file to the tab
	 */
	private void updateTitle() {
		IEditorInput input = getEditorInput();
		setPartName(input.getName());
		setTitleToolTip(input.getToolTipText());
	}

	private void populateTablePage() throws Exception {
		for (int i = 0; i < NB_TABLE_VIEWERS; i++) {
			populateTablePage(i);
		}
	}

	private void populateTablePage(final int index) throws Exception {
		switch (index) {
		case INDEX_TABLE_DOCUMENTED_REQUIREMENTS: {
			AlisaDebug.debug("[AlisaEditor] set content provider for documented requirements");
			tableViewers[index].setContentProvider(new AlisaDocumentedRequirementsContentProvider());
			break;
		}

		case INDEX_TABLE_STAKEHOLDERS: {
			AlisaDebug.debug("[AlisaEditor] set content provider for stakeholders");
			tableViewers[index].setContentProvider(new AlisaStakeholdersContentProvider());
			break;
		}

		case INDEX_TABLE_VERIFICATION_ACTIVITIES: {
			AlisaDebug.debug("[AlisaEditor] set content provider for verification activities");
			tableViewers[index].setContentProvider(new AlisaVerificationActivitiesContentProvider());
			break;
		}

		case INDEX_TABLE_REQUIREMENTS: {
			AlisaDebug.debug("[AlisaEditor] set content provider for requirements");
			tableViewers[index].setContentProvider(new AlisaRequirementsContentProvider());
			break;
		}

		case INDEX_TABLE_GOALS: {
			AlisaDebug.debug("[AlisaEditor] set content provider for goals");
			tableViewers[index].setContentProvider(new AlisaGoalsContentProvider());
			break;
		}

		case INDEX_TABLE_EXTERNAL_DOCUMENTS: {
			AlisaDebug.debug("[AlisaEditor] set content provider for external documents");
			tableViewers[index].setContentProvider(new AlisaExternalDocumentsContentProvider());
			break;
		}

		}

		// make the selection available
		getSite().setSelectionProvider(tableViewers[index]);

		tableViewers[index].getTable().getDisplay().asyncExec(new Runnable() {
			public void run() {
				updateTableFromTextEditor(index);
			}
		});
	}

	public RequirementDocument getReqDoc() {
		AlisaModel model = getRootObject(false);
		EList<EObject> content = model.getContent();
		for (EObject res : content) {
			if (res instanceof RequirementDocument) {
				return (RequirementDocument) res;
			}
		}
		RequirementDocument reqdoc = Utils.createReqDoc(model);
		reqdoc.setName("new req doc");
		return reqdoc;
	}

	public Goals getGoals() {
		AlisaModel model = getRootObject(false);
		EList<EObject> content = model.getContent();
		for (EObject res : content) {
			if (res instanceof Goals) {
				return (Goals) res;
			}
		}
		Goals goals = Utils.createGoals(model);
		goals.setName("new goals");
		return goals;
	}

	private static int NEW_REQS_ID = 1;

	public Requirements getRequirements() {
		AlisaModel model = getRootObject(false);
		EList<EObject> content = model.getContent();
		for (EObject res : content) {
			if (res instanceof Requirements) {
				return (Requirements) res;
			}
		}
		Requirements reqs = Utils.createRequirements(model);
		reqs.setName("new_requirements" + NEW_REQS_ID++);
		return reqs;
	}

	private static int NEW_XDOCS_ID = 1;

	public ExternalDocuments getExternalDocuments() {
		AlisaModel model = getRootObject(false);
		EList<EObject> content = model.getContent();
		for (EObject res : content) {
			if (res instanceof ExternalDocuments) {
				return (ExternalDocuments) res;
			}
		}
		ExternalDocuments xdocs = Utils.createExternalDocuments(model);
		xdocs.setName("new_external_documents" + NEW_XDOCS_ID++);
		return xdocs;
	}

	private static int NEW_ORG_ID = 1;

	public Stakeholders getStakeholders() {
		AlisaModel model = getRootObject(false);
		EList<EObject> content = model.getContent();
		for (EObject res : content) {
			if (res instanceof Stakeholders) {
				return (Stakeholders) res;
			}
		}
		Stakeholders sh = Utils.createStakeholders(model);
		sh.setName("new_organization" + NEW_ORG_ID++);
		return sh;
	}

	private static int NEW_VL_ID = 1;

	public VerificationLibrary getVerificationLibrary() {
		AlisaModel model = getRootObject(false);
		EList<EObject> content = model.getContent();
		for (EObject res : content) {
			if (res instanceof Stakeholders) {
				return (VerificationLibrary) res;
			}
		}
		VerificationLibrary sh = Utils.createVerificationLibrary(model);
		sh.setName("new_verification_library" + NEW_VL_ID++);
		return sh;
	}

	public AlisaModel getRootObject() {
		return getRootObject(false);
	}

	public AlisaModel getRootObject(boolean force) {
		if ((alisaModel == null) || force) {
			new AlisaStandaloneSetup().createInjectorAndDoEMFRegistration();

			ResourceSet rs = new ResourceSetImpl();

			IResource rsrc = ResourceUtil.getResource(getEditorInput());
			Resource resource = rs.getResource(URI.createURI(rsrc.getLocationURI().toString()), true);
			EObject eobject = resource.getContents().get(0);
			AlisaDebug.debug("[AlisaEditor] eobject=" + eobject);

			if (eobject instanceof AlisaModel) {
				alisaModel = (AlisaModel) eobject;
			}
		}

		return alisaModel;
	}

	/**
	 *
	 */
	public void updateTable(int index) {
		tableViewers[index].refresh();
		AlisaDebug.debug("[AlisaEditor] try to udpate table " + index);

		firePropertyChange(IEditorPart.PROP_DIRTY);
		editor.validateEditorInputState();
	}

	public void updateTables() {
		for (int i = 0; i < NB_TABLE_VIEWERS; i++) {
			updateTable(i);
		}
		editor.update();
		editor.setInput(getEditorInput());
	}

	private int getNbColumns(int index) {
		switch (index) {
		case INDEX_TABLE_REQUIREMENTS: {
			return columnsNamesRequirements.length;
		}
		case INDEX_TABLE_STAKEHOLDERS: {
			return columnsNamesStakeholders.length;
		}
		case INDEX_TABLE_VERIFICATION_ACTIVITIES: {
			return columnsNamesVerificationActivities.length;
		}

		case INDEX_TABLE_DOCUMENTED_REQUIREMENTS: {
			return columnsNamesDocumentedRequirements.length;
		}

		case INDEX_TABLE_GOALS: {
			return columnsNamesGoals.length;
		}

		case INDEX_TABLE_EXTERNAL_DOCUMENTS: {
			return columnsNamesExternalDocuments.length;
		}

		default: {
			return 0;
		}
		}
	}

	private String[] getColumnName(int index) {
		String[] columnsEmpty = {};

		switch (index) {
		case INDEX_TABLE_REQUIREMENTS: {
			return columnsNamesRequirements;
		}

		case INDEX_TABLE_STAKEHOLDERS: {
			return columnsNamesStakeholders;
		}

		case INDEX_TABLE_VERIFICATION_ACTIVITIES: {
			return columnsNamesVerificationActivities;
		}

		case INDEX_TABLE_DOCUMENTED_REQUIREMENTS: {
			return columnsNamesDocumentedRequirements;
		}

		case INDEX_TABLE_GOALS: {
			return columnsNamesGoals;
		}

		case INDEX_TABLE_EXTERNAL_DOCUMENTS: {
			return columnsNamesExternalDocuments;
		}

		default: {
			return columnsEmpty;
		}
		}
	}

	/**
	 *
	 */
	private void updateTableFromTextEditor(int index) {
		int nbColumns = getNbColumns(index);
		String[] columnsNames = getColumnName(index);

		tableHeaderMenu = new Menu(tableViewers[index].getTable());
		TableColumn[] columns = tableViewers[index].getTable().getColumns();

		if (columns.length == 0) {
			// create columns
			for (int i = 0; i < nbColumns; i++) {
				final TableViewerColumn column = new TableViewerColumn(tableViewers[index], SWT.LEFT);
				final int idx = i;
				column.getColumn().setText(columnsNames[i]);
				column.getColumn().setWidth(100);
				column.getColumn().setResizable(true);
				column.getColumn().setMoveable(true);
				column.setLabelProvider(new AlisaLabelProvider());
				addMenuItemToColumn(column.getColumn(), idx);
			}
		}

		tableViewers[index].setInput(getRootObject());
		defineCellEditing(index);
	}

	private void defineCellEditing(int index) {
		String[] columnProperties = new String[getNbColumns(index)];
		CellEditor[] cellEditors = new CellEditor[getNbColumns(index)];

		for (int i = 0; i < getNbColumns(index); i++) {
			columnProperties[i] = Integer.toString(i);
			cellEditors[i] = new TextCellEditor(tableViewers[index].getTable());
		}

		tableViewers[index].setColumnProperties(columnProperties);

		// XXX can be replaced by tableViewer.setEditingSupport()
		tableViewers[index].setCellEditors(cellEditors);
		tableViewers[index].setCellModifier(new AlisaEditorCellModifier(this));

	}

	/**
	 * @param column
	 * @param index
	 */
	private void addMenuItemToColumn(final TableColumn column, final int index) {
		// create menu item
		final MenuItem itemName = new MenuItem(tableHeaderMenu, SWT.CHECK, index);
		itemName.setText(column.getText());
		itemName.setSelection(column.getResizable());
		itemName.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				if (itemName.getSelection()) {
					column.setWidth(100);
					column.setResizable(true);
				} else {
					column.setWidth(0);
					column.setResizable(false);
				}
			}
		});

	}

	/**
	 * The <code>MultiPageEditorPart</code> implementation of this
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * This method is automatically called when the editor is closed
	 * and marks the end of the editor's life cycle.
	 * It cleans up any platform resources, such as images, clipboard,
	 * and so on, which were created by this class.
	 *
	 * @see org.eclipse.ui.part.MultiPageEditorPart#dispose()
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		super.dispose();
	}

	/**
	 * Saves the multi-page editor's document.
	 * If the save is successful, the part should fire a property
	 * changed event (PROP_DIRTY property), reflecting the new dirty state.
	 * If the save is canceled via user action, or for any other reason,
	 * the part should invoke setCanceled on the IProgressMonitor to
	 * inform the caller
	 *
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void doSave(IProgressMonitor monitor) {

		if (getActivePage() == INDEX_SOURCE) {
			/* Force reload of the root object */

			editor.doSave(monitor);
			getRootObject(true);
			updateTableFromTextEditor(INDEX_TABLE_DOCUMENTED_REQUIREMENTS);
			updateTableFromTextEditor(INDEX_TABLE_REQUIREMENTS);
			updateTableFromTextEditor(INDEX_TABLE_GOALS);
			updateTableFromTextEditor(INDEX_TABLE_EXTERNAL_DOCUMENTS);
			updateTableFromTextEditor(INDEX_TABLE_STAKEHOLDERS);
			updateTableFromTextEditor(INDEX_TABLE_VERIFICATION_ACTIVITIES);
		} else {
//    		Injector injector = Guice.createInjector(new  AlisaRuntimeModule());  
//    		Serializer serializer = injector.getInstance(Serializer.class);  
//    		String s = serializer.serialize(getRootObject());  
//    		AlisaDebug.debug("[AlisaEditor] editor input = " + getEditorInput());
//    		AlisaDebug.debug("[AlisaEditor] new model = " + s);
			EObject rootObject = getRootObject();
			ResourceSet rs = new ResourceSetImpl();
			IResource rsrc = ResourceUtil.getResource(getEditorInput());
			Resource resource = rs.getResource(URI.createURI(rsrc.getLocationURI().toString()), true);
			for (int i = 0; i < resource.getContents().size(); i++) {
				resource.getContents().remove(i);
			}
			AlisaDebug.debug("[AlisaEditor] trying to save");
			resource.getContents().add(rootObject);
			try {
				resource.save(null);
			} catch (IOException e) {
				AlisaDebug.debug("[AlisaEditor] exception when trying to save");
//				e.printStackTrace();
			}

		}
		// TODO flush commandstack
//		this.getEdomain.getCommandStack().flush();			
//		if (this.dirty != dirty) {
//			this.dirty = dirty;
//			editorDirtyStateChanged();
//		}

	}

	/**
	 * Returns whether the "Save As" operation is supported by this part.
	 *
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * Saves the multi-page editor's document as another file. Also updates the
	 * text for page 0's tab, and updates this multi-page editor's input to
	 * correspond to the nested editor's.
	 *
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	public void doSaveAs() {
//        if (getActivePage() == indexTBL && isPageModified) {
//            updateTextEditorFromTable();
//        } else {
//            updateTableFromTextEditor();
//        }
//
//        isPageModified = false;

		editor.doSaveAs();
		setInput(editor.getEditorInput());
		updateTitle();
	}

	/**
	 * Initializes this editor with the given editor site and input.
	 * This method is automatically called shortly after editor construction;
	 * it marks the start of the editor's lifecycle.

	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 *
	 * @see org.eclipse.ui.part.MultiPageEditorPart#init(org.eclipse.ui.IEditorSite, org.eclipse.ui.IEditorInput)
	 */
	public void init(IEditorSite site, IEditorInput editorInput) throws PartInitException {
		/*
		 * String message = "Input is " + editorInput + " of instance " + editorInput.getClass().getName();
		 * IStatus status = new Status(IStatus.ERROR, "csvedit", IStatus.ERROR, message, null);
		 * Activator.getDefault().getLog().log(status);
		 */

		/*
		 * if (!(editorInput instanceof IFileEditorInput))
		 * throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		 */
		super.init(site, editorInput);
	}

	/**
	 * @see org.eclipse.ui.part.MultiPageEditorPart#handlePropertyChange(int)
	 */
	protected void handlePropertyChange(int propertyId) {
		if (propertyId == IEditorPart.PROP_DIRTY)
			isPageModified = isDirty();
		isPageModified = true;
		super.handlePropertyChange(propertyId);
	}

	/**
	 * @see org.eclipse.ui.part.MultiPageEditorPart#isDirty()
	 */
	public boolean isDirty() {
		return isPageModified || super.isDirty();
	}

	/**
	 * Calculates the contents of page 2 when the it is activated.
	 *
	 * @see org.eclipse.ui.part.MultiPageEditorPart#pageChange(int)
	 */
	protected void pageChange(int newPageIndex) {
//        switch (newPageIndex) {
//            case indexSRC :
//                if (isDirty())
//                    updateTextEditorFromTable();
//                break;
//            case indexTBL :
//                if (isDirty())
//                    updateTableFromTextEditor();
//                break;
//            }
//        isPageModified = false;
		super.pageChange(newPageIndex);
	}

	/**
	 * should update the text of the textual editor.
	 * we should see how to make use of the xtext
	 * editor.
	 */
	private void updateTextEditorFromTable() {
		/**
		 * old code but we have to replace with the xtext
		 * editor.
		 */
//        editor
//           .getDocumentProvider()
//           .getDocument(editor.getEditorInput())
//           .set(((AbstractAlisaFile) tableViewer.getInput()).getTextRepresentation());
	}

	/**
	 * When the focus shifts to the editor, this method is called;
	 * it must then redirect focus to the appropriate editor based
	 * on which page is currently selected.
	 *
	 * @see org.eclipse.ui.part.MultiPageEditorPart#setFocus()
	 */
	public void setFocus() {
		switch (getActivePage()) {
		case INDEX_SOURCE:
			editor.setFocus();
			break;
		default:
			tableViewers[getActivePage()].getTable().setFocus();
			break;
		}
	}

	/**
	 * Closes all project files on project close.
	 *
	 * @see org.eclipse.core.resources.IResourceChangeListener#resourceChanged(org.eclipse.core.resources.IResourceChangeEvent)
	 */
	public void resourceChanged(final IResourceChangeEvent event) {

		if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i < pages.length; i++) {
						if (((FileEditorInput) editor.getEditorInput()).getFile().getProject()
								.equals(event.getResource())) {
							IEditorPart editorPart = pages[i].findEditor(editor.getEditorInput());
							pages[i].closeEditor(editorPart, true);
						}
					}
				}
			});
		}
	}

}
