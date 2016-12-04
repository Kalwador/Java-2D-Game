package states;

import core.GameStatus;
import core.Main;
import core.HUD;
import static core.HUD.dialogWindow;
import static core.HUD.npcMessage;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
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
    core.Camera camera;

    //meta dane gry
    GameStatus gs;

    //dane o wyglądzie bohatera, poruszaniu i kolizjach
    core.Event event;
    core.Actor actor;

    //npc test 
    private Image npc; //obraz + pozycja npc
    private HUD hud;

    int npcX = 896;
    int npcY = 480;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

        gs = new GameStatus();
        hud = new HUD(gc, sbg, gs);
        camera = new core.Camera(gc, gs.map);
        actor = new core.Actor(gs.map);
        event = new core.Event(actor);

        npc = new Image("graphic/npcSprite/Kobieta4.png").getSubImage(0, 0, 48, 48);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        int xPos = Mouse.getX();
        int yPos = Mouse.getY();

        //x i y przed poruszeniem - do kolizji
        double oldX = gs.x, oldY = gs.y;

        //obsługa klawiszy funkcyjnych
        event.functionalKey(gc, sbg, input, xPos, yPos);

        //poruszanie postaci, eventy, klawiszologia
        event.movement(sbg, input, gs, delta);

        //kolizje
        if (event.colision(gs, sbg, hud, input, oldX, oldY) == 1) { //wykrycie przejścia przez portalMapList
            updateGameStatus();
        }
        //update hud
        hud.update(gc, sbg, xPos, yPos);
        if (hud.console == true) {
            hud.updateConsole();
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

        //render hud
        hud.render(g);

        //obrócenie osi - potrzebne do poprawnej pracy kamery
        camera.translateGraphics();

        //render sprite
        actor.sprite.draw(gs.x, gs.y);

        //render npc
        npc.draw(npcX, npcY);

        //render hud - ostatni, na niego tylko ewentualnie okna questów, plecaka
        dialogWindow.draw(400, 680, 600, 111); //render ramki i tekstu questa

        if (hud.console == true) {
            hud.renderConsole(g, camera);
        }
    }

    //wywoła się przy przejściu przez portalMapList
    public void updateGameStatus() throws SlickException {
        String path = "graphic/map/" + Integer.toString(GameStatus.levelID) + ".tmx";
        gs.map = new TiledMap(path);
        camera.map = new TiledMap(path);

        //update entity fields: 
        gs.updateEntityFieldList(gs.map);

        //update npc 
        //update enemy
        //update loot
        //update portalMapList
        gs.updatePortalMapList(gs.portalMapList);
    }

    public PlayState(int state) {
    }

    @Override
    public int getID() {
        return 1;
    }
}
