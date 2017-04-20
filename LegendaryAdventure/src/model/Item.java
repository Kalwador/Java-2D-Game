package model;

public class Item {
    private int id;
    private String name; // nazwa przedmiotu
    private String description; //opis przedmiotu
    private int amount; //ilość sztuk
    private int nOF; //the number of features - ilość cech przedmiotu
    private int hp; //health points
    private int mp; //mana points
    private int kt; //kamien teleportacyjny
    private int id_klucza;//id_klucza

    public Item(){
        this.amount = 0;
    }
    public Item(int id, String name, String description, int amount, int nOF, int hp, int mp, int kt, int id_klucza) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.nOF = nOF;
        this.hp = hp;
        this.mp = mp;
        this.kt = kt;
        this.id_klucza = id_klucza;
    }
    
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public int getnOF() {
        return nOF;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getKt() {
        return kt;
    }

    public int getId_klucza() {
        return id_klucza;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(int amount) {
        this.amount = amount;
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

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name=" + name + ", description=" + description + ", amount=" + amount + ", nOF=" + nOF + ", hp=" + hp + ", mp=" + mp + ", kt=" + kt + ", id_klucza=" + id_klucza + '}';
    }
    
}