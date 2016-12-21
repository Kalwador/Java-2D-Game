package actor;

import core.Sprite;
import hud.Console;
import hud.Frame;
import core.*;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

public class Keys extends Sprite {

    public Sprite sprite;

    public Keys(Sprite actor) throws SlickException {
        this.sprite = actor;
    }

    //obsługa poruszania się
    public void movement(StateBasedGame sbg, Input input, core.GameStatus gs, int delta) throws SlickException {

        if (input.isKeyDown(Input.KEY_W) || input.isKeyDown(Input.KEY_UP)) {
            sprite.avatar = sprite.movingUp;
            sprite.avatar.update(delta);
            gs.y -= gs.hero.heroSpeed * delta * 0.1f;
        }
        if (input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)) {
            sprite.avatar = sprite.movingDown;
            sprite.avatar.update(delta);
            gs.y += gs.hero.heroSpeed * delta * 0.2f;
        }
        if (input.isKeyDown(Input.KEY_A) || input.isKeyDown(Input.KEY_LEFT)) {
            sprite.avatar = sprite.movingLeft;
            sprite.avatar.update(delta);
            gs.x -= gs.hero.heroSpeed * delta * 0.1f;
        }
        if (input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)) {
            sprite.avatar = sprite.movingRight;
            sprite.avatar.update(delta);
            gs.x += gs.hero.heroSpeed * delta * 0.2f;
        }

    }

    //obsługa kolizji, eventów i przejść
    public int colision(GameStatus gs, StateBasedGame sbg, Frame hud, Input input, double oldX, double oldY) throws SlickException {

        LoadEntity.recPlayer = new Rectangle(gs.x, gs.y, sprite.heroW, sprite.heroH);
        int iter = 0;

        //portal
        for (int i = 0; i < gs.portalMapList.size(); i++) {
//            W razie problemów z portalami odkomentować
//            System.out.println("x=" + gs.x + " y=" + gs.y + ", xS=" + gs.portalMapList.get(i).xStart + " xE=" + gs.portalMapList.get(i).xEnd
//                    + " yS=" + gs.portalMapList.get(i).yStart + " yE=" + gs.portalMapList.get(i).yEnd + "\n");
            if (((gs.x >= gs.portalMapList.get(i).xStart) && (gs.x <= gs.portalMapList.get(i).xEnd))
                    && ((gs.y >= gs.portalMapList.get(i).yStart) && (gs.y <= gs.portalMapList.get(i).yEnd))) {
                gs.levelID = gs.portalMapList.get(i).levelID;
                gs.x = gs.portalMapList.get(i).xNew;
                gs.y = gs.portalMapList.get(i).yNew;
                return 1;
            }
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
    public static void functionalKeyHandler(GameContainer gc, StateBasedGame sbg, Input input, int xpos, int ypos) {

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
                screenBlur.ScreenClass.makeScreen();
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
                screenBlur.ScreenClass.makeScreen();
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
                screenBlur.ScreenClass.makeScreen();
                Mouse.setCursorPosition(xpos, ypos);
                sbg.enterState(5);
            }
        }

        //okno skili
        if (input.isKeyPressed(Input.KEY_K)) {
            if (sbg.getCurrentStateID() == 6) {
                sbg.enterState(1);
            } else {
                Mouse.setCursorPosition(0, 720);
                screenBlur.ScreenClass.makeScreen();
                Mouse.setCursorPosition(xpos, ypos);
                sbg.enterState(6);
            }
        }
        //okno mapy
        if (input.isKeyPressed(Input.KEY_M)) {
            if (sbg.getCurrentStateID() == 7) {
                sbg.enterState(1);
            } else {
                sbg.enterState(7);
            }
        }
        //okno zapisu gry
        if (input.isKeyPressed(Input.KEY_Z)) {
            if (sbg.getCurrentStateID() == 11) {
                sbg.enterState(1);
            } else {
                Mouse.setCursorPosition(0, 720);
                screenBlur.ScreenClass.makeScreen();
                Mouse.setCursorPosition(xpos, ypos);
                sbg.enterState(11);
            }
        }
        //okno pauzy
        if (input.isKeyPressed(Input.KEY_P)) {
            if (sbg.getCurrentStateID() == 13) {
                sbg.enterState(1);
            } else {
                Mouse.setCursorPosition(0, 720);
                screenBlur.ScreenClass.makeScreen();
                Mouse.setCursorPosition(xpos, ypos);
                sbg.enterState(13);
            }
        }
        //konsola
        if (input.isKeyPressed(Input.KEY_GRAVE)) {
            Console.showConsole();
        }
        if (input.isKeyPressed(Input.KEY_F1)) {
            Console.consoleF1();
        }
        if (input.isKeyPressed(Input.KEY_F2)) {
            Console.consoleF2();
        }
        if (input.isKeyPressed(Input.KEY_F3)) {
            Console.consoleF3();
        }
        if (input.isKeyPressed(Input.KEY_F4)) {
            Console.consoleF4();
        }
        if (input.isKeyPressed(Input.KEY_F5)) {
            Console.consoleF5();
        }
    }
}
