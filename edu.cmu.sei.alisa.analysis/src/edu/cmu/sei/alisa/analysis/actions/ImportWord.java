/*
 * Copyright 2014 Carnegie Mellon University
 * 

 * Any opinions, findings and conclusions or recommendations expressed in this 
 * Material are those of the author(s) and do not necessarily reflect the 
 * views of the United States Department of Defense. 

 * NO WARRANTY. THIS CARNEGIE MELLON UNIVERSITY AND SOFTWARE ENGINEERING 
 * INSTITUTE MATERIAL IS FURNISHED ON AN �AS-IS� BASIS. CARNEGIE MELLON 
 * UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESSED OR IMPLIED, 
 * AS TO ANY MATTER INCLUDING, BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR 
 * PURPOSE OR MERCHANTABILITY, EXCLUSIVITY, OR RESULTS OBTAINED FROM USE OF 
 * THE MATERIAL. CARNEGIE MELLON UNIVERSITY DOES NOT MAKE ANY WARRANTY OF 
 * ANY KIND WITH RESPECT TO FREEDOM FROM PATENT, TRADEMARK, OR COPYRIGHT 
 * INFRINGEMENT.
 * 
 * This Material has been approved for public release and unlimited 
 * distribution except as restricted below. 
 * 
 * This Material is provided to you under the terms and conditions of the 
 * Eclipse Public License Version 1.0 ("EPL"). A copy of the EPL is 
 * provided with this Content and is also available at 
 * http://www.eclipse.org/legal/epl-v10.html.
 * 
 * Carnegie Mellon is registered in the U.S. Patent and Trademark 
 * Office by Carnegie Mellon University. 
 * 
 */

package edu.cmu.sei.alisa.analysis.actions;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.osgi.framework.Bundle;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.ResourceUtil;

import edu.cmu.alisa.utils.AlisaDebug;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.analysis.Activator;
import edu.cmu.sei.alisa.analysis.reqimport.WordImport;
import edu.cmu.sei.alisa.analysis.utils.Utils;
import edu.cmu.sei.alisa.editor.editors.AlisaEditor;


public final class ImportWord implements IWorkbenchWindowActionDelegate  {

	private String inputFile;
	private IWorkbenchWindow window;


	AlisaModel 				producedModel;

	public AlisaModel getModel ()
	{
		return this.producedModel;
	}
	
	public void setModel (AlisaModel am)
	{
		this.producedModel = am;
	}





	public void run(IAction action) 
	{
		final Display 		currentDisplay;
		final AlisaEditor   alisaEditor;
		IEditorPart 		editorPart;
		
		editorPart = window.getActivePage().getActiveEditor();
		
		
		if (editorPart instanceof AlisaEditor)
		{
			alisaEditor = (AlisaEditor) editorPart;
		}
		else
		{
			alisaEditor = null;
		}
		
		currentDisplay = PlatformUI.getWorkbench().getDisplay();

		currentDisplay.syncExec(new Runnable(){

			public void run() {
				IWorkbenchWindow window;
				Shell sh;


				window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				sh = window.getShell();

				FileDialog fd = new FileDialog(sh, SWT.OPEN);
				inputFile = fd.open();
				String parentDirectory = new File(inputFile).getParent();
				

			}});

		Job aadlGenerator = new Job("WORDIMPORT") {
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Importing the Word Requirement", 100);

				AlisaDebug.debug("ImportWord" , "import file " + inputFile);
				
				/**
				 * Import the Word file into a Alisa Model
				 */
				producedModel = WordImport.importFile(inputFile);

				
				/**
				 * Save the produced model into the current editor
				 */
	    		ResourceSet rs = new ResourceSetImpl();
	            IResource rsrc = ResourceUtil.getResource(alisaEditor.getEditorInput());
	            Resource resource = rs.getResource(URI.createURI(rsrc.getLocationURI().toString()), true);
	            for (int i = 0 ; i < resource.getContents().size() ; i++)
	            {
	            	resource.getContents().remove(i);
	            }
	            AlisaDebug.debug("[AlisaEditor] trying to save");
	            resource.getContents().add (producedModel);
	            try 
	            {
					resource.save(null);
				} 
	            catch (IOException e) 
				{
					AlisaDebug.debug ("[AlisaEditor] exception when trying to save");
//					e.printStackTrace();
				}

				Utils.refreshWorkspace(monitor);
				monitor.done();
				return Status.OK_STATUS;
			}
		};
		aadlGenerator.schedule();



	}

	public void selectionChanged(IAction action, ISelection selection) 
	{
		
	}


	
	public void dispose() 
	{

	}

	public void init(IWorkbenchWindow window) 
	{
		this.window = window;
	}


}
