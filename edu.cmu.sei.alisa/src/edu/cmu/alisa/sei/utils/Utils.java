package edu.cmu.alisa.sei.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.osate.xtext.aadl2.properties.util.EMFIndexRetrieval;

import edu.cmu.sei.alisa.alisa.AlisaFactory;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Category;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.ExternalDocuments;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Goals;
import edu.cmu.sei.alisa.alisa.Organization;
import edu.cmu.sei.alisa.alisa.RDAPackage;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDocument;
import edu.cmu.sei.alisa.alisa.Requirements;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationLibrary;
import edu.cmu.sei.alisa.alisa.impl.AlisaFactoryImpl;

public class Utils {
	public static String fixString(String s) {
		if (s != null) {
			return s.replaceAll("\"", "");
		} else {
			return "\"\"";
		}
	}

	public static String fixIdentifier(String id) {
		if (!(id.substring(0, 1).matches("[a-zA-Z]"))) {
			return "REQ_" + id;
		}
		return id;
	}

	public static String filterString(String s) {
		return s.replaceAll("[^a-zA-Z0-9_. ]", "");
	}

	public static Stakeholder findStakeHolder(String name) {
		EObject obj = EMFIndexRetrieval.getDottedEObjectOfType(AlisaPackage.eINSTANCE.getStakeholder(), name);
		return (Stakeholder) obj;
	}

	public static Category findCategory(EObject context, String name) {
		EObject obj = EMFIndexRetrieval.getDottedEObjectOfType(AlisaPackage.eINSTANCE.getCategory(), name);
		return (Category) obj;
	}

	/**
	 * Convert a list of strings into a readable string
	 * @param stakeholders
	 * @return
	 */
	public static String getStringListAsString(List<String> stringList) {
		String strVal = "";
		boolean firstPassed = false;
		for (String s : stringList) {
			if (firstPassed == true) {
				strVal += ",";

			}

			strVal += s;
			firstPassed = true;
		}
		return strVal;
	}

	/**
	 * Convert a list of stakeholders into a readable string
	 * @param stakeholders
	 * @return
	 */
	public static String getCategoryListAsString(List<Category> cat) {
		String strVal = "";
		boolean firstPassed = false;
		for (Category s : cat) {
			if (firstPassed == true) {
				strVal += ",";

			}

			strVal += s.getName();
			firstPassed = true;
		}
		return strVal;
	}

	/**
	 * Convert a list of stakeholders into a readable string
	 * @param stakeholders
	 * @return
	 */
	public static String getStakeholderListAsString(List<Stakeholder> stakeholders) {
		String strVal = "";
		boolean firstPassed = false;
		for (Stakeholder s : stakeholders) {
			if (firstPassed == true) {
				strVal += ",";

			}

			strVal += s.getName();
			firstPassed = true;
		}
		return strVal;
	}

	/**
	 * Convert a list of requirements into a readable string
	 * @param req
	 * @return
	 */
	public static String getContractualElementListAsString(List<Requirement> req) {
		String strVal = "";
		boolean firstPassed = false;
		for (Requirement s : req) {
			if (firstPassed == true) {
				strVal += ",";

			}

			strVal += s.getName();
			firstPassed = true;
		}
		return strVal;
	}

	public static String wrapValue(Object o) {
		String s = o.toString();
		if (s.startsWith("\"") && s.endsWith("\""))
			return s;
		return "\"" + o.toString() + "\"";
	}

	public static List<Stakeholder> getStakeholdersFromString(EObject context, String str) {
		List<Stakeholder> stakeholders = new ArrayList<Stakeholder>();
		for (String stakeholderName : str.split(",")) {
			Stakeholder s = Utils.findStakeHolder(stakeholderName);
			if (s != null) {
				stakeholders.add(s);
			}
		}
		return stakeholders;
	}

	/**
	 * Add a new DocumentedRequirement to the model
	 * @param model - the alisa model that will contain the
	 *                new DocumentedRequirement.
	 */
	private static int NEW_DOCREQ_ID = 1;

	public static Requirement addNewRequirement(RequirementDocument reqdoc) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Requirement req = factory.createRequirement();
		req.setTitle("\"Title\"");
		req.setName("newreq" + NEW_DOCREQ_ID++);
		req.setDescription("\"Desc\"");
		reqdoc.getContent().add(req);

		return req;
	}

	public static Goal addNewGoal(RequirementDocument reqdoc) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Goal req = factory.createGoal();
		req.setTitle("\"Title\"");
		req.setName("newreq" + NEW_DOCREQ_ID++);
		req.setDescription("\"Desc\"");
		reqdoc.getContent().add(req);

		return req;
	}

	/**
	 * Add a new verification activity to the model
	 * @param model - the alisa model that will contain the
	 *                new verification activity.
	 */
	private static int NEW_VA_ID = 1;

	public static void addNewVerificationActivity(VerificationLibrary lib) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		VerificationActivity va = factory.createVerificationActivity();
		va.setTitle("\"Title\"");
		va.setName("new_verification_activity" + NEW_VA_ID++);
		va.setMethod("manual");
		va.setDescription("\"Desc\"");
		lib.getContent().add(va);
	}

	/**
	 * Add a new external document to the model
	 * @param external docs - the ExternalDOcuments set that will contain the
	 *                new external doc.
	 */
	private static int NEW_XDOC_ID = 1;

	public static void addNewExternalDocument(ExternalDocuments lib) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		ExternalDocument xdoc = factory.createExternalDocument();
		xdoc.setName("new_external_doc" + NEW_XDOC_ID++);
		xdoc.setExternalReference("\"XRef to doc\"");
		lib.getDocs().add(xdoc);
	}

	/**
	 * Add a new goal to the model
	 * @param goals - the goals that will contain the
	 *                new goal.
	 */
	private static int NEW_GOAL_ID = 1;

	public static void addNewGoal(Goals lib) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Goal va = factory.createGoal();
		va.setTitle("\"Title\"");
		va.setName("new_goal" + NEW_GOAL_ID++);
		va.setDescription("\"Desc\"");
		lib.getGoals().add(va);
	}

	/**
	 * Add a new goal to the model
	 * @param goals - the goals that will contain the
	 *                new goal.
	 */
	private static int NEW_REQ_ID = 1;

	public static void addNewRequirement(Requirements lib) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Requirement va = factory.createRequirement();
		va.setTitle("\"Title\"");
		va.setName("new_requirement" + NEW_REQ_ID++);
		va.setDescription("\"Desc\"");
		lib.getReqs().add(va);
	}

	/**
	 * Add a new stakeholder to the model
	 * @param model - the alisa model that will contain the
	 *                new stakeholder.
	 */
	private static int NEW_SH_ID = 1;

	public static Stakeholder addNewStakeholder(Organization org) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Stakeholder sh = factory.createStakeholder();
		sh.setTitle("\"Title\"");
		sh.setName("newstakeholder" + NEW_SH_ID++);
		sh.setRole("\"Role\"");
		sh.setDescription("\"Desc\"");
		org.getStakeholder().add(sh);
		return sh;
	}

	/**
	 * Create a new Model
	 */

	public static RequirementDocument createRequirementDocument() {
		AlisaFactory factory = AlisaFactoryImpl.init();
		RequirementDocument reqdoc = factory.createRequirementDocument();
		return reqdoc;
	}

	public static Requirements createRequirements(RDAPackage model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Requirements reqdoc = factory.createRequirements();
		model.getContent().add(reqdoc);
		return reqdoc;
	}

	public static Goals createGoals(RDAPackage model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Goals goals = factory.createGoals();
		model.getContent().add(goals);
		return goals;
	}

	public static VerificationLibrary createVerificationLibrary() {
		AlisaFactory factory = AlisaFactoryImpl.init();
		VerificationLibrary vl = factory.createVerificationLibrary();
		return vl;
	}

	public static ExternalDocuments createExternalDocuments() {
		AlisaFactory factory = AlisaFactoryImpl.init();
		ExternalDocuments reqdoc = factory.createExternalDocuments();
		return reqdoc;
	}

	public static Organization createOrganization() {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Organization reqdoc = factory.createOrganization();
		return reqdoc;
	}

	/**
	 * Remove an object from the model. Should make consistency
	 * check if the node is not referenced before in order
	 * to make sure the model is still consistent
	 * @param o     - the object to be removed
	 */
	public static void deleteObjectFromModel(EObject o) {
		if (!(o instanceof AlisaModel)) {
			EObject reqdoc = o.eContainer();
			reqdoc.eContents().remove(o);
		}
	}

}
