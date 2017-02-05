package states;

import gameUtils.Fonts;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

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

    boolean existSave[] = {true, true, false}; //Czy savy isnieją (pozycje)
    SaveToDisplay stdTab[] = new SaveToDisplay[3]; //tablica lokalnych savow-testow

    int actualBSposition = 1; //Pozycja prostokąta wyboru save'a

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        backGround = new Image("graphic/menu/backgroundMainMenu.jpg");
        borderGold = new Image("graphic/menu/LoadStateWoutBg.png");
        checkBorderSilver = new Image("graphic/menu/LSC_SilverBorder.png");

        mouse = "";
        onScreenLoc = " ";

        //Wytworzenie własnej czcionki
        fonts = new gameUtils.Fonts();

        //-----------------------------------------------
        //---- przykładowe savey do wyswietlenia --------
        //new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
        stdTab[0] = new SaveToDisplay(1, "DOM", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), "graphic/saveMin/HomeSaveMiniature.png");
        stdTab[1] = new SaveToDisplay(2, "GóRY", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), "graphic/saveMin/MountainSaveMiniature.png");
        stdTab[2] = new SaveToDisplay(2, "GóRY", new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), "graphic/saveMin/MountainSaveMiniature.png");

    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawImage(backGround, 0, 0);
        g.drawImage(borderGold, 0, 0); //złote ramki

        Fonts.print18().drawString(10, 10, "wsp. myszy: " + mouse);
        Fonts.print18().drawString(10, 30, onScreenLoc);

        Fonts.print28().drawString(300, 220, "Wczytaj", cButtons[0]);
        Fonts.print28().drawString(329, 330, "Usuń", cButtons[1]);
        Fonts.print28().drawString(329, 440, "Back", cButtons[2]);

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
            Fonts.print28().drawString(750, 213, "Zapis Nr 1", cSaves[0]);
            Fonts.print18().drawString(984, 192, stdTab[0].getMapLocation());
            Fonts.print18().drawString(929, 252, stdTab[0].getSaveDate());
            g.drawImage(new Image(stdTab[0].getMiniaturePath()), 630, 178);
        }
        if (existSave[1]) {
            Fonts.print28().drawString(750, 324, "Zapis Nr 2", cSaves[1]);
            Fonts.print18().drawString(984, 313, stdTab[1].getMapLocation());
            Fonts.print18().drawString(929, 368, stdTab[1].getSaveDate());
            g.drawImage(new Image(stdTab[1].getMiniaturePath()), 630, 289);
        }
        if (existSave[2]) {
            Fonts.print28().drawString(750, 440, "Zapis Nr 3", cSaves[2]);
            Fonts.print18().drawString(984, 434, stdTab[2].getMapLocation());
            Fonts.print18().drawString(929, 474, stdTab[2].getSaveDate());
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

        //Odświeżenie kolorów przycisków
        for (int j = 0; j < cButtons.length; j++) {
            cButtons[j] = Color.white;
        }
        for (int j = 0; j < cSaves.length; j++) {
            cSaves[j] = Color.white;
        }

        //wczytaj
        if ((xpos > 262 && xpos < 471) && (ypos > 460 && ypos < 517)) {
            if (input.isMouseButtonDown(0)) {
                //wczytaj - obsluga przycisku
            } 
            cButtons[0] = co;
            if (input.isMouseButtonDown(0)) {
                cButtons[0] = Color.gray;
            }
        }

        //usun
        if ((xpos > 262 && xpos < 471) && (ypos > 344 && ypos < 402)) {
            if (input.isMouseButtonDown(0)) {
                //usuń - obsluga przycisku
            }
            cButtons[1] = co;
            if (input.isMouseButtonDown(0)) {
                cButtons[1] = Color.gray;
            }
        }
        
        //cofnij
        if ((xpos > 262 && xpos < 471) && (ypos > 231 && ypos < 289)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(0);
            }
            cButtons[2] = co;
            if (input.isMouseButtonDown(0)) {
                cButtons[2] = Color.gray;
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

    public LoadGameState(int state) {
    }

    @Override
    public int getID() {
        return 11;
    }
}

class SaveToDisplay {
    //klasa lokalna na potrzeby wyświetlania savów w złotej tabelce

    int nr; //numer 1-3
    String mapLocation; //nazwa miejsca
    String saveDate; //Data zapisu
    String miniaturePath; //Ścieżka miniatury

    public SaveToDisplay() {
    }

    public SaveToDisplay(int nr, String mapLocation, String saveDate, String miniaturePath) {
        this.nr = nr;
        this.mapLocation = mapLocation;
        this.saveDate = saveDate;
        this.miniaturePath = miniaturePath;
    }

    public int getNr() {
        return nr;
    }

    public String getMapLocation() {
        return mapLocation;
    }

    public String getSaveDate() {
        return saveDate;
    }

    public String getMiniaturePath() {
        return miniaturePath;
    }

}
