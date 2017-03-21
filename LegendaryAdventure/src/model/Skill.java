package model;

import java.util.ArrayList;


public class Skill {

    private final int id_skill;
    private final String nazwa;
    private final String opis;
    private final double dmg;
    private final double mana;
    private final String target; //cel(ja/wrog/aoe) 1-ja 2-ja/sojusznik 3-wrog 4-aoe
    //private final int icon; //zmienna do ikony/grafiki skilla     /ścieżka_nie_zmienna/" +Integer.toString(skillID)+".png";
    private final int cooldown;
    private final int stun; //czas ogluszenia, if 0=brak
    private final boolean distance;
    

    
    
    public Skill(int id_skill, String nazwa, String opis, double dmg, double mana, String target, int cooldown, int stun, boolean distance) {
        this.id_skill = id_skill;
        this.nazwa = nazwa;
        this.opis = opis;
        this.dmg = dmg;
        this.mana = mana;
        this.target = target;
        this.cooldown = cooldown;
        this.stun = stun;
        this.distance = distance;
        

        //System.out.println("Umiejetnosc " + nazwa + "zadała " + dmg + "obrazen, postaci o ID " + target);
    }
    
//    public static ArrayList<Skill> skills = new ArrayList<Skill>() {
//        {
//            add(new Skill(1001, "Kula ognia", "opis1", 50, "enemy", 2, 0));
//            add(new Skill(1002, "Leczace swiatlo", "opis2", 25, "hero", 3, 0));
//            add(new Skill(1003, "Lodowe pęknięcie", "opis3", 20, "enemy", 5, 1));
//        }
//        
//    };
    
//    public static ArrayList<Skill> skills;
//    public void ladujSkille() {
//        skills = new ArrayList<Skill>();
//        skills.add(new Skill(1001, "Kula ognia", "opis1", 50, "enemy", 2, 0));
//        skills.add(new Skill(1002, "Leczace swiatlo", "opis2", 25, "hero", 3, 0));
//        skills.add(new Skill(1003, "Lodowe pęknięcie", "opis3", 20, "enemy", 5, 1));
//        
//        skills.get(id_skill);
//    }
//    
//    public static void getSkill(int id) {
//        skills.get(id);
//    }

    
    //usage - wykorzystanie // przesloniecie override w kazdej klasie potomnej. Przesloniecie ma pobierac w parametrach obiekt typu enemy(hp) i na nim wykoanny skill

    public int getId_skill() {
        return id_skill;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public double getDmg() {
        return dmg;
    }

    public String getTarget() {
        return target;
    }

    public int getCooldown() {
        return cooldown;
    }

    public int getStun() {
        return stun;
    }
    public boolean getDistance() {
        return distance;
    }

    public double getMana() {
        return mana;
    }


}
