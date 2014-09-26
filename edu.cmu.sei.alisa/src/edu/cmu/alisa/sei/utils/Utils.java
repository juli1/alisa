package edu.cmu.alisa.sei.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import edu.cmu.sei.alisa.alisa.AlisaFactory;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.DocumentedRequirement;
import edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
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
		for (EObject eo : alisaModel.getContent()) {
			if (eo instanceof Stakeholder) {
				Stakeholder s = (Stakeholder) eo;
				if (s.getName().equalsIgnoreCase(name)) {
					return s;
				}
			}
		}
		return null;
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
	private static int NEW_REQ_ID = 1;

	public static DocumentedRequirement addNewDocumentedRequirement(AlisaModel model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		DocumentedRequirement req = factory.createDocumentedRequirement();
		req.setTitle("\"Title\"");
		req.setName("newreq" + NEW_REQ_ID++);
		req.setComment("\"Comment\"");
		req.setDescription("\"Desc\"");
		model.getContent().add(req);

		return req;
	}

	/**
	 * Add a new verification activity to the model
	 * @param model - the alisa model that will contain the
	 *                new verification activity.
	 */
	private static int NEW_VA_ID = 1;

	public static void addNewVerificationActivity(AlisaModel model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		VerificationActivity va = factory.createVerificationActivity();
		va.setTitle("\"Title\"");
		va.setName("new_verification_activity" + NEW_VA_ID++);
		va.setMethod("manual");
		va.setDescription("\"Desc\"");
		model.getContent().add(va);
	}

	/**
	 * Add a new stakeholder to the model
	 * @param model - the alisa model that will contain the
	 *                new stakeholder.
	 */
	private static int NEW_SH_ID = 1;

	public static Stakeholder addNewStakeholder(AlisaModel model) {
		AlisaFactory factory = AlisaFactoryImpl.init();
		Stakeholder sh = factory.createStakeholder();
		sh.setTitle("\"Title\"");
		sh.setName("newstakeholder" + NEW_SH_ID++);
		sh.setRole("\"Role\"");
		sh.setDescription("\"Desc\"");
		model.getContent().add(sh);
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

	/**
	 * Remove an object from the model. Should make consistency
	 * check if the node is not referenced before in order
	 * to make sure the model is still consistent
	 * @param model - the AlisaModel that contain the object to remove
	 * @param o     - the object to be removed
	 */
	public static void deleteObjectFromModel(AlisaModel model, Object o) {
		model.getContent().remove(o);
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
