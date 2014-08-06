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

import edu.cmu.alisa.sei.utils.AlisaDebug;
import edu.cmu.alisa.sei.utils.Utils;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.editor.editors.AlisaEditor;


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
    	int elementIndex;
        Object elementData;
        Object returnValue;
        
        
        
        AlisaDebug.debug ("[AlisaEditorCellModifier] getValue element=" + element + ";property=" + property);
        
        elementIndex = Integer.parseInt(property);
        returnValue = "";
        
        
        if (element instanceof Requirement)
    	{
    		Requirement requirement = (Requirement) element;
    		switch (elementIndex)
    		{
	    		case 1:
	    		{
	    			returnValue = Utils.fixString (requirement.getTitle());
	    			break;
	    		}
	    		case 2:
	    		{
	    			returnValue = Utils.fixString (requirement.getDescription());
	    			break;
	    		}
	    		case 3:
	    		{
	    			returnValue = Utils.fixString (requirement.getComment());
	    			break;
	    		}
	    		case 4:
	    		{
	    			String strVal = "";
	    			boolean firstPassed = false;
	    			for (Stakeholder s : requirement.getAssignedTo())
	    			{
	    				if (firstPassed == true)
	    				{
	    					strVal += ",";
	    				
	    				}
	    				
	    				strVal += s.getName();
	    				firstPassed = true;
	    			}
	    			returnValue = strVal;
	    			break;
	    		}
    		}

    	}
    	
    	if (element instanceof Stakeholder)
    	{
    		Stakeholder stakeholder = (Stakeholder) element;
    		switch (elementIndex)
    		{
	    		case 1:
	    		{
	    			returnValue = Utils.fixString (stakeholder.getTitle());
	    			break;
	    		}
	    		case 2:
	    		{
	    			returnValue = Utils.fixString (stakeholder.getDescription());
	    			break;
	    		}
	    		case 3:
	    		{
	    			returnValue = Utils.fixString (stakeholder.getRole());
	    			break;
	    		}
	    		
	    		
    		}    		
    	}
    	
    	if (element instanceof VerificationActivity)
    	{
    		VerificationActivity va = (VerificationActivity) element;
    		switch (elementIndex)
    		{
				case 0:
					returnValue = va.getName();
					break;
    			case 1:
    				returnValue = va.getTitle();
    				break;
    			case 2:
    				returnValue = va.getDescription();
    				break;
    			case 3:
    				returnValue = va.getMethod();
    				break;
    			case 4:
    				returnValue = Utils.getStakeholderListAsString (va.getAssignedTo());
    				break;
    		}
    	}
    	return returnValue;
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
    	String strVal;
    	
    	
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
	    			strVal = "\"" + (String)value +"\"";
	    			requirement.setTitle(strVal);
	    			break;
	    		}
	    		case 2:
	    		{
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] update requirement desc");
	    			strVal = "\"" + (String)value +"\"";
	    			requirement.setDescription(strVal);
	    			break;
	    		}
	    		case 3:
	    		{
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] update requirement comment");
	    			strVal = "\"" + (String)value +"\"";
	    			requirement.setComment(strVal);
	    			break;
	    		}
	    		case 4:
	    		{
	    			for (Stakeholder s : Utils.getStakeholdersFromString (alisaEditor.getRootObject(), (String) value))
	    			{
    					AlisaDebug.debug ("[AlisaEditorCell] add stakeholder" + s.getName());

	    				requirement.getAssignedTo().add(s);
	    			}
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
	    			strVal = Utils.wrapValue(value);
	    			stakeholder.setTitle(strVal);
	    			break;
	    		}
	    		case 2:
	    		{
	    			AlisaDebug.debug ("[AlisaEditorCellModifier] update stakeholder desc");
	    			strVal = Utils.wrapValue(value);
	    			stakeholder.setDescription(strVal);
	    			break;
	    		}
	    		case 3:
	    		{
//	    			AlisaDebug.debug ("[AlisaEditorCellModifier] update stakeholder role");
//	    			AlisaDebug.debug ("[AlisaEditorCellModifier] before role=" + stakeholder.getRole());
	    			strVal = Utils.wrapValue(value);
	    			stakeholder.setRole(strVal);
//	    			AlisaDebug.debug ("[AlisaEditorCellModifier] after role=" + stakeholder.getRole());

	    			break;
	    		}
    		}    		
    	}
    	
    	if (elementData instanceof VerificationActivity)
    	{
    		VerificationActivity va = (VerificationActivity) elementData;
    		editorIdentifier = AlisaEditor.INDEX_TABLE_VERIFICATION_ACTIVITIES;
    		switch (elementIndex)
    		{
				case 0:
					va.setName(Utils.wrapValue(value));
					break;
    			case 1:
    				va.setTitle(Utils.wrapValue(value));
    				break;
    			case 2:
    				va.setDescription(Utils.wrapValue(value));
    				break;
    			case 3:
    				String val = (String) value;
    				if ((val.equalsIgnoreCase("manual")) || (val.equalsIgnoreCase("automatic")))
    				{
    					va.setMethod(val.toLowerCase());
    				}
    				break;
    			case 4:
	    			for (Stakeholder s : Utils.getStakeholdersFromString (alisaEditor.getRootObject(), (String) value))
	    			{
    					AlisaDebug.debug ("[AlisaEditorCell] add stakeholder" + s.getName());

	    				va.getAssignedTo().add(s);
	    			}
    				break;
    		}
    	}
    	
    	if (editorIdentifier != -1)
    	{
    		alisaEditor.updateTable (editorIdentifier);
    		
    	}
    	alisaEditor.updateTextualEditor();
    }
}
