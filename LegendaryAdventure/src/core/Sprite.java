package core;

import model.Hero;
import org.newdawn.slick.Animation;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

/**
 * Obsługuje sprite postaci bohatera, jego animację, czasy animacji oraz
 * kierunek ruchu
 */
public class Sprite {

    //wygląd bohatera
    public Image imgSprite;
    public int heroHeight, heroWidth;

    //prędkość animacji uzależniona od prędkości poruszania
    int durationScalar = (int) (100 / Hero.movementSpeed);

    //animacja avataru
    public int[] duration = {durationScalar, durationScalar, durationScalar, durationScalar, durationScalar, durationScalar};
    public Animation avatar, movingUp, movingDown, movingLeft, movingRight;

    //wywoła się przy "Nowa Gra"
    public Sprite() throws SlickException {

        //lokalizacja avataru
        imgSprite = new Image("graphic/heroSprite/avatar" + GameStatus.spriteNumber + ".png");

        //ilość klatek na szerokość
        int widthSubImageLength = 6;

        //rozmiar avataru
        this.heroHeight = imgSprite.getHeight() / 4;
        this.heroWidth = imgSprite.getWidth() / widthSubImageLength;

        Image[] walkDown = new Image[widthSubImageLength];
        Image[] walkLeft = new Image[widthSubImageLength];
        Image[] walkRight = new Image[widthSubImageLength];
        Image[] walkUp = new Image[widthSubImageLength];

        for (int w = 0, h = 0; w < imgSprite.getWidth(); w += heroWidth) {
            walkDown[h] = imgSprite.getSubImage(w, heroHeight * 0, heroWidth, heroHeight);
            walkUp[h] = imgSprite.getSubImage(w, heroHeight * 1, heroWidth, heroHeight);
            walkLeft[h] = imgSprite.getSubImage(w, heroHeight * 2, heroWidth, heroHeight);
            walkRight[h] = imgSprite.getSubImage(w, heroHeight * 3, heroWidth, heroHeight);
            h++;
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
