package dataBase;

public class Bag {
    private int id;
    private int itemID;
    
    
    public int getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public int getItem(){
        return itemID;
    }
    
    public void setItem(){
        this.itemID = itemID;
    }
    
    public Bag() {}
    public Bag(int id, int item) {
        this.id = id;
        this.itemID = item;
    }
}
