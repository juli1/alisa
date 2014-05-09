/* Copyright 2011 csvedit
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.cmu.sei.alisa.editor.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;


public class AlisaStakeholdersContentProvider implements IStructuredContentProvider {

	
	
    /**
     * Returns the elements to display in the table viewer
     *
     * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
     */
    public Object[] getElements(Object element)
    {
    	List<Stakeholder> stakeholders = new ArrayList<Stakeholder>();
    	AlisaDebug.debug ("[AlisaStakeholdersContentProvider] element=" + element);
   
    	if (element instanceof AlisaModel)
    	{
    		AlisaModel am = (AlisaModel) element;
    		for (Object o : am.getContent())
    		{
    			if (o instanceof Stakeholder)
    			{
    				stakeholders.add((Stakeholder)o);
    			}
    		}
    	}
        return stakeholders.toArray();
    }

    /**
     * @see org.eclipse.jface.viewers.IContentProvider#dispose()
     */
    public void dispose() {
    }


    public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
    }
}