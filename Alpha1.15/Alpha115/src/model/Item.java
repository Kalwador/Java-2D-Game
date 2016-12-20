package model;

public class Item {

    int id;
    String name; // nazwa przedmiotu
    String description; //opis przedmiotu
    int value; //ilość sztuk
    int nOF; //the number of features - ilość cech przedmiotu
    int hp; //health points
    int mp; //mana points
    int kt; //kamien teleportacyjny
    int id_klucza;//id_klucza

    public Item() {
    }

    public Item(int id, String name, String description, int value, int nOF, int hp, int mp, int kt, int id_klucza) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.value = value;
        this.nOF = nOF;
        this.hp = hp;
        this.mp = mp;
        this.kt = kt;
        this.id_klucza = id_klucza;
    }
    
    //seters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setnOF(int nOF) {
        this.nOF = nOF;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setKt(int kt) {
        this.kt = kt;
    }

    public void setId_klucza(int id_klucza) {
        this.id_klucza = id_klucza;
    }
    
    //geters
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
