package states;

import actor.*;
import hud.Console;
import hud.Frame;
import core.*;
import static hud.Frame.dialogWindow;
import hud.Hud;
import model.Portal;
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

    //kamera wyśrodkowana na postaci
    Camera camera;

    //meta dane gry
    GameStatus gs;

    private Event event;

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
        //pobranie danych wejściowych z kontrolerów
        Input input = gc.getInput();
        int xPos = Mouse.getX();
        int yPos = Mouse.getY();

        //obsługa wszystkich wydarzeń w oknie gry
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
     * Metoda wywoła się przy przejściu przez portalMapList
     *
     * @param gc potrzebny do przeładowania camery
     * @throws SlickException
     */
    public void updateGameStatus(GameContainer gc) throws SlickException {
        String path = "graphic/map/" + Integer.toString(GameStatus.levelID) + ".tmx";
        gs.map = new TiledMap(path);
        camera = new core.Camera(gc, gs.map);

        //update entity fields: 
        gs.updateEntityFieldList(gs.map);

        //update npc 
        //update enemy
        //update loot
        gs.updatePortalMapList2(gs.portalMapList);
    }

    public PlayState(int state) {
    }

    @Override
    public int getID() {
        return 1;
    }
}
