package edu.cmu.sei.alisa.analysis.preferences;

import java.io.File;

import org.eclipse.jface.preference.IPreferenceStore;

import edu.cmu.sei.alisa.analysis.Activator;


public class PreferencesValues
{
	public static String getHeaderString (int depth)
	{
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		
		switch (depth)
		{
			case 0:
				return store.getString(PreferenceConstants.HEADER1);
			case 1:
				return store.getString(PreferenceConstants.HEADER2);
			case 2:
				return store.getString(PreferenceConstants.HEADER3);
			case 3:
				return store.getString(PreferenceConstants.HEADER4);
			case 4:
				return store.getString(PreferenceConstants.HEADER5);
		}
		return "unknown";
	}
}
