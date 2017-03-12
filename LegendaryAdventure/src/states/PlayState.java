package states;

import actor.*;
import core.*;
import hud.Hud;
import java.util.Optional;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

public class PlayState extends BasicGameState {

    /**
     * Czy potrzeba przeładować mapę
     */
    public static boolean needToMapUpdate = false;
    /**
     * Kamera obsługująca pole widzenia na ekranie
     */
    private Camera camera;

    /**
     * Meta dane gry
     */
    static GameStatus gs;

    /**
     * Zdarzenia w oknie gry
     */
    private Event event;

    /**
     * Paski boczne i ich obsługa
     */
    private Hud hud;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        gs = new GameStatus();
        camera = new Camera(gc, gs.map);
        hud = new Hud();
        event = new actor.Event(GameStatus.sprite);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

        /**
         * pobranie danych wejściowych z kontrolerów
         */
        Input input = gc.getInput();
        int xPos = Mouse.getX();
        int yPos = Mouse.getY();
        /**
         * update hud
         */
        hud.update(gc, sbg, gs, input, xPos, yPos);
        
        /**
         * Obsługa wszystkich wydarzeń w oknie gry
         */
        event.update(gc, sbg, delta, gs, input, xPos, yPos);
        
        if (needToMapUpdate) {
            updateGameStatus(gc);
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        //centrowanie kamery
        camera.centerOn(gs.x, gs.y);

        //rysowanie mapy
        camera.drawMap(0); //tło
        camera.drawMap(1); //obiekty2
        camera.drawMap(2); //obiekty2
        camera.drawMap(3); //obiekty3
        camera.drawMap(4); //efekty
        camera.drawMap(gs.map.getLayerIndex("npc")); //efekty

        //render mainFrame
        hud.render(gc, g, camera, gs);

        camera.translateGraphics();

        //render avatar, który siedzi w obiekcie event
        gs.sprite.avatar.draw(gs.x, gs.y);
    }

    /**
     * Metoda wywoła się przy przejściu przez portal
     *
     * @param gc Potrzebny do przeładowania camery
     */
    public void updateGameStatus(GameContainer gc) {
        try {
            gs.map = new TiledMap("graphic/map/" + Integer.toString(GameStatus.levelID) + ".tmx");
            camera = new core.Camera(gc, gs.map);

            //update entity fields: 
            gs.updateEntityFieldList(gs.map);

            //update npc 
            //update enemy
            //update loot
            //update listy portali na mapie
            gs.updatePortalMapList(gs.portalMapList);

            //update miniMapy w rogu
            hud.frame.miniMapPath = "graphic/miniMap/" + String.valueOf(GameStatus.levelID) + ".png";
            hud.frame.miniMap = new Image(hud.frame.miniMapPath);
        } catch (SlickException e) {
            System.out.println("B R A K    minimapy dla tej mapy");
            e.printStackTrace();
        }
        needToMapUpdate = false;
    }

    public PlayState(int state) {
    }

    @Override
    public int getID() {
        return 1;
    }
}
