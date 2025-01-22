package com.ashathor.rpgsheet.utils;

/** Skill enum for all the skills present
 * @author Ash Dev
 *
 */
public enum Skill {
	ACROBATICS(Stat.DEXTERITY, "Acrobatics"),
	ANIMAL_HANDLING(Stat.WISDOM, "Animal Handling"),
	ARCANA(Stat.INTELLIGENCE, "Arcana"),
	ATHLETICS(Stat.STRENGTH, "Athletics"),
	DECEPTION(Stat.CHARISMA, "Deception"),
	HISTORY(Stat.INTELLIGENCE, "History"),
	INSIGHT(Stat.WISDOM, "Insight"),
	INTIMIDATION(Stat.CHARISMA, "Intimidation"),
	INVESTIGATION(Stat.INTELLIGENCE, "Investigation"),
	MEDICINE(Stat.WISDOM, "Medicine"),
	NATURE(Stat.INTELLIGENCE, "Nature"),
	PERCEPTION(Stat.WISDOM, "Perception"),
	PERFORMANCE(Stat.CHARISMA, "Performance"),
	PERSUASION(Stat.CHARISMA, "Persuasion"),
	RELIGION(Stat.INTELLIGENCE, "Religion"),
	SLEIGHT_OF_HAND(Stat.DEXTERITY, "Sleight of Hand"),
	STEALTH(Stat.DEXTERITY, "Stealth"),
	SURVIVAL(Stat.WISDOM, "Survival");
	
	//The corresponding statistic that is linked to each skill.
	private final Stat stat;
	//User friendly name that each skill has. Handy for making the UI. In correct space and capital.
	private final String title;
	
	Skill(Stat stat, String title ){
		this.stat = stat;
		this.title = title;
	}
	
	public Stat getStat() {
		return stat;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	
}
