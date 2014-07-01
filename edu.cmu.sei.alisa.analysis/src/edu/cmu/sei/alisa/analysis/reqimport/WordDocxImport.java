package edu.cmu.sei.alisa.analysis.reqimport;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.model.StyleDescription;
import org.apache.poi.hwpf.model.StyleSheet;
import org.apache.poi.hwpf.usermodel.Bookmark;
import org.apache.poi.hwpf.usermodel.Bookmarks;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Section;
import org.apache.poi.hwpf.usermodel.Table;
import org.apache.poi.hwpf.usermodel.TableCell;
import org.apache.poi.hwpf.usermodel.TableRow;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import edu.cmu.alisa.utils.AlisaDebug;
import edu.cmu.alisa.utils.Utils;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.analysis.preferences.PreferencesValues;

public class WordDocxImport
{
	public static final int		MAX_DEPTH = 5;
	public static int[] 		depthToStyleIdentifier 	= new int[MAX_DEPTH];
	public static String[] 		normalStyleStrings 	= {"Text Body", "Normal"};
	public static int[] 		normalStyleIdentifier 	= new int[normalStyleStrings.length];
	public static final int 	INVALID_STYLE = -1;
	private static int 			CURRENT_LEVEL = -1;


	public static boolean isRequirementDescription (Paragraph par)
	{
		for (int tmp = 0 ; tmp < normalStyleIdentifier.length ; tmp++)
		{
			if (normalStyleIdentifier[tmp] == par.getStyleIndex())
			{
				return true;
			}
		}
		return false;
	}

	public static int getDepth (Paragraph par)
	{
		for (int tmp = 0 ; tmp < depthToStyleIdentifier.length ; tmp++)
		{
			if (depthToStyleIdentifier[tmp] == par.getStyleIndex())
			{
				AlisaDebug.debug("WordImport", "style index number " + par.getStyleIndex() + " is level " + (tmp + 1));
				return tmp;
			}
		}
		return INVALID_STYLE;
	}

	public static boolean isRequirementTitle (Paragraph par)
	{
		return (getDepth(par) != INVALID_STYLE);
	}

	


	public static AlisaModel importFile (String fileName, ImportType importType)
	{
		AlisaModel returnedModel;
		XWPFDocument  doc;
		POIFSFileSystem fs;
		//        WordExtractor wordExtractor;
		//        Bookmarks bookmarks;
		Range range;
		StyleSheet styleSheet;
		Requirement[] currentRequirements;
		Requirement currentRequirement;
		List<Table> tables;
		int reqLevel;
		String reqTitle;
		String reqIdentifier;
		Requirement req;



		currentRequirement = null;
		currentRequirements 	= new Requirement[MAX_DEPTH];
		fs = null;

		returnedModel = Utils.createModel();

		try {
			doc = new XWPFDocument (OPCPackage.open(new FileInputStream(fileName))); 
			//            wordExtractor = new WordExtractor(doc);
			//            bookmarks = doc.getBookmarks();
		
			Stakeholder genericStakeholder;


			/**
			 * Instantiate a generic stakeholder
			 */
			genericStakeholder = Utils.addNewStakeholder(returnedModel);
			genericStakeholder.setTitle("\"System designer\"");


			for (XWPFTable table : doc.getTables())
			{
				for (XWPFTableRow row : table.getRows())
				{
					if (row.getTableCells().size() > 3)
					{
//						AlisaDebug.debug ("WordImport", "cell 0 =" + row.getTableCells().get(0).getText() + "cell 1 =" + row.getTableCells().get(1).getText());
						boolean isRequirement;
						
						isRequirement   = row.getTableCells().get(2).getText().equalsIgnoreCase("true");
						reqTitle 		= Utils.filterString(row.getTableCells().get(1).getText());
	            		reqIdentifier 	= Utils.fixIdentifier(Utils.filterString( row.getTableCells().get(0).getText()));
	            		
	            		if ((isRequirement) && (reqIdentifier != null) && (reqTitle.length() > 0) && (reqIdentifier.length() > 0))
	            		{
	            			
		            		req = Utils.addNewRequirement(returnedModel);
		            		req.setTitle("\"" + reqTitle + "\"\n");
		            		req.setDescription("\"\"");
		            		req.setName(reqIdentifier);
		            		/**
		            		 * Assign the requirement to a generic Stakeholder.
		            		 */
		            		req.getAssignedTo().add(genericStakeholder);
	            		}
					}
				}
			}



		} catch (Exception e) {
			e.printStackTrace();
		}


		return returnedModel;
	}
}
