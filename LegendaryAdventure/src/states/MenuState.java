package states;

import gameUtils.Fonts;
import model.Hero;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MenuState extends BasicGameState {

    //int licznik = 0;
    String mouse;
    Color c = Color.white; //Domyślny kolor napisów
    Color ctab[] = {c, c, c, c, c}; //Tablica kolorów tekstu na przyciskach

    public static Music music;
    public static Sound sound;
    /**
     * MEGA WAZNE NIE USUWAC, NIE MODYFIKOWAC OBIEKTU font
     */
    gameUtils.Fonts font;

    int exitCounter;
            
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        gc.setMouseCursor(new Image("graphic/hud/gloveCoursor2.png"), 0, 0);
        /**
         * MEGA WAZNE NIE USUWAC, NIE MODYFIKOWAC OBIEKTU font2
         */
        exitCounter = 0;
        font = new Fonts();
        mouse = "";
//        music = new Music("music/m1.ogg");
//        music.setVolume(1);
//        music.loop(1.0F, 0.1F);
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
                LoadGameState.updateSlots();
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
                core.GameStatus.hero = new Hero();
                sbg.enterState(14);
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
                exitCounter++;
                if (exitCounter == 7) {
                    System.exit(0);
                }
            }
            ctab[4] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[4] = Color.gray;
            }
        } else {
            exitCounter = 0;
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
        Fonts.print25().drawString(568, 260, "LOAD GAME", ctab[0]);
        Fonts.print25().drawString(574, 345, "NEW GAME", ctab[1]);
        Fonts.print25().drawString(585, 430, "OPTIONS", ctab[2]);
        Fonts.print25().drawString(590, 515, "CREDITS", ctab[3]);
        Fonts.print25().drawString(611, 600, "EXIT", ctab[4]);

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
