package edu.cmu.sei.alisa.naming;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;

public class AlisaQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

	public String getDelimiter() {
		return "::";
	}

	public QualifiedName qualifiedName(final Classifier obj) {
		return getConverter().toQualifiedName(obj.getQualifiedName());
	}

	public QualifiedName qualifiedName(final NamedElement obj) {
		// return null;
		return super.getFullyQualifiedName(obj);
	}

//
//	public QualifiedName qualifiedName(final AlisaElement obj) {
//		// return null;
//		return getConverter().toQualifiedName(obj.getQualifiedName());
//	}

	public QualifiedName qualifiedName(final Element obj) {
		return null;// getConverter().toQualifiedName(obj.getQualifiedName());
	}

}
