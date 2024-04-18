/**
 * 
 */
package com.ashathor.rpgsheet.model;

import java.util.Observable;
import java.util.logging.Logger;

import com.ashathor.rpgsheet.utils.Skill;
import com.ashathor.rpgsheet.utils.Stat;

/**
 * @author Rivendell
 *
 */
@SuppressWarnings("deprecation")
public class Character extends Observable {

	private static final Logger LOGGER = Logger.getLogger(Character.class.getName());

	// Character top info
	private String name;
	private String cla55;
	private String level;
	private String background;
	private String playerName;
	private String race;
	private String alignment;
	private String exp;

	// Statistics array
	// This is created using the statistics enum and all data in and out needs to be
	// aware of the enum.
	// Using the enum ordinal to place items in the correct entry.
	private final int[] stats = new int[Stat.values().length];

	// Skills array
	private final int[] skills = new int[Skill.values().length];

	private final boolean[] savingThrows = new boolean[Stat.values().length];

	private final boolean[] skillProficencies = new boolean[Skill.values().length];

	private String passiveWisdom;

	private String inspiration;
	private String proficiencyBonus;

	private String armourClass;
	private String initiative;
	private String speed;

	private String currentHitPoints;
	private String maximumHitPoints;
	private String temporaryHitPoints;

	private String hitDice;
	private String totalHitDice;

	private String otherProficienciesAndLanguages;

	private String personalTraits;
	private String ideals;
	private String bonds;
	private String flaws;

	private String featuresAndTraits;

	private String equipment;

	public Character() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers();
	}

	/**
	 * @return the cla55
	 */
	public String getCla55() {
		return cla55;
	}

	/**
	 * @param cla55 the cla55 to set
	 */
	public void setCla55(String cla55) {
		this.cla55 = cla55;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * @return the background
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * @param background the background to set
	 */
	public void setBackground(String background) {
		this.background = background;
	}

	/**
	 * @return the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	/**
	 * @return the race
	 */
	public String getRace() {
		return race;
	}

	/**
	 * @param race the race to set
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * @return the alignment
	 */
	public String getAlignment() {
		return alignment;
	}

	/**
	 * @param alignment the alignment to set
	 */
	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	/**
	 * @return the exp
	 */
	public String getExp() {
		return exp;
	}

	/**
	 * @param exp the exp to set
	 */
	public void setExp(String exp) {
		this.exp = exp;
	}

	/**
	 * @return the strength
	 */
	public Integer getStrength() {
		//Uses the Stat enum ordinal to get the place in the array that strength is being saved.
		return this.stats[Stat.STRENGTH.ordinal()];
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(Integer strength) {
		this.stats[Stat.STRENGTH.ordinal()] = strength;
		LOGGER.fine("Strength changed to " + strength);
		setChanged();
		LOGGER.fine("Strength set changed");
		notifyObservers(Stat.STRENGTH);
		LOGGER.fine("Strength observers notified");
	}

	/**
	 * @return the dexterity
	 */
	public Integer getDexterity() {
		return this.stats[Stat.DEXTERITY.ordinal()];
	}

	/**
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(Integer dexterity) {
		this.stats[Stat.DEXTERITY.ordinal()] = dexterity;
		LOGGER.fine("Dexterity changed to " + dexterity);
		setChanged();
		LOGGER.fine("Dexterity set changed");
		notifyObservers(Stat.DEXTERITY);
		LOGGER.fine("Dexterity observers notified");
	}

	/**
	 * @return the constitution
	 */
	public Integer getConstitution() {
		return this.stats[Stat.CONSTITUTION.ordinal()];
	}

	/**
	 * @param constitution the constitution to set
	 */
	public void setConstitution(Integer constitution) {
		this.stats[Stat.CONSTITUTION.ordinal()] = constitution;
		LOGGER.fine("Constitution changed to " + constitution);
		setChanged();
		LOGGER.fine("Constitution set changed");
		notifyObservers(Stat.CONSTITUTION);
		LOGGER.fine("Constitution observers notified");
	}

	/**
	 * @return the intelligence
	 */
	public Integer getIntelligence() {
		return this.stats[Stat.INTELLIGENCE.ordinal()];
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(Integer intelligence) {
		this.stats[Stat.INTELLIGENCE.ordinal()] = intelligence;
		LOGGER.fine("Intelligence changed to " + intelligence);
		setChanged();
		LOGGER.fine("Intelligence set changed");
		notifyObservers(Stat.INTELLIGENCE);
		LOGGER.fine("Intelligence observers notified");
	}

	/**
	 * @return the wisdom
	 */
	public Integer getWisdom() {
		return this.stats[Stat.WISDOM.ordinal()];
	}

	/**
	 * @param wisdom the wisdom to set
	 */
	public void setWisdom(Integer wisdom) {
		this.stats[Stat.WISDOM.ordinal()] = wisdom;
		LOGGER.fine("Wisdom changed to " + wisdom);
		setChanged();
		LOGGER.fine("Wisdom set changed");
		notifyObservers(Stat.WISDOM);
		LOGGER.fine("Wisdom observers notified");
	}

	/**
	 * @return the charisma
	 */
	public Integer getCharisma() {
		return this.stats[Stat.CHARISMA.ordinal()];
	}

	/**
	 * @param charisma the charisma to set
	 */
	public void setCharisma(Integer charisma) {
		this.stats[Stat.CHARISMA.ordinal()] = charisma;
		LOGGER.fine("Charisma changed to " + charisma);
		setChanged();
		LOGGER.fine("Charisma set changed");
		notifyObservers(Stat.CHARISMA);
		LOGGER.fine("Charisma observers notified");
	}

	public void setAcrobatics(int value) {
		this.skills[Skill.ACROBATICS.ordinal()] = value;
	}

	public void setAnimalHandleing(int value) {
		this.skills[Skill.ANIMAL_HANDLING.ordinal()] = value;
	}

	public boolean isStrengthProf() {
		return this.savingThrows[Stat.STRENGTH.ordinal()];
	}

	public void setStrengthProf(boolean strengthProf) {
		this.savingThrows[Stat.STRENGTH.ordinal()] = strengthProf;
	}

	public boolean isDexterityProf() {
		return this.savingThrows[Stat.DEXTERITY.ordinal()];
	}

	public void setDexterityProf(boolean dexterityProf) {
		this.savingThrows[Stat.DEXTERITY.ordinal()] = dexterityProf;
	}

	public boolean isConstitutionProf() {
		return this.savingThrows[Stat.CONSTITUTION.ordinal()];
	}

	public void setConstitutionProf(boolean constitutionProf) {
		this.savingThrows[Stat.CONSTITUTION.ordinal()] = constitutionProf;
	}

	public boolean isIntelligenceProf() {
		return this.savingThrows[Stat.INTELLIGENCE.ordinal()];
	}

	public void setIntelligenceProf(boolean intelligenceProf) {
		this.savingThrows[Stat.INTELLIGENCE.ordinal()] = intelligenceProf;
	}

	public boolean isWisdomProf() {
		return this.savingThrows[Stat.WISDOM.ordinal()];
	}

	public void setWisdomProf(boolean wisdomProf) {
		this.savingThrows[Stat.WISDOM.ordinal()] = wisdomProf;
	}

	public boolean isCharismaProf() {
		return this.savingThrows[Stat.CHARISMA.ordinal()];
	}

	public void setCharismaProf(boolean charismaProf) {
		this.savingThrows[Stat.CHARISMA.ordinal()] = charismaProf;
	}

	public boolean isAcrobaticsProf() {
		return this.skillProficencies[Skill.ACROBATICS.ordinal()];
	}

	public void setAcrobaticsProf(boolean acrobaticsProf) {
		this.skillProficencies[Skill.ACROBATICS.ordinal()] = acrobaticsProf;
	}

	public boolean isAnimalHandlingProf() {
		return this.skillProficencies[Skill.ANIMAL_HANDLING.ordinal()];
	}

	public void setAnimalHandlingProf(boolean animalHandlingProf) {
		this.skillProficencies[Skill.ANIMAL_HANDLING.ordinal()] = animalHandlingProf;
	}

	public boolean isArcanaProf() {
		return this.skillProficencies[Skill.ARCANA.ordinal()];
	}

	public void setArcanaProf(boolean arcanaProf) {
		this.skillProficencies[Skill.ARCANA.ordinal()] = arcanaProf;
	}

	public boolean isAthleticsProf() {
		return this.skillProficencies[Skill.ATHLETICS.ordinal()];
	}

	public void setAthleticsProf(boolean athleticsProf) {
		this.skillProficencies[Skill.ATHLETICS.ordinal()] = athleticsProf;
	}

	public boolean isDeceptionProf() {
		return this.skillProficencies[Skill.DECEPTION.ordinal()];
	}

	public void setDeceptionProf(boolean deceptionProf) {
		this.skillProficencies[Skill.DECEPTION.ordinal()] = deceptionProf;
	}

	public boolean isHistoryProf() {
		return this.skillProficencies[Skill.HISTORY.ordinal()];
	}

	public void setHistoryProf(boolean historyProf) {
		this.skillProficencies[Skill.HISTORY.ordinal()] = historyProf;
	}

	public boolean isInsightProf() {
		return this.skillProficencies[Skill.INSIGHT.ordinal()];
	}

	public void setInsightProf(boolean insightProf) {
		this.skillProficencies[Skill.INSIGHT.ordinal()] = insightProf;
	}

	public boolean isIntimidationProf() {
		return this.skillProficencies[Skill.INTIMIDATION.ordinal()];
	}

	public void setIntimidationProf(boolean intimidationProf) {
		this.skillProficencies[Skill.INTIMIDATION.ordinal()] = intimidationProf;
	}

	public boolean isInvestigationProf() {
		return this.skillProficencies[Skill.INVESTIGATION.ordinal()];
	}

	public void setInvestigationProf(boolean investigationProf) {
		this.skillProficencies[Skill.INVESTIGATION.ordinal()] = investigationProf;
	}

	public boolean isMedicineProf() {
		return this.skillProficencies[Skill.MEDICINE.ordinal()];
	}

	public void setMedicineProf(boolean medicineProf) {
		this.skillProficencies[Skill.MEDICINE.ordinal()] = medicineProf;
	}

	public boolean isNatureProf() {
		return this.skillProficencies[Skill.NATURE.ordinal()];
	}

	public void setNatureProf(boolean natureProf) {
		this.skillProficencies[Skill.NATURE.ordinal()] = natureProf;
	}

	public boolean isPerceptionProf() {
		return this.skillProficencies[Skill.PERCEPTION.ordinal()];
	}

	public void setPerceptionProf(boolean perceptionProf) {
		this.skillProficencies[Skill.PERCEPTION.ordinal()] = perceptionProf;
	}

	public boolean isPerfomanceProf() {
		return this.skillProficencies[Skill.PERFORMANCE.ordinal()];
	}

	public void setPerfomanceProf(boolean perfomanceProf) {
		this.skillProficencies[Skill.PERFORMANCE.ordinal()] = perfomanceProf;
	}

	public boolean isPersuationProf() {
		return this.skillProficencies[Skill.PERSUASION.ordinal()];
	}

	public void setPersuationProf(boolean persuationProf) {
		this.skillProficencies[Skill.PERSUASION.ordinal()] = persuationProf;
	}

	public boolean isReligionProf() {
		return this.skillProficencies[Skill.RELIGION.ordinal()];
	}

	public void setReligionProf(boolean religionProf) {
		this.skillProficencies[Skill.RELIGION.ordinal()] = religionProf;
	}

	public boolean isSlightOfHandProf() {
		return this.skillProficencies[Skill.SLEIGHT_OF_HAND.ordinal()];
	}

	public void setSlightOfHandProf(boolean slightOfHandProf) {
		this.skillProficencies[Skill.SLEIGHT_OF_HAND.ordinal()] = slightOfHandProf;
	}

	public boolean isStealthProf() {
		return this.skillProficencies[Skill.STEALTH.ordinal()];
	}

	public void setStealthProf(boolean stealthProf) {
		this.skillProficencies[Skill.STEALTH.ordinal()] = stealthProf;
	}

	public boolean isSurvivalProf() {
		return this.skillProficencies[Skill.SURVIVAL.ordinal()];
	}

	public void setSurvivalProf(boolean survivalProf) {
		this.skillProficencies[Skill.SURVIVAL.ordinal()] = survivalProf;
	}

	/**
	 * @return the passiveWisdom
	 */
	public String getPassiveWisdom() {
		return passiveWisdom;
	}

	/**
	 * @param passiveWisdom the passiveWisdom to set
	 */
	public void setPassiveWisdom(String passiveWisdom) {
		this.passiveWisdom = passiveWisdom;
	}

	/**
	 * @return the inspiration
	 */
	public String getInspiration() {
		return inspiration;
	}

	/**
	 * @param inspiration the inspiration to set
	 */
	public void setInspiration(String inspiration) {
		this.inspiration = inspiration;
	}

	/**
	 * @return the proficiencyBonus
	 */
	public String getProficiencyBonus() {
		return proficiencyBonus;
	}

	/**
	 * @param proficiencyBonus the proficiencyBonus to set
	 */
	public void setProficiencyBonus(String proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}

	/**
	 * @return the armourClass
	 */
	public String getArmourClass() {
		return armourClass;
	}

	/**
	 * @param armourClass the armourClass to set
	 */
	public void setArmourClass(String armourClass) {
		this.armourClass = armourClass;
	}

	/**
	 * @return the initiative
	 */
	public String getInitiative() {
		return initiative;
	}

	/**
	 * @param initiative the initiative to set
	 */
	public void setInitiative(String initiative) {
		this.initiative = initiative;
	}

	/**
	 * @return the speed
	 */
	public String getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(String speed) {
		this.speed = speed;
	}

	/**
	 * @return the currentHitPoints
	 */
	public String getCurrentHitPoints() {
		return currentHitPoints;
	}

	/**
	 * @param currentHitPoints the currentHitPoints to set
	 */
	public void setCurrentHitPoints(String currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	/**
	 * @return the maximumHitPoints
	 */
	public String getMaximumHitPoints() {
		return maximumHitPoints;
	}

	/**
	 * @param maximumHitPoints the maximumHitPoints to set
	 */
	public void setMaximumHitPoints(String maximumHitPoints) {
		this.maximumHitPoints = maximumHitPoints;
	}

	/**
	 * @return the temporaryHitPoints
	 */
	public String getTemporaryHitPoints() {
		return temporaryHitPoints;
	}

	/**
	 * @param temporaryHitPoints the temporaryHitPoints to set
	 */
	public void setTemporaryHitPoints(String temporaryHitPoints) {
		this.temporaryHitPoints = temporaryHitPoints;
	}

	/**
	 * @return the hitDice
	 */
	public String getHitDice() {
		return hitDice;
	}

	/**
	 * @param hitDice the hitDice to set
	 */
	public void setHitDice(String hitDice) {
		this.hitDice = hitDice;
	}

	/**
	 * @return the totalHitDice
	 */
	public String getTotalHitDice() {
		return totalHitDice;
	}

	/**
	 * @param totalHitDice the totalHitDice to set
	 */
	public void setTotalHitDice(String totalHitDice) {
		this.totalHitDice = totalHitDice;
	}

	/**
	 * @return the otherProficienciesAndLanguages
	 */
	public String getOtherProficienciesAndLanguages() {
		return otherProficienciesAndLanguages;
	}

	/**
	 * @param otherProficienciesAndLanguages the otherProficienciesAndLanguages to
	 *                                       set
	 */
	public void setOtherProficienciesAndLanguages(String otherProficienciesAndLanguages) {
		this.otherProficienciesAndLanguages = otherProficienciesAndLanguages;
	}

	/**
	 * @return the personalTraits
	 */
	public String getPersonalTraits() {
		return personalTraits;
	}

	/**
	 * @param personalTraits the personalTraits to set
	 */
	public void setPersonalTraits(String personalTraits) {
		this.personalTraits = personalTraits;
	}

	/**
	 * @return the ideals
	 */
	public String getIdeals() {
		return ideals;
	}

	/**
	 * @param ideals the ideals to set
	 */
	public void setIdeals(String ideals) {
		this.ideals = ideals;
	}

	/**
	 * @return the bonds
	 */
	public String getBonds() {
		return bonds;
	}

	/**
	 * @param bonds the bonds to set
	 */
	public void setBonds(String bonds) {
		this.bonds = bonds;
	}

	/**
	 * @return the flaws
	 */
	public String getFlaws() {
		return flaws;
	}

	/**
	 * @param flaws the flaws to set
	 */
	public void setFlaws(String flaws) {
		this.flaws = flaws;
	}

	/**
	 * @return the featuresAndTraits
	 */
	public String getFeaturesAndTraits() {
		return featuresAndTraits;
	}

	/**
	 * @param featuresAndTraits the featuresAndTraits to set
	 */
	public void setFeaturesAndTraits(String featuresAndTraits) {
		this.featuresAndTraits = featuresAndTraits;
	}

	/**
	 * @return the equipment
	 */
	public String getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment the equipment to set
	 */
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public int[] getStats() {
		return stats;
	}

	public int[] getSkills() {
		return skills;
	}

	public boolean[] getSkillProficencies() {
		return skillProficencies;
	}

	public boolean[] getSavingThrows() {
		return savingThrows;
	}

}
