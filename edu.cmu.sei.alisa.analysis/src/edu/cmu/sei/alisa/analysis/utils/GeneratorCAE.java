package edu.cmu.sei.alisa.analysis.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import net.certware.argument.arm.ArgumentElement;
import net.certware.argument.caz.Argument;
import net.certware.argument.caz.ArgumentDiagram;
import net.certware.argument.caz.CazFactory;
import net.certware.argument.caz.Claim;
import net.certware.argument.caz.Evidence; 
import net.certware.argument.caz.Justification;
import net.certware.argument.caz.diagram.part.CazCreationWizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.IStructuredSelection; 
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDecomposition;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;


public class GeneratorCAE
{
	private static final CazFactory f = CazFactory.eINSTANCE;

	private static ArgumentDiagram argumentDiagram = f.createArgumentDiagram();
	private static int id = 1;
	private final static int SUBSTR_LEN = 15;

	public static void init ()
	{
		argumentDiagram = f.createArgumentDiagram();
		id = 1;
	}
	
	public static void generate (ArgumentElement parent, Requirement requirement)
	{
		String content = "";
	
		if (requirement == null)
		{
			return;
		}
		

		Claim claim = f.createClaim();

		content = requirement.getName();
		if (requirement.getDescription() != null)
		{
			if (requirement.getDescription().length() > 15)
			{
				content += " - " + requirement.getDescription().substring(0, SUBSTR_LEN) + " ...";
			}
			else
			{
				content += " - " + requirement.getDescription();
			}
		}

		claim.setIdentifier(Integer.toString(id++));
		claim.setContent(content);
		claim.setDescription(requirement.getDescription());

		argumentDiagram.getClaims().add(claim);
		if (parent != null) 
		{
			if (parent instanceof Claim)
			{
				Claim c = (Claim) parent;
				c.getSubClaims().add (claim);
			}
		}

		parent = claim;


		for (RequirementDecomposition rd : requirement.getDecomposedBy())
		{
			generate (claim, rd);
		}
		
		for (VerificationDecomposition rd : requirement.getVerifiedBy())
		{
			generate (claim, rd);
		}
	}
	
	public static void generate (ArgumentElement parent, VerificationActivity verificationActivity)
	{
		String content = "";
	
		Justification justification = f.createJustification();

		content = verificationActivity.getName();
		if (verificationActivity.getDescription() != null)
		{
			if (verificationActivity.getDescription().length() > 15)
			{
				content += " - " + verificationActivity.getDescription().substring(0, SUBSTR_LEN) + " ...";
			}
			else
			{
				content += " - " + verificationActivity.getDescription();
			}
		}

		justification.setIdentifier(Integer.toString(id++));
		justification.setContent(content);
		justification.setDescription(verificationActivity.getDescription());

		argumentDiagram.getJustifications().add(justification);
		if (parent != null) 
		{
			if (parent instanceof Argument)
			{
				Argument a = (Argument) parent;
				a.getArgumentJustification().add(justification);
			}
		}
	}

	public static void generate (ArgumentElement parent, RequirementDecomposition decomposition)
	{
		if (decomposition.getLeft() != null)
		{
			generate (parent, decomposition.getLeft());
		}
		
		if (decomposition.getRight() != null)
		{
			generate (parent, decomposition.getRight());
		}
		
	}
	
	public static void generate (ArgumentElement parent, VerificationDecomposition decomposition)
	{
		generate (parent, decomposition.getLeft());
		generate (parent, decomposition.getRight());
		generate (parent, decomposition.getElements());
	}
	
public static void save(IProject project) {
	CazCreationWizard wizard = new CazCreationWizard();
	IStructuredSelection selection = new StructuredSelection(project);
	wizard.init(PlatformUI.getWorkbench(), selection);
	Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	WizardDialog dialog = new WizardDialog(shell, wizard);

	if (dialog.open() == WizardDialog.OK) {
		Diagram diagram = (Diagram) wizard.getDiagram().getContents().get(0);
		final Resource modelResource = diagram.getElement().eResource();

		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(modelResource);
		domain.getCommandStack().execute(new RecordingCommand(domain) {
			@Override 
			protected void doExecute() {
				modelResource.getContents().clear();
				modelResource.getContents().add(argumentDiagram);
				try {
					modelResource.save(null);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
	}
}
}
