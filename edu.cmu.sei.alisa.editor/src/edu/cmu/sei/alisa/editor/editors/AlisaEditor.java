package edu.cmu.sei.alisa.editor.editors;


import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
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
import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.xtext.ui.editor.XtextEditor;

import edu.cmu.sei.alisa.editor.utils.AlisaContentProvider;

/**
 * An example showing how to create a multi-page editor.
 * This example has 3 pages:
 * <ul>
 * <li>page 0 contains a nested text editor.
 * <li>page 1 allows you to change the font used in page 2
 * <li>page 2 shows the words in page 0 in sorted order
 * </ul>
 */
public class AlisaEditor extends MultiPageEditorPart implements IResourceChangeListener{

    private boolean isPageModified;

    public static final int NB_TABLE_VIEWERS    = 2;
    public static final int INDEX_SOURCE  	    = 2;
    public static final int INDEX_TABLE_REQUIREMENTS 	= 1;
    public static final int INDEX_TABLE_STAKEHOLDERS 	= 0;
    public static final String[] TABLE_NAMES = {"Stakeholders" , "Requirements"};
    /** The text editor used in page 0. */
    protected TextEditor editor;

    /** The table viewer used in page 1. */
    protected TableViewer[] tableViewers = new TableViewer[NB_TABLE_VIEWERS];

    private Menu tableHeaderMenu;



    /**
     * Creates a multi-page editor example.
     */
    public AlisaEditor () {
        super();
        ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
    
    }

    /**
     * Creates the pages of the multi-page editor.
     *
     * @see org.eclipse.ui.part.MultiPageEditorPart#createPages()
     */
    protected void createPages () {
        try {
            createStakeholderPage();
            createRequirementsPage();
//            createSourcePage();
            updateTitle();
            populateTablePage();
        } catch (Exception e) {
            System.err.println(e);
            e.printStackTrace();
        }
    }

    /**
     * Creates page 0 of the multi-page editor, which contains a text editor.
     */
    private void createSourcePage () {
        try {
            editor = new XtextEditor();
            editor.setInput(getEditorInput());
            addPage(editor, getEditorInput());
            setPageText(INDEX_SOURCE, "Alisa Textual");
        } catch (PartInitException e) {
            ErrorDialog.openError(getSite().getShell(), "Error creating nested text editor", null, e.getStatus());
        }
    } 

    
    private void createTablePage (int index) {
        Composite parent = getContainer();

        // XXX move all the creation into its own component
        Canvas canvas = new Canvas(parent, SWT.None);

        GridLayout layout = new GridLayout(5, false);
        canvas.setLayout(layout);

        // create the header part with the search function and Add/Delete rows
        Label searchLabel = new Label(canvas, SWT.NONE);
        searchLabel.setText("Filter: ");
        final Text searchText = new Text(canvas, SWT.BORDER | SWT.SEARCH);
        searchText.setLayoutData(
                new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));

        // Create and configure the buttons
        Button insert = new Button(canvas, SWT.PUSH | SWT.CENTER);
        insert.setText("Insert Row");
        insert.setToolTipText("Insert a new row before the current one");
        GridData buttonInsertGridData = new GridData (GridData.HORIZONTAL_ALIGN_BEGINNING);
        buttonInsertGridData.widthHint = 80;
        insert.setLayoutData(buttonInsertGridData);

        Button add = new Button(canvas, SWT.PUSH | SWT.CENTER);
        add.setText("Add Row");
        add.setToolTipText("Add a new row at the end of the file");
        GridData buttonAddGridData = new GridData (GridData.HORIZONTAL_ALIGN_BEGINNING);
        buttonAddGridData.widthHint = 80;
        add.setLayoutData(buttonAddGridData);


        Button delete = new Button(canvas, SWT.PUSH | SWT.CENTER);
        delete.setText("Delete Row");
        delete.setToolTipText("Delete the current row");
        GridData buttonDelGridData = new GridData (GridData.HORIZONTAL_ALIGN_BEGINNING);
        buttonDelGridData.widthHint = 80;
        delete.setLayoutData(buttonDelGridData);
       
        tableViewers[index] = new TableViewer(canvas,
                SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION |SWT.BORDER);
        tableViewers[index].setUseHashlookup(true);
        final Table table = tableViewers[index].getTable();
        table.setHeaderVisible(true);
        table.setLinesVisible(true);

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


    private void createStakeholderPage () {
    	createTablePage (INDEX_TABLE_STAKEHOLDERS);
    }
    
    private void createRequirementsPage () {
    	createTablePage (INDEX_TABLE_REQUIREMENTS);
    }
    

    /**
     * Set Name of the file to the tab
     */
    private void updateTitle () {
        IEditorInput input = getEditorInput();
        setPartName(input.getName());
        setTitleToolTip(input.getToolTipText());
    }

    private void populateTablePage () throws Exception {
    	for (int i = 0 ; i < NB_TABLE_VIEWERS ; i++)
    	{
    		populateTablePage(i);
    	}
    }
    
    private void populateTablePage (int index) throws Exception {
    	tableViewers[index].setContentProvider(new AlisaContentProvider());

        // make the selection available
        getSite().setSelectionProvider(tableViewers[index]);

        tableViewers[index].getTable().getDisplay().asyncExec(
                new Runnable() {
                    public void run() { updateTableFromTextEditor(); }
                }
        );
    }

    /**
     *
     */
    public void tableModified (int index) {
    	tableViewers[index].refresh();
        boolean wasPageModified = isPageModified;
        isPageModified = true;
        if (!wasPageModified) {
            firePropertyChange(IEditorPart.PROP_DIRTY);
            editor.validateEditorInputState(); // will invoke: FileModificationValidator.validateEdit() (expected by some repository providers)
       }
    }

    /**
     *
     */
    private void updateTableFromTextEditor () {
       
    }

 


    /**
     * @param column
     * @param index
     */
    private void addMenuItemToColumn (final TableColumn column, final int index) {
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
    public void dispose () {
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
    public void doSave (IProgressMonitor monitor) {
//        if (getActivePage() == indexRequirements && isPageModified) {
//            updateTextEditorFromTable();
//        } else {
//            updateTableFromTextEditor();
//        }
//
//        isPageModified = false;
        editor.doSave(monitor);
    }

    /**
     * Returns whether the "Save As" operation is supported by this part.
     *
     * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
     */
    public boolean isSaveAsAllowed () {
        return true;
    }

    /**
     * Saves the multi-page editor's document as another file. Also updates the
     * text for page 0's tab, and updates this multi-page editor's input to
     * correspond to the nested editor's.
     *
     * @see org.eclipse.ui.part.EditorPart#doSaveAs()
     */
    public void doSaveAs () {
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
    public void init (IEditorSite site, IEditorInput editorInput) throws PartInitException {
        /*
        String message = "Input is " + editorInput + " of instance " + editorInput.getClass().getName();
        IStatus status = new Status(IStatus.ERROR, "csvedit", IStatus.ERROR, message, null);
        Activator.getDefault().getLog().log(status);
        */

        /*
        if (!(editorInput instanceof IFileEditorInput))
            throw new PartInitException("Invalid Input: Must be IFileEditorInput");
        */
        super.init(site, editorInput);
    }

    /**
     * @see org.eclipse.ui.part.MultiPageEditorPart#handlePropertyChange(int)
     */
    protected void handlePropertyChange (int propertyId) {
        if (propertyId == IEditorPart.PROP_DIRTY)
            isPageModified = isDirty();
        super.handlePropertyChange(propertyId);
    }

    /**
     * @see org.eclipse.ui.part.MultiPageEditorPart#isDirty()
     */
    public boolean isDirty () {
        return isPageModified || super.isDirty();
    }

    /**
     * Calculates the contents of page 2 when the it is activated.
     *
     * @see org.eclipse.ui.part.MultiPageEditorPart#pageChange(int)
     */
    protected void pageChange (int newPageIndex) {
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
     *
     */
    private void updateTextEditorFromTable () {
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
    public void setFocus () 
    {
        switch (getActivePage()) 
        {
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
    public void resourceChanged (final IResourceChangeEvent event) {
        if (event.getType() == IResourceChangeEvent.PRE_CLOSE) {
            Display.getDefault().asyncExec(new Runnable() {
                public void run() {
                    IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
                    for (int i = 0; i < pages.length; i++) {
                        if (((FileEditorInput) editor.getEditorInput()).getFile().getProject().equals(event.getResource())) {
                            IEditorPart editorPart = pages[i].findEditor(editor.getEditorInput());
                            pages[i].closeEditor(editorPart, true);
                        }
                    }
                }
            });
        }
    }

}
