package dataBaseSQL;

import java.util.List;

public class GameDataBase {

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
