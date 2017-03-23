package gameUtils;

import java.util.Random;


/**
 *
 * @author Szymon
 */
public class UseSkill {

    public static boolean tura = false;

    public static void use(String target, int id) {

        String type = target;
        System.out.println(target);
        double skillDMG = gameUtils.LoadSkills.getSkill(id).getDmg();
        double skillManaCost = gameUtils.LoadSkills.getSkill(id).getMana();
        tura = gameUtils.LoadSkills.getSkill(id).getDistance();

        if (skillManaCost >= core.GameStatus.hero.tempHeroMana) {
            System.out.println("Niewystarczajaca mana"); //i tura jest pomijana
        } else {
            if (target.equals("enemy")) {
                System.out.println("enemy hp przed: " + core.GameStatus.enemy.tempEnemyHealth);
                core.GameStatus.enemy.tempEnemyHealth -= skillDMG;  //obrona =20 = 2
                System.out.println("enemy hp po: " + core.GameStatus.enemy.tempEnemyHealth);
            } else {
                System.out.println("leczenie przed: " + core.GameStatus.hero.tempHeroHealth);
                core.GameStatus.hero.tempHeroHealth += skillDMG;
                if (core.GameStatus.hero.tempHeroHealth >= core.GameStatus.hero.maxHeroHealth) {
                    core.GameStatus.hero.tempHeroHealth = core.GameStatus.hero.maxHeroHealth;
                }
                System.out.println("leczenie po: " + core.GameStatus.hero.tempHeroHealth);
            }
            System.out.println("Mana przed uzyciem: " + core.GameStatus.hero.tempHeroMana);
            core.GameStatus.hero.tempHeroMana -= skillManaCost;
            if(core.GameStatus.hero.tempHeroMana >= core.GameStatus.hero.maxHeroMana) {
                core.GameStatus.hero.tempHeroMana = core.GameStatus.hero.maxHeroMana;
            }
            System.out.println("Mana po uzyciu: " + core.GameStatus.hero.tempHeroMana);
        }
    }

    public static void mobUse(int low, int high) {
        Random random = new Random();
        double damage = random.nextInt(high - low) + low;
    }
}
