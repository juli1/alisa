package edu.cmu.sei.alisa.analysis.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.editor.editors.AlisaEditor;

public class GenerateCAE implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;

	/**
	 * The constructor.
	 */
	public GenerateCAE() {
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void run(IAction action) {
		AlisaEditor editor;
		Requirement requirement;

		requirement = null;
		editor = null;
		IEditorPart editorPart = window.getActivePage().getActiveEditor();

		if (editorPart instanceof AlisaEditor) {
			editor = (AlisaEditor) editorPart;
		}

		if (editor != null) {
			Object o = ((IStructuredSelection) (editor.getTableViewer(AlisaEditor.INDEX_TABLE_REQUIREMENTS)
					.getSelection())).getFirstElement();
			if (o instanceof Requirement) {
				requirement = (Requirement) o;
			}
		}

		if (requirement == null) {
			MessageBox dialog = new MessageBox(window.getShell(), SWT.OK);
			dialog.setText("Alisa CAE Generator");
			dialog.setMessage("You must select a requirement");
			dialog.open();
		} else {
//			GeneratorCAE.init();
//			GeneratorCAE.generate (null, requirement);
//			GeneratorCAE.save(edu.cmu.sei.alisa.analysis.utils.Utils.getSelectedProject());
//			AlisaDebug.debug("[GenerateCAE] selected requirement=" + requirement);
		}

	}

	/**
	 * Selection in the workbench has been changed. We 
	 * can change the state of the 'real' action here
	 * if we want, but this can only happen after 
	 * the delegate has been created.
	 * @see IWorkbenchWindowActionDelegate#selectionChanged
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

	/**
	 * We can use this method to dispose of any system
	 * resources we previously allocated.
	 * @see IWorkbenchWindowActionDelegate#dispose
	 */
	public void dispose() {
	}

	/**
	 * We will cache window object in order to
	 * be able to provide parent shell for the message dialog.
	 * @see IWorkbenchWindowActionDelegate#init
	 */
	public void init(IWorkbenchWindow window) {
		this.window = window;
	}
}