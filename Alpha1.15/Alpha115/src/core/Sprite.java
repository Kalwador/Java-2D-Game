package core;

import model.Hero;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class Sprite {

    public TiledMap map;

    //wygląd bohatera
    public Image imgSprite;
    public int heroH, heroW;

    //prędkość animacji uzależniona od prędkości poruszania
    int durationScalar = (int) (100 / Hero.heroSpeed);

    //animacja avatar
    public int[] duration = {durationScalar, durationScalar, durationScalar, durationScalar};
    public Animation avatar, movingUp, movingDown, movingLeft, movingRight;

    //wywoła się przy "Nowa Gra"
    public Sprite() throws SlickException {
//        this.map = map;

        //lokalizacja avatar
        imgSprite = new Image("graphic/heroSprite/heroTest.png");

        //wielkość avatar
        this.heroH = imgSprite.getHeight() / 4;
        this.heroW = imgSprite.getWidth() / 4;
        
        Image [] walkDown = new Image[4]; 
        Image [] walkLeft = new Image[4]; 
        Image [] walkRight = new Image[4];  
        Image [] walkUp = new Image[4]; 
        
        int j = 0;
        for (int i = 0; i < imgSprite.getHeight(); i += heroW) {
            walkDown[j] = imgSprite.getSubImage(i, heroH * 0, heroW, heroH);
            walkLeft[j] = imgSprite.getSubImage(i, heroH * 1, heroW, heroH);
            walkRight[j] = imgSprite.getSubImage(i, heroH * 2, heroW, heroH);
            walkUp[j] = imgSprite.getSubImage(i, heroH * 3, heroW, heroH);
            j++;
        }

        //animacja avatar
        movingDown = new Animation(walkDown, duration, false);
        movingLeft = new Animation(walkLeft, duration, false);
        movingRight = new Animation(walkRight, duration, false);
        movingUp = new Animation(walkUp, duration, false);

        //ustawienie początkowego położenia avatar
        avatar = movingDown;
    }
    
}
