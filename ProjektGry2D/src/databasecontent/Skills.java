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
public class Skills {
    private int id;
    private int quickskill;
    private boolean skill;
    
    
    public int getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public int getQuickSkills(){
        return quickskill;
    }
    
    public void setQuickSkills(){
        this.quickskill = quickskill;
    }
    
    public boolean getSkills(){
        return skill;
    }
    
    public void setSkills(){
        this.skill = skill;
    }
    
    
    public Skills() {}
    public Skills(int id, int quickskill, boolean skill) {
        this.id = id;
        this.quickskill = quickskill;
        this.skill = skill;
    }
}
