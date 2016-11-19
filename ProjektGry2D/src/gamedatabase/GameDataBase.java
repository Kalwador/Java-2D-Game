/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamedatabase;

import java.util.List;

import databasecontent.Bag;
import databasecontent.CharacterInformation;
import databasecontent.Quests;
import databasecontent.Skills;
import slot.Actions;
/**
 *
 * @author maciejpiotrowski
 */
public class GameDataBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Actions a = new Actions();
        //a.insertCharacterInformation("Belzebub", 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
 
        List<CharacterInformation> characterinformation = a.selectCharacterInformation();
        List<Bag> bag = a.selectBag();
 
        System.out.println("Informacje o bohaterze: ");
        for(CharacterInformation c: characterinformation)
            System.out.println(c);
 
        System.out.println("Lista itemow w plecku:");
        for(Bag k: bag)
            System.out.println(k);
 
        a.closeConnection();
    }
    
}
