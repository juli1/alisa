/*
 * generated by Xtext
 */
package edu.cmu.sei.alisa.validation

import edu.cmu.sei.alisa.alisa.Requirement
import edu.cmu.sei.alisa.alisa.AlisaPackage
import org.eclipse.xtext.validation.Check
import edu.cmu.sei.alisa.alisa.AlisaModel
import edu.cmu.sei.alisa.alisa.Stakeholder
import edu.cmu.sei.alisa.alisa.VerificationActivity

//import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class AlisaValidator extends AbstractAlisaJavaValidator 
{

  public static val INVALID_IDENTIFIER = 'existingIdentifier'
	
	@Check
	def checkStakeholder(Stakeholder stakeholder) {
		checkStakeholderName (stakeholder)
	}
	
	def checkStakeholderName(Stakeholder stakeholder)
	{
		var model = (stakeholder.eContainer() as AlisaModel);
		if (model != null) {
			for (other : model.content)
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
		var model = (verificationActivity.eContainer() as AlisaModel);
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

	@Check
	def checkRequirement(Requirement requirement) {
		checkRequirementName (requirement)
	}
	
	def checkRequirementName(Requirement requirement)
	{
		var model = (requirement.eContainer() as AlisaModel);
		if (model != null) {
			for (other : model.content)
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
}
