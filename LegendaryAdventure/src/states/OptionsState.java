package states;

import gameUtils.Fonts;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class OptionsState extends BasicGameState {

    String mouse;
    String onScreenLoc;
    Color c = Color.white; //Domyślny kolor napisów
    Color ctab[] = {c, c, c, c, c}; //Tablica kolorów tekstu na przyciskach

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
        
        Fonts.print18().drawString(10, 10, "wsp. myszy: " + mouse);
        Fonts.print18().drawString(10, 30, onScreenLoc);
        
        int bx = 500;
        int by = 150;
        for (int i = 0; i < 5; i++) {
            g.drawImage(buttonBB, bx, by += 85);
        }

        Fonts.print78().drawString(510, 100, "OPCJE", Color.white);
        Fonts.print25().drawString(565, 260, "Opcja 1", ctab[0]);
        Fonts.print25().drawString(565, 345, "Opcja 2", ctab[1]);
        Fonts.print25().drawString(565, 430, "Opcja 3", ctab[2]);
        Fonts.print25().drawString(565, 515, ("SPEED :" + model.Hero.movementSpeed), ctab[3]);
        Fonts.print25().drawString(575, 600, "Powrót", ctab[4]);
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
        
        //opcja 1 
        if ((xpos > 520 && xpos < 777) && (ypos > 410 && ypos < 484)) {
            if (input.isMouseButtonDown(0)) {
                //działanie - opcja 1 
            }
            ctab[0] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[0] = Color.gray;
            }
        }
        //opcja 2 
        if ((xpos > 520 && xpos < 777) && (ypos > 326 && ypos < 399)) {
            if (input.isMouseButtonDown(0)) {
                //działanie - opcja 2 
            }
            ctab[1] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[1] = Color.gray;
            }
        }
        //opcja 3 
        if ((xpos > 520 && xpos < 777) && (ypos > 241 && ypos < 314)) {
            if (input.isMouseButtonDown(0)) {
                //działanie - opcja 3
            }
            ctab[2] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[2] = Color.gray;
            }
        }
        ///Prędkość poruszania
        if ((xpos > 520 && xpos < 777) && (ypos > 156 && ypos < 229)) {
            if (input.isMouseButtonDown(0)) {
                if(model.Hero.movementSpeed < 7){
                    model.Hero.movementSpeed += 1;
                }
                else{
                    model.Hero.movementSpeed = 1.0;
                }
            }
            ctab[3] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[3] = Color.gray;
            }
        }
        //powrót do menu
        if ((xpos > 520 && xpos < 777) && (ypos > 69 && ypos < 144)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(0); 
            }
            ctab[4] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[4] = Color.gray;
            }
        }
    }

    public OptionsState(int state) {
    }

    @Override
    public int getID() {
        return 2;
    }
}
