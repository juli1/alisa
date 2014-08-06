package edu.cmu.sei.alisa.editor.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;

public class AlisaTableFilter extends ViewerFilter {

	private String searchString;
	private Pattern searchPattern;

	/**
	 * Build a pattern. we use pattern so we can make non case sensitive search
	 *
	 * @param s string to search
	 */
	public void setSearchText(String s) {
		// Search must be a substring of the existing value
		this.searchString = ".*" + s + ".*";

		searchPattern = Pattern.compile(searchString, Pattern.CASE_INSENSITIVE);

	}

	/**
	 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
	 */
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		Matcher m;

		if (searchString == null || searchString.length() == 0) {
			return true;
		}

		if (element instanceof Requirement) {
			Requirement requirement = (Requirement) element;

			m = searchPattern.matcher(requirement.getName());
			if (m.matches()) {
				return true;
			}

			if (requirement.getDescription() != null) {
				m = searchPattern.matcher(requirement.getDescription());
				if (m.matches()) {
					return true;
				}
			}

			if (requirement.getTitle() != null) {
				m = searchPattern.matcher(requirement.getTitle());
				if (m.matches()) {
					return true;
				}
			}

			if (requirement.getComment() != null) {
				m = searchPattern.matcher(requirement.getComment());
				if (m.matches()) {
					return true;
				}
			}

		}

		if (element instanceof Stakeholder) {
			Stakeholder stakeholder = (Stakeholder) element;

			m = searchPattern.matcher(stakeholder.getName());
			if (m.matches()) {
				return true;
			}

			m = searchPattern.matcher(stakeholder.getDescription());
			if (m.matches()) {
				return true;
			}

			m = searchPattern.matcher(stakeholder.getTitle());
			if (m.matches()) {
				return true;
			}

			m = searchPattern.matcher(stakeholder.getRole());
			if (m.matches()) {
				return true;
			}

		}

		if (element instanceof VerificationActivity) {
			VerificationActivity va = (VerificationActivity) element;

			m = searchPattern.matcher(va.getName());
			if (m.matches()) {
				return true;
			}

			m = searchPattern.matcher(va.getDescription());
			if (m.matches()) {
				return true;
			}

			m = searchPattern.matcher(va.getTitle());
			if (m.matches()) {
				return true;
			}

		}
		return false;
	}
}