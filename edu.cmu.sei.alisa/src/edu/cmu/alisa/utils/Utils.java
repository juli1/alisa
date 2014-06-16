package edu.cmu.alisa.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import edu.cmu.sei.alisa.alisa.AlisaFactory;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDecomposition;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.impl.AlisaFactoryImpl;

public class Utils {
	public static String fixString (String s)
	{
		if (s != null)
		{
			return s.replaceAll("\"", "");
		}
		else
		{
			return "\"\"";
		}
	}
	
	public static Stakeholder findStakeHolder (AlisaModel alisaModel, String name)
	{
		for (EObject eo : alisaModel.getContent())
		{
			if (eo instanceof Stakeholder)
			{
				Stakeholder s = (Stakeholder)eo;
				if (s.getName().equalsIgnoreCase(name))
				{
					return s;
				}
			}
		}
		return null;
	}
	
	
	public static String getDecompositionString (RequirementDecomposition decomposition)
	{
		String result = "";
		
		if (decomposition.getElement() != null)
		{
			result += decomposition.getElement().getName();
		}
		else
		{
		
			if (decomposition.getLeft() != null)
			{
				result += decomposition.getLeft().getName();
				
			}
			
			if (decomposition.getType() != null)
			{
				result += " " + decomposition.getType() + " "; 
			}
			
			if (decomposition.getRight() != null)
			{
				result += getDecompositionString (decomposition.getRight()); 
			}
		}
		return result;
	}
	
	/**
	 * Convert a list of stakeholders into a readable string
	 * @param stakeholders
	 * @return
	 */
	public static String getStakeholderListAsString (List<Stakeholder> stakeholders)
	{
		String strVal = "";
		boolean firstPassed = false;
		for (Stakeholder s : stakeholders)
		{
			if (firstPassed == true)
			{
				strVal += ",";
			
			}
			
			strVal += s.getName();
			firstPassed = true;
		}
		return strVal;
	}
	
	public static String wrapValue (Object o)
	{
		return "\"" + o.toString() +"\"";
	}
	
	public static List<Stakeholder> getStakeholdersFromString (AlisaModel model, String str)
	{
		List<Stakeholder> stakeholders = new ArrayList<Stakeholder>();
		for (String stakeholderName : str.split(","))
		{
			Stakeholder s = Utils.findStakeHolder(model, stakeholderName);
			if (s != null)
			{
				AlisaDebug.debug ("[AlisaEditorCell] found stakeholder");
				stakeholders.add(s);
			}
		}
		return stakeholders;
	}
	
	/**
	 * Add a new requirement to the model
	 * @param model - the alisa model that will contain the
	 *                new requirement.
	 */
	private static int NEW_REQ_ID = 1;
	public static Requirement addNewRequirement (AlisaModel model)
	{
		AlisaFactory factory = AlisaFactoryImpl.init();
		Requirement req = factory.createRequirement();
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
	public static void addNewVerificationActivity (AlisaModel model)
	{
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
	public static Stakeholder addNewStakeholder (AlisaModel model)
	{
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
	public static AlisaModel createModel ()
	{
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
	public static void deleteObjectFromModel (AlisaModel model, Object o)
	{
		model.getContent().remove (o);
	}
}
