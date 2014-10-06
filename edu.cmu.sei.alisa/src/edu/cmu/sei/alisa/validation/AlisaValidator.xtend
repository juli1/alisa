/*
 * generated by Xtext
 */
package edu.cmu.sei.alisa.validation

import edu.cmu.sei.alisa.alisa.AlisaPackage
import org.eclipse.xtext.validation.Check
import edu.cmu.sei.alisa.alisa.Stakeholder
import edu.cmu.sei.alisa.alisa.VerificationActivity
import edu.cmu.sei.alisa.alisa.VerificationLibrary
import edu.cmu.sei.alisa.alisa.Organization
import edu.cmu.sei.alisa.alisa.Requirement
import edu.cmu.sei.alisa.alisa.Goal
import edu.cmu.sei.alisa.alisa.Goals
import edu.cmu.sei.alisa.alisa.Requirements
import edu.cmu.sei.alisa.alisa.RequirementDocument


/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class AlisaValidator extends AbstractAlisaValidator 
{  
 
  public static val INVALID_IDENTIFIER = 'existingIdentifier'
	
	@Check
	def checkStakeholder(Stakeholder stakeholder) {
		checkStakeholderName (stakeholder)
	}
	
	def checkStakeholderName(Stakeholder stakeholder)
	{ 
		var org = (stakeholder.eContainer() as Organization);
		if (org != null) {
			for (other : org.stakeholder)
			{
				if (other instanceof Stakeholder)
				{
					var otherStak = other as Stakeholder;
					if (otherStak != null)
					{
						if ((otherStak != stakeholder) && (otherStak.name.equalsIgnoreCase(stakeholder.name)))
						{
							error("Stakeholders names have to be unique", AlisaPackage$Literals::STAKEHOLDER__NAME);
							return;
						}
					}
				}
			}
		}
	}



	@Check
	def checkVerificationActivity (VerificationActivity verificationActivity)
	{
		checkVerificationActivityName (verificationActivity)
	}
	
	def checkVerificationActivityName (VerificationActivity verificationActivity)
	{
		if (verificationActivity.eContainer() instanceof VerificationLibrary)
		{
			var model = (verificationActivity.eContainer() as VerificationLibrary);
			if (model != null) {
				for (other : model.content)
				{
					if (other instanceof VerificationActivity)
					{
						var otherVA = other as VerificationActivity;
						if (otherVA != null)
						{
							if ((otherVA != verificationActivity) && (otherVA.name.equalsIgnoreCase(verificationActivity.name)))
							{
								error("Verification Activities names have to be unique", AlisaPackage$Literals::VERIFICATION_ACTIVITY__NAME);
								return;
							}
						}
					}
				}
			}
		}
		
	}

	@Check
	def checkRequirement(Requirement requirement) {
		checkRequirementName (requirement)
	}
	
	def checkRequirementName(Requirement requirement)
	{
		var model = (requirement.eContainer() as Requirements);
		if (model != null) {
			for (other : model.reqs)
			{
				if (other instanceof Requirement)
				{
					var otherReq = other as Requirement;
					if (otherReq != null)
					{
						if ((otherReq != requirement) && (otherReq.name.equalsIgnoreCase(requirement.name)))
						{
							error("Requirements names have to be unique", AlisaPackage$Literals::REQUIREMENT__NAME);
							return;
						}
					}
				}
			}
		}
	}

	@Check
	def checkGoal(Goal requirement) {
		checkGoalName (requirement)
	}
	
	def checkGoalName(Goal requirement)
	{
		if (requirement.eContainer() instanceof Goals){
		var model = (requirement.eContainer() as Goals);
		if (model != null) {
			for (other : model.goals)
			{
				if (other instanceof Goal)
				{
					var otherReq = other as Goal;
					if (otherReq != null)
					{
						if ((otherReq != requirement) && (otherReq.name.equalsIgnoreCase(requirement.name)))
						{
							error("Requirements names have to be unique", AlisaPackage$Literals::REQUIREMENT__NAME);
							return;
						}
					}
				}
			}
		}
		} else 	if (requirement.eContainer() instanceof RequirementDocument){
		var model = (requirement.eContainer() as RequirementDocument);
		if (model != null) {
			for (other : model.content)
			{
				if (other instanceof Goal)
				{
					var otherReq = other as Goal;
					if (otherReq != null)
					{
						if ((otherReq != requirement) && (otherReq.name.equalsIgnoreCase(requirement.name)))
						{
							error("Requirements names have to be unique", AlisaPackage$Literals::REQUIREMENT__NAME);
							return;
						}
					}
				}
			}
		}
		}			
	}
}
