package edu.cmu.sei.alisa.editor.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import edu.cmu.sei.alisa.alisa.Organization;
import edu.cmu.sei.alisa.alisa.Stakeholder;

public class AlisaOrganizationContentProvider implements IStructuredContentProvider {

	/**
	 * Returns the elements to display in the table viewer
	 *
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object element) {
		List<Stakeholder> stakeholders = new ArrayList<Stakeholder>();

		if (element instanceof Organization) {
			Organization am = (Organization) element;
			for (Object oo : am.getStakeholder()) {
				if (oo instanceof Stakeholder) {
					stakeholders.add((Stakeholder) oo);
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
