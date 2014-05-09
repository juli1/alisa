package edu.cmu.sei.alisa.editor.utils;

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
}
