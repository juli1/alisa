/**
 * generated by Xtext
 */
package edu.cmu.sei.alisa.validation;

import com.google.common.base.Objects;
import edu.cmu.sei.alisa.alisa.ContractualElement;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Organization;
import edu.cmu.sei.alisa.alisa.RSALContainer;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.validation.AbstractAlisaValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.osate.aadl2.Aadl2Package;

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
              EAttribute _namedElement_Name = Aadl2Package.eINSTANCE.getNamedElement_Name();
              this.error("Stakeholders names have to be unique", _namedElement_Name);
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
    if ((_eContainer instanceof RSALContainer)) {
      EObject _eContainer_1 = verificationActivity.eContainer();
      RSALContainer model = ((RSALContainer) _eContainer_1);
      boolean _notEquals = (!Objects.equal(model, null));
      if (_notEquals) {
        EList<EObject> _content = model.getContent();
        for (final EObject other : _content) {
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
                EAttribute _namedElement_Name = Aadl2Package.eINSTANCE.getNamedElement_Name();
                this.error("Verification Activities names have to be unique", _namedElement_Name);
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
    this.checkContractualName(requirement);
  }
  
  @Check
  public void checkGoal(final Goal requirement) {
    this.checkContractualName(requirement);
  }
  
  public void checkContractualName(final ContractualElement requirement) {
    EObject _eContainer = requirement.eContainer();
    RSALContainer model = ((RSALContainer) _eContainer);
    boolean _notEquals = (!Objects.equal(model, null));
    if (_notEquals) {
      EList<EObject> _content = model.getContent();
      for (final EObject other : _content) {
        if ((other instanceof ContractualElement)) {
          ContractualElement otherReq = ((ContractualElement) other);
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
              EAttribute _namedElement_Name = Aadl2Package.eINSTANCE.getNamedElement_Name();
              this.error("Requirement and goal names have to be unique within a container", _namedElement_Name);
              return;
            }
          }
        }
      }
    }
  }
}
