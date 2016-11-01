package Core.Actor;

public abstract class Hero{
    
    protected String heroName;
    protected int heroLevel;
    protected int heroHealth;
    protected int heroMana;
    protected int heroExperience;
    protected double heroDeffence;
    protected double heroAttack;
    protected double heroMagicAttack;
    

    //siła zręczność inteligencja
    //protected int strenght;
    //protected int agility;
    //protected int intteligence;
        
    //protected int CritChance;
    //protected int CritDeffence;

    public Hero() {
        //inicjalizacja wartości początkowych 
        //wywolana tylko przy tworzeniu nowej postaci
        heroLevel = 0;
        heroExperience = 0;
        heroHealth = 10; //wymyśliłem dartość do zmienienia
        heroMana = 10;
        heroDeffence = 5.0;
        
        heroAttack = 1;
        heroMagicAttack = 1;
    }
    
    //ten konstruktor wywoła się przy wczytywaniu zapisu z pliku
    public Hero(String heroName, int heroLevel, int heroHealth, int heroMana,int heroExperience, 
            double heroDeffence, double heroAttack, double heroMagicAttack) {
        this.heroName = heroName;
        this.heroLevel = heroLevel;
        this.heroHealth = heroHealth;
        this.heroMana = heroMana;
        this.heroExperience = heroExperience;
        this.heroDeffence = heroDeffence;
        this.heroAttack = heroAttack;
        this.heroMagicAttack = heroMagicAttack;
    }
}
