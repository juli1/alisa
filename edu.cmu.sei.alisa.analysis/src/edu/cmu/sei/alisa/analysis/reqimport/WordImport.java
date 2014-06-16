package edu.cmu.sei.alisa.analysis.reqimport;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.hwpf.model.StyleDescription;
import org.apache.poi.hwpf.model.StyleSheet;
import org.apache.poi.hwpf.usermodel.Bookmark;
import org.apache.poi.hwpf.usermodel.Bookmarks;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.apache.poi.hwpf.usermodel.Range;
import org.apache.poi.hwpf.usermodel.Section;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import edu.cmu.alisa.utils.AlisaDebug;
import edu.cmu.alisa.utils.Utils;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.Requirement;

public class WordImport
{
	public static String[] depthToStyleString 	= {"Heading 1", "Heading 2", "Heading 3", "Heading 4", "Heading 5"};
	public static int[] depthToStyleIdentifier 	= new int[depthToStyleString.length];
	public static String[] normalStyleStrings 	= {"Text Body", "Normal"};
	public static int[] normalStyleIdentifier 	= new int[normalStyleStrings.length];
	public static final int INVALID_STYLE = -1;
	private static int CURRENT_LEVEL = -1;
	
	
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
				return tmp;
			}
		}
		return INVALID_STYLE;
	}
	
	public static boolean isRequirementTitle (Paragraph par)
	{
		return (getDepth(par) != INVALID_STYLE);
	}
	
	public static AlisaModel importFile (String fileName)
	{
		AlisaModel returnedModel;
		HWPFDocument doc;
        POIFSFileSystem fs;
        WordExtractor wordExtractor;
        Bookmarks bookmarks;
        Range range;
        StyleSheet styleSheet;
        Requirement currentRequirement;
          
        fs = null;

		returnedModel = Utils.createModel();
		currentRequirement = null;
		
        try {
            fs = new POIFSFileSystem(new FileInputStream(fileName));
             doc = new HWPFDocument(fs);
//            fields = doc.getFields();
//             doc.getParagraphTable()
            wordExtractor = new WordExtractor(doc);
            bookmarks = doc.getBookmarks();
            range = doc.getRange();
            styleSheet = doc.getStyleSheet();
            
            
            /**
             * Initialize the styles table
             */
    		for (int tmp = 0 ; tmp < normalStyleStrings.length ; tmp++)
    		{
    				normalStyleIdentifier[tmp] = INVALID_STYLE;
    		}
    		
    		for (int tmp = 0 ; tmp < depthToStyleString.length ; tmp++)
    		{
    				depthToStyleIdentifier[tmp] = INVALID_STYLE;
    		}
            
            /**
             * Parse the style of the document and try to find the style identifier
             * for each type (or level) of requirement.
             */
            for (int sid = 0 ; sid < styleSheet.numStyles() ; sid++)
            {
            	StyleDescription styleDescription = styleSheet.getStyleDescription(sid);
            	if ((styleDescription != null) && (styleDescription.getName() != null))
            	{
            		AlisaDebug.debug("WordImport", "Style #" + sid + " content= " + styleDescription.getName());
            		for (int tmp = 0 ; tmp < normalStyleStrings.length ; tmp++)
            		{
            			if (styleDescription.getName().equalsIgnoreCase(normalStyleStrings[tmp]))
            			{
            				normalStyleIdentifier[tmp] = sid;
            			}
            		}
            		
            		for (int tmp = 0 ; tmp < depthToStyleString.length ; tmp++)
            		{
            			if (styleDescription.getName().equalsIgnoreCase(depthToStyleString[tmp]))
            			{
            				depthToStyleIdentifier[tmp] = sid;
            			}
            		}
            	}
            }
            
            for (int sid = 0 ; sid < range.numSections() ; sid++)
            {
            	Section section = range.getSection(sid);

            	AlisaDebug.debug("WordImport", "Section #" + sid);
                for (int pid = 0 ; pid < section.numParagraphs() ; pid++)
                {
                	Paragraph par = section.getParagraph(pid);

                	if (isRequirementDescription (par))
                	{
                		if (currentRequirement != null)
                		{
                			currentRequirement.setDescription(currentRequirement.getDescription().replace("\"", ""));
                			currentRequirement.setDescription(currentRequirement.getDescription().replace("\n", ""));
                			currentRequirement.setDescription("\"" + currentRequirement.getDescription() + " " + par.text() + "\"\n");
                		}
                	}
                	
                	if (isRequirementTitle (par))
                	{
                		Requirement req;
                		int reqLevel;
                		
                		reqLevel = getDepth(par);
                		
                		req = Utils.addNewRequirement(returnedModel);
                		req.setTitle("\"" + par.text() + "\"\n");
                		req.setDescription("");
                		currentRequirement = req;
                	}
                	
                	AlisaDebug.debug("WordImport", "Paragraph #" + pid + " content= " + par.text());
                	AlisaDebug.debug("WordImport", "Paragraph #" + pid + " style= " + par.getStyleIndex());
                	
                	AlisaDebug.debug("WordImport", "Paragraph #" + pid + " getIlfo= " + par.getIlfo());
                	AlisaDebug.debug("WordImport", "Paragraph #" + pid + " getIlvl= " + par.getIlvl());
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
            
            
            
            wordExtractor.close();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
		return returnedModel;
	}
}
