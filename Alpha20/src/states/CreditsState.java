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

//    String mouse;
//    String onScreenLoc;
    
    Image menuF;
    Image buttonBB;
    
    Color c = Color.white; //Domyślny kolor napisów
    Color ctab[] = {c}; //Tablica kolorów tekstu na przyciskach

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
//        onScreenLoc = " ";
//        mouse = "";

        menuF = new Image("graphic/menu/backgroundMainMenu.jpg");
        buttonBB = new Image("graphic/menu/buttonMM.png");  
    }

    
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }

        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
//
//        mouse = "x= " + xpos + " y=" + ypos;
//        onScreenLoc = "x= " + xpos + " y=" + Math.abs(720 - ypos);

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
    
    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        
        //background
        g.drawImage(menuF, 0, 0);
        
//        Fonts.print18().drawString(10, 10, "współ. myszy: " + mouse);
//        Fonts.print18().drawString(10, 30, onScreenLoc);
        
        //buton back
        g.drawImage(buttonBB, 493, 600);

        Fonts.print46().drawString(450, 100, "  A U T H O R S", Color.white);
        Fonts.print25().drawString(500, 200, "Szymon", Color.white);Fonts.print25().drawString(670, 200, "Kulikowski", Color.white);
        Fonts.print25().drawString(500, 250, "  Maciej", Color.white);Fonts.print25().drawString(670, 250, "Piotrowski", Color.white);
        Fonts.print25().drawString(500, 300, "Szymon", Color.white);Fonts.print25().drawString(670, 300, "Półzięć", Color.white);
        Fonts.print25().drawString(500, 350, "Jaromir", Color.white); Fonts.print25().drawString(670, 350, "Sarzyński", Color.white);
        Fonts.print25().drawString(500, 400, "    Piotr", Color.white);Fonts.print25().drawString(670, 400, "Szpila", Color.white);
        Fonts.print25().drawString(500, 450, " Adrian", Color.white); Fonts.print25().drawString(670, 450, "Wilk", Color.white);

        Fonts.print18().drawString(470, 545, "Special thanks to Damian Wajda",  Color.white);
        
        Fonts.print25().drawString(600, 625, "BACK", ctab[0]);
    }


    public CreditsState(int state) {
    }

    @Override
    public int getID() {
        return 8;
    }
}
