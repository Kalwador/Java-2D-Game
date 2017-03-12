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

/*
Może być taki problem że po zapisaniu gry, i wejściu do Load State nie będzie nowgo sava,
winą jest odświerzanie okna, należy zadbać aby po zapisaniu gry odświerzyć load state.
 */
public class LoadGameState extends BasicGameState {

    Image backGround;
    Image borderGold; //zlote ramki
    Image checkBorderSilver; //srebrny prostokat wyboru

    String mouse;
    String onScreenLoc; //wspolrzedne do wstawiania elementow
    gameUtils.Fonts fonts;

    Color cw = Color.white;
    Color co = Color.orange;
    Color cSaves[] = {co, cw, cw}; //Kolory savów
    Color cButtons[] = {cw, cw, cw}; //Kolory tekstu na przyciskach

    static model.Save stdTab[] = new model.Save[3];

    int actualBSposition = 1; //Pozycja prostokąta wyboru save'a
    int counter = 0;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        backGround = new Image("graphic/menu/backgroundMainMenu.jpg");
        borderGold = new Image("graphic/menu/LoadStateWoutBg.png");
        checkBorderSilver = new Image("graphic/menu/LSC_SilverBorder.png");

        mouse = "";
        onScreenLoc = " ";

        updateSlots();
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {

        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;
        onScreenLoc = "x= " + xpos + " y=" + Math.abs(720 - ypos);

        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }

        //Odświeżenie kolorów przycisków
        for (int j = 0; j < cButtons.length; j++) {
            cButtons[j] = Color.white;
        }
        for (int j = 0; j < cSaves.length; j++) {
            cSaves[j] = Color.white;
        }

        //LOAD BUTTON
        if ((xpos > 262 && xpos < 471) && (ypos > 460 && ypos < 517)) {
            if (input.isMouseButtonDown(0)) {
                if (!stdTab[actualBSposition - 1].getMiniaturePath().equals("brak")) {
                    gameUtils.TXTsave.loadSave(actualBSposition);
                    states.PlayState.needToMapUpdate = true;
                    sbg.enterState(1);
                }
            }
            cButtons[0] = co;
            if (input.isMouseButtonDown(0)) {
                cButtons[0] = Color.gray;
            }
        }

        //DELETE BUTTON
        if ((xpos > 262 && xpos < 471) && (ypos > 344 && ypos < 402)) {
            if (input.isMouseButtonDown(0)) {
                gameUtils.TXTsave.deleteSave(actualBSposition);
                updateSlots();
                sbg.enterState(11);
            }
            cButtons[1] = co;
            if (input.isMouseButtonDown(0)) {
                cButtons[1] = Color.gray;
            }
        }

        //BACK BUTTON
        if ((xpos > 262 && xpos < 471) && (ypos > 231 && ypos < 289)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(0);
            }
            cButtons[2] = co;
            if (input.isMouseButtonDown(0)) {
                cButtons[2] = Color.gray;
            }
        }

        //Prostokąt 1
        if ((xpos > 625 && xpos < 1130) && (ypos > 442 && ypos < 545)) {
            if (input.isMouseButtonDown(0)) {
                actualBSposition = 1;
            }
        }
        //Prostokąt 2
        if ((xpos > 625 && xpos < 1130) && (ypos > 327 && ypos < 433)) {
            if (input.isMouseButtonDown(0)) {
                actualBSposition = 2;
            }
        }
        //Prostokąt 3
        if ((xpos > 625 && xpos < 1130) && (ypos > 215 && ypos < 320)) {
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
        g.drawImage(backGround, 0, 0);
        
        //złote ramki
        g.drawImage(borderGold, 0, 0); 

        Fonts.print28().drawString(325, 218, "LOAD", cButtons[0]);
        Fonts.print28().drawString(310, 335, "DELETE", cButtons[1]);
        Fonts.print28().drawString(325, 448, "BACK", cButtons[2]);

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
        Fonts.print18().drawString(784, 192, stdTab[0].getMapLocation());
        Fonts.print18().drawString(784, 252, stdTab[0].getSaveDate());
        if (!stdTab[0].getMiniaturePath().equals("brak")) {
            g.drawImage(new Image(stdTab[0].getMiniaturePath()), 630, 178);
        }

        Fonts.print18().drawString(784, 313, stdTab[1].getMapLocation());
        Fonts.print18().drawString(784, 368, stdTab[1].getSaveDate());
        if (!stdTab[1].getMiniaturePath().equals("brak")) {
            g.drawImage(new Image(stdTab[1].getMiniaturePath()), 630, 289);
        }

        Fonts.print18().drawString(784, 414, stdTab[2].getMapLocation());
        Fonts.print18().drawString(784, 474, stdTab[2].getSaveDate());
        if (!stdTab[2].getMiniaturePath().equals("brak")) {
            g.drawImage(new Image(stdTab[2].getMiniaturePath()), 630, 400);
        }

        //Wyswietlanie prostokąta wyboru
        switch (actualBSposition) {
            case 1:
                g.drawImage(checkBorderSilver, 623, 171);
                break;
            case 2:
                g.drawImage(checkBorderSilver, 623, 286);
                break;
            case 3:
                g.drawImage(checkBorderSilver, 623, 399);
                break;
        }
    }

    public LoadGameState(int state) {
    }

    @Override
    public int getID() {
        return 11;
    }

    public static void updateSlots() {
        stdTab[0] = gameUtils.TXTsave.loadData(1);
        stdTab[1] = gameUtils.TXTsave.loadData(2);
        stdTab[2] = gameUtils.TXTsave.loadData(3);
    }
}
