package edu.cmu.sei.alisa.editor.utils;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.TextEditor;

public class AlisaTextEditor extends TextEditor{


	    public AlisaTextEditor()
	    {
	    }
	    
	    public void update ()
	    {
		
			IEditorInput input = this.getEditorInput();
			if(input instanceof IFileEditorInput)
			{
				IFileEditorInput fileInput = (IFileEditorInput) input;
				try {
					fileInput.getFile().refreshLocal(IResource.DEPTH_INFINITE, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			setInput(input);
	    }
	
}
