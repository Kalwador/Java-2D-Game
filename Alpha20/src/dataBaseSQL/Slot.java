/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBaseSQL;

/**
 *
 * @author maciejpiotrowski
 */
public class Slot {
    private int id;
    private int idHero;
    private int idBag;
    private int idSkill;
    private int idQuest;
 
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdHero() {
        return idHero;
    }
    public void setIdHero(int idHero) {
        this.idHero = idHero;
    }
    
    public int getIdBag() {
        return idBag;
    }
    public void setIdBag(int idBag) {
        this.idHero = idBag;
    }
    
    public int getIdSkill() {
        return idSkill;
    }
    public void setIdSkill(int idSkill) {
        this.idSkill = idSkill;
    }
    
    public int getIdQuest() {
        return idQuest;
    }
    public void setIdQuest(int idQuest) {
        this.idQuest = idQuest;
    }
 
    public Slot() {}
    public Slot(int id, int idHero, int idBag, int idSkill, int idQuest) {
        this.id = id;
        this.idHero = idHero;
        this.idBag = idBag;
        this.idSkill = idSkill;
        this.idQuest = idQuest;
    }
}
