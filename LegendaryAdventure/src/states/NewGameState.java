package states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class NewGameState extends BasicGameState {

     Image backGround;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        backGround = new Image("graphic/menu/backgroundMainMenu.jpg");
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(backGround, -30, -30);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput(); 
        if(input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }
    }
    
    public NewGameState(int state) {
    }
    @Override
    public int getID() {
        return 10;
    }
}
