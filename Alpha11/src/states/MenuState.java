package states;

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
    Font font;
    TrueTypeFont printHead;
    TrueTypeFont printLabel;
    Color c = Color.white; //Domyślny kolor napisów
    Color ctab[] = {c,c,c,c,c}; //Tablica kolorów tekstu na przyciskach

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mouse = "";
        // wyjasnienia dot. czcionek wyjasnione w BagState
        char tabc[] = {'ą', 'ę', 'ó', 'ć', 'ż', 'ł', 'ś', 'ź', 'ń'};
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File("res/fonts/TrajanPro-Regular.otf"));
            //font = font.deriveFont(Font.BOLD, 48f);
        } catch (FontFormatException fontFormatException) {
            System.out.println("X");
        } catch (IOException iOException) {
            System.out.println("Y");
        }
        printLabel = new TrueTypeFont(font.deriveFont(Font.BOLD, 25f), true, tabc);
        printHead = new TrueTypeFont(font.deriveFont(Font.BOLD, 78f), true, tabc);
        //printLabel.drawString(50, 50, "Zaż" + "\n" + "ółć..." + "Zażółć gęślą jaźń");
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
                sbg.enterState(1);
            }
            ctab[0] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[0] = Color.gray;
            }
        }
        //nowa gra - narazie brak
        if ((xpos > 520 && xpos < 777) && (ypos > 326 && ypos < 399)) {
            if (input.isMouseButtonDown(0)) {
                //sbg.enterState(unknown);
            }
            ctab[1] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[1] = Color.gray;
            }
        }
        //opcje - narazie brak
        if ((xpos > 520 && xpos < 777) && (ypos > 241 && ypos < 314)) {
            if (input.isMouseButtonDown(0)) {
                //sbg.enterState(unknown);
            }
            ctab[2] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[2] = Color.gray;
            }
        }
        //twórcy - narazie brak
        if ((xpos > 520 && xpos < 777) && (ypos > 156 && ypos < 229)) {
            if (input.isMouseButtonDown(0)) {
                //sbg.enterState(unknown);
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
            gauss.ScreenClass.makeScreen();
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

        printHead.drawString(60, 100, "LEGENDARY ADVENTURES", Color.white);
        printLabel.drawString(550, 260, "   Nowa gra", ctab[0]);
        printLabel.drawString(550, 345, "  Wczytaj grę", ctab[1]);
        printLabel.drawString(550, 430, "       Opcje", ctab[2]);
        printLabel.drawString(550, 515, "     Twórcy", ctab[3]);
        printLabel.drawString(550, 600, "      Wyjście", ctab[4]);

        //g.drawLine(500, 235, 795, 312);
        g.drawString(mouse, 10, 10);
        //g.drawString(String.valueOf(licznik), 70, 70);
    }

    public MenuState(int state) {
    }

    public MenuState() {
    }

    public int getID() {
        return 0;
    }
}
