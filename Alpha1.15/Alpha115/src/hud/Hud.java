package hud;

import core.Camera;
import core.GameStatus;
import java.util.Iterator;
import java.util.Set;
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
        
        //test items HashMap
        /*Set<Integer> itemsKey = gs.itemsInGame.keySet();
        Iterator<Integer> itemsIterator = itemsKey.iterator();
        System.out.println(gs.itemsInGame.size());
        while(itemsIterator.hasNext()){
            Object o=itemsIterator.next();
            System.out.println(gs.itemsInGame.get(o).getId());
            System.out.println(gs.itemsInGame.get(o).getName());
            System.out.println(gs.itemsInGame.get(o).getDescription());
        }*/
        //test equip HashMap
        System.out.println(gs.equipInGame.size());
        Set<Integer> equipKey = gs.equipInGame.keySet();
        Iterator<Integer> equipIterator = equipKey.iterator();
        while(equipIterator.hasNext()){
            Object o=equipIterator.next();
            System.out.println(gs.equipInGame.get(o).getId());
            System.out.println(gs.equipInGame.get(o).getName());
            System.out.println(gs.equipInGame.get(o).getDescription());
        }
        
        
        /*ArrayList
        System.out.println(gs.itemsInGame.size());
        for (int i = 0; i < gs.itemsInGame.size(); i++) {
            System.out.println("test");
            System.out.println(gs.itemsInGame.get(i).getId());
        }*/
}
    
    public void render(GameContainer gc, Graphics g, Camera camera, GameStatus gs) throws SlickException{
        frame.render(g);
        if(console.console){console.render(gc, g, camera, gs);}
        //render minimapy
        //render skili z szybkiego paska
        

    }
}
