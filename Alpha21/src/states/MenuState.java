package states;

import gameUtils.Fonts;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MenuState extends BasicGameState {

    //int licznik = 0;
    String mouse;
    Color c = Color.white; //Domyślny kolor napisów
    Color ctab[] = {c,c,c,c,c}; //Tablica kolorów tekstu na przyciskach

    /**
     * MEGA WAZNE NIE USUWAC, NIE MODYFIKOWAC OBIEKTU font
     */
    gameUtils.Fonts font;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        /**
         * MEGA WAZNE NIE USUWAC, NIE MODYFIKOWAC OBIEKTU font2
         */
        font = new Fonts();       
        mouse = "";
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();

        mouse = "x= " + xpos + " y=" + ypos;
        c = Color.white;
        for (int j = 0; j < ctab.length; j++) {
            ctab[j] = c;  
        }

        //wczytaj grę - play state 
        if ((xpos > 520 && xpos < 777) && (ypos > 410 && ypos < 484)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(11);
            }
            ctab[0] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[0] = Color.gray;
            }
        }
        //nowa gra - narazie brak
        if ((xpos > 520 && xpos < 777) && (ypos > 326 && ypos < 399)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }
            ctab[1] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[1] = Color.gray;
            }
        }
        //opcje
        if ((xpos > 520 && xpos < 777) && (ypos > 241 && ypos < 314)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(2);
            }
            ctab[2] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[2] = Color.gray;
            }
        }
        //twórcy
        if ((xpos > 520 && xpos < 777) && (ypos > 156 && ypos < 229)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(8);
            }
            ctab[3] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[3] = Color.gray;
            }
        }
        //wyjście
        if ((xpos > 520 && xpos < 777) && (ypos > 69 && ypos < 144)) {
            if (input.isMouseButtonDown(0)) {
                System.exit(0);
            }
            ctab[4] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[4] = Color.gray;
            }
        }
        //licznik++;
        //Testowanie screnów i włączenie plecaka
        if (input.isKeyPressed(Input.KEY_1)) {
            Mouse.setCursorPosition(0, 720);
            screenBlur.ScreenClass.makeScreen();
            Mouse.setCursorPosition(xpos, ypos);
            sbg.enterState(4);
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        Image menuF = new Image("graphic/menu/backgroundMainMenu.jpg");
        g.drawImage(menuF, 0, 0);
        Image buttonBB = new Image("graphic/menu/buttonMM.png");
        int bx = 500;
        int by = 150;
        for (int i = 0; i < 5; i++) {
            g.drawImage(buttonBB, bx, by += 85);
        }

        Fonts.print78().drawString(90, 100, "LEGENDARY ADVENTURES", Color.white);
        Fonts.print25().drawString(550, 260, "  Wczytaj grę", ctab[0]);
        Fonts.print25().drawString(550, 345, "    Nowa gra", ctab[1]);
        Fonts.print25().drawString(550, 430, "       Opcje", ctab[2]);
        Fonts.print25().drawString(550, 515, "     Twórcy", ctab[3]);
        Fonts.print25().drawString(550, 600, "      Wyjście", ctab[4]);

        g.drawString(mouse, 10, 10);
    }

    public MenuState(int state) {
    }

    public MenuState() {
    }

    public int getID() {
        return 0;
    }
}
