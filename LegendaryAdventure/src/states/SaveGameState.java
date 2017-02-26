package states;

import gameUtils.Fonts;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.SaveToDisplay;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class SaveGameState extends BasicGameState {

    String mouse;
    String onScreenLoc;
    gameUtils.Fonts fonts;
    String actualScr;

    Image checkBorderSilverSmall; //srebrny prostokat wyboru

    Color cw = Color.white;
    Color co = Color.orange;
    Color cSaves[] = {co, cw, cw}; //Kolory savów
    Color cButtons[] = {cw, cw}; //Kolory tekstu na przyciskach

    boolean existSave[] = {true, true, true}; //Czy savy isnieją (pozycje)
    SaveToDisplay stdTab[] = new SaveToDisplay[3]; //tablica lokalnych savow-testow

    int actualBSposition = 1; //Pozycja prostokąta wyboru save'a

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        //backGround = new Image("graphic/menu/backgroundMainMenu.jpg");

        mouse = "";
        onScreenLoc = " ";

        //Wytworzenie własnej czcionki
        fonts = new gameUtils.Fonts();

        checkBorderSilverSmall = new Image("graphic/menu/LSC_SilverBorder_small.png");

        //-----------------------------------------------
        //---- przykładowe savey do wyswietlenia --------
        //new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        stdTab[0] = new SaveToDisplay(1, "DOM", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), "graphic/saveMin/HomeSaveMiniatureSmall.png");
        stdTab[1] = new SaveToDisplay(2, "GóRY", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), "graphic/saveMin/MountainSaveMiniatureSmall.png");
        stdTab[2] = new SaveToDisplay(2, "GóRY", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), "graphic/saveMin/MountainSaveMiniatureSmall.png");

    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        //Tło sceny - rozmyty printscreen
        actualScr = screenBlur.ScreenClass.screenNumber();
        Image skrinGB = new Image(actualScr);
        g.drawImage(skrinGB, 0, 0);

        //Okno save game info
        Image menuW = new Image("graphic/menu/SaveStateWB.png");
        g.drawImage(menuW, 0, 0);

        Fonts.print18().drawString(10, 10, "wsp. myszy: " + mouse);
        Fonts.print18().drawString(10, 30, onScreenLoc);

        Fonts.print18().drawString(592, 142, "Zapis gry");

        Fonts.print18().drawString(468, 502, "Zapisz", cButtons[0]);
        Fonts.print18().drawString(750, 502, "Usuń", cButtons[1]);

        //Ustalenie kolorów nr savów
        switch (actualBSposition) {
            case 1:
                cSaves[0] = co;
                cSaves[1] = cw;
                break;
            case 2:
                cSaves[0] = cw;
                cSaves[1] = co;
                cSaves[2] = cw;
                break;
            case 3:
                cSaves[1] = cw;
                cSaves[2] = co;
                break;
        }

        //Wyświetlanie savów
        if (existSave[0]) {
            Fonts.print18().drawString(533, 237, "Zapis Nr 1", cSaves[0]);
            Fonts.print18().drawString(772, 212, stdTab[0].getMapLocation());
            Fonts.print18().drawString(660, 268, stdTab[0].getSaveDate());
            g.drawImage(new Image(stdTab[0].getMiniaturePath()), 435, 203);
        }
        if (existSave[1]) {
            Fonts.print18().drawString(533, 327, "Zapis Nr 2", cSaves[1]);
            Fonts.print18().drawString(772, 307, stdTab[1].getMapLocation());
            Fonts.print18().drawString(660, 362, stdTab[1].getSaveDate());
            g.drawImage(new Image(stdTab[1].getMiniaturePath()), 435, 295);
        }
        if (existSave[2]) {
            Fonts.print18().drawString(533, 420, "Zapis Nr 3", cSaves[2]);
            Fonts.print18().drawString(772, 396, stdTab[2].getMapLocation());
            Fonts.print18().drawString(660, 454, stdTab[2].getSaveDate());
            g.drawImage(new Image(stdTab[2].getMiniaturePath()), 435, 386);
        }

        //Wyswietlanie prostokąta wyboru
        switch (actualBSposition) {
            case 1:
                g.drawImage(checkBorderSilverSmall, 420, 187);
                break;
            case 2:
                g.drawImage(checkBorderSilverSmall, 420, 279);
                break;
            case 3:
                g.drawImage(checkBorderSilverSmall, 420, 374);
                break;
        }
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;
        onScreenLoc = "x= " + xpos + " y=" + Math.abs(720 - ypos);

        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }

        //powrót do gry przycisk (X)
        if ((xpos > 894 && xpos < 916) && (ypos > 564 && ypos < 592)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }
        }

        //Odświeżenie kolorów przycisków
        for (int j = 0; j < cButtons.length; j++) {
            cButtons[j] = Color.white;
        }
        for (int j = 0; j < cSaves.length; j++) {
            cSaves[j] = Color.white;
        }

        //zapisz
        if ((xpos > 428 && xpos < 580) && (ypos > 190 && ypos < 231)) {
            if (input.isMouseButtonDown(0)) {
                //zapisz - obsluga przycisku
            }
            cButtons[0] = co;
            if (input.isMouseButtonDown(0)) {
                cButtons[0] = Color.gray;
            }
        }

        //usun
        if ((xpos > 700 && xpos < 852) && (ypos > 190 && ypos < 231)) {
            if (input.isMouseButtonDown(0)) {
                //usun - obsluga przycisku
            }
            cButtons[1] = co;
            if (input.isMouseButtonDown(0)) {
                cButtons[1] = Color.gray;
            }
        }

        //Przewijanie prostokata do góry - klawisz, przycisk góra
        if (input.isKeyPressed(Input.KEY_UP)) {
            if (actualBSposition > 1) {
                actualBSposition--;
            }
        }

        //Przewijanie prostokata do dołu - klawisz, przycisk dół
        if (input.isKeyPressed(Input.KEY_DOWN)) {
            if (actualBSposition < 3) {
                actualBSposition++;
            }
        }
    }

    public SaveGameState(int state) {
    }

    @Override
    public int getID() {
        return 12;
    }
}
