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

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import edu.cmu.alisa.sei.utils.Utils;
import edu.cmu.sei.alisa.alisa.DocumentedRequirement;
import edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;

/**
 * This class is used to show the content
 * of a label in the table.
 * @author julien
 *
 */
public class AlisaLabelProvider extends StyledCellLabelProvider {

	private String searchText;
	private Color searchColor;

	/**
	 *
	 */
	public AlisaLabelProvider() {
		searchColor = Display.getCurrent().getSystemColor(SWT.COLOR_YELLOW);
	}

	/**
	 * @param element
	 * @param columnIndex
	 * @return
	 */
	public Image getColumnImage(Object element, int columnIndex) {
		return null;
	}

	/**
	 * @param element
	 * @param columnIndex
	 * @return
	 */
	public String getColumnText(Object element, int columnIndex) {
		return "bla";
	}

	/**
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	public void addListener(ILabelProviderListener listener) {
	}

	/**
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
	 */
	public boolean isLabelProperty(Object element, String property) {
		return true;
	}

	/**
	 * @see org.eclipse.jface.viewers.BaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	public void removeListener(ILabelProviderListener listener) {
	}

	/**
	 * @param searchText
	 */
	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}

	/**
	 * @see org.eclipse.jface.viewers.StyledCellLabelProvider#dispose()
	 */
	public void dispose() {
	}

	/**
	 * @see org.eclipse.jface.viewers.StyledCellLabelProvider#update(org.eclipse.jface.viewers.ViewerCell)
	 */
	@Override
	public void update(ViewerCell cell) {
		int index = cell.getColumnIndex();
		String text = "N/A";
//    	AlisaDebug.debug("[AlisaLabelProvider] update, element=" + cell.getElement());
//    	AlisaDebug.debug("[AlisaLabelProvider] index=" + index);

		if (cell.getElement() instanceof DocumentedRequirement) {
			DocumentedRequirement requirement = (DocumentedRequirement) cell.getElement();
			switch (index) {
			case 0:
				text = requirement.getName();
				break;
			case 1:
				text = requirement.getTitle();
				break;
			case 2:
				text = requirement.getDescription();
				break;
			case 3:
				text = requirement.getComment();
				break;
			case 4: {
				text = Utils.getStakeholderListAsString(requirement.getAssignedTo());
				break;
			}

			case 5: {
				String strVal = "";
				boolean firstPassed = false;
				for (DocumentedRequirementDecomposition rtmp : requirement.getDecomposedBy()) {
					strVal += Utils.getDecompositionString(rtmp);

				}
				text = strVal;
				break;
			}
			}
		}

		if (cell.getElement() instanceof Stakeholder) {
			Stakeholder stakeholder = (Stakeholder) cell.getElement();
			switch (index) {
			case 0:
				text = stakeholder.getName();
				break;
			case 1:
				text = stakeholder.getTitle();
				break;
			case 2:
				text = stakeholder.getDescription();
				break;
			case 3:
				text = stakeholder.getRole();
				break;
			}
		}

		if (cell.getElement() instanceof VerificationActivity) {
			VerificationActivity va = (VerificationActivity) cell.getElement();
			switch (index) {
			case 0:
				text = va.getName();
				break;
			case 1:
				text = va.getTitle();
				break;
			case 2:
				text = va.getDescription();
				break;
			case 3:
				text = va.getMethod();
				break;
			case 4:
				text = Utils.getStakeholderListAsString(va.getAssignedTo());
				break;
			}
		}

		if (cell.getElement() instanceof Goal) {
			Goal goal = (Goal) cell.getElement();
			switch (index) {
			case 0:
				text = goal.getName();
				break;
			case 1:
				text = goal.getTitle();
				break;
			case 2:
				text = goal.getDescription();
				break;
			case 3:
				text = goal.getAssert();
				break;
			case 4:
				text = goal.getRationale();
				break;
			case 5:
				text = Utils.getStringListAsString(goal.getIssue());
				break;
			case 6:
				text = Utils.getStakeholderListAsString(goal.getStakeholderReference());
				break;
			}

		}

		if (cell.getElement() instanceof Requirement) {
			Requirement req = (Requirement) cell.getElement();
			switch (index) {
			case 0:
				text = req.getName();
				break;
			case 1:
				text = req.getTitle();
				break;
			case 2:
				text = req.getDescription();
				break;
			case 3:
				text = req.getAssert();
				break;
			case 4:
				text = req.getRationale();
				break;
			case 5:
				text = Utils.getStringListAsString(req.getIssue());
				break;
			}
		}

		if (cell.getElement() instanceof ExternalDocument) {
			ExternalDocument extdoc = (ExternalDocument) cell.getElement();
			switch (index) {
			case 0:
				text = extdoc.getName();
				break;
			case 1:
				text = extdoc.getXternalReference();
				break;
			}
		}

		cell.setText(text);
		super.update(cell);
	}
}
