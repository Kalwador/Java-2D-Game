package states;

import core.SoundService;
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

public class MenuState extends BasicGameState {

    //int licznik = 0;
    String mouse;
    Color c = Color.white; //Domyślny kolor napisów
    Color ctab[] = {c, c, c, c, c}; //Tablica kolorów tekstu na przyciskach

    public static boolean playHover[] = {false,false,false,false,false};
//    public static Music music;
//    public static Sound sound;
    /**
     * MEGA WAZNE NIE USUWAC, NIE MODYFIKOWAC OBIEKTU font
     */
    gameUtils.Fonts font;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        gc.setMouseCursor(new Image("graphic/hud/gloveCoursor.png"), 0, 0);
        /**
         * MEGA WAZNE NIE USUWAC, NIE MODYFIKOWAC OBIEKTU font2
         */
        font = new Fonts();
        mouse = "";
//        music = new Music("music/m1.ogg");
//        music.setVolume(1);
//        music.loop(1.0F, 0.1F);
        SoundService.playMusic("music/m1.ogg");
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
            SoundService.playHover(playHover[0]);
            playHover[0] = false;
            if (input.isMouseButtonDown(0)) {
                LoadGameState.updateSlots();
                sbg.enterState(11);
            }
            ctab[0] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[0] = Color.gray;
                SoundService.playClick();
                SoundService.playMusic("music/Free Music [BattleEmotion]  Rapture - Ross Bugden.ogg");
            }
        } else {
            playHover[0] = true;
        }
        //nowa gra - narazie brak
        if ((xpos > 520 && xpos < 777) && (ypos > 326 && ypos < 399)) {
            SoundService.playHover(playHover[1]);
            playHover[1] = false;
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }
            ctab[1] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[1] = Color.gray;
                SoundService.playClick();
            }
        } else {
            playHover[1] = true;
        }

        //opcje
        if ((xpos > 520 && xpos < 777) && (ypos > 241 && ypos < 314)) {
            SoundService.playHover(playHover[2]);
            playHover[2] = false;
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(2);
            }
            ctab[2] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[2] = Color.gray;
                SoundService.playClick();
            }
        } else {
            playHover[2] = true;
        }
        //twórcy
        if ((xpos > 520 && xpos < 777) && (ypos > 156 && ypos < 229)) {
            SoundService.playHover(playHover[3]);
            playHover[3] = false;
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(8);
            }
            ctab[3] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[3] = Color.gray;
                SoundService.playClick();
            }
        } else {
            playHover[3] = true;
        }
        //wyjście
        if ((xpos > 520 && xpos < 777) && (ypos > 69 && ypos < 144)) {
            SoundService.playHover(playHover[4]);
            playHover[4] = false;
            if (input.isMouseButtonDown(0)) {
                System.exit(0);
            }
            ctab[4] = Color.orange;
            if (input.isMouseButtonDown(0)) {
                ctab[4] = Color.gray;
                SoundService.playClick();
            }
        } else {
            playHover[4] = true;
        }
        //licznik++;
        //Testowanie screnów i włączenie plecaka
        if (input.isKeyPressed(Input.KEY_1)) {
            screenBlur.ScreenClass.makeScreen(xpos, ypos);
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
