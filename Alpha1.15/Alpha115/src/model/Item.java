package model;

public class Item {

    int id;
    String name; // nazwa przedmiotu
    String description; //opis przedmiotu
    int quantity; //ilość sztuk
    int nOF; //the number of features - ilość cech przedmiotu
    int hp; //health points
    int mp; //mana points
    int kt; //kamień teleportacyjny
    int id_klucza;//id_klucza

    public Item() {
    }

    public Item(int id, String name, String description, int quantity, int nOF, int hp, int mp, int kt, int id_klucza) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.nOF = nOF;
        this.hp = hp;
        this.mp = mp;
        this.kt = kt;
        this.id_klucza = id_klucza;
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

    public Item(model.Item bag) {

    }
}
