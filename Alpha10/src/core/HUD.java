package core;

import core.GameStatus;
import entities.Npc;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import states.PlayState;

public class HUD {
    
    public GameStatus gs;
    public GameContainer gc;
    
    //grafika pod okno dialogowe
    public static Image dialogWindow;
    
    //napis w oknie dialogowym
    public static String npcMessage;
    
     //współrzędne w rogu
    int collisionTileID, npcTileID, gateTileID;
    int collisionID, npcID, gateID;
    
    //liczniki 
    public static boolean renderCounter;
    
    public HUD(GameContainer gc, StateBasedGame sbg, GameStatus gs) throws SlickException {
        this.gc = gc;
        this.gs = gs;
        
        //ustawienie liczników na niewidoczne
        renderCounter = false;
        
        dialogWindow = new Image("res/menu/quest_text_background.png");
        dialogWindow.setAlpha(0);
        npcMessage = "";
    }
    public void updateHUD(GameStatus gs, int delta){
        
        //współrzędne w rogu
        collisionID = gs.map.getLayerIndex("collision");
        collisionTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), collisionID);
        npcID = gs.map.getLayerIndex("npc");
        npcTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), npcID);
        gateID = gs.map.getLayerIndex("gate");
        gateTileID = gs.map.getTileId(((gs.x + 32) / 32), ((gs.y + 32) / 32), gateID);
    }
    public void render(Graphics g){
        //metoda renderująca cały hud
        //paski życia
        //paski boczne menu 
        //minimapa itp
        if(renderCounter == true){renderCounter(g);}
    }
    
    public void renderCounter(Graphics g){
         //współrzędne w rogu ekranu
        g.drawString("Pozycja: x=" + String.valueOf(gs.x / 32) + " y=" + String.valueOf(gs.y / 32), 10f, 40f);
        g.drawString("collisionTileID " + String.valueOf(collisionTileID) + " collisionID " + String.valueOf(collisionID), 10f, 70f);
        g.drawString("npcTileID " + String.valueOf(npcTileID) + " npcID " + String.valueOf(npcID), 10f, 100f);
        g.drawString("gateTileID " + String.valueOf(gateTileID) + " gateID " + String.valueOf(gateID), 10f, 130f);
    }
    public static void showDialogWindow() {
        dialogWindow.setAlpha(100);
        npcMessage = Npc.getDialog(10);
    }

    public static void hideDialogWindow() {
        dialogWindow.setAlpha(0);
        npcMessage = "";
    }

    
}
