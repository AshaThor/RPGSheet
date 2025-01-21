package com.ashathor.rpgsheet.utils;

import java.util.function.Consumer;

import javax.swing.JTextField;

public class SaveableTextJTextField extends JTextField {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Consumer<String> value;

	public SaveableTextJTextField(Consumer<String> value) {
		this.value = value;
	}
	
	public void save() {
		
	}

}
