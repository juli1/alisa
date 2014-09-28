package edu.cmu.alisa.sei.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.osate.xtext.aadl2.properties.util.EMFIndexRetrieval;

import edu.cmu.sei.alisa.alisa.AlisaFactory;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.DocumentedRequirement;
import edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.ExternalDocuments;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Goals;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDocument;
import edu.cmu.sei.alisa.alisa.Requirements;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.Stakeholders;
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

	public static Stakeholder findStakeHolder(AlisaModel alisaModel, String name) {
		EObject obj = EMFIndexRetrieval.getDottedEObjectOfType(AlisaPackage.eINSTANCE.getStakeholder(), name);
		return (Stakeholder) obj;
	}

	public static String getDecompositionString(DocumentedRequirementDecomposition decomposition) {
		String result = "";

		if (decomposition.getElement() != null) {
			result += decomposition.getElement().getName();
		} else {

			if (decomposition.getLeft() != null) {
				result += decomposition.getLeft().getName();

			}

			if (decomposition.getType() != null) {
				result += " " + decomposition.getType() + " ";
			}

			if (decomposition.getRight() != null) {
				result += getDecompositionString(decomposition.getRight());
			}
		}
		return result;
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
	 * Convert a list of stakeholders into a readable string
	 * @param req
	 * @return
	 */
	public static String getDocumentedRequirementAsString(List<DocumentedRequirement> req) {
		String strVal = "";
		boolean firstPassed = false;
		for (DocumentedRequirement s : req) {
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

	public static List<Stakeholder> getStakeholdersFromString(AlisaModel model, String str) {
		List<Stakeholder> stakeholders = new ArrayList<Stakeholder>();
		for (String stakeholderName : str.split(",")) {
			Stakeholder s = Utils.findStakeHolder(model, stakeholderName);
			if (s != null) {
				AlisaDebug.debug("[AlisaEditorCell] found stakeholder");
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

	public static DocumentedRequirement addNewDocumentedRequirement(RequirementDocument reqdoc) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		DocumentedRequirement req = factory.createDocumentedRequirement();
		req.setTitle("\"Title\"");
		req.setName("newreq" + NEW_DOCREQ_ID++);
		req.setComment("\"Comment\"");
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
		xdoc.setXternalReference("\"XRef to doc\"");
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
		va.setReqkind("requirement");
		lib.getReqs().add(va);
	}

	/**
	 * Add a new stakeholder to the model
	 * @param model - the alisa model that will contain the
	 *                new stakeholder.
	 */
	private static int NEW_SH_ID = 1;

	public static Stakeholder addNewStakeholder(Stakeholders org) {
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
	private static int NEW_MODEL_ID = 1;

	public static AlisaModel createModel() {
		AlisaFactory factory = AlisaFactoryImpl.init();
		return factory.createAlisaModel();
	}

	public static RequirementDocument createReqDoc(AlisaModel model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		RequirementDocument reqdoc = factory.createRequirementDocument();
		model.getContent().add(reqdoc);
		return reqdoc;
	}

	public static Requirements createRequirements(AlisaModel model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Requirements reqdoc = factory.createRequirements();
		model.getContent().add(reqdoc);
		return reqdoc;
	}

	public static Goals createGoals(AlisaModel model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Goals goals = factory.createGoals();
		model.getContent().add(goals);
		return goals;
	}

	public static VerificationLibrary createVerificationLibrary(AlisaModel model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		VerificationLibrary vl = factory.createVerificationLibrary();
		model.getContent().add(vl);
		return vl;
	}

	public static ExternalDocuments createExternalDocuments(AlisaModel model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		ExternalDocuments reqdoc = factory.createExternalDocuments();
		model.getContent().add(reqdoc);
		return reqdoc;
	}

	public static Stakeholders createStakeholders(AlisaModel model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Stakeholders reqdoc = factory.createStakeholders();
		model.getContent().add(reqdoc);
		return reqdoc;
	}

	/**
	 * Remove an object from the model. Should make consistency
	 * check if the node is not referenced before in order
	 * to make sure the model is still consistent
	 * @param o     - the object to be removed
	 */
	public static void deleteObjectFromModel(EObject o) {
		if (o instanceof DocumentedRequirement) {
			RequirementDocument reqdoc = (RequirementDocument) o.eContainer();
			reqdoc.getContent().remove(o);
		}
		if (o instanceof Stakeholder) {
			Stakeholders container = (Stakeholders) o.eContainer();
			container.getStakeholder().remove(o);
		}
		if (o instanceof Stakeholders) {
			AlisaModel container = (AlisaModel) o.eContainer();
			container.getContent().remove(o);
		}
	}

	public static void addDependency(DocumentedRequirement parent, DocumentedRequirement subDocumentedRequirement) {
		DocumentedRequirementDecomposition actualDecomposition;
		DocumentedRequirementDecomposition newDecomposition;
		AlisaFactory factory;

		factory = AlisaFactoryImpl.init();

		newDecomposition = factory.createDocumentedRequirementDecomposition();

		if (parent.getDecomposedBy().size() > 0) {
			actualDecomposition = parent.getDecomposedBy().get(0);
		} else {
			actualDecomposition = null;
		}

		if (actualDecomposition == null) {
			newDecomposition.setElement(subDocumentedRequirement);

			parent.getDecomposedBy().add(newDecomposition);
		} else {
			newDecomposition.setLeft(subDocumentedRequirement);
			newDecomposition.setRight(actualDecomposition);
			newDecomposition.setType("and");
			parent.getDecomposedBy().add(newDecomposition);

		}

	}
}
