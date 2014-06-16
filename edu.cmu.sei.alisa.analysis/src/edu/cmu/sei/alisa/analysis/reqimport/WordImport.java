package edu.cmu.sei.alisa.analysis.reqimport;

import java.io.FileInputStream;

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

public class WordImport
{
	public static AlisaModel importFile (String fileName)
	{
		AlisaModel returnedModel;
		 HWPFDocument doc;
        POIFSFileSystem fs;
        WordExtractor wordExtractor;
        Bookmarks bookmarks;
        Range range;
        StyleSheet styleSheet;
        
          
        fs = null;
        try {
            fs = new POIFSFileSystem(new FileInputStream(fileName));
             doc = new HWPFDocument(fs);
//            fields = doc.getFields();
//             doc.getParagraphTable()
            wordExtractor = new WordExtractor(doc);
            bookmarks = doc.getBookmarks();
            range = doc.getRange();
            styleSheet = doc.getStyleSheet();
            
            for (int sid = 0 ; sid < styleSheet.numStyles() ; sid++)
            {
            	StyleDescription styleDescription = styleSheet.getStyleDescription(sid);
            	if ((styleDescription != null) && (styleDescription.getName() != null))
            	{
            		AlisaDebug.debug("WordImport", "Style #" + sid + " content= " + styleDescription.getName());
            	}
            }
            
            for (int sid = 0 ; sid < range.numSections() ; sid++)
            {
            	Section section = range.getSection(sid);

            	AlisaDebug.debug("WordImport", "Section #" + sid);
                for (int pid = 0 ; pid < section.numParagraphs() ; pid++)
                {
                	Paragraph par = section.getParagraph(pid);
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
		
		returnedModel = Utils.createModel();
		
		Utils.addNewRequirement (returnedModel);
		
		return returnedModel;
	}
}
