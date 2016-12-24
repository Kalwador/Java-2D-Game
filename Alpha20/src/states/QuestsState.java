package states;

import gameUtils.Fonts;
import org.newdawn.slick.Color;
import java.util.ArrayList;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.MouseListener;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class QuestsState extends BasicGameState {

    String mouse;
    String onScreenLoc;
    gameUtils.Fonts fonts;
    ArrayList<String> questy = new ArrayList<>();
    int bp = 0;
    Color c = Color.black;
    String actualScr;

    //wsp pocz suwaka
    int suwX = 790;
    int suwY = 174;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mouse = ""; onScreenLoc = " ";
        
        //Wytworzenie własnej czcionki
        fonts = new gameUtils.Fonts();
        
        questy.add("Zemsta na bandytach");
        questy.add("Gdzie uciekl herszt");
        questy.add("Obozowisko na polach");
        questy.add("Wyprawa po futra.");
        questy.add("Polowanie na lisy");
        questy.add("Zaginiony ładunek");
        questy.add("Pradawna krypa");
        questy.add("Smocze ostrze");
        questy.add("Gdzie są bandyci");
        questy.add("Oboz troli");
        questy.add("Zaginiona paczka");
        questy.add("Bezdomny pies");
        questy.add("Rybobranie");
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        int scrolling = Mouse.getDWheel();
        mouse = "x= " + xpos + " y=" + ypos;
        onScreenLoc = "x= " + xpos + " y=" + Math.abs(720-ypos);
        
        
        if (input.isKeyPressed(Input.KEY_ESCAPE) || input.isKeyPressed(Input.KEY_M)) {
            sbg.enterState(1);
        }
        //powrót do menu
        if (((xpos > 520 && xpos < 720) && (ypos > 145 && ypos < 175))
                || /* X okna*/((xpos > 779 && xpos < 812) && (ypos > 606 && ypos < 636))) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }
        }
        //wyjście
//        if ((xpos > 470 && xpos < 630) && (ypos > 280 && ypos < 312)) {
//            if (input.isMouseButtonDown(0)) {
//                System.exit(0);
//            }
//        }
        
        //Przewijanie do góry - scrool myszy, klawisz, przycisk góra
        if ((scrolling > 0) || input.isKeyPressed(Input.KEY_UP) || ((xpos > 788 && xpos < 814) && (ypos > 546 && ypos < 569) && (input.isMousePressed(0)))) {
            if (bp > 0) {
                bp--;
                suwY -= 24;
            }
        }
        //Przewijanie do dołu - scrool myszy, klawisz, przycisk dół
        if ((scrolling < 0) || input.isKeyPressed(Input.KEY_DOWN) || ((xpos > 788 && xpos < 814) && (ypos > 97 && ypos < 124) && (input.isMousePressed(0)))) {
            if (bp < (questy.size() - 11)) {
                bp++;
                suwY += 24;
            }
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        //Tło sceny - rozmyty printscreen
        actualScr = screenBlur.ScreenClass.screenNumber();
        Image skrinGB = new Image(actualScr);
        g.drawImage(skrinGB, 0, 0);
        //Okno questa
        Image menuW = new Image("graphic/menu/QuestNew.png");
        g.drawImage(menuW, 0, 0);
        //Suwaczek
        Image skrolus = new Image("graphic/menu/skrolus.png");
        g.drawImage(skrolus, suwX, suwY);

        Fonts.print18().drawString(100, 30, onScreenLoc);
        Fonts.print18().drawString(100, 10, mouse);
        Fonts.print18().drawString(100, 30, " bieżący indeks " + String.valueOf(bp));
        Fonts.print18().drawString(100, 50, " rozmiar listy " + String.valueOf(questy.size()));

//        g.drawString("Opcje", 520, 375);
//        g.drawRoundRect(520, 375, 300, 60, 6);
//        g.drawString("Twórcy", 520, 445);
//        g.drawRoundRect(520, 445, 300, 60, 6);
//        g.drawString("Wyjście", 520, 515);
//        g.drawRoundRect(520, 515, 300, 60, 6);
        Fonts.print18().drawString(600, 100, "Questy");// (przewijanie strzalkami)");

        int wspqy = 175; // wsp pocz y wyświetlania listy
        for (int i = bp; i < bp + 11; i++) {
            Fonts.print18().drawString(519, wspqy += 30, questy.get(i), c);

        }

        Fonts.print18().drawString(530, 555, "Powrót do gry", c);
        g.drawRoundRect(520, 545, 200, 30, 6);
        Fonts.print18().drawString(510, 595, "C O N C E P T   Q U E S T S", c);
    }

    public QuestsState(int state) {
    }

    public QuestsState() {
    }

    public int getID() {
        return 5;
    }
}
