/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasecontent;

/**
 *
 * @author maciejpiotrowski
 */
public class Bag {
    private int id;
    private int item;
    
    
    public int getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public int getItem(){
        return item;
    }
    
    public void setItem(){
        this.item = item;
    }
    
    public Bag() {}
    public Bag(int id, int item) {
        this.id = id;
        this.item = item;
    }
}
