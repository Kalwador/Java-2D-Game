package states;

import core.GameStatus;
import core.Main;
import core.HUD;
import static core.HUD.dialogWindow;
import static core.HUD.npcMessage;
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

    //kamera wyśrodkowująca na postaci
    core.Camera camera;

    //meta dane gry
    GameStatus gs;

    //dane o wyglądzie bohatera, poruszaniu i kolizjach
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
        npc = new Image("res/npcSprite/Kobieta4.png").getSubImage(0, 0, 48, 48);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();

        //update pasków
        hud.updateHUD(gs, delta);

        //x i y przed poruszeniem - do kolizji
        double oldX = gs.x, oldY = gs.y;

        //poruszanie postaci, eventy, klawiszologia
        actor.movement(sbg, input, gs, delta);

        //kolizje
        actor.colision(gs, hud, input, oldX, oldY);

        //obsługa klawiszy funkcyjnych
        actor.event(gc, sbg, input, hud);

    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        //centrowanie kamery
        camera.centerOn(gs.x, gs.y);

        //render hudu
        hud.render(g);

        //rysowanie mapy
        camera.drawMap(0); //tło
        camera.drawMap(1); //obiekty1
        camera.drawMap(2); //obiekty2
        camera.drawMap(3); //obiekty3
        camera.drawMap(4); //efekty

        //obrócenie osi - potrzebne do poprawnej pracy kamery
        camera.translateGraphics();

        //render sprite
        actor.sprite.draw(gs.x, gs.y);

        //render npc
        npc.draw(npcX, npcY);

        //render hud - ostatni, na niego tylko ewentualnie okna questów, plecaka
        dialogWindow.draw(400, 680, 600, 111); //render ramki i tekstu questa
        g.drawString(npcMessage, 420, 700);

    }

    public PlayState(int state) {
    }

    @Override
    public int getID() {
        return 1;
    }
}
