/*
* generated by Xtext
*/
package edu.cmu.sei.alisa;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AlisaUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return edu.cmu.sei.alisa.ui.internal.AlisaActivator.getInstance().getInjector("edu.cmu.sei.alisa.Alisa");
	}
	
}
