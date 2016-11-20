package status;

import org.newdawn.slick.SlickException;

public class Hero {

    public String heroName;
    public int heroLevel;
    public int heroExperience;
    public int heroHealth;
    public int heroMana;
    public double heroDeffence;
    public double heroAttack;
    public double heroMagicAttack;
    public static double heroSpeed;

    protected int strenght;
    protected int agility;
    protected int inteligence;

    //protected int CritChance;
    //protected int CritDeffence;
    public Hero() throws SlickException {
        //inicjalizacja wartości początkowych 
        //wywolana tylko przy tworzeniu nowej postaci
        heroName = "Dzidek";

        heroLevel = 0;
        heroExperience = 0;

        heroHealth = 10;
        heroMana = 10;
        heroDeffence = 5.0;

        heroAttack = 1;
        heroMagicAttack = 1;

        //przy stworzeniu ras te wartości zostaną zróżnicowane zależnie od wybranej klasy
        strenght = 5;
        agility = 5;
        inteligence = 5;

        // odpowiedznia predkosc to 1.5 
        heroSpeed = 5.0;
    }

    //ten konstruktor wywoła się przy wczytywaniu zapisu z pliku
    public Hero(String heroName, int heroLevel, int heroHealth, int heroMana, int heroExperience,
            double heroDeffence, double heroAttack, double heroMagicAttack) {
        this.heroName = heroName;
        this.heroLevel = heroLevel;
        this.heroHealth = heroHealth;
        this.heroMana = heroMana;
        this.heroExperience = heroExperience;
        this.heroDeffence = heroDeffence;
        this.heroAttack = heroAttack;
        this.heroMagicAttack = heroMagicAttack;
        this.strenght = 5;
        this.agility = 5;
        this.inteligence = 5;
    }
}
