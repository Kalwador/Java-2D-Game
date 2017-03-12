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

public class SaveState extends BasicGameState {

    String mouse;
    String onScreenLoc;
    gameUtils.Fonts fonts;
    String actualScr;

    Image menuW;
    Image checkBorderSilverSmall; //srebrny prostokat wyboru

    Image[] saveIconArray;

    Color whiteColor = Color.white;
    Color orangeColor = Color.orange;
    Color[] colorOfSaves = {orangeColor, whiteColor, whiteColor}; //Kolory savów
    Color cButtons[] = {whiteColor, whiteColor}; //Kolory tekstu na przyciskach

    boolean existSave[] = {true, true, true}; //Czy savy isnieją (pozycje)

    int actualBSposition = 1; //Pozycja prostokąta wyboru save'a

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

        saveIconArray = new Image[3];

        //Okno save game info
        menuW = new Image("graphic/menu/SaveStateWB.png");

        mouse = "";
        onScreenLoc = " ";

        //Wytworzenie własnej czcionki
        fonts = new gameUtils.Fonts();

        checkBorderSilverSmall = new Image("graphic/menu/LSC_SilverBorder_small.png");

        LoadGameState.updateSlots();
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
        for (int j = 0; j < colorOfSaves.length; j++) {
            colorOfSaves[j] = Color.white;
        }

        //zapisz
        if ((xpos > 428 && xpos < 580) && (ypos > 190 && ypos < 231)) {
            if (input.isMouseButtonDown(0)) {
                screenBlur.ScreenClass.makeSmallScreen(actualBSposition);
                gameUtils.TXTsave.saveGame(actualBSposition);
                LoadGameState.updateSlots();
            }
            cButtons[0] = orangeColor;
            if (input.isMouseButtonDown(0)) {
                cButtons[0] = Color.gray;
            }
        }

        //usun
        if ((xpos > 700 && xpos < 852) && (ypos > 190 && ypos < 231)) {
            if (input.isMouseButtonDown(0)) {
                gameUtils.TXTsave.deleteSave(actualBSposition);
                LoadGameState.updateSlots();
            }
            cButtons[1] = orangeColor;
            if (input.isMouseButtonDown(0)) {
                cButtons[1] = Color.gray;
            }
        }
        //Prostokąt 1
        if ((xpos > 431 && xpos < 841) && (ypos > 433 && ypos < 519)) {
            if (input.isMouseButtonDown(0)) {
                actualBSposition = 1;
            }
        }
        //Prostokąt 2
        if ((xpos > 431 && xpos < 841) && (ypos > 341 && ypos < 428)) {
            if (input.isMouseButtonDown(0)) {
                actualBSposition = 2;
            }
        }
        //Prostokąt 3
        if ((xpos > 431 && xpos < 841) && (ypos > 250 && ypos < 333)) {
            if (input.isMouseButtonDown(0)) {
                actualBSposition = 3;
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

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        //Tło sceny - rozmyty printscreen
        actualScr = screenBlur.ScreenClass.screenNumber();
        Image skrinGB = new Image(actualScr);
        g.drawImage(skrinGB, 0, 0);

        g.drawImage(menuW, 0, 0);

        Fonts.print18().drawString(10, 10, "wsp. myszy: " + mouse);
        Fonts.print18().drawString(10, 30, onScreenLoc);

        Fonts.print18().drawString(581, 140, "SAVE GAME");

        Fonts.print18().drawString(478, 502, "SAVE", cButtons[0]);
        Fonts.print18().drawString(740, 502, "DELETE", cButtons[1]);

        //Ustalenie kolorów nr savów
        switch (actualBSposition) {
            case 1:
                colorOfSaves[0] = orangeColor;
                colorOfSaves[1] = whiteColor;
                break;
            case 2:
                colorOfSaves[0] = whiteColor;
                colorOfSaves[1] = orangeColor;
                colorOfSaves[2] = whiteColor;
                break;
            case 3:
                colorOfSaves[1] = whiteColor;
                colorOfSaves[2] = orangeColor;
                break;
        }

        //Wyświetlanie savów
        if (existSave[0]) {
            Fonts.print18().drawString(555, 225, LoadGameState.stdTab[0].getMapLocation(), colorOfSaves[0]);
            Fonts.print18().drawString(555, 255, LoadGameState.stdTab[0].getSaveDate(), colorOfSaves[0]);
            if (!LoadGameState.stdTab[0].getMiniaturePath().equals("brak")) {
                new Image(LoadGameState.stdTab[0].getMiniaturePath()).draw(436, 202, 0.82f);
            }
        }
        if (existSave[1]) {
            Fonts.print18().drawString(555, 320, LoadGameState.stdTab[1].getMapLocation(), colorOfSaves[1]);
            Fonts.print18().drawString(555, 350, LoadGameState.stdTab[1].getSaveDate(), colorOfSaves[1]);
            if (!LoadGameState.stdTab[1].getMiniaturePath().equals("brak")) {
                new Image(LoadGameState.stdTab[1].getMiniaturePath()).draw(436, 294, 0.82f);
            }
        }
        if (existSave[2]) {
            Fonts.print18().drawString(555, 405, LoadGameState.stdTab[2].getMapLocation(), colorOfSaves[2]);
            Fonts.print18().drawString(555, 435, LoadGameState.stdTab[2].getSaveDate(), colorOfSaves[2]);
            if (!LoadGameState.stdTab[2].getMiniaturePath().equals("brak")) {
                new Image(LoadGameState.stdTab[2].getMiniaturePath()).draw(436, 386, 0.82f);
            }
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

    public SaveState(int state) {
    }

    @Override
    public int getID() {
        return 12;
    }
}
