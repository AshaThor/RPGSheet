/**
 * 
 */
package com.ashathor.rpgsheet.model;

import java.util.Observable;
import java.util.logging.Logger;

import com.ashathor.rpgsheet.ui.StatPanel;
import com.ashathor.rpgsheet.utils.StatNames;

/**
 * @author Rivendell
 *
 */
@SuppressWarnings("deprecation")
public class Character extends Observable{
	
	private static final Logger LOGGER = Logger.getLogger(Character.class.getName());

	//Character top info
	private String name;
	private String cla55;
	private String level;
	private String background;
	private String playerName;
	private String race;
	private String alignment;
	private String exp;
	
	//Statistics block
	private Integer strength;
	private Integer dexterity;
	private Integer constitution;
	private Integer intelligence;
	private Integer wisdom;
	private Integer charisma;
	
	private boolean strengthProf;
	private boolean dexterityProf;
	private boolean constitutionProf;
	private boolean intelligenceProf;
	private boolean wisdomProf;
	private boolean charismaProf;
	
	private boolean acrobaticsProf;
	private boolean animalHandlingProf;
	private boolean arcanaProf;
	private boolean athleticsProf;
	private boolean deceptionProf;
	private boolean historyProf;
	private boolean insightProf;
	private boolean intimidationProf;
	private boolean investigationProf;
	private boolean medicineProf;
	private boolean natureProf;
	private boolean perceptionProf;
	private boolean perfomanceProf;
	private boolean persuationProf;
	private boolean religionProf;
	private boolean slightOfHandProf;
	private boolean stealthProf;
	private boolean survivalProf;
	
	private Integer passiveWisdom;
	
	private Integer inspiration;
	private Integer proficiencyBonus;
	
	private Integer armourClass;
	private Integer initiative;
	private Integer speed;
	
	private Integer currentHitPoints;
	private Integer maximumHitPoints;
	private Integer temporaryHitPoints;
	
	private Integer hitDice;
	private Integer totalHitDice;
	
	private String otherProficienciesAndLanguages;
	
	private String personalTraits;
	private String ideals;
	private String bonds;
	private String flaws;
	
	private String featuresAndTraits;
	
	private String equipment;
	
	private int platinum;
	private int gold;
	private int electrum;
	private int silver;
	private int copper;

	public Character() {
		super();
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
		return strength;
	}

	/**
	 * @param strength the strength to set
	 */
	public void setStrength(Integer strength) {
		this.strength = strength;
		LOGGER.fine("Strength changed to " + strength);
		setChanged();
		LOGGER.fine("Strength set changed");
		notifyObservers(StatNames.STRENGTH);
		LOGGER.fine("Strength observers notified");
	}

	/**
	 * @return the dexterity
	 */
	public Integer getDexterity() {
		return dexterity;
	}

	/**
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(Integer dexterity) {
		this.dexterity = dexterity;
		LOGGER.fine("Dexterity changed to " + dexterity);
		setChanged();
		LOGGER.fine("Dexterity set changed");
		notifyObservers(StatNames.DEXTERITY);
		LOGGER.fine("Dexterity observers notified");
	}

	/**
	 * @return the constitution
	 */
	public Integer getConstitution() {
		return constitution;
	}

	/**
	 * @param constitution the constitution to set
	 */
	public void setConstitution(Integer constitution) {
		this.constitution = constitution;
		LOGGER.fine("Constitution changed to " + constitution);
		setChanged();
		LOGGER.fine("Constitution set changed");
		notifyObservers(StatNames.CONSTITUTION);
		LOGGER.fine("Constitution observers notified");
	}

	/**
	 * @return the intelligence
	 */
	public Integer getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
		LOGGER.fine("Intelligence changed to " + intelligence);
		setChanged();
		LOGGER.fine("Intelligence set changed");
		notifyObservers(StatNames.INTELLIGENCE);
		LOGGER.fine("Intelligence observers notified");
	}

	/**
	 * @return the wisdom
	 */
	public Integer getWisdom() {
		return wisdom;
	}

	/**
	 * @param wisdom the wisdom to set
	 */
	public void setWisdom(Integer wisdom) {
		this.wisdom = wisdom;
		LOGGER.fine("Wisdom changed to " + wisdom);
		setChanged();
		LOGGER.fine("Wisdom set changed");
		notifyObservers(StatNames.WISDOM);
		LOGGER.fine("Wisdom observers notified");
	}

	/**
	 * @return the charisma
	 */
	public Integer getCharisma() {
		return charisma;
	}

	/**
	 * @param charisma the charisma to set
	 */
	public void setCharisma(Integer charisma) {
		this.charisma = charisma;
		LOGGER.fine("Charisma changed to " + charisma);
		setChanged();
		LOGGER.fine("Charisma set changed");
		notifyObservers(StatNames.CHARISMA);
		LOGGER.fine("Charisma observers notified");
	}

	public boolean isStrengthProf() {
		return strengthProf;
	}

	public void setStrengthProf(boolean strengthProf) {
		this.strengthProf = strengthProf;
	}

	public boolean isDexterityProf() {
		return dexterityProf;
	}

	public void setDexterityProf(boolean dexterityProf) {
		this.dexterityProf = dexterityProf;
	}

	public boolean isConstitutionProf() {
		return constitutionProf;
	}

	public void setConstitutionProf(boolean constitutionProf) {
		this.constitutionProf = constitutionProf;
	}

	public boolean isIntelligenceProf() {
		return intelligenceProf;
	}

	public void setIntelligenceProf(boolean intelligenceProf) {
		this.intelligenceProf = intelligenceProf;
	}

	public boolean isWisdomProf() {
		return wisdomProf;
	}

	public void setWisdomProf(boolean wisdomProf) {
		this.wisdomProf = wisdomProf;
	}

	public boolean isCharismaProf() {
		return charismaProf;
	}

	public void setCharismaProf(boolean charismaProf) {
		this.charismaProf = charismaProf;
	}

	public boolean isAcrobaticsProf() {
		return acrobaticsProf;
	}

	public void setAcrobaticsProf(boolean acrobaticsProf) {
		this.acrobaticsProf = acrobaticsProf;
	}

	public boolean isAnimalHandlingProf() {
		return animalHandlingProf;
	}

	public void setAnimalHandlingProf(boolean animalHandlingProf) {
		this.animalHandlingProf = animalHandlingProf;
	}

	public boolean isArcanaProf() {
		return arcanaProf;
	}

	public void setArcanaProf(boolean arcanaProf) {
		this.arcanaProf = arcanaProf;
	}

	public boolean isAthleticsProf() {
		return athleticsProf;
	}

	public void setAthleticsProf(boolean athleticsProf) {
		this.athleticsProf = athleticsProf;
	}

	public boolean isDeceptionProf() {
		return deceptionProf;
	}

	public void setDeceptionProf(boolean deceptionProf) {
		this.deceptionProf = deceptionProf;
	}

	public boolean isHistoryProf() {
		return historyProf;
	}

	public void setHistoryProf(boolean historyProf) {
		this.historyProf = historyProf;
	}

	public boolean isInsightProf() {
		return insightProf;
	}

	public void setInsightProf(boolean insightProf) {
		this.insightProf = insightProf;
	}

	public boolean isIntimidationProf() {
		return intimidationProf;
	}

	public void setIntimidationProf(boolean intimidationProf) {
		this.intimidationProf = intimidationProf;
	}

	public boolean isInvestigationProf() {
		return investigationProf;
	}

	public void setInvestigationProf(boolean investigationProf) {
		this.investigationProf = investigationProf;
	}

	public boolean isMedicineProf() {
		return medicineProf;
	}

	public void setMedicineProf(boolean medicineProf) {
		this.medicineProf = medicineProf;
	}

	public boolean isNatureProf() {
		return natureProf;
	}

	public void setNatureProf(boolean natureProf) {
		this.natureProf = natureProf;
	}

	public boolean isPerceptionProf() {
		return perceptionProf;
	}

	public void setPerceptionProf(boolean perceptionProf) {
		this.perceptionProf = perceptionProf;
	}

	public boolean isPerfomanceProf() {
		return perfomanceProf;
	}

	public void setPerfomanceProf(boolean perfomanceProf) {
		this.perfomanceProf = perfomanceProf;
	}

	public boolean isPersuationProf() {
		return persuationProf;
	}

	public void setPersuationProf(boolean persuationProf) {
		this.persuationProf = persuationProf;
	}

	public boolean isReligionProf() {
		return religionProf;
	}

	public void setReligionProf(boolean religionProf) {
		this.religionProf = religionProf;
	}

	public boolean isSlightOfHandProf() {
		return slightOfHandProf;
	}

	public void setSlightOfHandProf(boolean slightOfHandProf) {
		this.slightOfHandProf = slightOfHandProf;
	}

	public boolean isStealthProf() {
		return stealthProf;
	}

	public void setStealthProf(boolean stealthProf) {
		this.stealthProf = stealthProf;
	}

	public boolean isSurvivalProf() {
		return survivalProf;
	}

	public void setSurvivalProf(boolean survivalProf) {
		this.survivalProf = survivalProf;
	}

	/**
	 * @return the passiveWisdom
	 */
	public Integer getPassiveWisdom() {
		return passiveWisdom;
	}

	/**
	 * @param passiveWisdom the passiveWisdom to set
	 */
	public void setPassiveWisdom(Integer passiveWisdom) {
		this.passiveWisdom = passiveWisdom;
	}

	/**
	 * @return the inspiration
	 */
	public Integer getInspiration() {
		return inspiration;
	}

	/**
	 * @param inspiration the inspiration to set
	 */
	public void setInspiration(Integer inspiration) {
		this.inspiration = inspiration;
	}

	/**
	 * @return the proficiencyBonus
	 */
	public Integer getProficiencyBonus() {
		return proficiencyBonus;
	}

	/**
	 * @param proficiencyBonus the proficiencyBonus to set
	 */
	public void setProficiencyBonus(Integer proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}

	/**
	 * @return the armourClass
	 */
	public Integer getArmourClass() {
		return armourClass;
	}

	/**
	 * @param armourClass the armourClass to set
	 */
	public void setArmourClass(Integer armourClass) {
		this.armourClass = armourClass;
	}

	/**
	 * @return the initiative
	 */
	public Integer getInitiative() {
		return initiative;
	}

	/**
	 * @param initiative the initiative to set
	 */
	public void setInitiative(Integer initiative) {
		this.initiative = initiative;
	}

	/**
	 * @return the speed
	 */
	public Integer getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	/**
	 * @return the currentHitPoints
	 */
	public Integer getCurrentHitPoints() {
		return currentHitPoints;
	}

	/**
	 * @param currentHitPoints the currentHitPoints to set
	 */
	public void setCurrentHitPoints(Integer currentHitPoints) {
		this.currentHitPoints = currentHitPoints;
	}

	/**
	 * @return the maximumHitPoints
	 */
	public Integer getMaximumHitPoints() {
		return maximumHitPoints;
	}

	/**
	 * @param maximumHitPoints the maximumHitPoints to set
	 */
	public void setMaximumHitPoints(Integer maximumHitPoints) {
		this.maximumHitPoints = maximumHitPoints;
	}

	/**
	 * @return the temporaryHitPoints
	 */
	public Integer getTemporaryHitPoints() {
		return temporaryHitPoints;
	}

	/**
	 * @param temporaryHitPoints the temporaryHitPoints to set
	 */
	public void setTemporaryHitPoints(Integer temporaryHitPoints) {
		this.temporaryHitPoints = temporaryHitPoints;
	}

	/**
	 * @return the hitDice
	 */
	public Integer getHitDice() {
		return hitDice;
	}

	/**
	 * @param hitDice the hitDice to set
	 */
	public void setHitDice(Integer hitDice) {
		this.hitDice = hitDice;
	}

	/**
	 * @return the totalHitDice
	 */
	public Integer getTotalHitDice() {
		return totalHitDice;
	}

	/**
	 * @param totalHitDice the totalHitDice to set
	 */
	public void setTotalHitDice(Integer totalHitDice) {
		this.totalHitDice = totalHitDice;
	}

	/**
	 * @return the otherProficienciesAndLanguages
	 */
	public String getOtherProficienciesAndLanguages() {
		return otherProficienciesAndLanguages;
	}

	/**
	 * @param otherProficienciesAndLanguages the otherProficienciesAndLanguages to set
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

	public int getPlatinum() {
		return platinum;
	}

	public void setPlatinum(int platinum) {
		this.platinum = platinum;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getElectrum() {
		return electrum;
	}

	public void setElectrum(int electrum) {
		this.electrum = electrum;
	}

	public int getSilver() {
		return silver;
	}

	public void setSilver(int silver) {
		this.silver = silver;
	}

	public int getCopper() {
		return copper;
	}

	public void setCopper(int copper) {
		this.copper = copper;
	}

}
