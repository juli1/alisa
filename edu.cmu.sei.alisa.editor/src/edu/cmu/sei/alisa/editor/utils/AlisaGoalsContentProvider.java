package edu.cmu.sei.alisa.editor.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Goals;

public class AlisaGoalsContentProvider implements IStructuredContentProvider {

	/**
	 * Returns the elements to display in the table viewer
	 *
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	public Object[] getElements(Object element) {
		List<Goal> goals = new ArrayList<Goal>();

		if (element instanceof AlisaModel) {
			AlisaModel am = (AlisaModel) element;
			for (Object o : am.getContent()) {
				if (o instanceof Goals) {
					for (Goal g : ((Goals) o).getGoals()) {
						goals.add(g);
					}
				}
			}
		}
		if (element instanceof Goals) {
			for (Goal g : ((Goals) element).getGoals()) {
				goals.add(g);
			}
		}
		return goals.toArray();
	}

	/**
	 * @see org.eclipse.jface.viewers.IContentProvider#dispose()
	 */
	public void dispose() {
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}
}
