package model;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Skill {

    //private int id_hero; //id klasy postaci
    private final int id_skill;
    private final String nazwa;
    private final String opis;
    private final int dmg;
    private final int poison; //zatrucie czasowe-moze byc odwrotnosc, heal czasowy 1-tak0-nie i obsluzyc gdzies indziej
    private final int target; //cel(ja/wrog/aoe) 1-ja 2-ja/sojusznik 3-wrog 4-aoe
    private final int icon; //zmienna do ikony/grafiki skilla     /ścieżka_nie_zmienna/" +Integer.toString(skillID)+".png";
    private final double cooldown;
    private final double stun; //czas ogluszenia, if 0=brak
    private static long counter = 0;
    
    //do skilów animowanych aoe itp
    //private final boolean animated; //czy skill jest animowany
    //private final int[] duration; //czasy animacaji
    
    
    public Skill(int id_skill, String nazwa, String opis, int dmg, int poison, int target, int icon, double cooldown, double stun) {
        this.id_skill = id_skill;
        this.nazwa = nazwa;
        this.opis = opis;
        this.dmg = dmg;
        this.poison = poison;
        this.target = target;
        this.icon = icon;
        this.cooldown = cooldown;
        this.stun = stun;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void warriorSkills() {
        ArrayList<Skill> warrior = new ArrayList<Skill>();
        warrior.add(new Skill(1, "Cios", "Przemodelowanie facjaty", 15, 0, 3, 1, 5.0, 0));
    }

    public void mageSkills() {
        ArrayList<Skill> mage = new ArrayList<Skill>();
        mage.add(new Skill(1, "FireBall", "Kula ognia", 30, 0, 3, 2, 3.0, 0));
        mage.add(new Skill(2, "Fire breath", "Ognisty oddech spopielajacy wrogow w poblizu", 40, 1, 4, 3, 10.0, 0)); //zatruty, aoe

    }

    public void POISON() { //n-czas trwania trucizny

    }

//    public void TimerOdlicz() {
//
//        int secondsPassed = 4; //ustawienie ile sekund ma trwac timer
//
//        Timer myTimer = new Timer();
//        TimerTask task = new TimerTask() {
//            @Override
//            public void run() {
//                secondsPassed--;
//                System.out.println("Minelo sekund: " + secondsPassed);
//                if (secondsPassed == 0) {
//                    System.out.println("Koniec zatrucia");
//                    myTimer.cancel(); //zakonczenie timera
//                }
//            }
//        }
//    }
    public static void licznik(int delta, int value) {
//        try {
            System.out.println(counter);
            counter += delta;
            if (counter >= value) {
                counter = 0;
                System.out.println("zatrucie "+counter+"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
//        } catch (SlickException e1) {
//            System.out.println("Blad licznika-SKILLS COUNTER");
//        }
    }
}
