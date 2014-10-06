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

import edu.cmu.alisa.sei.utils.Utils;
import edu.cmu.sei.alisa.alisa.Category;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.editor.editors.AlisaEditor;

public class AlisaEditorCellModifier implements ICellModifier {
	private AlisaEditor alisaEditor;

	public AlisaEditorCellModifier(AlisaEditor editor) {
		super();
		this.alisaEditor = editor;
	}

	/**
	 * Checks whether the given property of the given element can be modified.
	 *
	 * @return true if the property can be modified, and false if it is not modifiable
	 * @see org.eclipse.jface.viewers.ICellModifier#canModify(java.lang.Object, java.lang.String)
	 */
	public boolean canModify(Object element, String property) {
		return true;
	}

	/**
	 * Returns the value for the given property of the given element.
	 * Returns "" if the element does not have the given property.
	 *
	 * @see org.eclipse.jface.viewers.ICellModifier#getValue(java.lang.Object, java.lang.String)
	 */
	public Object getValue(Object element, String property) {
		int elementIndex;
		Object elementData;
		Object returnValue;

		elementIndex = Integer.parseInt(property);
		returnValue = "";

		if (element instanceof Requirement) {
			Requirement requirement = (Requirement) element;
			switch (elementIndex) {
			case 0: {
				String strVal = "";
				boolean firstPassed = false;
				for (Category s : requirement.getCategory()) {
					if (firstPassed == true) {
						strVal += ",";

					}

					strVal += s.getName();
					firstPassed = true;
				}
				returnValue = strVal;
				break;
			}
			case 1: {
				returnValue = Utils.fixString(requirement.getName());
				break;
			}
			case 2: {
				returnValue = Utils.fixString(requirement.getTarget());
				break;
			}
			case 3: {
				returnValue = Utils.fixString(requirement.getTitle());
				break;
			}
			case 4: {
				returnValue = Utils.fixString(requirement.getDescription());
				break;
			}
			case 6: {
				returnValue = Utils.fixString(requirement.getRationale());
				break;
			}
			case 5: {
				returnValue = Utils.fixString(requirement.getAssert());
				break;
			}
			case 7: {
				String strVal = "";
				boolean firstPassed = false;
				for (String s : requirement.getIssue()) {
					if (firstPassed == true) {
						strVal += ",";

					}

					strVal += s;
					firstPassed = true;
				}
				returnValue = strVal;
				break;
			}
			}
		}

		if (element instanceof Goal) {
			Goal goal = (Goal) element;
			switch (elementIndex) {
			case 0: {
				returnValue = Utils.fixString(goal.getName());
				break;
			}
			case 2: {
				returnValue = Utils.fixString(goal.getTitle());
				break;
			}
			case 3: {
				returnValue = Utils.fixString(goal.getDescription());
				break;
			}
			case 5: {
				returnValue = Utils.fixString(goal.getRationale());
				break;
			}
			case 4: {
				returnValue = Utils.fixString(goal.getAssert());
				break;
			}
			case 6: {
				String strVal = "";
				boolean firstPassed = false;
				for (String s : goal.getIssue()) {
					if (firstPassed == true) {
						strVal += ",";

					}

					strVal += s;
					firstPassed = true;
				}
				returnValue = strVal;
				break;
			}
			case 7: {
				String strVal = "";
				boolean firstPassed = false;
				for (Stakeholder s : goal.getStakeholderReference()) {
					if (firstPassed == true) {
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

		if (element instanceof Stakeholder) {
			Stakeholder stakeholder = (Stakeholder) element;
			switch (elementIndex) {
			case 0: {
				returnValue = Utils.fixString(stakeholder.getName());
			}
			case 1: {
				returnValue = Utils.fixString(stakeholder.getTitle());
				break;
			}
			case 2: {
				returnValue = Utils.fixString(stakeholder.getDescription());
				break;
			}
			case 3: {
				returnValue = Utils.fixString(stakeholder.getRole());
				break;
			}

			}
		}

		if (element instanceof VerificationActivity) {
			VerificationActivity va = (VerificationActivity) element;
			switch (elementIndex) {
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
				returnValue = Utils.getStakeholderListAsString(va.getAssignedTo());
				break;
			}
		}

		if (element instanceof ExternalDocument) {
			ExternalDocument xdoc = (ExternalDocument) element;
			switch (elementIndex) {
			case 0: {
				returnValue = Utils.fixString(xdoc.getName());
				break;
			}
			case 1: {
				returnValue = Utils.fixString(xdoc.getExternalReference());
				break;
			}
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
	public void modify(Object element, String property, Object value) {
		Object elementData;
		int elementIndex;
		int editorIdentifier;
		String strVal = Utils.wrapValue(value);
		;

		editorIdentifier = -1;
		elementData = ((TableItem) element).getData();
		elementIndex = Integer.parseInt(property);

		if (elementData instanceof Requirement) {
			Requirement requirement = (Requirement) elementData;
			editorIdentifier = AlisaEditor.INDEX_TABLE_REQUIREMENTS;
			switch (elementIndex) {
			case 0: {
				requirement.getCategory().clear();
				for (String catname : ((String) value).split(",")) {
					requirement.getCategory().add(Utils.findCategory(requirement, catname));
				}
				break;
			}
			case 1: {
				requirement.setName((String) value);
				break;
			}
			case 2: {
				requirement.setTarget((String) value);
				break;
			}
			case 3: {
				requirement.setTitle(strVal);
				break;
			}
			case 4: {
				requirement.setDescription(strVal);
				break;
			}
			case 6: {
				requirement.setRationale(strVal);
				break;
			}
			case 5: {
				requirement.setAssert(strVal);
				break;
			}
			case 7: {
				requirement.getIssue().clear();
				for (String issue : ((String) value).split(",")) {
					requirement.getIssue().add(issue);
				}
				break;
			}
			}
		}

		if (elementData instanceof Goal) {
			Goal goal = (Goal) elementData;
			editorIdentifier = AlisaEditor.INDEX_TABLE_GOALS;
			switch (elementIndex) {
			case 0: {
				goal.setName((String) value);
				break;
			}
			case 2: {
				goal.setTitle(strVal);
				break;
			}
			case 3: {
				goal.setDescription(strVal);
				break;
			}
			case 5: {
				goal.setRationale(strVal);
				break;
			}
			case 4: {
				goal.setAssert(strVal);
				break;
			}
			case 6: {
				goal.getIssue().clear();
				for (String issue : ((String) value).split(",")) {
					goal.getIssue().add(issue);
				}
				break;
			}
			case 7: {
				goal.getStakeholderReference().clear();
				for (Stakeholder s : Utils.getStakeholdersFromString(alisaEditor.getRootObject(), (String) value)) {
					goal.getStakeholderReference().add(s);
				}
				break;
			}
			}

		}

		if (elementData instanceof Stakeholder) {
			Stakeholder stakeholder = (Stakeholder) elementData;
			editorIdentifier = AlisaEditor.INDEX_TABLE_STAKEHOLDERS;
			switch (elementIndex) {
			case 0: {
				stakeholder.setName((String) value);
				break;
			}
			case 1: {
				stakeholder.setTitle(strVal);
				break;
			}
			case 2: {
				stakeholder.setDescription(strVal);
				break;
			}
			case 3: {
				stakeholder.setRole(strVal);

				break;
			}
			}
		}

		if (elementData instanceof ExternalDocument) {
			ExternalDocument xdoc = (ExternalDocument) elementData;
			editorIdentifier = AlisaEditor.INDEX_TABLE_EXTERNAL_DOCUMENTS;
			switch (elementIndex) {
			case 0: {
				xdoc.setName((String) value);
				break;
			}
			case 1: {
				xdoc.setExternalReference(strVal);
				break;
			}
			}
		}

		if (elementData instanceof VerificationActivity) {
			VerificationActivity va = (VerificationActivity) elementData;
			editorIdentifier = AlisaEditor.INDEX_TABLE_VERIFICATION_ACTIVITIES;
			switch (elementIndex) {
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
				if ((val.equalsIgnoreCase("manual")) || (val.equalsIgnoreCase("automatic"))) {
					va.setMethod(val.toLowerCase());
				}
				break;
			case 4:
				for (Stakeholder s : Utils.getStakeholdersFromString(alisaEditor.getRootObject(), (String) value)) {

					va.getAssignedTo().add(s);
				}
				break;
			}
		}

		if (editorIdentifier != -1) {
			alisaEditor.updateTable(editorIdentifier);

		}
		alisaEditor.updateTextualEditor();
	}
}
