package hud;

import actor.Fonts;
import core.Camera;
import core.GameStatus;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import model.Hero;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.StateBasedGame;
import states.BagState;

public class Hud {
    
    private Frame frame;
    private Console console;
    private Buttons buttons;
    Hero h = new Hero();
    Fonts fonts;
    
    public Hud() throws SlickException {
        this.buttons = new Buttons();
        this.frame = new Frame();
        this.console = new Console();
        fonts = new Fonts();
    }
    

//    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
//        
//        System.out.println("dupa");
//    }
    
    public void update(GameContainer gc, StateBasedGame sbg, GameStatus gs, Input input, int xPos, int yPos) throws SlickException {
        buttons.clickButton(sbg, input, xPos, yPos);
        if(console.console){console.update(gs);}
        else {gc.setShowFPS(false);}
    }
    
    public void render(GameContainer gc, Graphics g, Camera camera, GameStatus gs, StateBasedGame sbg) throws SlickException{
        frame.render(g);
        if(console.console){console.render(gc, g, camera, gs);}
        //fonts.printLabel.drawString(gs.x,gs.y,"sdfsdf",Color.black);
        //render minimapy
        //render skili z szybkiego paska
    }
}
