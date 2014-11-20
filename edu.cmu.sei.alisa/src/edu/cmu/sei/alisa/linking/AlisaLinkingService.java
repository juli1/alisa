package edu.cmu.sei.alisa.linking;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.nodemodel.INode;
import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.Classifier;
import org.osate.aadl2.NamedElement;
import org.osate.xtext.aadl2.properties.linking.PropertiesLinkingService;

import edu.cmu.sei.alisa.alisa.ContractualElement;

public class AlisaLinkingService extends PropertiesLinkingService {

	@Override
	public List<EObject> getLinkedObjects(EObject context, EReference reference, INode node)
			throws IllegalNodeException {

		final EClass requiredType = reference.getEReferenceType();
		if (requiredType == null) {
			return Collections.<EObject> emptyList();
		}
		final EClass ne = Aadl2Package.eINSTANCE.getNamedElement();
		final String name = getCrossRefNodeAsString(node);
		if (requiredType == ne) {
			NamedElement e = null;
			if (context instanceof ContractualElement) {
				// TODO: resolve classifier vs. element in classifier
				String dotname = name.replaceAll("::", ".");
				EObject res = findClassifier(context, reference, dotname);
				if (res != null) {
					return Collections.singletonList(res);
				}
				return Collections.singletonList(res);
			}
			if (e instanceof Classifier) {
				EObject res = ((Classifier) e).findNamedElement(name);
				// the result satisfied the expected class
				return Collections.singletonList(res);
			}
		}
		List<EObject> res = super.getLinkedObjects(context, reference, node);
		return res;

	}
}
