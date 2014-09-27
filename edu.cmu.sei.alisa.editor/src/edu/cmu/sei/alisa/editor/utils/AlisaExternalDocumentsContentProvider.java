package edu.cmu.sei.alisa.editor.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import edu.cmu.alisa.sei.utils.AlisaDebug;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.ExternalDocuments;

public class AlisaExternalDocumentsContentProvider implements IStructuredContentProvider {

	/**
	 * Returns the elements to display in the table viewer
	 *
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object element) {
		List<ExternalDocument> requirements = new ArrayList<ExternalDocument>();
		AlisaDebug.debug("[AlisaRequirementsContentProvider] element=" + element);

		if (element instanceof AlisaModel) {
			AlisaModel am = (AlisaModel) element;
			for (Object o : am.getContent()) {
				if (o instanceof ExternalDocuments) {
					for (ExternalDocument oo : ((ExternalDocuments) o).getDocs()) {
						requirements.add(oo);
					}
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