/*
 * generated by Xtext
 */
package edu.cmu.sei.alisa.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators= {edu.cmu.sei.alisa.validation.AlisaValidator.class})
public class AbstractAlisaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(edu.cmu.sei.alisa.alisa.AlisaPackage.eINSTANCE);
		return result;
	}
}
