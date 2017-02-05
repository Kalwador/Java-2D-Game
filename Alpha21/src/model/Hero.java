package model;

import org.newdawn.slick.SlickException;

public class Hero {

    public String heroName;
    
    public int heroLevel;
    public int tempHeroExperience;  
    public int maxHeroExperience;  //odpowiedni wzór wzrostu tej wartości przy levelowaniu to: 'maxHeroExperience += Math.log(maxHeroExperience);'
    
    public int tempHeroHealth;
    public int maxHeroHealth;
    
    public int tempHeroMana;
    public int maxHeroMana;
    
    public double heroDeffence;
    public double heroAttack;
    
    public static double movementSpeed;
    public static double attackSpeed;

    protected int strenght;
    protected int agility;
    protected int inteligence;
    
    protected int levelPoints;
    
    //wywolana tylko przy tworzeniu nowej postaci
    public Hero() throws SlickException {
        
        heroName = "Hero";

        heroLevel = 1;
        tempHeroExperience = 0;
        maxHeroExperience = 100;

        tempHeroHealth = 10;
        maxHeroHealth = 10;
        
        tempHeroMana = 10;
        maxHeroMana = 10;
        
        heroAttack = 2.0;
        heroDeffence = 2.0;

        //przy stworzeniu klas te wartości zostaną zróżnicowane zależnie od wybranej klasy
        strenght = 5;
        agility = 5;
        inteligence = 5;

        // sugested speed 1.3 
        movementSpeed = 1.0;
        attackSpeed = 1.0;
        
        levelPoints = 3;
    }
    /**
     * 
     * @param heroName
     * @param heroLevel
     * @param tempHeroExperience
     * @param maxHeroExperience
     * @param tempHeroHealth
     * @param maxHeroHealth
     * @param tempHeroMana
     * @param maxHeroMana
     * @param heroAttack
     * @param heroDeffence
     * @param strenght
     * @param agility
     * @param inteligence
     * @param levelPoints 
     */
    public Hero(String heroName, int heroLevel, int tempHeroExperience, int maxHeroExperience, 
            int tempHeroHealth, int maxHeroHealth, int tempHeroMana, int maxHeroMana, double heroAttack, 
            double heroDeffence, int strenght, int agility, int inteligence, int levelPoints) {
        this.heroName = heroName;
        this.heroLevel = heroLevel;
        this.tempHeroExperience = tempHeroExperience;
        this.maxHeroExperience = maxHeroExperience;
        this.tempHeroHealth = tempHeroHealth;
        this.maxHeroHealth = maxHeroHealth;
        this.tempHeroMana = tempHeroMana;
        this.maxHeroMana = maxHeroMana;
        this.heroAttack = heroAttack;
        this.heroDeffence = heroDeffence;
        this.strenght = strenght;
        this.agility = agility;
        this.inteligence = inteligence;
        this.levelPoints = levelPoints;
    }
}
