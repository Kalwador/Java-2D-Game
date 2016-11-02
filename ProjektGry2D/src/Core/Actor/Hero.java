package core.actor;

public abstract class Hero{
    
    public String heroName;
    public int heroLevel;
    public int heroExperience;
    public int heroHealth;
    public int heroMana;
    public double heroDeffence;
    public double heroAttack;
    public double heroMagicAttack;
    //public double heroSpeed;
    

    //siła zręczność inteligencja
    //protected int strenght;
    //protected int agility;
    //protected int intteligence;
        
    //protected int CritChance;
    //protected int CritDeffence;

    public Hero() {
        //inicjalizacja wartości początkowych 
        //wywolana tylko przy tworzeniu nowej postaci
        heroName = "";
        heroLevel = 0;
        heroExperience = 0;
        heroHealth = 10; //wymyśliłem dartość do zmienienia
        heroMana = 10;
        heroDeffence = 5.0;
        
        heroAttack = 1;
        heroMagicAttack = 1;
        //heroSpeed = 1;
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
