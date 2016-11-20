/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;

/**
 *
 * @author maciejpiotrowski
 */
public class Quests {
    private int id;
    private int quest;
    
    
    public int getId(){
        return id;
    }
    
    public void setId(){
        this.id = id;
    }
    
    public int getQuest(){
        return quest;
    }
    
    public void setQuest(){
        this.quest = quest;
    }
    
    public Quests() {}
    public Quests(int id, int quest) {
        this.id = id;
        this.quest = quest;
    }
}
