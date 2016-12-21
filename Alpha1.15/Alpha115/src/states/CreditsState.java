package states;

import gameUtils.Fonts;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class CreditsState extends BasicGameState {

    String mouse;
    String onScreenLoc;
    Color c = Color.white; //Domyślny kolor napisów
    Color ctab[] = {c}; //Tablica kolorów tekstu na przyciskach

    /**
     * MEGA WAZNE NIE USUWAC, NIE MODYFIKOWAC OBIEKTU font2
     */
    Fonts font2;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        /**
         * MEGA WAZNE NIE USUWAC, NIE MODYFIKOWAC OBIEKTU font2
         */
        font2 = new Fonts();
        onScreenLoc = " ";
        mouse = "";
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        Image menuF = new Image("graphic/menu/backgroundMainMenu.jpg");
        g.drawImage(menuF, 0, 0);
        Image buttonBB = new Image("graphic/menu/buttonMM.png");       
        
        Fonts.printf().drawString(10, 10, "wsp. myszy: " + mouse);
        Fonts.printf().drawString(10, 30, onScreenLoc);
        
        g.drawImage(buttonBB, 500, 575);

        Fonts.printfMH().drawString(510, 100, "Twórcy", Color.white);
        Fonts.printfBig().drawString(575, 600, "Powrót", ctab[0]);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }

        int xpos = Mouse.getX();
        int ypos = Mouse.getY();

        mouse = "x= " + xpos + " y=" + ypos;
        onScreenLoc = "x= " + xpos + " y=" + Math.abs(720 - ypos);

        c = Color.white;
        for (int j = 0; j < ctab.length; j++) {
            ctab[j] = c;
        }
        
        //powrót do menu
        if ((xpos > 520 && xpos < 777) && (ypos > 69 && ypos < 144)) {
            if (input.isMouseButtonDown(0)) {
                Mouse.setCursorPosition(xpos, ypos-86);
                sbg.enterState(0); 
            }
            ctab[0] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[0] = Color.gray;
            }
        }
    }

    public CreditsState(int state) {
    }

    @Override
    public int getID() {
        return 12;
    }
}
