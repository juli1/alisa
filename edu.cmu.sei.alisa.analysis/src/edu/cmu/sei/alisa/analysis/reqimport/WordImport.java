package edu.cmu.sei.alisa.analysis.reqimport;

import java.io.FileInputStream;

import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import edu.cmu.alisa.utils.Utils;
import edu.cmu.sei.alisa.alisa.AlisaModel;

public class WordImport
{
	public static AlisaModel importFile (String fileName)
	{
		AlisaModel returnedModel;
		
        POIFSFileSystem fs;
          
        fs = null;
        try {
            fs = new POIFSFileSystem(new FileInputStream(fileName));
            HWPFDocument doc = new HWPFDocument(fs);
 
            WordExtractor we = new WordExtractor(doc);
            
            /**Get the total number of paragraphs**/
            String[] paragraphs = we.getParagraphText();
            System.out.println("Total Paragraphs: "+paragraphs.length);
     
            for (int i = 0; i < paragraphs.length; i++) {
     
                System.out.println("Length of paragraph "+(i +1)+": "+ paragraphs[i].length());
                System.out.println(paragraphs[i].toString());
     
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		returnedModel = Utils.createModel();
		
		Utils.addNewRequirement (returnedModel);
		
		return returnedModel;
	}
}
