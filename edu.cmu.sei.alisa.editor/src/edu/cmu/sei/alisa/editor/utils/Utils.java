package edu.cmu.sei.alisa.editor.utils;

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
}
