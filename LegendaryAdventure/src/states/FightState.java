package states;

import core.Camera;
import core.GameStatus;
import core.Sprite;
import gameUtils.LocationName;
import hud.Hud;
import javafx.event.Event;
import model.Hero;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class FightState extends BasicGameState {

    Image fightCanvas;
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
    private actor.Event event;

    /**
     * Paski boczne i ich obsługa
     */
    private Hud hud;
    Sprite sprite;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        gs = new GameStatus();
        hud = new Hud();
        event = new actor.Event(gs.sprite);
        fightCanvas = new Image("graphic/fightCanvas/101.jpg");
        fightCanvas = LocationName.getFightCanvas(100);
        event = new actor.Event(gs.sprite);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        fightCanvas.draw(((gc.getWidth() / 2) - (fightCanvas.getWidth() / 2)), 0);
        hud.render(gc, g, camera, gs);
        gs.sprite.movingUp.draw(640,400,gs.sprite.heroWidth*3,gs.sprite.heroHeight*3);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        if (input.isKeyPressed(Input.KEY_ESCAPE) || input.isKeyPressed(Input.KEY_Y)) {
            sbg.enterState(1);
        }

        int xPos = Mouse.getX();
        int yPos = Mouse.getY();
        /**
         * update hud
         */
        hud.update(gc, sbg, gs, input, xPos, yPos);
        
        /**
         * Obsługa wszystkich wydarzeń w oknie gry
         */
        event.update(gc, sbg, i, gs, input, xPos, yPos);
    }

    public FightState(int state) {
    }

    @Override
    public int getID() {
        return 13;
    }
}
