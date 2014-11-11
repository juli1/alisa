/**
 * generated by Xtext
 */
package edu.cmu.sei.alisa.validation;

import com.google.common.base.Objects;
import edu.cmu.sei.alisa.alisa.AlisaElement;
import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Goals;
import edu.cmu.sei.alisa.alisa.Organization;
import edu.cmu.sei.alisa.alisa.ReqDocContent;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDocument;
import edu.cmu.sei.alisa.alisa.Requirements;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationLibrary;
import edu.cmu.sei.alisa.validation.AbstractAlisaValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class AlisaValidator extends AbstractAlisaValidator {
  public final static String INVALID_IDENTIFIER = "existingIdentifier";
  
  @Check
  public void checkStakeholder(final Stakeholder stakeholder) {
    this.checkStakeholderName(stakeholder);
  }
  
  public void checkStakeholderName(final Stakeholder stakeholder) {
    EObject _eContainer = stakeholder.eContainer();
    Organization org = ((Organization) _eContainer);
    boolean _notEquals = (!Objects.equal(org, null));
    if (_notEquals) {
      EList<Stakeholder> _stakeholder = org.getStakeholder();
      for (final Stakeholder other : _stakeholder) {
        if ((other instanceof Stakeholder)) {
          Stakeholder otherStak = ((Stakeholder) other);
          boolean _notEquals_1 = (!Objects.equal(otherStak, null));
          if (_notEquals_1) {
            boolean _and = false;
            boolean _notEquals_2 = (!Objects.equal(otherStak, stakeholder));
            if (!_notEquals_2) {
              _and = false;
            } else {
              String _name = otherStak.getName();
              String _name_1 = stakeholder.getName();
              boolean _equalsIgnoreCase = _name.equalsIgnoreCase(_name_1);
              _and = _equalsIgnoreCase;
            }
            if (_and) {
              this.error("Stakeholders names have to be unique", AlisaPackage.Literals.STAKEHOLDER__NAME);
              return;
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkVerificationActivity(final VerificationActivity verificationActivity) {
    this.checkVerificationActivityName(verificationActivity);
  }
  
  public void checkVerificationActivityName(final VerificationActivity verificationActivity) {
    EObject _eContainer = verificationActivity.eContainer();
    if ((_eContainer instanceof VerificationLibrary)) {
      EObject _eContainer_1 = verificationActivity.eContainer();
      VerificationLibrary model = ((VerificationLibrary) _eContainer_1);
      boolean _notEquals = (!Objects.equal(model, null));
      if (_notEquals) {
        EList<AlisaElement> _content = model.getContent();
        for (final AlisaElement other : _content) {
          if ((other instanceof VerificationActivity)) {
            VerificationActivity otherVA = ((VerificationActivity) other);
            boolean _notEquals_1 = (!Objects.equal(otherVA, null));
            if (_notEquals_1) {
              boolean _and = false;
              boolean _notEquals_2 = (!Objects.equal(otherVA, verificationActivity));
              if (!_notEquals_2) {
                _and = false;
              } else {
                String _name = otherVA.getName();
                String _name_1 = verificationActivity.getName();
                boolean _equalsIgnoreCase = _name.equalsIgnoreCase(_name_1);
                _and = _equalsIgnoreCase;
              }
              if (_and) {
                this.error("Verification Activities names have to be unique", AlisaPackage.Literals.VERIFICATION_ACTIVITY__NAME);
                return;
              }
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkRequirement(final Requirement requirement) {
    this.checkRequirementName(requirement);
  }
  
  public void checkRequirementName(final Requirement requirement) {
    EObject _eContainer = requirement.eContainer();
    Requirements model = ((Requirements) _eContainer);
    boolean _notEquals = (!Objects.equal(model, null));
    if (_notEquals) {
      EList<Requirement> _reqs = model.getReqs();
      for (final Requirement other : _reqs) {
        if ((other instanceof Requirement)) {
          Requirement otherReq = ((Requirement) other);
          boolean _notEquals_1 = (!Objects.equal(otherReq, null));
          if (_notEquals_1) {
            boolean _and = false;
            boolean _notEquals_2 = (!Objects.equal(otherReq, requirement));
            if (!_notEquals_2) {
              _and = false;
            } else {
              String _name = otherReq.getName();
              String _name_1 = requirement.getName();
              boolean _equalsIgnoreCase = _name.equalsIgnoreCase(_name_1);
              _and = _equalsIgnoreCase;
            }
            if (_and) {
              this.error("Requirements names have to be unique", AlisaPackage.Literals.REQUIREMENT__NAME);
              return;
            }
          }
        }
      }
    }
  }
  
  @Check
  public void checkGoal(final Goal requirement) {
    this.checkGoalName(requirement);
  }
  
  public void checkGoalName(final Goal requirement) {
    EObject _eContainer = requirement.eContainer();
    if ((_eContainer instanceof Goals)) {
      EObject _eContainer_1 = requirement.eContainer();
      Goals model = ((Goals) _eContainer_1);
      boolean _notEquals = (!Objects.equal(model, null));
      if (_notEquals) {
        EList<Goal> _goals = model.getGoals();
        for (final Goal other : _goals) {
          if ((other instanceof Goal)) {
            Goal otherReq = ((Goal) other);
            boolean _notEquals_1 = (!Objects.equal(otherReq, null));
            if (_notEquals_1) {
              boolean _and = false;
              boolean _notEquals_2 = (!Objects.equal(otherReq, requirement));
              if (!_notEquals_2) {
                _and = false;
              } else {
                String _name = otherReq.getName();
                String _name_1 = requirement.getName();
                boolean _equalsIgnoreCase = _name.equalsIgnoreCase(_name_1);
                _and = _equalsIgnoreCase;
              }
              if (_and) {
                this.error("Requirements names have to be unique", AlisaPackage.Literals.REQUIREMENT__NAME);
                return;
              }
            }
          }
        }
      }
    } else {
      EObject _eContainer_2 = requirement.eContainer();
      if ((_eContainer_2 instanceof RequirementDocument)) {
        EObject _eContainer_3 = requirement.eContainer();
        RequirementDocument model_1 = ((RequirementDocument) _eContainer_3);
        boolean _notEquals_3 = (!Objects.equal(model_1, null));
        if (_notEquals_3) {
          EList<ReqDocContent> _content = model_1.getContent();
          for (final ReqDocContent other_1 : _content) {
            if ((other_1 instanceof Goal)) {
              Goal otherReq_1 = ((Goal) other_1);
              boolean _notEquals_4 = (!Objects.equal(otherReq_1, null));
              if (_notEquals_4) {
                boolean _and_1 = false;
                boolean _notEquals_5 = (!Objects.equal(otherReq_1, requirement));
                if (!_notEquals_5) {
                  _and_1 = false;
                } else {
                  String _name_2 = otherReq_1.getName();
                  String _name_3 = requirement.getName();
                  boolean _equalsIgnoreCase_1 = _name_2.equalsIgnoreCase(_name_3);
                  _and_1 = _equalsIgnoreCase_1;
                }
                if (_and_1) {
                  this.error("Requirements names have to be unique", AlisaPackage.Literals.REQUIREMENT__NAME);
                  return;
                }
              }
            }
          }
        }
      }
    }
  }
}
