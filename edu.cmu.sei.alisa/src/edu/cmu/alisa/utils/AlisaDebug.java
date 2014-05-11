package edu.cmu.alisa.utils;

import edu.cmu.sei.alisa.alisa.AlisaFactory;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.impl.AlisaFactoryImpl;

public class AlisaDebug {
	static boolean DEBUG_ENABLE = true;
	private static Requirement[] debugRequirements;
	private static AlisaModel debugModel;
	private static Stakeholder[] debugStakeholders;
	private static boolean isInit = false;
	private static AlisaFactory factory = AlisaFactoryImpl.init();
	
	public static void debug (String str) {
		if (DEBUG_ENABLE) {
			System.out.println(str);
		}
	}
	
	
	
	public static Requirement[] getSampleRequirements ()
	{
		initDebug ();
    	return debugRequirements;
	}
	
	public static Stakeholder[] getSampleStakeholders ()
	{
		initDebug ();
    	return debugStakeholders;
	}
	
	public static void initDebug ()
	{
    	if (! isInit)
    	{
    		debugRequirements = new Requirement[2];
    		debugRequirements[0] = factory.createRequirement();
    		debugRequirements[0].setTitle("title1");
    		debugRequirements[0].setDescription("desc1");
    		debugRequirements[0].setComment("comment1");
    		debugRequirements[1] = factory.createRequirement();
    		debugRequirements[1].setTitle("title2");
    		debugRequirements[1].setDescription("desc2");
    		debugRequirements[1].setComment("comment2");
    		
    		debugStakeholders = new Stakeholder[2];
			debugStakeholders[0] = factory.createStakeholder();
			debugStakeholders[0].setTitle("title1");
			debugStakeholders[0].setDescription("desc1");
			debugStakeholders[0].setRole("role1");
			debugStakeholders[1] = factory.createStakeholder();
			debugStakeholders[1].setTitle("title2");
			debugStakeholders[1].setDescription("desc2");
			debugStakeholders[1].setRole("role2");
			
			debugModel = factory.createAlisaModel();
	    	for (Requirement r : debugRequirements)
	    	{
	    		debugModel.getContent().add(r);
	    	}
	    	
	    	for (Stakeholder s : debugStakeholders)
	    	{
	    		debugModel.getContent().add(s);
	    	}
    	}
    	isInit = true;
	}
	
	public static AlisaModel getSampleAlisaModel ()
	{
		initDebug ();

    	return debugModel;
	}
}
