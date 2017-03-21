package model;
import java.util.ArrayList;
import model.Skill;

/**
 *
 * @author Szymon
 */
public class LadujSkille {
    public Skill skill;
    
    public static ArrayList<Skill> skills=new ArrayList<Skill>();
    public void ladujSkille() {
//        skills.add(skill = new Skill(1001, "Pierdolnięcie", "Pizga że chuj", 6, 10, "enemy", 2, 2, true));
//        skills.add(skill = new Skill(1002, "Lecz sie cepie", "Pizsdfuj", 5, 15, "hero", 5, 0, false));
//        skills.add(skill = new Skill(1003, "Lep na ryj", "piecze", 10, 30,"enemy", 5, 0, false));
        skills.add(skill = new Skill(1001, //id
                "Atak wrecz", //nazwa
                "Atakujesz wroga bronia trzymana w rece", //opis
                2, //dmg
                0, //mana
                "enemy", //target
                1, //cooldown
                0, //stun
                false //distance
        ));  
        skills.add(skill = new Skill(1002, //id
                "Kula ognia", //nazwa
                "Ciskasz ognistą kulą w nieprzyjaciela", //opis
                30, //dmg
                10, //mana
                "enemy", //target
                2, //cooldown
                0, //stun
                true //distance
        ));  
        skills.add(skill = new Skill(1003, //id
                "Leczaca swiatlosc", //nazwa
                "Otacza cie niebianskie swiatlo, leczac pomniejsze obrazenia", //opis
                5, //dmg-leczenie
                10, //mana
                "hero", //target
                2, //cooldown
                0, //stun
                false //distance
        ));  
        skills.add(skill = new Skill(1004, //id
                "Transfuzja", //nazwa
                "Odzyskujesz czesc energii magicznej, poswiecajac czesc zdrowia", //opis
                5, //dmg
                -10, //mana
                "hero", //target
                3, //cooldown
                0, //stun
                false //distance
        )); 
        skills.add(skill = new Skill(1005, //id
                "Cios tarcza", //nazwa
                "Atakujesz przeciwnika tarcza ", //opis
                5, //dmg
                10, //mana
                "enemy", //target
                2, //cooldown
                2, //stun
                true //distance
        ));  
        skills.add(skill = new Skill(1005, //id
                "Zamrozenie", //nazwa
                "Zamrazasz swojego przeciwnika. Nie moze atakowac przez 2 tury", //opis
                5, //dmg
                15, //mana
                "enemy", //target
                2, //cooldown
                2, //stun
                true //distance
        )); 

//        skills.add(skill = new Skill(1006, //id
//                "Meteoryt", //nazwa
//                "Zsylsz ognisty meteoryt na nieprzyjaciela", //opis
//                50, //dmg
//                50, //mana
//                "enemy", //target
//                2, //cooldown
//                0, //stun
//                true //distance
//        )); 
    }
   
    public static Skill getSkill(int id){
     
        System.out.println("Zatakowales uzywajac: "+skills.get(id).getNazwa());
        System.out.println("____________");
        return skills.get(id);       
    }
}

//zdefiniowac 2x uzycie usage do kombinacji ja cos wrogowi, wrog mi
//zdefiniowac uzycie usage n razy

//skills.add(skill = new Skill(1005, //id
//                "", //nazwa
//                "", //opis
//                , //dmg
//                , //mana
//                "", //target
//                , //cooldown
//                , //stun
//                 //distance
//        ));  