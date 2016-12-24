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
public class CharacterInformation {
    private int id;
    private String name;
    private int x;
    private int y;
    private int highlevel;
    private int mediumlevel;
    private int experience;
    private int force;
    private int dexterity;
    private int magic;
    private int attack;
    private int mediumattack;
    private int defense;
    private int mediumdefense;
    private double highspeed;
    
    
    public int getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(){
        this.name = name;
    }
    
    public int getX(){
        return x;
    }
    
    public void setX(){
        this.x = x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setY(){
        this.y = y;
    }
    
    public int getHighLevel(){
        return highlevel;
    }
    
    public void setHighLevel(){
        this.highlevel = highlevel;
    }
    
    public int getMediumLevel(){
        return mediumlevel;
    }
    
    public void setMediumLevel(){
        this.mediumlevel = mediumlevel;
    }
    
    public int getExperience(){
        return experience;
    }
    
    public void setExperience(){
        this.experience = experience;
    }
    
    public int getForce(){
        return force;
    }
    
    public void setForce(){
        this.force = force;
    }
    
    public int getDexterity(){
        return dexterity;
    }
    
    public void setDexterity(){
        this.dexterity = dexterity;
    }
    
    public int getMagic(){
        return magic;
    }
    
    public void setMagic(){
        this.magic = magic;
    }
    
    public int getAttack(){
        return attack;
    }
    
    public void setAttack(){
        this.attack = attack;
    }
    
    public int getMediumAttack(){
        return mediumattack;
    }
    
    public void setMediumAttack(){
        this.mediumattack = mediumattack;
    }
    
    public int getDefense(){
        return defense;
    }
    
    public void setDefense(){
        this.defense = defense;
    }
    
    public int getMediumDefense(){
        return mediumdefense;
    }
    
    public void setMediumDefense(){
        this.mediumdefense = mediumdefense;
    }
    
    public double getHighSpeed(){
        return highspeed;
    }
    
    public void setHighSpeed(){
        this.highspeed = highspeed;
    }

    public CharacterInformation() {}
    
    public CharacterInformation(int id, String name, int x, int y, int highlevel,
        int mediumlevel, int experience, int force, int dexterity, int magic,
        int attack, int mediumattack, int defense, int mediumdefense, double highspeed) {
        
        
        this.id = id;
        this.name = name;
        this.x = x;
        this.y = y;
        this.highlevel = highlevel;
        this.mediumlevel = mediumlevel;
        this.experience = experience;
        this.force = force;
        this.dexterity = dexterity;
        this.magic = magic;
        this.attack = attack;
        this.mediumattack = mediumattack;
        this.defense = defense;
        this.mediumdefense = mediumdefense;
        this.highspeed = highspeed;
    }
    
    @Override
    public String toString() {
        return "["+id+"] - "+name+" "+x+" - "+y+" - "+highlevel+" - "+mediumlevel+""
                + " - "+experience+" - "+force+" - "+dexterity+" - "+magic+"- "+attack+""
                + " -"+mediumattack+" -"+defense+" - "+mediumdefense+" - "+highspeed+"";
    }
}
