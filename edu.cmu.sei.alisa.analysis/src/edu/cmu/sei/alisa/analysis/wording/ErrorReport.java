package edu.cmu.sei.alisa.analysis.wording;

public class ErrorReport {
	private String requirementName;
	private String report;
	
	public ErrorReport ()
	{
		
	}
	
	public void setRequirementName(String s)
	{
		this.requirementName = s;
	}
	
	public void setReport(String s)
	{
		this.report = s;
	}
	
	public String getRequirementName()
	{
		return this.requirementName;
	}
	
	public String getReport()
	{
		return this.report;
	}
}
