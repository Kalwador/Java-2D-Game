package core;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

public class ActionHandler {
    public static void handlePlay(Input input, GameContainer gc, GameStatus gs, StateBasedGame sbg, int delta){
        
        if(input.isKeyDown(Input.KEY_W) || input.isKeyDown(Input.KEY_UP)) {
            gs.y -= gs.heroSpeed * 0.1 * delta;
        }
        if(input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)) {
            gs.y += gs.heroSpeed * 0.2 * delta;
        }
        if(input.isKeyDown(Input.KEY_A) || input.isKeyDown(Input.KEY_LEFT)) {
            gs.x -= gs.heroSpeed * 0.1 * delta;
        }
        if(input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)) {
            gs.x += gs.heroSpeed * 0.2 * delta;
        }
        if(input.isKeyDown(Input.KEY_ESCAPE)) {
            sbg.enterState(2);
        }
    }
}
