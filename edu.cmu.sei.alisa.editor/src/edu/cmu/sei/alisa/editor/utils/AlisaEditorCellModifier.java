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

import org.eclipse.jface.viewers.ICellModifier;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.ui.IEditorPart;

import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.editor.editors.AlisaEditor;

/**
 *
 * @author fhenri
 *
 */
public class AlisaEditorCellModifier implements ICellModifier {
	private AlisaEditor alisaEditor;
	
	public AlisaEditorCellModifier (AlisaEditor editor)
	{
		super ();
		this.alisaEditor = editor;
	}
	
	
    /**
     * Checks whether the given property of the given element can be modified.
     *
     * @return true if the property can be modified, and false if it is not modifiable
     * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
     */
    public boolean canModify (Object element, String property) {
        return true;
    }

    /**
     * Returns the value for the given property of the given element.
     * Returns "" if the element does not have the given property.
     *
     * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
     */
    public Object getValue (Object element, String property)
    {
    	AlisaDebug.debug ("[AlisaEditorCellModifier] getValue element=" + element + ";property=" + property);
        int elementIndex = Integer.parseInt(property);
//        CSVRow row = (CSVRow) element;
//
//        if(elementIndex < row.getNumberOfElements()) {
//            return row.getElementAt(elementIndex);
//        }
//        else {
//            return "";
//        }
        return "";
    }


    
    /**
     * Modifies the value for the given property of the given element.
     * Has no effect if the element does not have the given property,
     * or if the property cannot be modified.
     *
     * @see org.eclipse.jface.viewers.ICellModifier#modify(java.lang.Object, java.lang.String, java.lang.Object)
     */
    public void modify (Object element, String property, Object value) {
        Object elementData;
    	int elementIndex;
    	int editorIdentifier;
    	
    	editorIdentifier = -1;
    	elementData = ((TableItem) element).getData();
    	elementIndex = Integer.parseInt(property);
    	AlisaDebug.debug ("[AlisaEditorCellModifier] modify element=" + element + ";property=" + property + ";value=" + value );
    	AlisaDebug.debug ("[AlisaEditorCellModifier] modify element data=" +  ((TableItem) element).getData());
    	
    	if (elementData instanceof Requirement)
    	{
    		Requirement requirement = (Requirement) elementData;
    		editorIdentifier = AlisaEditor.INDEX_TABLE_REQUIREMENTS;
    		switch (elementIndex)
    		{
	    		case 1:
	    		{
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] update requirement title");
	    			requirement.setTitle((String)value);
	    			break;
	    		}
	    		case 2:
	    		{
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] update requirement desc");
	    			requirement.setDescription((String)value);
	    			break;
	    		}
	    		case 3:
	    		{
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] update requirement comment");
	    			requirement.setComment((String)value);
	    			break;
	    		}
    		}

    	}
    	
    	if (elementData instanceof Stakeholder)
    	{
    		Stakeholder stakeholder = (Stakeholder) elementData;
    		editorIdentifier = AlisaEditor.INDEX_TABLE_STAKEHOLDERS;
    		switch (elementIndex)
    		{
	    		case 1:
	    		{
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] update stakeholder title");
	    			stakeholder.setTitle((String)value);
	    			break;
	    		}
	    		case 2:
	    		{
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] update stakeholder desc");
	    			stakeholder.setDescription((String)value);
	    			break;
	    		}
	    		case 3:
	    		{
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] update stakeholder role");
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] before role=" + stakeholder.getRole());
	    			stakeholder.setRole((String)value);
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] after role=" + stakeholder.getRole());

	    			break;
	    		}
    		}    		
    	}
    	
    	if (editorIdentifier != -1)
    	{
    		alisaEditor.updateTable (editorIdentifier);
    		
    	}
    	alisaEditor.updateTextualEditor();
    }
}
