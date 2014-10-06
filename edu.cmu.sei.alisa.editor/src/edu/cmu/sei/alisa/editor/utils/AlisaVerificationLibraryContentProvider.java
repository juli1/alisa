package edu.cmu.sei.alisa.editor.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationLibrary;

public class AlisaVerificationLibraryContentProvider implements IStructuredContentProvider {

	/**
	 * Returns the elements to display in the table viewer
	 *
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object element) {
		List<VerificationActivity> vas = new ArrayList<VerificationActivity>();

		if (element instanceof VerificationLibrary) {
			VerificationLibrary lib = (VerificationLibrary) element;
			for (Object o : lib.getContent()) {
				if (o instanceof VerificationActivity) {
					vas.add((VerificationActivity) o);
				}
			}
		}
		return vas.toArray();
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
}
