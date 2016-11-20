package states;

import java.util.ArrayList;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class QuestsState extends BasicGameState{

    String mouse;
    ArrayList<String> questy = new ArrayList<>();
    int bp = 0;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mouse = "";
        questy.add("Wyprawa po czekolade.");
        questy.add("Wyprawa po frugo.");
        questy.add("Wyprawa po knopersy.");
        questy.add("Wyprawa po cole.");
        questy.add("Wyprawa po majonez.");
        questy.add("Wyprawa po marsa.");
        questy.add("Wyprawa po kitkaty.");
        questy.add("Wyprawa po kota.");
        questy.add("Wyprawa po psa.");
        questy.add("Wyprawa po kurczaka.");
        questy.add("Wyprawa po rybę.");
        questy.add("Wyprawa po gajwera.");
        questy.add("Wyprawa po swinga.");

    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;

        //powrót do menu
        if ((xpos > 920 && xpos < 1218) && (ypos > 239 && ypos < 300)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(0);
            }
        }
        //wyjście
        if ((xpos > 470 && xpos < 630) && (ypos > 280 && ypos < 312)) {
            if (input.isMouseButtonDown(0)) {
                System.exit(0);
            }
        }

        if (input.isKeyPressed(Input.KEY_UP)) {
            if (bp > 0) {
                bp--;
                sbg.enterState(5);
            }
        }

        if (input.isKeyPressed(Input.KEY_DOWN)) {
            if (bp < (questy.size()-9)) {
                bp++;
            }
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

//        Image menuF = new Image("Resources/Graphics/Menus/MenuF.png");
//        g.drawImage(menuF, 0, 0);
        Image menuW = new Image("res/menu/woodBackground.jpg");
        //Image lg = new Image("Resources/Graphics/Menus/load_game.png");
        g.drawImage(menuW, -30, -30);
        //g.drawImage(lg, 520, 235);
        g.drawString(mouse, 100, 10);
        g.drawString(" bieżący indeks "+String.valueOf(bp), 100, 30);
        g.drawString(" rozmiar listy "+String.valueOf(questy.size()), 100, 50);

        g.drawString("Powrót do menu", 920, 505);
        g.drawRoundRect(920, 505, 300, 60, 6);

//        g.drawString("Opcje", 520, 375);
//        g.drawRoundRect(520, 375, 300, 60, 6);
//        g.drawString("Twórcy", 520, 445);
//        g.drawRoundRect(520, 445, 300, 60, 6);
//        g.drawString("Wyjście", 520, 515);
//        g.drawRoundRect(520, 515, 300, 60, 6);
        g.drawString("Questy:\n(przewijanie strzalkami)", 500, 50);
        g.drawRoundRect(500, 130, 300, 270, 6);
        int wspqx = 100;


        g.drawString("C O N C E P T   Q U E S T S", 520, 595);    
        
            for (int i = bp; i < bp + 9; i++) {
                g.drawString(questy.get(i), 500, wspqx += 30);
            
        }
    }

    public QuestsState(int state) {
    }

    public QuestsState() {
    }

    public int getID() {
        return 5;
    }
}

