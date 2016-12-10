package core;

import core.GameStatus;
import entities.Npc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import states.PlayState;

public class HUD {

    public GameStatus gs;
    public GameContainer gc;

    //grafiki
    public static Image hud, dialogWindow;

    //napis w oknie dialogowym
    public static String npcMessage;

    //współrzędne w rogu
    int collisionTileID, npcTileID, itemTileID, portalTileID;

    //liczniki 
    public static boolean console;

    public HUD(GameContainer gc, StateBasedGame sbg, GameStatus gs) throws SlickException {
        this.gc = gc;
        this.gs = gs;

        console = false;

        hud = new Image("graphic/menu/hud.png");

        dialogWindow = new Image("graphic/menu/quest_text_background.png");
        dialogWindow.setAlpha(0);
        npcMessage = "";
    }

    //dodane robienie screenów dla scen, 4 ify zmienione
    public void update(GameContainer gc, StateBasedGame sbg, int xPos, int yPos) throws SlickException {

        Input input = gc.getInput();
        xPos = Mouse.getX();
        yPos = Mouse.getY();
        //hud obsługa myszką
        if ((xPos > 267 && xPos < 336) && (yPos > 24 && yPos < 93)) {
            if (input.isMouseButtonDown(0)) {
            Mouse.setCursorPosition(0, 720);
            gauss.ScreenClass.makeScreen();
            Mouse.setCursorPosition(640, 360);
                sbg.enterState(3);
            }
        }
        if ((xPos > 349 && xPos < 418) && (yPos > 24 && yPos < 93)) {
            if (input.isMouseButtonDown(0)) {
            Mouse.setCursorPosition(0, 720);
            gauss.ScreenClass.makeScreen();
            Mouse.setCursorPosition(640, 360);
                sbg.enterState(5);
            }
        }
        if ((xPos > 429 && xPos < 498) && (yPos > 24 && yPos < 93)) {
            if (input.isMouseButtonDown(0)) {
            Mouse.setCursorPosition(0, 720);
            gauss.ScreenClass.makeScreen();
            Mouse.setCursorPosition(640, 360);
                sbg.enterState(4);
            }
        }
        if ((xPos > 509 && xPos < 578) && (yPos > 24 && yPos < 93)) {
            if (input.isMouseButtonDown(0)) {
            Mouse.setCursorPosition(0, 720);
            gauss.ScreenClass.makeScreen();
            Mouse.setCursorPosition(640, 360);
            //----------------wcześniej było (4)--------------------------
                sbg.enterState(6);
            }
        }
        if (console == false) {
            gc.setShowFPS(false);
        }
    }

    public void render(Graphics g) throws SlickException {
        g.drawImage(hud, 0, 0);
    }

    public void updateConsole() {
        //współrzędne w rogu
        collisionTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), 5);
        portalTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), 6);
        npcTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), 7);
        itemTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), 8);
    }

    public void renderConsole(Graphics g,Camera camera) {

        gc.setShowFPS(true);
        camera.untranslateGraphics();
        //współrzędne w rogu ekranu
        g.drawString("Actor Position: x=" + String.valueOf(gs.x) + " y=" + String.valueOf(gs.y), 10f, 30f);
        g.drawString("Tile: x=" + String.valueOf(gs.x / 32) + " y=" + String.valueOf(gs.y / 32), 10f, 50f);
        g.drawString("Tile Start At: xS=" + String.valueOf((gs.x / 32) * 32) + " xE=" + String.valueOf(((gs.x / 32) * 32) + 32)
                + " yS=" + String.valueOf((gs.y / 32) * 32) + " yE=" + String.valueOf(((gs.y / 32) * 32) + 32), 10f, 70f);
        g.drawString("collisionTileID=" + String.valueOf(collisionTileID) + " collisionID=" + String.valueOf(5), 10f, 90f);
        g.drawString("npcTileID=" + String.valueOf(npcTileID) + " npcID=" + String.valueOf(7), 10f, 110f);
        g.drawString("itemTileID=" + String.valueOf(itemTileID) + " itemID=" + String.valueOf(8), 10f, 130f);
        g.drawString("gateTileID=" + String.valueOf(portalTileID) + " gateID=" + String.valueOf(6), 10f, 150f);
        camera.drawMap(6);
        camera.translateGraphics();
        g.draw(LoadEntity.recPlayer);
        int count = 0;
        while (GameStatus.collisions.size() > count) {
            g.draw(GameStatus.collisions.get(count));
            count++;
        }
    }

    public static void showDialogWindow() {
        dialogWindow.setAlpha(100);
        npcMessage = Npc.getDialog(10);
    }

    public static void hideDialogWindow() {
        dialogWindow.setAlpha(0);
        npcMessage = "";
    }

    public static void showConsole() {
        if (HUD.console == true) {
            HUD.console = false;
        } else {
            HUD.console = true;
        }
    }
}
