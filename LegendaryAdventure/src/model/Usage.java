package model;

import java.util.Random;

/**
 *
 * @author Szymon
 */
public class Usage {

    public static boolean tura = false;
    Enemy enemy=new Enemy();

    public  void use(String target, int id) {
        String type = target;
        System.out.println(target);
        double dmg = model.LadujSkille.getSkill(id).getDmg();
        double mana = model.LadujSkille.getSkill(id).getMana();
        tura = model.LadujSkille.getSkill(id).getDistance();
        

        
        //LadujSkille.getSkill(id).getTarget().
        if (mana >= Hero.tempHeroMana) {
            System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
        } else {
            if (target.equals("enemy")) {
                System.out.println("enemy hp przed: " + enemy.tempEnemyHealth);
                enemy.tempEnemyHealth -= dmg;  //obrona =20 = 2
                System.out.println("enemy hp po: " + enemy.tempEnemyHealth);
            } else {
                System.out.println("leczenie przed: " + Hero.tempHeroHealth);
                Hero.tempHeroHealth += dmg;
                if (Hero.tempHeroHealth >= Hero.maxHeroHealth) {
                    Hero.tempHeroHealth = Hero.maxHeroHealth;
                }
                System.out.println("leczenie po: " + Hero.tempHeroHealth);
            }
            System.out.println("Mana przed uzyciem: " + Hero.tempHeroMana);
            Hero.tempHeroMana -= mana;
            if(Hero.tempHeroMana >= Hero.maxHeroMana) {
                Hero.tempHeroMana = Hero.maxHeroMana;
            }
            System.out.println("Mana po uzyciu: " + Hero.tempHeroMana);
            //cooldown
            
        }
    }
    
    public void enemyUse(String target, int id) {
        String type = target;
        System.out.println(target);
        double dmg = model.LadujSkille.getSkill(id).getDmg();
        double mana = model.LadujSkille.getSkill(id).getMana();
        tura = model.LadujSkille.getSkill(id).getDistance();
        //enemy.tempEnemyMana = 100;
        
        //LadujSkille.getSkill(id).getTarget().
        if (mana >= enemy.tempEnemyMana) {
            System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
        } else {
            if (target.equals("enemy")) {
                System.out.println("hero hp przed: " + Hero.tempHeroHealth);
                Hero.tempHeroHealth -= dmg;  //obrona =20 = 2
                System.out.println("hero hp po: " + Hero.tempHeroHealth);
            } else {
                System.out.println("leczenie przed: " + enemy.tempEnemyHealth);
                enemy.tempEnemyHealth += dmg;
                if (enemy.tempEnemyHealth >= enemy.maxEnemyHealth) {
                    enemy.tempEnemyHealth = enemy.maxEnemyHealth;
                }
                System.out.println("leczenie po: " + enemy.tempEnemyHealth);
            }
            System.out.println("Mana przed uzyciem: " + enemy.tempEnemyMana);
            enemy.tempEnemyMana -= mana;
            if(enemy.tempEnemyMana >= enemy.maxEnemyMana) {
                enemy.tempEnemyMana = enemy.maxEnemyMana;
            }
            System.out.println("Mana po uzyciu: " + enemy.tempEnemyMana);
            //cooldown
            
        }
    }
    
    //popisać rozne metodki atakow
    public void melee(String attacker, int id) { //atakujacy
        String type = attacker;
        System.out.println(attacker);
        double dmg = model.LadujSkille.getSkill(id).getDmg();
        double mana = model.LadujSkille.getSkill(id).getMana();
        tura = model.LadujSkille.getSkill(id).getDistance();
        if (type.equals("Hero")) {
            if (mana >= Hero.tempHeroMana) {
                System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
            } else {
                System.out.println("enemy hp przed: " + enemy.tempEnemyHealth);
                enemy.tempEnemyHealth -= dmg;  //obrona =20 = 2
                System.out.println("enemy hp po: " + enemy.tempEnemyHealth); 
            }
            
            System.out.println("Mana przed uzyciem: " + Hero.tempHeroMana);
            Hero.tempHeroMana -= mana;
            if(Hero.tempHeroMana >= Hero.maxHeroMana) {
                Hero.tempHeroMana = Hero.maxHeroMana;
            }
            System.out.println("Mana po uzyciu: " + Hero.tempHeroMana);
            //cooldown
            
        } else {
            System.out.println("TAKUJE ENEMY");
            if (mana >= enemy.tempEnemyMana) {
                System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
            } else {
                System.out.println("hero hp przed: " + Hero.tempHeroHealth);
                Hero.tempHeroHealth -= dmg;  //obrona =20 = 2
                System.out.println("hero hp po: " + Hero.tempHeroHealth); 
            }
            
            System.out.println("Mana przed uzyciem: " + enemy.tempEnemyMana);
            enemy.tempEnemyMana -= mana;
            if(enemy.tempEnemyMana >= enemy.maxEnemyMana) {
                enemy.tempEnemyMana = enemy.maxEnemyMana;
            }
            System.out.println("Mana po uzyciu: " + enemy.tempEnemyMana);
            //cooldown
        }        
    }
    
    public void distance(String attacker, int id) { //atakujacy
        String type = attacker;
        System.out.println(attacker);
        double dmg = model.LadujSkille.getSkill(id).getDmg();
        double mana = model.LadujSkille.getSkill(id).getMana();
        tura = model.LadujSkille.getSkill(id).getDistance();
        if (type.equals("Hero")) {
            if (mana >= Hero.tempHeroMana) {
                System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
            } else {
                System.out.println("enemy hp przed: " + enemy.tempEnemyHealth);
                enemy.tempEnemyHealth -= dmg;  //obrona =20 = 2
                System.out.println("enemy hp po: " + enemy.tempEnemyHealth); 
            }
            
            System.out.println("Mana przed uzyciem: " + Hero.tempHeroMana);
            Hero.tempHeroMana -= mana;
            if(Hero.tempHeroMana >= Hero.maxHeroMana) {
                Hero.tempHeroMana = Hero.maxHeroMana;
            }
            System.out.println("Mana po uzyciu: " + Hero.tempHeroMana);
            //cooldown
            
        } else {
            System.out.println("TAKUJE ENEMY");
            if (mana >= enemy.tempEnemyMana) {
                System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
            } else {
                System.out.println("hero hp przed: " + Hero.tempHeroHealth);
                Hero.tempHeroHealth -= dmg;  //obrona =20 = 2
                System.out.println("hero hp po: " + Hero.tempHeroHealth); 
            }
            
            System.out.println("Mana przed uzyciem: " + enemy.tempEnemyMana);
            enemy.tempEnemyMana -= mana;
            if(enemy.tempEnemyMana >= enemy.maxEnemyMana) {
                enemy.tempEnemyMana = enemy.maxEnemyMana;
            }
            System.out.println("Mana po uzyciu: " + enemy.tempEnemyMana);
            //cooldown
        }
    }
    
    public void heal(String attacker, int id) { //atakujacy
        String type = attacker;
        System.out.println(attacker);
        double dmg = model.LadujSkille.getSkill(id).getDmg();
        double mana = model.LadujSkille.getSkill(id).getMana();
        tura = model.LadujSkille.getSkill(id).getDistance();
        if (type.equals("Hero")) {
            if (mana >= Hero.tempHeroMana) {
                System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
            } else {
                System.out.println("Hero hp przed: " + Hero.tempHeroHealth);
                Hero.tempHeroHealth += dmg;  
                System.out.println("Hero hp po: " + Hero.tempHeroHealth); 
            }
            
            System.out.println("Hero mana przed uzyciem: " + Hero.tempHeroMana);
            Hero.tempHeroMana -= mana;
            System.out.println("Hero ana po uzyciu: " + Hero.tempHeroMana);   
        } 
        if (type.equals("enemy")) {
            System.out.println("TAKUJE ENEMY");
            if (mana >= enemy.tempEnemyMana) {
                System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
            } else {
                System.out.println("enemy hp przed: " + enemy.tempEnemyHealth);
                enemy.tempEnemyHealth += dmg;  //obrona =20 = 2
                System.out.println("enemy hp po: " + enemy.tempEnemyHealth); 
            }
            
            System.out.println("enemy mana przed uzyciem: " + enemy.tempEnemyMana);
            enemy.tempEnemyMana -= mana;
            System.out.println("enemy mana po uzyciu: " + enemy.tempEnemyMana);
            //cooldown
        }
    }
    
    public void lifesteal(String attacker, int id) { //atakujacy
        String type = attacker;
        System.out.println(attacker);
        double dmg = model.LadujSkille.getSkill(id).getDmg();
        double mana = model.LadujSkille.getSkill(id).getMana();
        tura = model.LadujSkille.getSkill(id).getDistance();
        if (type.equals("Hero")) {
            if (mana >= Hero.tempHeroMana) {
                System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
            } else {
                System.out.println("Hero hp przed: " + Hero.tempHeroHealth);
                System.out.println("enemy hp przed: " + enemy.tempEnemyHealth);
                Hero.tempHeroHealth += dmg;
                enemy.tempEnemyHealth -= dmg;
                if (Hero.tempHeroHealth > Hero.maxHeroHealth)
                    Hero.tempHeroHealth = Hero.maxHeroHealth;
                System.out.println("Hero hp po: " + Hero.tempHeroHealth);
                System.out.println("enemy hp po: " + enemy.tempEnemyHealth);
            }
            System.out.println("Hero mana przed uzyciem: " + Hero.tempHeroMana);
            Hero.tempHeroMana -= mana;
            System.out.println("Hero ana po uzyciu: " + Hero.tempHeroMana);
            
        }
        if (type.equals("enemy")) {
            if (mana >= enemy.tempEnemyMana) {
                System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
            } else {
                System.out.println("enemy hp przed: " + enemy.tempEnemyHealth);
                System.out.println("Hero hp przed: " + Hero.tempHeroHealth);
                enemy.tempEnemyHealth += dmg;
                Hero.tempHeroHealth -= dmg;
                if (enemy.tempEnemyHealth > enemy.maxEnemyHealth)
                    enemy.tempEnemyHealth = enemy.maxEnemyHealth;
                System.out.println("enemy hp przed: " + enemy.tempEnemyHealth);
                System.out.println("Hero hp przed: " + Hero.tempHeroHealth);
            }
            System.out.println("enemy mana przed uzyciem: " + enemy.tempEnemyMana);
            enemy.tempEnemyMana -= mana;
            System.out.println("enemy mana po uzyciu: " + enemy.tempEnemyMana);
        }
    }
        
    public void passive(String attacker, int id) { //atakujacy
        String type = attacker;
        System.out.println(attacker);
        double dmg = model.LadujSkille.getSkill(id).getDmg();
        double mana = model.LadujSkille.getSkill(id).getMana();
        tura = model.LadujSkille.getSkill(id).getDistance();
        if (type.equals("Hero")) {
            
        }
        
        
    }
    
    

    public static int mobUse(int low, int high) {
        Random random = new Random();
        double damage = random.nextInt(high - low) + low;
        return (int)damage;
    }

}
