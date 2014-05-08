package edu.cmu.sei.alisa.editor.utils;

import edu.cmu.sei.alisa.alisa.AlisaFactory;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.impl.AlisaFactoryImpl;

public class AlisaDebug {
	static boolean DEBUG_ENABLE = true;

	public static void debug (String str) {
		if (DEBUG_ENABLE) {
			System.out.println(str);
		}
	}
	
	public static Requirement[] getSampleRequirements ()
	{
    	AlisaFactory factory = AlisaFactoryImpl.init();
		Requirement[] requirements;
    	requirements = new Requirement[2];
    	requirements[0] = factory.createRequirement();
    	requirements[0].setTitle("title1");
    	requirements[0].setDescription("desc1");
    	requirements[0].setComment("comment1");
    	requirements[1] = factory.createRequirement();
    	requirements[1].setTitle("title2");
    	requirements[1].setDescription("desc2");
    	requirements[1].setComment("comment2");
    	return requirements;
	}
	
	public static Stakeholder[] getSampleStakeholders ()
	{
    	AlisaFactory factory = AlisaFactoryImpl.init();
		Stakeholder[] stakeholders;
		stakeholders = new Stakeholder[2];
		stakeholders[0] = factory.createStakeholder();
		stakeholders[0].setTitle("title1");
		stakeholders[0].setDescription("desc1");
		stakeholders[0].setRole("role1");
		stakeholders[1] = factory.createStakeholder();
		stakeholders[1].setTitle("title2");
		stakeholders[1].setDescription("desc2");
		stakeholders[1].setRole("role2");
    	return stakeholders;
	}
	
	public static AlisaModel getSampleAlisaModel ()
	{
    	AlisaFactory factory = AlisaFactoryImpl.init();
		Requirement[] requirements;
    	requirements = new Requirement[2];
    	AlisaModel model = factory.createAlisaModel();
    	for (Requirement r : getSampleRequirements())
    	{
    		model.getContent().add(r);
    	}
    	
    	for (Stakeholder s : getSampleStakeholders())
    	{
    		model.getContent().add(s);
    	}
    	return model;
	}
}
