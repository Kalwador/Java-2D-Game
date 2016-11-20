package core;

import core.GameStatus;
import static core.HUD.renderCounter;
import status.Hero;
import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

public class Actor {

    public TiledMap map;

    //wygląd bohatera
    public Image img;
    public double heroH, heroW;
    int durationScalar = (int) (100 / Hero.heroSpeed); //prędkość animacji uzależniona od prędkości poruszania

    //animacja sprite
    public int[] duration = {durationScalar, durationScalar, durationScalar, durationScalar};
    public Animation sprite, movingUp, movingDown, movingLeft, movingRight;

    //do kolizji, eventów, przejść
    int collisionID, eventID, gateID;
    int collisionTileID, eventTileID, gateTileID;

    //konstruktor dla poruszania postaci 
    //wywoła się przy "Nowa Gra"
    public Actor(TiledMap map) throws SlickException {
        this.map = map;

        //lokalizacja sprite
        img = new Image("res/heroSprite/heroTest.png");

        //wielkość sprite
        this.heroH = 48;
        this.heroW = 48;

        //animacja sprite
        Image[] walkDown = {img.getSubImage(0, 0, 48, 48), img.getSubImage(48, 0, 48, 48), img.getSubImage(96, 0, 48, 48), img.getSubImage(144, 0, 48, 48)};
        Image[] walkLeft = {img.getSubImage(0, 48, 48, 48), img.getSubImage(48, 48, 48, 48), img.getSubImage(96, 48, 48, 48), img.getSubImage(144, 48, 48, 48)};
        Image[] walkRight = {img.getSubImage(0, 96, 48, 48), img.getSubImage(48, 96, 48, 48), img.getSubImage(96, 96, 48, 48), img.getSubImage(144, 96, 48, 48)};
        Image[] walkUp = {img.getSubImage(0, 144, 48, 48), img.getSubImage(48, 144, 48, 48), img.getSubImage(96, 144, 48, 48), img.getSubImage(144, 144, 48, 48)};
        
        //animacja sprite
        movingDown = new Animation(walkDown, duration, false);
        movingLeft = new Animation(walkLeft, duration, false);
        movingRight = new Animation(walkRight, duration, false);
        movingUp = new Animation(walkUp, duration, false);
       
        //animacja sprite
        sprite = movingDown;
    }

    //obsługa poruszania się
    public void movement(StateBasedGame sbg, Input input, core.GameStatus gs, int delta) throws SlickException {

        if (input.isKeyDown(Input.KEY_W) || input.isKeyDown(Input.KEY_UP)) {
            sprite = movingUp;
            sprite.update(delta);
            gs.y -= gs.hero.heroSpeed * delta * 0.1f;
        }
        if (input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)) {
            sprite = movingDown;
            sprite.update(delta);
            gs.y += gs.hero.heroSpeed * delta * 0.2f;
        }
        if (input.isKeyDown(Input.KEY_A) || input.isKeyDown(Input.KEY_LEFT)) {
            sprite = movingLeft;
            sprite.update(delta);
            gs.x -= gs.hero.heroSpeed * delta * 0.1f;
        }
        if (input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)) {
            sprite = movingRight;
            sprite.update(delta);
            gs.x += gs.hero.heroSpeed * delta * 0.2f;
        }

    }
    
    //obsługa kolizji, eventów i przejść
    public void colision(GameStatus gs,HUD hud, Input input, double oldX, double oldY) {
        
        
        //kolizje
        collisionID = map.getLayerIndex("collision");
        collisionTileID = map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), collisionID);
        if (collisionTileID == 1) {

            gs.x = (int) oldX;
            gs.y = (int) oldY;
        }
        
        
        //podejśćie pod npc - event
        eventID = map.getLayerIndex("npc");
        eventTileID = map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), eventID);
        if (eventTileID == 3 && input.isKeyPressed(Input.KEY_ENTER)) {
            hud.showDialogWindow();
        }
        if(eventTileID != 3){
            hud.hideDialogWindow();
        }
        
        //wejście w przejście do kolejnej mapy
        gateID = map.getLayerIndex("gate");
        gateTileID = map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), gateID);
        if (gateTileID == 2 ) {

            System.out.println("gate");
        }
    }
    
    //obsługa klawiszy funkcyjnych
    public void event(GameContainer gc, StateBasedGame sbg, Input input, HUD hud) {
        
        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            //sbg.enterState(2);
            System.exit(0);
        }
        if (input.isKeyPressed(Input.KEY_C)) {
            sbg.enterState(3);
        }
        if ((input.isKeyPressed(Input.KEY_B)) || (input.isKeyPressed(Input.KEY_TAB)) || (input.isKeyPressed(Input.KEY_I))) {
            sbg.enterState(4);
        }
        if ((input.isKeyPressed(Input.KEY_Q)) || (input.isKeyPressed(Input.KEY_L))) {
            sbg.enterState(5);
        }
        if (input.isKeyPressed(Input.KEY_K)) {
            sbg.enterState(6);
        }
        if (input.isKeyPressed(Input.KEY_M)) {
            sbg.enterState(7);
        }
        //licznik fpsów i wyświtlacz tileid 
        if (input.isKeyPressed(Input.KEY_GRAVE)) {
            if(HUD.renderCounter == true) {HUD.renderCounter = false; gc.setShowFPS(false);}
            else {HUD.renderCounter = true;gc.setShowFPS(true);}
        }
    }
    
    //konstruktor do załadowania gry - NIEDOKOŃCZONE
    public Actor(Image img) throws SlickException {
        this.img = img;
    }

}
