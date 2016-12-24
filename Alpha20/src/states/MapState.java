package states;

import javafx.event.Event;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MapState extends BasicGameState {

    Image map;
    Image backGround;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        backGround = new Image("graphic/menu/backgroundMainMenu.jpg");
        map = new Image("graphic/miniMap/fullMap.jpg");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(backGround, -30, -30);
        map.draw(((gc.getWidth() / 2) - (map.getWidth() / 2)), 0);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        if (input.isKeyPressed(Input.KEY_ESCAPE) || input.isKeyPressed(Input.KEY_M)) {
            sbg.enterState(1);
        }
        //obsługa klawiszy funkcyjnych
        //core.Event.functionalKey(gc, sbg, input, );
    }

    public MapState(int state) {
    }

    @Override
    public int getID() {
        return 7;
    }
}
