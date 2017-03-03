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

public class SkillsState extends BasicGameState {

    String mouse;
    String onScreenLoc;
    gameUtils.Fonts fonts;
    String actualScr;

    //Pole sterujące aktywną zakładką
    //-- 0 - Wojownik, 1 - Łowca, 2 - Mag
    private static int actualSubWindow = 0;

    //Kolory zakładek
    Color cw = Color.white;
    Color co = Color.orange;
    Color c[] = {Color.orange, Color.white, Color.white};
    
    Image menuW;
    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mouse = "";
        onScreenLoc = " ";
        
        menuW = new Image("graphic/menu/SkillsWithBackExport.png");
        
        //Wytworzenie własnej czcionki
        fonts = new gameUtils.Fonts();
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        //Tło sceny - rozmyty printscreen
        actualScr = screenBlur.ScreenClass.screenNumber();
        Image skrinGB = new Image(actualScr);
        g.drawImage(skrinGB, 0, 0);
        //Okno character info
        
        g.drawImage(menuW, 0, 0);

        Fonts.print18().drawString(577, 142, "Umiejętności");
        
        Fonts.print18().drawString(10, 10, mouse);
        Fonts.print18().drawString(10, 30, onScreenLoc);
        Fonts.print18().drawString(10, 50, "Bieżąca zakładka: " + String.valueOf(actualSubWindow));

        Fonts.print18().drawString(395, 184, "Wojownik", c[0]);
        Fonts.print18().drawString(602, 184, "Łowca", c[1]);
        Fonts.print18().drawString(800, 184, "Mag", c[2]);

        // wyświetlanie dla zakładki wojownik
        if (actualSubWindow == 0) {
            //tutaj będzie więcej w przeszłości
            g.drawImage(new Image("graphic/menu/warrior_bg.png"), 0, 0);
            Fonts.print18().drawString(464, 342, "Test wyświetlania dla zakładki wojownik", co);
        }
        // wyświetlanie dla zakładki łowca
        if (actualSubWindow == 1) {
             //tutaj będzie więcej w przeszłości
             g.drawImage(new Image("graphic/menu/hunter_bg.png"), 0, 0);
             Fonts.print18().drawString(464, 342, "Test wyświetlania dla zakładki łowca", co);
        }
        // wyświetlanie dla zakładki mag
        if (actualSubWindow == 2) {
            //tutaj będzie więcej w przeszłości
            g.drawImage(new Image("graphic/menu/wizzard_bg.png"), 0, 0);
            Fonts.print18().drawString(464, 342, "Test wyświetlania dla zakładki mag", co);
        }
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
                       
//        int xposa = input.getMouseX();
//        int yposa = input.getMouseY();
              
        mouse = "x= " + xpos + " y=" + ypos;// + " xa= " + xposa + " ya=" + yposa;
        onScreenLoc = "x= " + xpos + " y=" + Math.abs(720 - ypos);

        //powrót do gry
        if ((xpos > 894 && xpos < 916) && (ypos > 564 && ypos < 592)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }
        }
        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }

        //Sterowanie zakładkami
        if ((xpos > 361 && xpos < 545) && (ypos > 509 && ypos < 542)) {
            if (input.isMouseButtonDown(0)) {
                actualSubWindow = 0;
                c[0] = co;
                c[1] = cw;
                c[2] = cw;
            }
        }
        if ((xpos > 546 && xpos < 730) && (ypos > 509 && ypos < 542)) {
            if (input.isMouseButtonDown(0)) {
                actualSubWindow = 1;
                c[0] = cw;
                c[1] = co;
                c[2] = cw;
            }
        }
        if ((xpos > 731 && xpos < 920) && (ypos > 509 && ypos < 542)) {
            if (input.isMouseButtonDown(0)) {
                actualSubWindow = 2;
                c[0] = cw;
                c[1] = cw;
                c[2] = co;
            }
        }

    }

    public SkillsState(int state) {
    }

    @Override
    public int getID() {
        return 6;
    }

}
