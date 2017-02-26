package hud;

import core.GameStatus;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Frame {

    //mini Mapa w rogu
    public Image miniMap;
    public String miniMapPath;

    //tło ramki
    public Image frameBackGround;

    //ramka hudu
    public Image mainFrame;
    
    //wskaźnik na minipamie
    public Image miniMapPointer;
    
    //paski życia i many 
    public Image manaBar;
    public Image healthBar;

    //napis w oknie dialogowym
    public static String npcMessage;

    public Frame() {
        try {
            miniMapPath = "graphic/miniMap/" + String.valueOf(GameStatus.levelID) + ".png";
            this.miniMap = new Image(miniMapPath);

            frameBackGround = new Image("graphic/hud/backGround.png");

            healthBar = new Image("graphic/hud/healthBar.png");
            manaBar = new Image("graphic/hud/manaBar.png");

            mainFrame = new Image("graphic/hud/hud4.png");
            
            miniMapPointer = new Image("graphic/hud/pointer.png");
            miniMapPointer = miniMapPointer.getScaledCopy(13, 13);
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

    public void render(Graphics g) throws SlickException {

        //render tła ramki
        frameBackGround.draw(0, 600);

        //render minimapy
        miniMap.draw(11, 478);
        
        //render wskaźnika na minimapie
        miniMapPointer.draw(8+((220*core.GameStatus.x)/core.Camera.mapWidth),470+((220*core.GameStatus.y)/core.Camera.mapHeight));
        
        //render pasków życia i many
        healthBar.draw(1095, 639, (int) (134 * (GameStatus.hero.tempHeroHealth / (double) GameStatus.hero.maxHeroHealth)), 16);
        manaBar.draw(1095, 677, (int) (134 * (GameStatus.hero.tempHeroMana / (double) GameStatus.hero.maxHeroMana)), 16);

        //render ramki
        g.drawImage(mainFrame, 0, 0);
    }
}
