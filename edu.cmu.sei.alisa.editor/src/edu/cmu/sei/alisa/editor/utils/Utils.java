package edu.cmu.sei.alisa.editor.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.RequirementDecomposition;
import edu.cmu.sei.alisa.alisa.Stakeholder;

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
}
