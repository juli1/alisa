package edu.cmu.sei.alisa.analysis.utils;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public class Utils {
	public static IProject getSelectedProject() {
		IWorkbench workbench;
		IEditorInput editorInput;
		IWorkbenchWindow workbenchWindow;
		/**
		 * First, we try to get the editor, its file and associated input file.
		 */

		workbench = PlatformUI.getWorkbench();
		workbenchWindow = workbench.getActiveWorkbenchWindow();

		if ((workbench == null) || (workbenchWindow == null)) {

			workbenchWindow = workbench.getActiveWorkbenchWindow();

			return null;
		}

		editorInput = workbenchWindow.getActivePage().getActiveEditor().getEditorInput();
		if (editorInput instanceof FileEditorInput) {
			FileEditorInput fei = (FileEditorInput) editorInput;
			return fei.getFile().getProject();
		}

		/**
		 * We try to find with a structured selection
		 */
		ISelection selection;

		selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getSelection();
		if (selection != null) {
			try {
				if (selection instanceof IStructuredSelection) {
					if (selection instanceof ITreeSelection) {
						TreeSelection treeSelection = (TreeSelection) selection;
						TreePath[] treePaths = treeSelection.getPaths();
						TreePath treePath = treePaths[0];

						Object lastSegmentObj = treePath.getLastSegment();

						if (lastSegmentObj instanceof IFile
								&& (((IFile) lastSegmentObj).getFileExtension()).equalsIgnoreCase("rdal")) {
							return null;
						}

					}
				}
			} catch (NullPointerException npe) {
				npe.printStackTrace();
			}
		}
		return null;
	}

	public static void refreshWorkspace(IProgressMonitor monitor) {
		for (IProject ip : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			try {
				ip.refreshLocal(IResource.DEPTH_INFINITE, monitor);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
