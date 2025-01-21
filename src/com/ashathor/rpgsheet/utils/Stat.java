package com.ashathor.rpgsheet.utils;

/** Stat enum for all the stats present
 * @author Ash Dev
 *
 */
public enum Stat {
	STRENGTH("Strength","STR"),
	DEXTERITY("Dexterity","DEX"),
	CONSTITUTION("Constitution","CON"),
	INTELLIGENCE("Intelligence","INT"),
	WISDOM("Wisdom","WIS"),
	CHARISMA("Charisma","CHA");
	
	//Useful abbreviation
	private final String abbreviation;
	//Useful title in correct case
	private final String title;
	
	public final String getAbbreviation() {
		return abbreviation;
	}
	
	public final String getTitle() {
		return title;
	}

	Stat(String title, String abbreviation) {
		this.title = title;
		this.abbreviation = abbreviation;
	}
}
