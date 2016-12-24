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
     * Kamera obsługująca pole widzenia na ekranie 
     */
    Camera camera;
    
    /**
     * Meta dane gry
     */
    GameStatus gs;
    
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
        hud = new Hud();
        camera = new Camera(gc, gs.map);
        event = new actor.Event(gs.sprite);
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
         * Obsługa wszystkich wydarzeń w oknie gry
         */
        if (event.update(gc, sbg, delta, gs, input, xPos, yPos)) {
            updateGameStatus(gc);
        }

        /**
         * update hud
         */
        hud.update(gc, sbg, gs, input, xPos, yPos);
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
            String path = "graphic/map/" + Integer.toString(GameStatus.levelID) + ".tmx";
            gs.map = new TiledMap(path);
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
            
            //--------------------------------------------------------------
            //---------------------KOD W PRACY------------------------------
//            Optional nullableMap = Optional.ofNullable(new Image(hud.frame.miniMapPath));
//            if(nullableMap.isPresent()){
//                hud.frame.miniMap = new Image(path);
//            }
//            else{
//                hud.frame.miniMap = new Image("graphic/miniMap/noMiniMap.png");
//            }
            //--------------------------------------------------------------
            
        } catch (SlickException e) {
            System.out.println("B R A K    minimapy dla tej mapy");
            e.printStackTrace();
        }
    }

    public PlayState(int state) {
    }

    @Override
    public int getID() {
        return 1;
    }
}
