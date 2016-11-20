package states;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MenuState extends BasicGameState{
    String mouse;
    

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mouse = "";
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= "+xpos+" y="+ypos;
        
        //nowa gra
        if((xpos>470 && xpos<630) &&(ypos>366 && ypos<396)){
            if(input.isMouseButtonDown(0)){
                sbg.enterState(1);
            }
        }
        //wyjście
        if((xpos>470 && xpos<630) &&(ypos>233 && ypos<200)){
            if(input.isMouseButtonDown(0)){
                System.exit(0);
            }
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        
        Image menuF = new Image("res/menu/MenuF.png");
        g.drawImage(menuF, 0, 0);
        g.drawString(mouse, 100, 100);
    }
    
    public MenuState(int state) {
    }
    public MenuState() {
    }
    public int getID(){
        return 0;
    }
}
