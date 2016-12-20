package hud;

import core.Camera;
import core.GameStatus;
import java.util.Iterator;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Hud {
    
    private Frame frame;
    private Console console;
    private Buttons buttons;
    
    public Hud() throws SlickException {
        this.buttons = new Buttons();
        this.frame = new Frame();
        this.console = new Console();
    }
    
    public void update(GameContainer gc, StateBasedGame sbg, GameStatus gs, Input input, int xPos, int yPos) throws SlickException {
        buttons.clickButton(sbg, input, xPos, yPos);
        if(console.console){console.update(gs);}
        else {gc.setShowFPS(false);}
        /*Iterator<model.Item> iter = gs.itemsInGame.iterator();
        model.Item item = iter.next();
        System.out.println(item.getDescription());*/
    }
    
    public void render(GameContainer gc, Graphics g, Camera camera, GameStatus gs) throws SlickException{
        frame.render(g);
        if(console.console){console.render(gc, g, camera, gs);}
        //render minimapy
        //render skili z szybkiego paska
    }
}
