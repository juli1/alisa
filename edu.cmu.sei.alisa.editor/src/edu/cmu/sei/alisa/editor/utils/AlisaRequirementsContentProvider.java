package edu.cmu.sei.alisa.editor.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Requirements;

public class AlisaRequirementsContentProvider implements IStructuredContentProvider {

	/**
	 * Returns the elements to display in the table viewer
	 *
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object element) {
		List<Requirement> reqs = new ArrayList<Requirement>();

		if (element instanceof AlisaModel) {
			AlisaModel am = (AlisaModel) element;
			for (Object o : am.getContent()) {
				if (o instanceof Requirements) {
					for (Requirement g : ((Requirements) o).getReqs()) {
						reqs.add(g);
					}
				}
			}
		}
		if (element instanceof Requirements) {
			for (Requirement g : ((Requirements) element).getReqs()) {
				reqs.add(g);
			}
		}
		return reqs.toArray();
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
}
