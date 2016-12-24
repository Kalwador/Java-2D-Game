package hud;

import core.Camera;
import core.GameStatus;
import core.LoadEntity;
import java.util.Iterator;
import java.util.Set;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Console {

    //współrzędne w rogu
    int collisionTileID, npcTileID, itemTileID, portalTileID;

    //tryby pracy konsoli
    public static boolean console;
    public static boolean F1; //colisions
    public static boolean F2; //portals
    public static boolean F3; //items
    public static boolean F4; //npc
    public static boolean F5; //mobs

    public Console() throws SlickException {
        console = false;
        F1 = false;
        F2 = false;
        F3 = false;
        F4 = false;
        F5 = false;
    }

    public void update(GameStatus gs) throws SlickException {
        //współrzędne w rogu
        collisionTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), 5);
        portalTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), 6);
        npcTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), 7);
        itemTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), 8);
    }

    public void render(GameContainer gc, Graphics g, Camera camera, GameStatus gs) {
        gc.setShowFPS(true);

        camera.translateGraphics();
        int count = 0;
        while (GameStatus.collisions.size() > count) {
            g.draw(GameStatus.collisions.get(count));
            count++;
        }
        g.draw(LoadEntity.recPlayer);

        camera.untranslateGraphics();

        //współrzędne w rogu ekranu
        g.drawString("Actor Position: x=" + String.valueOf(gs.x) + " y=" + String.valueOf(gs.y), 10f, 30f);
        g.drawString("Tile: x=" + String.valueOf(gs.x / 32) + " y=" + String.valueOf(gs.y / 32), 10f, 50f);
        g.drawString("Tile Start At: xS=" + String.valueOf((gs.x / 32) * 32) + " xE=" + String.valueOf(((gs.x / 32) * 32) + 32)
                + " yS=" + String.valueOf((gs.y / 32) * 32) + " yE=" + String.valueOf(((gs.y / 32) * 32) + 32), 10f, 70f);
        g.drawString("Mouse Position: X="+Mouse.getX()+"  Y="+Mouse.getY(), 10f, 90f);

        if (F1) {
            g.drawString("collisionTileID=" + String.valueOf(collisionTileID) + " collisionID=" + String.valueOf(5), 10f, 110f);
            camera.drawMap(5);
        }
        g.drawString("npcTileID=" + String.valueOf(npcTileID) + " npcID=" + String.valueOf(7), 10f, 130f);
        g.drawString("itemTileID=" + String.valueOf(itemTileID) + " itemID=" + String.valueOf(8), 10f, 150f);

        if (F2) {
            g.drawString("gateTileID=" + String.valueOf(portalTileID) + " gateID=" + String.valueOf(6), 10f, 170f);
            camera.drawMap(6);
        }
        
    }

    public static void showConsole() {
        if (console == true) {
            console = false;
        } else {
            console = true;
        }
    }

    public static void consoleF1() {
        if (F1 == true) {
            F1 = false;
        } else {
            F1 = true;
        }
    }

    public static void consoleF2() {
        if (F2 == true) {
            F2 = false;
        } else {
            F2 = true;
        }
    }

    public static void consoleF3() {
        if (F3 == true) {
            F3 = false;
        } else {
            F3 = true;
        }
    }

    public static void consoleF4() {
        if (F4 == true) {
            F4 = false;
        } else {
            F4 = true;
        }
    }

    public static void consoleF5() {
        if (F5 == true) {
            F5 = false;
        } else {
            F5 = true;
        }
    }
}
