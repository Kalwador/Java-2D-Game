package model;

import java.util.ArrayList;
import java.util.HashMap;
import org.newdawn.slick.SlickException;

public class Enemy {

    
    public String enemyName;

    public int enemyLevel;
    public int tempEnemyExperience;
    public int maxEnemyExperience;  //odpowiedni wzór wzrostu tej wartości przy levelowaniu to: 'maxHeroExperience += Math.log(maxHeroExperience);'

    public static double tempEnemyHealth;
    public static double maxEnemyHealth;

    public static int tempEnemyMana;
    public static int maxEnemyMana;

    public static double enemyAttack;
    public static double enemyDeffence;

    public static double movementSpeed;
    public static double attackSpeed;

    public int strenght;
    public int agility;
    public int inteligence;

    public int levelPoints;

    //wywolana tylko przy tworzeniu nowej postaci
    public Enemy() throws SlickException {

        enemyName = "Scierwojad";

        enemyLevel = 1;
        tempEnemyExperience = 0;
        maxEnemyExperience = 100;

        tempEnemyHealth = 100;
        maxEnemyHealth = 100;

        tempEnemyMana = 50;
        maxEnemyMana = 50;

        enemyAttack = 5.0;
        enemyDeffence = 20.0;

        //przy stworzeniu klas te wartości zostaną zróżnicowane zależnie od wybranej klasy
        strenght = 5;
        agility = 5;
        inteligence = 5;

        // sugested speed 1.3 
        //movementSpeed = 1.0;
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

    
    
    
    public Enemy(String enemyName, int enemyLevel, int tempEnemyExperience, int maxEnemyExperience, double tempEnemyHealth, double maxEnemyHealth, int tempEnemyMana, int maxEnemyMana, double enemyAttack, double enemyDeffence, int strenght, int agility, int inteligence, int levelPoints) {
        this.enemyName = enemyName;
        this.enemyLevel = enemyLevel;
        this.tempEnemyExperience = tempEnemyExperience;
        this.maxEnemyExperience = maxEnemyExperience;
        this.tempEnemyHealth = tempEnemyHealth;
        this.maxEnemyHealth = maxEnemyHealth;
        this.tempEnemyMana = tempEnemyMana;
        this.maxEnemyMana = maxEnemyMana;
        this.enemyAttack = enemyAttack;
        this.enemyDeffence = enemyDeffence;
        this.strenght = strenght;
        this.agility = agility;
        this.inteligence = inteligence;
        this.levelPoints = levelPoints;
    }

//    public Hero(String heroName, int heroLevel, int tempHeroExperience, int maxHeroExperience, int tempHeroHealth, int maxHeroHealth, int tempHeroMana, int maxHeroMana, double heroDeffence, double heroAttack, int strenght, int agility, int inteligence, int levelPoints) {
//        this.heroName = heroName;
//        this.heroLevel = heroLevel;
//        this.tempHeroExperience = tempHeroExperience;
//        this.maxHeroExperience = maxHeroExperience;
//        this.tempHeroHealth = tempHeroHealth;
//        this.maxHeroHealth = maxHeroHealth;
//        this.tempHeroMana = tempHeroMana;
//        this.maxHeroMana = maxHeroMana;
//        this.heroDeffence = heroDeffence;
//        this.heroAttack = heroAttack;
//        this.strenght = strenght;
//        this.agility = agility;
//        this.inteligence = inteligence;
//        this.levelPoints = levelPoints;
//        HashMap<Integer,Skill> hudSkill = new HashMap<Integer,Skill>();
//        hudSkill.put(1, laduj.getSkill(1));
//        System.out.println(hudSkill);
//    }

//    public static int getMaxHeroExp(int lvl) {
//        int maxHeroExperience = 100;
//        for (int i = 0; i < lvl; i++) {
//            maxHeroExperience += Math.log(maxHeroExperience);
//        }
//        return maxHeroExperience;
//    }
    
    
    
    
}
