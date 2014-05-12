package edu.cmu.sei.alisa.analysis.utils;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

public class DialogUtils {
	
	public static void showBasicDialog (String text, String msg, Shell sh)
	{
		MessageBox dialog = new MessageBox(sh, SWT.OK);
		dialog.setText(text);
		dialog.setMessage(msg);				
		dialog.open(); 
	}
}
