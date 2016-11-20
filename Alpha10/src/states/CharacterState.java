package states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class CharacterState extends BasicGameState {

    String mouse;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mouse = "";
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        Image menuW = new Image("res/menu/QueEqBoh_3.png");
        g.drawImage(menuW, 0, 0);
        g.drawString(mouse, 100, 10);
        g.drawString("Powrót do menu", 920, 555);
        g.drawRoundRect(920, 555, 300, 60, 6);

        g.drawString("C O N C E P T   Que  Eq  Char - \nnarazie brak funkcjonalności", 520, 575);

    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;

        //powrót do menu
        if ((xpos > 920 && xpos < 1218) && (ypos > 139 && ypos < 200)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }
        }
        if(input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }
    }

    public CharacterState(int character) {
    }

    @Override
    public int getID() {
        return 3;
    }
}
