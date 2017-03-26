package model;

public class Enemy {
    public String enemyName;
    public int enemyLevel;
    public int tempEnemyExperience;
    public int maxEnemyExperience;  
    public int tempEnemyMana;
    public int maxEnemyMana;
    public int tempEnemyHealth;
    public int maxEnemyHealth;
    public int enemyAttack;
    public int enemyDeffence;
    public int movementSpeed;
    public int attackSpeed;
    public int strength;
    public int agility;
    public int inteligence;
    public int levelPoints;
    public String source;
 
    public Enemy() {}

    public Enemy(String enemyName, int enemyLevel, int tempEnemyExperience, int maxEnemyExperience, int tempEnemyMana, int maxEnemyMana, int tempEnemyHealth, int maxEnemyHealth, int enemyAttack, int enemyDeffence, int movementSpeed, int attackSpeed, int strength, int agility, int inteligence, int levelPoints, String source) {
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
