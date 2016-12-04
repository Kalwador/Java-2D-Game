package core;

import status.Hero;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class Actor {

    public TiledMap map;

    //wygląd bohatera
    public Image imgSprite;
    public int heroH, heroW;

    //prędkość animacji uzależniona od prędkości poruszania
    int durationScalar = (int) (100 / Hero.heroSpeed);

    //animacja sprite
    public int[] duration = {durationScalar, durationScalar, durationScalar, durationScalar};
    public Animation sprite, movingUp, movingDown, movingLeft, movingRight;

    //wywoła się przy "Nowa Gra"
    public Actor(TiledMap map) throws SlickException {
        this.map = map;

        //lokalizacja sprite
        imgSprite = new Image("graphic/heroSprite/heroTest.png");

        //wielkość sprite
        this.heroH = imgSprite.getHeight() / 4;
        this.heroW = imgSprite.getWidth() / 4;

        //animacja sprite
        Image[] walkDown = {imgSprite.getSubImage(0, 0, 48, 48), imgSprite.getSubImage(48, 0, 48, 48), imgSprite.getSubImage(96, 0, 48, 48), imgSprite.getSubImage(144, 0, 48, 48)};
        Image[] walkLeft = {imgSprite.getSubImage(0, 48, 48, 48), imgSprite.getSubImage(48, 48, 48, 48), imgSprite.getSubImage(96, 48, 48, 48), imgSprite.getSubImage(144, 48, 48, 48)};
        Image[] walkRight = {imgSprite.getSubImage(0, 96, 48, 48), imgSprite.getSubImage(48, 96, 48, 48), imgSprite.getSubImage(96, 96, 48, 48), imgSprite.getSubImage(144, 96, 48, 48)};
        Image[] walkUp = {imgSprite.getSubImage(0, 144, 48, 48), imgSprite.getSubImage(48, 144, 48, 48), imgSprite.getSubImage(96, 144, 48, 48), imgSprite.getSubImage(144, 144, 48, 48)};

        //animacja sprite
        movingDown = new Animation(walkDown, duration, false);
        movingLeft = new Animation(walkLeft, duration, false);
        movingRight = new Animation(walkRight, duration, false);
        movingUp = new Animation(walkUp, duration, false);

        //animacja sprite
        sprite = movingDown;
    }

    //konstruktor do załadowania gry - NIEDOKOŃCZONE
    public Actor() throws SlickException {
    }

}
