package status;

import org.newdawn.slick.SlickException;

public class Hero {

    public String heroName;
    
    public int heroLevel;
    public int heroExperience;
    
    public int heroHealth;
    public int heroMana;
    
    public double heroDeffence;
    public double heroMagicDeffence;
    
    public double heroAttack;
    public double heroMagicAttack;
    
    public static double heroSpeed;

    protected int strenght;
    protected int agility;
    protected int inteligence;
    
    //wywolana tylko przy tworzeniu nowej postaci
    public Hero() throws SlickException {
        
        heroName = "Hero";

        heroLevel = 1;
        heroExperience = 0;

        heroHealth = 10;
        heroMana = 10;

        heroDeffence = 2.0;
        heroMagicDeffence = 2.0;
        
        heroAttack = 1;
        heroMagicAttack = 1;

        //przy stworzeniu klas te wartości zostaną zróżnicowane zależnie od wybranej klasy
        strenght = 5;
        agility = 5;
        inteligence = 5;

        // sugested speed 1.5 
        heroSpeed = 1.5;
    }

    //wywoła się przy wczytywaniu zapisu z pliku
    public Hero(String heroName, int heroLevel, int heroExperience, int heroHealth, int heroMana, double heroDeffence, double heroMagicDeffence, double heroAttack, double heroMagicAttack, int strenght, int agility, int inteligence) {
        this.heroName = heroName;
        this.heroLevel = heroLevel;
        this.heroExperience = heroExperience;
        this.heroHealth = heroHealth;
        this.heroMana = heroMana;
        this.heroDeffence = heroDeffence;
        this.heroMagicDeffence = heroMagicDeffence;
        this.heroAttack = heroAttack;
        this.heroMagicAttack = heroMagicAttack;
        this.strenght = strenght;
        this.agility = agility;
        this.inteligence = inteligence;
    }

}
