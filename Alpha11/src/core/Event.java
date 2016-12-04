package core;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

public class Event extends Actor {

    public Actor actor;

    public Event(Actor actor) throws SlickException {
        this.actor = actor;
    }

    //obsługa poruszania się
    public void movement(StateBasedGame sbg, Input input, core.GameStatus gs, int delta) throws SlickException {

        if (input.isKeyDown(Input.KEY_W) || input.isKeyDown(Input.KEY_UP)) {
            actor.sprite = actor.movingUp;
            actor.sprite.update(delta);
            gs.y -= gs.hero.heroSpeed * delta * 0.1f;
        }
        if (input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)) {
            actor.sprite = actor.movingDown;
            actor.sprite.update(delta);
            gs.y += gs.hero.heroSpeed * delta * 0.2f;
        }
        if (input.isKeyDown(Input.KEY_A) || input.isKeyDown(Input.KEY_LEFT)) {
            actor.sprite = actor.movingLeft;
            actor.sprite.update(delta);
            gs.x -= gs.hero.heroSpeed * delta * 0.1f;
        }
        if (input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)) {
            actor.sprite = actor.movingRight;
            actor.sprite.update(delta);
            gs.x += gs.hero.heroSpeed * delta * 0.2f;
        }

    }

    //obsługa kolizji, eventów i przejść
    public int colision(GameStatus gs, StateBasedGame sbg, HUD hud, Input input, double oldX, double oldY) throws SlickException {

        LoadEntity.recPlayer = new Rectangle(gs.x, gs.y, actor.heroW-15, actor.heroH);
        int iter = 0;

        //portal
        while (LoadEntity.portals.size() > iter) {
            if (LoadEntity.recPlayer.intersects(LoadEntity.portals.get(iter))) {
                for (int i = 0; i < gs.portalMapList.size(); i++) {
//                    w razie problemów z portalami odkomentować
//                    System.out.println("x="+gs.x+" y="+gs.y+", xS="+gs.portalMapList.get(i).xStart+" xE="+gs.portalMapList.get(i).xEnd
//                            +" yS="+gs.portalMapList.get(i).yStart+" yE="+gs.portalMapList.get(i).yEnd+"\n");
                    if (((gs.x >= gs.portalMapList.get(i).xStart) && (gs.x <= gs.portalMapList.get(i).xEnd))
                            && ((gs.y >= gs.portalMapList.get(i).yStart) && (gs.y <= gs.portalMapList.get(i).yEnd))) {
                        gs.levelID = gs.portalMapList.get(i).levelID;
                        gs.x = gs.portalMapList.get(i).xN;
                        gs.y = gs.portalMapList.get(i).yN;
                        return 1;
                    }
                }
            }
            iter++;
        }

        //kolizje
        iter = 0;
        while (LoadEntity.collisions.size() > iter) {
            if (LoadEntity.recPlayer.intersects(LoadEntity.collisions.get(iter))) {
                gs.x = (int) oldX;
                gs.y = (int) oldY;
            }
            iter++;
        }
        return 0;
    }

    //obsługa klawiszy funkcyjnych
    public static void functionalKey(GameContainer gc, StateBasedGame sbg, Input input,int xpos, int ypos) {

        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            switch (sbg.getCurrentStateID()) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    //w przyszłości wejście do options
                    sbg.enterState(0);
                    break;
                }
                default: {
                    sbg.enterState(1);
                    break;
                }
            }
        }
        //character info
        if (input.isKeyPressed(Input.KEY_C)) {
            if (sbg.getCurrentStateID() == 3) {
                sbg.enterState(1);
            } else {
                Mouse.setCursorPosition(0, 720);
            gauss.ScreenClass.makeScreen();
            Mouse.setCursorPosition(xpos, ypos);
                sbg.enterState(3);
            }
        }
        //plecak
        if ((input.isKeyPressed(Input.KEY_B)) || (input.isKeyPressed(Input.KEY_TAB)) || (input.isKeyPressed(Input.KEY_I))) {
            if (sbg.getCurrentStateID() == 4) {
                sbg.enterState(1);
            } else {
                Mouse.setCursorPosition(0, 720);
            gauss.ScreenClass.makeScreen();
            Mouse.setCursorPosition(xpos, ypos);
                sbg.enterState(4);
            }
        }
        //okno questów 
        if ((input.isKeyPressed(Input.KEY_Q)) || (input.isKeyPressed(Input.KEY_L))) {
            if (sbg.getCurrentStateID() == 5) {
                sbg.enterState(1);
            } else {
                Mouse.setCursorPosition(0, 720);
            gauss.ScreenClass.makeScreen();
            Mouse.setCursorPosition(xpos, ypos);
                sbg.enterState(5);
            }
        }
//        //okno skili
//        if (input.isKeyPressed(Input.KEY_K)) {
//            if (sbg.getCurrentStateID() == 6) {
//                sbg.enterState(1);
//            } else {
//                Mouse.setCursorPosition(0, 720);
//            gauss.ScreenClass.makeScreen();
//            Mouse.setCursorPosition(xpos, ypos);
//                sbg.enterState(6);
//            }
//        }
        //okno mapy
        if (input.isKeyPressed(Input.KEY_M)) {
            if (sbg.getCurrentStateID() == 7) {
                sbg.enterState(1);
            } else {
                sbg.enterState(7);
            }
        }
        //licznik fpsów i wyświtlacz tileid 
        if (input.isKeyPressed(Input.KEY_GRAVE)) {
            HUD.showConsole();
        }
    }
}
