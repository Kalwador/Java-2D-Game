package hud;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Buttons {

    public void clickButton(StateBasedGame sbg, Input input, int xPos, int yPos) throws SlickException {

                //to w przyszłości do poprawienia
        int xpos = input.getMouseX();
        int ypos = input.getMouseY();
        
       if ((xPos > 267 && xPos < 336) && (yPos > 24 && yPos < 93)) {
            if (input.isMouseButtonDown(0)) {
            screenBlur.ScreenClass.makeScreen(xpos, ypos);
                sbg.enterState(3);
            }
        }
        if ((xPos > 349 && xPos < 418) && (yPos > 24 && yPos < 93)) {
            if (input.isMouseButtonDown(0)) {
            screenBlur.ScreenClass.makeScreen(xpos, ypos);
                sbg.enterState(5);
            }
        }
        if ((xPos > 429 && xPos < 498) && (yPos > 24 && yPos < 93)) {
            if (input.isMouseButtonDown(0)) {
            screenBlur.ScreenClass.makeScreen(xpos, ypos);
                sbg.enterState(4);
            }
        }
        if ((xPos > 509 && xPos < 578) && (yPos > 24 && yPos < 93)) {
            if (input.isMouseButtonDown(0)) {
            screenBlur.ScreenClass.makeScreen(xpos, ypos);
                sbg.enterState(6);
            }
        }
    }
}
