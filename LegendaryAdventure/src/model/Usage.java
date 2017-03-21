package model;

import java.util.Random;

/**
 *
 * @author Szymon
 */
public class Usage {

    public static boolean tura = false;

    public static void use(String target, int id) {

        String type = target;
        System.out.println(target);
        double dmg = model.LadujSkille.getSkill(id).getDmg();
        double mana = model.LadujSkille.getSkill(id).getMana();
        tura = model.LadujSkille.getSkill(id).getDistance();

        if (mana >= Hero.tempHeroMana) {
            System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
        } else {
            if (target.equals("enemy")) {
                System.out.println("enemy hp przed: " + Enemy.tempEnemyHealth);
                Enemy.tempEnemyHealth -= dmg;  //obrona =20 = 2
                System.out.println("enemy hp po: " + Enemy.tempEnemyHealth);
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
        }
    }

    public static void mobUse(int low, int high) {
        Random random = new Random();
        double damage = random.nextInt(high - low) + low;
    }

}
