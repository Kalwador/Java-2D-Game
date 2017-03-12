package hud;

import core.Camera;
import core.GameStatus;
import gameUtils.Fonts;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Hud {
    
    public Frame frame;
    private Console console;
    private Buttons buttons;
    private gameUtils.Fonts font;
    
    public Hud() throws SlickException {
        this.buttons = new Buttons();
        this.frame = new Frame();
        this.console = new Console();
        font = new gameUtils.Fonts();
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, GameStatus gs, Input input, int xPos, int yPos) throws SlickException {
        buttons.clickButton(sbg, input, xPos, yPos);
        if(console.isOn){console.update(gs);}
        else {gc.setShowFPS(false);}
    }
    
    public void render(GameContainer gc, Graphics g, Camera camera, GameStatus gs) throws SlickException{
       
        
        //render ramki
        frame.render(g);
        
        //render konsoli jeśli aktywna
        if(console.isOn){console.render(gc, g, camera, gs);}
        
        //render skili z szybkiego paska
        
        if(core.GameStatus.hero.levelPoints > 0) Fonts.print18().drawString(988, 666, Integer.toString(GameStatus.hero.levelPoints));
    }
}
