package hud;

import java.util.HashMap;
import model.Skill;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
import gameUtils.LoadSkills;

public class Buttons {
public LoadSkills laduj = new LoadSkills();
HashMap<Integer,Skill> hudSkill = new HashMap<Integer,Skill>();

    public void clickButton(StateBasedGame sbg, Input input, int xPos, int yPos) throws SlickException {
     
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
