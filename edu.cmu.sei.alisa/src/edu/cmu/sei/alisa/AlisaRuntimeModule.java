/*
 * generated by Xtext
 */
package edu.cmu.sei.alisa;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class AlisaRuntimeModule extends edu.cmu.sei.alisa.AbstractAlisaRuntimeModule {
	@Override
	public Class<? extends org.eclipse.xtext.linking.ILinkingService> bindILinkingService() {
		return edu.cmu.sei.alisa.linking.AlisaLinkingService.class;
	}

	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameConverter> bindIQualifiedNameConverter() {
		return edu.cmu.sei.alisa.naming.AlisaQualifiedNameConverter.class;
	}

	@Override
	public Class<? extends org.eclipse.xtext.naming.IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return edu.cmu.sei.alisa.naming.AlisaQualifiedNameProvider.class;
	}

}
