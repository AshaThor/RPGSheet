package com.ashathor.rpgsheet.utils;

/**Utility class for information regarding Skills*/
public class SkillNames {
	
	//Number of how many skills for easy access
	public static final int numOfSkills = 18;
	//List of static  skill names to enforce good spelling
	public static final String ACROBATICS = "Actrobatics";
	public static final String ANIMAL_HANDLING = "Animal Handling";
	public static final String ARCANA = "Acana";
	public static final String ATHLETICS = "Athletics";
	public static final String DECEPTION = "Deception";
	public static final String HISTORY = "History";
	public static final String INSIGHT = "Insight";
	public static final String INTIMIDATION = "Intimidation";
	public static final String INVESTIGATION = "Investigation";
	public static final String MEDICINE = "Medicine";
	public static final String NATURE = "Nature";
	public static final String PERCEPTION = "Perception";
	public static final String PERFORMANCE = "Performance";
	public static final String PERSUASION = "Persuation";
	public static final String RELIGION = "Religion";
	public static final String SLIGHT_OF_HAND = "Slight of Hand";
	public static final String STEALTH = "Stealth";
	public static final String SURVIVAL = "Survival";
	
	/**List of all skills in order for use of when iterating over all skills
	 * @return String[] - All skills
	 * */
	public static String[] skillNames() {
		String[] skillNames = {
				ACROBATICS,
				ANIMAL_HANDLING,
				ARCANA,
				ATHLETICS,
				DECEPTION,
				HISTORY,
				INSIGHT,
				INTIMIDATION,
				INVESTIGATION,
				MEDICINE,
				NATURE,
				PERCEPTION,
				PERFORMANCE,
				PERSUASION,
				RELIGION,
				SLIGHT_OF_HAND,
				STEALTH,
				SURVIVAL
		};
		return skillNames;
	}
}
