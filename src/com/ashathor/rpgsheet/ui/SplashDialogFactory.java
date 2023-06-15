/**
 * 
 */
package com.ashathor.rpgsheet.ui;

import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * @author Ash Dev
 *
 */
public class SplashDialogFactory{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final int DEFAULT_WIDTH = 380;
	final int DEFAULT_HEIGHT = 200;
	final String DEFAULT_TITLE = "Load Character";

	public JDialog create(MainFrame frame) {
		JDialog dialog = new JDialog(frame,"Load Character",Dialog.ModalityType.DOCUMENT_MODAL);
		GridBagLayout gridBagLayout = new GridBagLayout();
		dialog.setLayout(gridBagLayout);
		dialog.setMinimumSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
		return dialog;
	}

}
