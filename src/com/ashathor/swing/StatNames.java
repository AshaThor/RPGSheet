package com.ashathor.swing;

public class StatNames {
	public static final String STRENGTH = "Strength";
	public static final String DEXTERITY = "Dexterity";
	public static final String CONSTITUTION = "Constitution";
	public static final String INTELLIGENCE = "Intelligence";
	public static final String WISDOM = "Wisdom";
	public static final String CHARISMA = "Charisma";
	
	
	// Make this an enum
	static final String[] statNames = {
			STRENGTH,
			DEXTERITY,
			CONSTITUTION,
			INTELLIGENCE,
			WISDOM,
			CHARISMA
	};
	
	public static String[] statNames(){
		return statNames;
	}
 }
