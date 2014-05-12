package edu.cmu.sei.alisa.analysis.actions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringBufferInputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.resource.IContainer;

import edu.cmu.alisa.utils.AlisaDebug;
import edu.cmu.alisa.utils.Utils;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDecomposition;
import edu.cmu.sei.alisa.analysis.utils.DialogUtils;
import edu.cmu.sei.alisa.analysis.utils.GeneratorCAE;
import edu.cmu.sei.alisa.analysis.wording.ErrorReport;
import edu.cmu.sei.alisa.editor.editors.AlisaEditor;


public class CheckWording implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	private static List<ErrorReport> reportedErrors;
	
	/**
	 * The constructor.
	 */
	public CheckWording() {
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
		IEditorInput editorInput;
		IEditorPart editorPart;
		AlisaModel model;
		
		reportedErrors 	= new ArrayList<ErrorReport>();
		requirement 	= null; 
		editor      	= null;
		editorPart  	= window.getActivePage().getActiveEditor();
		
		if ( ! (editorPart instanceof AlisaEditor))
		{			
			DialogUtils.showBasicDialog ("Check Wording Error", "You must select the Alisa Editor", window.getShell());
		}

		editor = (AlisaEditor) editorPart;
		model = editor.getRootObject();
		
		for (EObject obj : model.getContent())
		{
			if (obj instanceof Requirement)
			{
				checkRequirement ((Requirement)obj);
			}
		}
		
		if (reportedErrors.size() > 0)
		{
			boolean writeError = false;
			editorInput = editor.getEditorInput();
			AlisaDebug.debug("[CheckWording] editor input=" + editorInput);
			StringBuffer toWrite = new StringBuffer ();
			
			for (ErrorReport er : reportedErrors)
			{
				toWrite.append(er.getRequirementName() + "," + er.getReport() +"\n");
			}
			
			if (editorInput instanceof FileEditorInput)
			{
				FileEditorInput fei = (FileEditorInput) editorInput;
				IProject project = fei.getFile().getProject();
				AlisaDebug.debug("[CheckWording] project=" + project);

				IFile reportFile = project.getFile("wording-report.csv");
				
				try {
					reportFile.create(new StringBufferInputStream (toWrite.toString()), IResource.FORCE , null);
				}
				catch (CoreException e)
				{
					DialogUtils.showBasicDialog ("Check Wording Error", "Error when creating the file, check the file does not already exist", window.getShell());

					AlisaDebug.debug("[CheckWording] error when trying to write the report file: " + e.getMessage());
				}
			}
		}
		else
		{
			DialogUtils.showBasicDialog ("Check Wording Error", "No Wording Error was found", window.getShell());
		}
	} 
	
	public static void checkRequirement (Requirement req)
	{
		final String[] toAvoid = {"may", "added"};
		
		for (int i = 0 ; i < toAvoid.length ; i++)
		{
			if (req.getDescription() == null)
			{
				continue;
			}
			
			if(req.getDescription().toLowerCase().contains(toAvoid[i]))
			{
				ErrorReport report = new ErrorReport();
				report.setRequirementName(req.getName());
				report.setReport("cannot contain the word " + toAvoid[i]);
				reportedErrors.add(report);
			}
		}
	}
	
	public static void checkRequirementDecomposition (RequirementDecomposition dec)
	{
		if (dec.getElement() != null)
		{
			checkRequirement(dec.getElement());
		}
		else
		{
			if (dec.getLeft() != null)
			{
				checkRequirement(dec.getLeft());
			}
			
			if (dec.getRight() != null)
			{
				checkRequirementDecomposition(dec.getRight());
			}
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