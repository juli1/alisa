package edu.cmu.sei.alisa.analysis.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import edu.cmu.sei.alisa.analysis.Activator;

public class PreferencesPage extends FieldEditorPreferencePage implements
IWorkbenchPreferencePage {

	private TabFolder folder;

	public PreferencesPage() {
		super(GRID);
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Alisa configuration page");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of the common
	 * GUI blocks needed to manipulate various types of preferences. Each field
	 * editor knows how to save and restore itself.
	 */
	public void createFieldEditors() {

		// First tab: configuration of Ocarina	
		addTab("Word Import");

		addField(new StringFieldEditor(PreferenceConstants.HEADER1,
				"&Header 1:", getFieldEditorParent()));
		
		addField(new StringFieldEditor(PreferenceConstants.HEADER2,
				"&Header 2:", getFieldEditorParent()));

		addField(new StringFieldEditor(PreferenceConstants.HEADER3,
				"&Header 3:", getFieldEditorParent()));

		addField(new StringFieldEditor(PreferenceConstants.HEADER4,
				"&Header 4:", getFieldEditorParent()));

		addField(new StringFieldEditor(PreferenceConstants.HEADER5,
				"&Header 5:", getFieldEditorParent()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {
	}

	/**
	 * Adjust the layout of the field editors so that they are properly aligned.
	 */
//	protected void adjustGridLayout()
//	{
//		if (folder != null)
//		{
//			TabItem[] items = folder.getItems();
//			for (int j = 0; j < items.length; j++)
//			{
//				GridLayout layout = ((GridLayout) ((Composite) items[j].getControl()).getLayout());
//				layout.numColumns = 3;
//				layout.marginHeight = 5;
//				layout.marginWidth = 5;
//			}
//		}
//
//		// need to call super.adjustGridLayout() since fieldEditor.adjustForNumColumns() is protected
//		super.adjustGridLayout();
//
//		// reset the main container to a single column
//		((GridLayout) super.getFieldEditorParent().getLayout()).numColumns = 1;
//	}

	/**
	 * Returns a parent composite for a field editor.
	 * <p>
	 * This value must not be cached since a new parent may be created each time this method called. Thus this method
	 * must be called each time a field editor is constructed.
	 * </p>
	 * @return a parent
	 */
	protected Composite getFieldEditorParent()
	{
		if (folder == null || folder.getItemCount() == 0)
		{
			return super.getFieldEditorParent();
		}
		return (Composite) folder.getItem(folder.getItemCount() - 1).getControl();
	}

	/**
	 * Adds a tab to the page.
	 * @param text the tab label
	 */
	public void addTab(String text)
	{
		if (folder == null)
		{
			// initialize tab folder
			folder = new TabFolder(super.getFieldEditorParent(), SWT.NONE);
			folder.setLayoutData(new GridData(GridData.FILL_BOTH));
		}

		TabItem item = new TabItem(folder, SWT.NONE);
		item.setText(text);

		Composite currentTab = new Composite(folder, SWT.NULL);
		GridLayout layout = new GridLayout();
		currentTab.setLayout(layout);
		currentTab.setFont(super.getFieldEditorParent().getFont());
		currentTab.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		item.setControl(currentTab);
	}


}