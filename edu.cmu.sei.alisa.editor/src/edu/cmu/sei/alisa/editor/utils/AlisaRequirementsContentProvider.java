
package edu.cmu.sei.alisa.editor.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import edu.cmu.alisa.sei.utils.AlisaDebug;
import edu.cmu.sei.alisa.alisa.AlisaFactory;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.impl.AlisaFactoryImpl;


public class AlisaRequirementsContentProvider implements IStructuredContentProvider {

	
	
	
    /**
     * Returns the elements to display in the table viewer
     *
     * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
     */
    public Object[] getElements(Object element)
    {
    	List<Requirement> requirements = new ArrayList<Requirement>();
    	AlisaDebug.debug ("[AlisaRequirementsContentProvider] element=" + element);
   
    	if (element instanceof AlisaModel)
    	{
    		AlisaModel am = (AlisaModel) element;
    		for (Object o : am.getContent())
    		{
    			if (o instanceof Requirement)
    			{
    				requirements.add((Requirement)o);
    			}
    		}
    	}
        return requirements.toArray();
    }

    /**
     * @see org.eclipse.jface.viewers.IContentProvider#dispose()
     */
    public void dispose() {
    }


    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }
}
