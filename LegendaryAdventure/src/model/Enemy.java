package model;

public class Enemy {
    public String enemyName;
    public int enemyLevel;
    public int tempEnemyExperience;
    public int maxEnemyExperience;  
    public double tempEnemyMana;
    public double maxEnemyMana;
    public double tempEnemyHealth;
    public double maxEnemyHealth;
    public double enemyAttack;
    public double enemyDeffence;
    public double movementSpeed;
    public double attackSpeed;
    public int strength;
    public int agility;
    public int inteligence;
    public int levelPoints;
    public String source;
 
    public Enemy() {}

    public Enemy(String enemyName, int enemyLevel, int tempEnemyExperience, int maxEnemyExperience, double tempEnemyMana, double maxEnemyMana, double tempEnemyHealth, double maxEnemyHealth, double enemyAttack, double enemyDeffence, double movementSpeed, double attackSpeed, int strength, int agility, int inteligence, int levelPoints, String source) {
        this.enemyName = enemyName;
        this.enemyLevel = enemyLevel;
        this.tempEnemyExperience = tempEnemyExperience;
        this.maxEnemyExperience = maxEnemyExperience;
        this.tempEnemyMana = tempEnemyMana;
        this.maxEnemyMana = maxEnemyMana;
        this.tempEnemyHealth = tempEnemyHealth;
        this.maxEnemyHealth = maxEnemyHealth;
        this.enemyAttack = enemyAttack;
        this.enemyDeffence = enemyDeffence;
        this.movementSpeed = movementSpeed;
        this.attackSpeed = attackSpeed;
        this.strength = strength;
        this.agility = agility;
        this.inteligence = inteligence;
        this.levelPoints = levelPoints;
        this.source = source;
    }
}
