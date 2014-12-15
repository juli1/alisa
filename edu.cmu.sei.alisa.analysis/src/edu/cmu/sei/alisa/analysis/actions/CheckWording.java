package edu.cmu.sei.alisa.analysis.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.osate.aadl2.NamedElement;

import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.ContractualElement;
import edu.cmu.sei.alisa.alisa.RSALContainer;
import edu.cmu.sei.alisa.analysis.wording.ErrorReport;

public class CheckWording {
	private static List<ErrorReport> reportedErrors;

	/**
	 * The constructor.
	 */
	public CheckWording() {
	}

	/**
	 * The action has been activated. The argument of the
	 * method represents the 'real' action sitting
	 * in the workbench UI.
	 * @see IWorkbenchWindowActionDelegate#run
	 */
	public void doCheck(AlisaModel model) {

		reportedErrors = new ArrayList<ErrorReport>();
		if (model instanceof RSALContainer)
			for (EObject obj : ((RSALContainer) model).getContent()) {
				if (obj instanceof ContractualElement) {
					checkDocumentedRequirement((ContractualElement) obj);
				} else if (obj instanceof RSALContainer) {
					doCheck((RSALContainer) obj);
				}
			}

		if (reportedErrors.size() > 0) {
			// TODO: output report
		} else {
			// TODO no error notice
		}
	}

	public static void checkDocumentedRequirement(ContractualElement eo) {
		final String[] toAvoid = { "may", "added" };
		final String[] mustHave = { "shall" };
		for (String avoid : toAvoid) {
			if (eo.getDescription() != null && eo.getDescription().toLowerCase().contains(avoid)) {
				ErrorReport report = new ErrorReport();
				report.setRequirementName(((NamedElement) eo).getName());
				report.setReport("cannot contain the word " + avoid);
				reportedErrors.add(report);
			}
		}
		for (String must : mustHave) {
			if (eo.getDescription() != null && !eo.getDescription().toLowerCase().contains(must)) {
				ErrorReport report = new ErrorReport();
				report.setRequirementName(((NamedElement) eo).getName());
				report.setReport("must contain the word " + must);
				reportedErrors.add(report);
			}
		}
	}
}