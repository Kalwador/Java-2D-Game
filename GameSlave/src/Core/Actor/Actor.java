package Actor;

public class Actor {
    
    protected String heroName;
    protected int heroLevel;
    protected int heroHealth;
    protected int heroMana;
    protected double heroDeffence;
    
    protected int heroAttack;
    protected int heroMagicAttack;
    
    
    
    //siła zręczność inteligencja
    //protected int strenght;
    //protected int agility;
    //protected int intteligence;
        
    //protected int CritChance;
    //protected int CritDeffence;

    public Actor() {
        //inicjalizacja wartości początkowych 
        //wywolana tylko przy tworzeniu nowej postaci
        heroLevel = 0;
        heroHealth = 10; //wymyśliłem dartość do zmienienia
        heroMana = 10;
        heroDeffence = 5.0;
        
        heroAttack = 1;
        heroMagicAttack = 1;
    }
    
    
}
