package edu.cmu.sei.alisa.analysis.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import edu.cmu.sei.alisa.analysis.Activator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * Initialize defaults value for preferences of the plug-in
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		store.setDefault(PreferenceConstants.HEADER1, "Heading 1");
		store.setDefault(PreferenceConstants.HEADER2, "Heading 2");
		store.setDefault(PreferenceConstants.HEADER3, "Heading 3");
		store.setDefault(PreferenceConstants.HEADER4, "Heading 4");
		store.setDefault(PreferenceConstants.HEADER5, "Heading 5");
	}

}
