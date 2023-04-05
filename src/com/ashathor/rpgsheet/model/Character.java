/**
 * 
 */
package com.ashathor.rpgsheet.model;

/**
 * @author Rivendell
 *
 */
public class Character {

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
	private Integer inteligence;
	private Integer wisdom;
	private Integer charisma;
	
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
	}

	/**
	 * @return the inteligence
	 */
	public Integer getInteligence() {
		return inteligence;
	}

	/**
	 * @param inteligence the inteligence to set
	 */
	public void setInteligence(Integer inteligence) {
		this.inteligence = inteligence;
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

}
