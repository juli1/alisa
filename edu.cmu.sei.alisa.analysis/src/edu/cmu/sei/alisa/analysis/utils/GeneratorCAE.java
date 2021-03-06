package edu.cmu.sei.alisa.analysis.utils;

//import net.certware.argument.arm.ArgumentElement;
//import net.certware.argument.caz.ArgumentDiagram;
//import net.certware.argument.caz.CazFactory;
//import net.certware.argument.caz.Claim;
//import net.certware.argument.caz.Evidence;
//import net.certware.argument.caz.diagram.part.CazCreationWizard;

public class GeneratorCAE {
//	private static final CazFactory f = CazFactory.eINSTANCE;
//
//	private static ArgumentDiagram argumentDiagram = f.createArgumentDiagram();
//	private static int id = 1;
//	private final static int SUBSTR_LEN = 60;
//
//	public static void init() {
//		argumentDiagram = f.createArgumentDiagram();
//		id = 1;
//	}
//
//	public static void generate(ArgumentElement parent, Requirement requirement) {
//		String content = "";
//
//		if (requirement == null) {
//			return;
//		}
//
//		Claim claim = f.createClaim();
//
//		content = requirement.getName();
//		if (requirement.getDescription() != null) {
//			if (requirement.getDescription().length() > SUBSTR_LEN) {
//				content += " - " + requirement.getDescription().substring(0, SUBSTR_LEN) + " ...";
//			} else {
//				content += " - " + requirement.getDescription();
//			}
//		}
//
//		claim.setIdentifier(Integer.toString(id++));
//		claim.setContent(content);
//		claim.setDescription(requirement.getDescription());
//
//		argumentDiagram.getClaims().add(claim);
//		if (parent != null) {
//			if (parent instanceof Claim) {
//				Claim c = (Claim) parent;
//				c.getSubClaims().add(claim);
//			}
//		}
//
//		parent = claim;
//
//		for (RequirementDecomposition rd : requirement.getDecomposedBy()) {
//			generate(claim, rd);
//		}
//
//		for (VerificationDecomposition rd : requirement.getVerifiedBy()) {
//			generate(claim, rd);
//		}
//	}
//
//	public static void generate(ArgumentElement parent, VerificationActivity verificationActivity) {
//		String content = "";
//
//		if ((verificationActivity.getDecomposedTo() == null) || (verificationActivity.getDecomposedTo().size() == 0)) {
//			Evidence evidence = f.createEvidence();
//
//			content = verificationActivity.getName();
//			if (verificationActivity.getDescription() != null) {
//				if (verificationActivity.getDescription().length() > SUBSTR_LEN) {
//					content += " - " + verificationActivity.getDescription().substring(0, SUBSTR_LEN) + " ...";
//				} else {
//					content += " - " + verificationActivity.getDescription();
//				}
//			}
//
//			evidence.setIdentifier(Integer.toString(id++));
//			evidence.setContent(content);
//			evidence.setDescription(verificationActivity.getDescription());
//
//			argumentDiagram.getEvidence().add(evidence);
//			if (parent != null) {
//				if (parent instanceof Claim) {
//					Claim c = (Claim) parent;
//					c.getClaimSolutions().add(evidence);
//
//				}
//			}
//		} else {
//			Claim claim = f.createClaim();
//			content = verificationActivity.getName();
//			if (verificationActivity.getDescription() != null) {
//				if (verificationActivity.getDescription().length() > SUBSTR_LEN) {
//					content += " - " + verificationActivity.getDescription().substring(0, SUBSTR_LEN) + " ...";
//				} else {
//					content += " - " + verificationActivity.getDescription();
//				}
//			}
//
//			claim.setIdentifier(Integer.toString(id++));
//			claim.setContent(content);
//			claim.setDescription(verificationActivity.getDescription());
//
//			argumentDiagram.getClaims().add(claim);
//			if (parent != null) {
//				if (parent instanceof Claim) {
//					Claim c = (Claim) parent;
//					c.getSubClaims().add(claim);
//				}
//			}
//
//			for (VerificationDecomposition vd : verificationActivity.getDecomposedTo()) {
//				generate(claim, vd);
//			}
//		}
//	}
//
//	public static void generate(ArgumentElement parent, RequirementDecomposition decomposition) {
//		if (decomposition.getLeft() != null) {
//			generate(parent, decomposition.getLeft());
//		}
//
//		if (decomposition.getRight() != null) {
//			generate(parent, decomposition.getRight());
//		}
//
//		if (decomposition.getElement() != null) {
//			generate(parent, decomposition.getElement());
//		}
//	}
//
//	public static void generate(ArgumentElement parent, VerificationDecomposition decomposition) {
//		if (decomposition.getLeft() != null) {
//			generate(parent, decomposition.getLeft());
//		}
//
//		if (decomposition.getRight() != null) {
//			generate(parent, decomposition.getRight());
//		}
//
//		if (decomposition.getElement() != null) {
//			generate(parent, decomposition.getElement());
//		}
//	}
//
//	public static void save(IProject project) {
//		CazCreationWizard wizard = new CazCreationWizard();
//		IStructuredSelection selection = new StructuredSelection(project);
//		wizard.init(PlatformUI.getWorkbench(), selection);
//		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
//		WizardDialog dialog = new WizardDialog(shell, wizard);
//
//		if (dialog.open() == WizardDialog.OK) {
//			Diagram diagram = (Diagram) wizard.getDiagram().getContents().get(0);
//			final Resource modelResource = diagram.getElement().eResource();
//
//			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(modelResource);
//			domain.getCommandStack().execute(new RecordingCommand(domain) {
//				@Override
//				protected void doExecute() {
//					modelResource.getContents().clear();
//					modelResource.getContents().add(argumentDiagram);
//					try {
//						modelResource.save(null);
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			});
//		}
//	}
}
