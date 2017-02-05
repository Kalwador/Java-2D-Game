package gameUtils;

import core.GameStatus;
import model.Hero;

public class fakeDataSeeder {
    public static void initFakeData(){
        core.GameStatus.hero = new Hero("Logan",21,340,400,75,100,75,100,30,15,10,10,10,3);
        Hero.attackSpeed = 1;
        Hero.movementSpeed = 1;
    }
}
