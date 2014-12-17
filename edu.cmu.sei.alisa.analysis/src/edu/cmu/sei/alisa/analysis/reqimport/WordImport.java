package edu.cmu.sei.alisa.analysis.reqimport;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.model.StyleDescription;
import org.apache.poi.hwpf.model.StyleSheet;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Section;
import org.apache.poi.hwpf.usermodel.Table;
import org.apache.poi.hwpf.usermodel.TableRow;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import edu.cmu.alisa.sei.utils.Utils;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.RSALContainer;
import edu.cmu.sei.alisa.analysis.preferences.PreferencesValues;

public class WordImport {
	public static final int MAX_DEPTH = 5;
	public static int[] depthToStyleIdentifier = new int[MAX_DEPTH];
	public static String[] normalStyleStrings = { "Text Body", "Normal" };
	public static int[] normalStyleIdentifier = new int[normalStyleStrings.length];
	public static final int INVALID_STYLE = -1;
	private static int CURRENT_LEVEL = -1;

	public static boolean isRequirementDescription(Paragraph par) {
		for (int tmp = 0; tmp < normalStyleIdentifier.length; tmp++) {
			if (normalStyleIdentifier[tmp] == par.getStyleIndex()) {
				return true;
			}
		}
		return false;
	}

	public static int getDepth(Paragraph par) {
		for (int tmp = 0; tmp < depthToStyleIdentifier.length; tmp++) {
			if (depthToStyleIdentifier[tmp] == par.getStyleIndex()) {
				return tmp;
			}
		}
		return INVALID_STYLE;
	}

	public static boolean isRequirementTitle(Paragraph par) {
		return (getDepth(par) != INVALID_STYLE);
	}

	public static List<Table> getAllTables(HWPFDocument doc) {
		Range range;
		List<Table> tables;

		tables = new ArrayList<Table>();
		range = doc.getRange();

		for (int i = 0; i < range.numParagraphs(); i++) {
			try {
				Paragraph par = range.getParagraph(i);
				if (par.isInTable()) {
					try {
						Table table = range.getTable(par);
						if (!tables.contains(table)) {
							tables.add(table);
						}
					} catch (ArrayIndexOutOfBoundsException e) {
					} catch (IllegalArgumentException e) {
					}
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
		return tables;
	}

	public static AlisaModel importFile(String fileName, ImportType importType) {
		RSALContainer reqdoc;
		HWPFDocument doc;
		POIFSFileSystem fs;
//        WordExtractor wordExtractor;
//        Bookmarks bookmarks;
		Range range;
		StyleSheet styleSheet;
		Goal[] currentRequirements;
		Goal currentRequirement;
		List<Table> tables;
		int reqLevel;
		String reqTitle;
		String reqIdentifier;
		Goal req;

		currentRequirement = null;
		currentRequirements = new Goal[MAX_DEPTH];
		fs = null;

		reqdoc = Utils.createRSALContainer();

		try {
			fs = new POIFSFileSystem(new FileInputStream(fileName));
			doc = new HWPFDocument(fs);
//            wordExtractor = new WordExtractor(doc);
//            bookmarks = doc.getBookmarks();
			range = doc.getRange();
			styleSheet = doc.getStyleSheet();
//			Stakeholder genericStakeholder;

//			/**
//			 * Instantiate a generic stakeholder
//			 */
//			Organization org = Utils.createOrganization();
//			genericStakeholder = Utils.addNewStakeholder(org);
//			genericStakeholder.setTitle("\"System designer\"");

			/**
			 * Initialize the styles table
			 */
			for (int tmp = 0; tmp < normalStyleStrings.length; tmp++) {
				normalStyleIdentifier[tmp] = INVALID_STYLE;
			}

			for (int tmp = 0; tmp < MAX_DEPTH; tmp++) {
				depthToStyleIdentifier[tmp] = INVALID_STYLE;
			}

			/**
			 * Parse the style of the document and try to find the style identifier
			 * for each type (or level) of requirement.
			 */
			for (int sid = 0; sid < styleSheet.numStyles(); sid++) {
				StyleDescription styleDescription = styleSheet.getStyleDescription(sid);
				if ((styleDescription != null) && (styleDescription.getName() != null)) {
//            		AlisaDebug.debug("WordImport", "Style #" + sid + " content= " + styleDescription.getName());

					/**
					 * Identify the Normal Style Identifier for the document
					 * We retrieve that information in the document style sheet.
					 */
					for (int tmp = 0; tmp < normalStyleStrings.length; tmp++) {
						if (styleDescription.getName().equalsIgnoreCase(normalStyleStrings[tmp])) {
							normalStyleIdentifier[tmp] = sid;
						}
					}

					/**
					 * Identify the Style Identifier for each Header
					 * We retrieve that information in the document style sheet.
					 */
					for (int tmp = 0; tmp < MAX_DEPTH; tmp++) {
						if (styleDescription.getName().equalsIgnoreCase(PreferencesValues.getHeaderString(tmp))) {
							depthToStyleIdentifier[tmp] = sid;
						}
					}
				}
			}

			/**
			 * Import based on range and paragraphs
			 */
			tables = getAllTables(doc);

			for (Table table : tables) {
				for (int rowId = 0; rowId < table.numRows(); rowId++) {

					TableRow row = table.getRow(rowId);

					if (row.numCells() < 2) {
						continue;
					}

					reqTitle = Utils.filterString(row.getCell(1).text());
					reqIdentifier = Utils.fixIdentifier(Utils.filterString(row.getCell(0).text()));

					if ((reqTitle.length() > 0) && (reqIdentifier.length() > 0)) {

						req = Utils.addNewGoal(reqdoc);
						req.setTitle("\"" + reqTitle + "\"\n");
						req.setDescription(Utils.createDescription("\"\""));
						req.setName(reqIdentifier);
//						/**
//						 * Assign the requirement to a generic Stakeholder.
//						 */
//						req.getStakeholderReference().add(genericStakeholder);
					}

				}
			}

			/**
			 * Import based on the sections
			 */
			for (int sid = 0; sid < range.numSections(); sid++) {
				Section section = range.getSection(sid);

//            	AlisaDebug.debug("WordImport", "Section #" + sid);
				for (int pid = 0; pid < section.numParagraphs(); pid++) {
					Paragraph par = null;

					try {
						par = section.getParagraph(pid);
					} catch (ArrayIndexOutOfBoundsException e) {
					}

					if (par == null) {
						continue;
					}

					/**
					 * The paragraph is just a normal paragraph that details
					 * the content of the requirement. We then simply add
					 * the text content into the description of the requirement.
					 */
					if (isRequirementDescription(par)) {

						if (currentRequirement != null) {
							String existingText;
							String additionalText;

							existingText = Utils.getDescriptionAsString(currentRequirement.getDescription());
							existingText = existingText.replace("\"", "");
							existingText = existingText.replace("\n", "");

							additionalText = par.text();
							if (additionalText.length() > 1) {
								additionalText = additionalText.substring(0, additionalText.length() - 1);
								currentRequirement.setDescription(Utils.createDescription("\"" + existingText + " "
										+ additionalText + "\"\n"));
							}
						}

					}

					/**
					 * Here, it means that the style of the paragraph
					 * is a heading. Depending on the heading style, we
					 * create a requirement at the appropriate depth.
					 */
					if (isRequirementTitle(par)) {
						/**
						 * Get the requirement depth (in order to create
						 * the requirements hierarchy).
						 */
						reqLevel = getDepth(par);

						reqTitle = par.text();
						reqTitle = reqTitle.substring(0, reqTitle.length() - 1);

						req = Utils.addNewGoal(reqdoc);
						req.setTitle("\"" + par.text() + "\"\n");
						req.setDescription(Utils.createDescription("\"\""));

//						/**
//						 * Assign the requirement to a generic Stakeholder.
//						 */
//						req.getStakeholderReference().add(genericStakeholder);
//
//						/**
//						 * If the requirement level is more than 0, then, this
//						 * requirement depends on another requirements. We then
//						 * add a dependency between the new requirement and
//						 * the requirement at level - 1
//						 */
//						if ((reqLevel > 0) && (currentRequirements[reqLevel - 1] != null)) {
//	XXX TODO						Utils.addDependency(currentRequirements[reqLevel - 1], req);
//						}

						currentRequirements[reqLevel] = req;

						currentRequirement = req;

					}

//                	AlisaDebug.debug("WordImport", "Paragraph #" + pid + " content= " + par.text());
//                	AlisaDebug.debug("WordImport", "Paragraph #" + pid + " style= " + par.getStyleIndex());
//                	
//                	AlisaDebug.debug("WordImport", "Paragraph #" + pid + " getIlfo= " + par.getIlfo());
//                	AlisaDebug.debug("WordImport", "Paragraph #" + pid + " getIlvl= " + par.getIlvl());
				}
			}

//            for (int bid = 0 ; bid < bookmarks.getBookmarksCount() ; bid++)
//            {
//            	Bookmark bookmark = bookmarks.getBookmark(bid);
//            	AlisaDebug.debug("WordImport", "Bookmark #" + bid + " ; start=" + bookmark.getStart()+ " ; end=" + bookmark.getEnd()+ " ; name=" + bookmark.getName());
//            }

//            for (int fid = 0 ; fid < fields.; bid++)
//            {
//            	Bookmark bookmark = bookmarks.getBookmark(bid);
//            	AlisaDebug.debug("WordImport", "Bookmark #" + bid + " ; start=" + bookmark.getStart()+ " ; end=" + bookmark.getEnd()+ " ; name=" + bookmark.getName());
//            }

//            int nbParagraphs = 0;
//            for (String paragraph : wordExtractor.getParagraphText())
//            {
//            	AlisaDebug.debug("WordImport", "Paragraph #" + nbParagraphs + " ; " + paragraph);
//            	nbParagraphs++;
//            }

//            wordExtractor.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return reqdoc;
	}
}
