package model;
public class Equip {
    int id;
    String name; //  name of equip
    String description; //description of equip
    String type; //type of equip
    int value; //value 
    int nOF; //the number of features - ilość cech przedmiotu
    int dmg; //damage
    int def; //defence
    
      
    public Equip(){}

    public Equip(int id, String name, String description, String type, int value, int nOF, int dmg, int def) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.value = value;
        this.nOF = nOF;
        this.dmg = dmg;
        this.def = def;
    }

    public int getnOF() {
        return nOF;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
