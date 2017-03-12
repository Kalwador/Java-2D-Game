package states;

import gameUtils.Fonts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import model.Equip;
import model.Item;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class BagState extends BasicGameState {

    boolean czyPlecak = true; //zmienna decydująca o sterowaniu oknem Plecak lub Broń
    boolean bagCursorActivate = false;
    boolean bagEqCursorActivate = false;

    String mouse;

    private int selectedItem;
    private int selectedItemX;
    private int selectedItemY;

    private int selectedEquip;
    private int selectedEquipX;
    private int selectedEquipY;

    Color colorWhite = Color.white;
    Color colorOrange = Color.orange;
    Color c[] = {Color.orange, Color.white};

    Image BagMainFrame;
    Image coins;

    //Kolory tekstu na przyciskach
    Color[] ArrayOfColors = {colorWhite, colorWhite, colorWhite, colorWhite};

// wysokość/szerokość miniatury/kwadratu wyboru
    int miniatureDimensions = 43;

//---------- GRUPA PLECAKA --------------------
    static ItemToDisplay[][] itemToDisplay = new ItemToDisplay[6][8];

    int squareItemSelectionXPosition = 0; //pozycja X kwadratu wyboru przemiotu (0-5)
    int squareItemSelectionYPosition = 0; //pozycja Y kwadratu wyboru przemiotu (0-7)

    static float posXmqssI = 305; // współrzędna X pozycji miniatury/kwadratu wyboru
    static float posYmqssI = 169; // współrzędna Y pozycji miniatury/kwadratu wyboru

    Rectangle r = new Rectangle(posXmqssI, posYmqssI, miniatureDimensions, miniatureDimensions);

//    ArrayList<ItemLocal> itemsLoc = new ArrayList<>(); //kolekcja przedmiotów z plecaka lokalnego
//------------- GRUPA BRONI -------------------
    static EquipToDisplay[][] equipToDisplay = new EquipToDisplay[6][8];

    int squareEquipSelectionXPosition = 0; //pozycja X kwadratu wyboru broni (0-5)
    int squareEquipSelectionYPosition = 0; //pozycja Y kwadratu wyboru broni (0-7)

    static float posXmqssIW = 683; // współrzędna X pozycji miniatury/kwadratu wyboru broni
    static float posYmqssIW = 169; // współrzędna Y pozycji miniatury/kwadratu wyboru broni

    Rectangle rW = new Rectangle(posXmqssIW, posYmqssIW, miniatureDimensions, miniatureDimensions);

//    ArrayList<ItemLocal> itemsW = new ArrayList<>(); //kolekcja broni
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        coins = new Image("graphic/menu/CoinBagButtons.png");
        BagMainFrame = new Image("graphic/menu/BagEquipScene2.png");
        mouse = "";
        updateItemList();
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        // Tło sceny - rozmyty printscreen
        Image skrinGB = new Image(screenBlur.ScreenClass.screenNumber());
        g.drawImage(skrinGB, 0, 0);

        // Główna ramka itemów i eqipu
        g.drawImage(BagMainFrame, 0, 0);

        // Render ikony monet
        g.drawImage(coins, 0, 0);

        Fonts.print18().drawString(100, 10, mouse);
        Fonts.print18().drawString(100, 70, String.valueOf(selectedItem));
        Fonts.print18().drawString(900, 70, String.valueOf(selectedEquip));

//------------------------------------------------
        int k = 0;
        //Rysowanie miniatur przedmiotów
        for (int i = 0; i < itemToDisplay[0].length; i++) {
            for (int j = 0; j < itemToDisplay.length; j++) {
                if (k < core.GameStatus.itemsInBag.size()) {
                    g.drawImage(new Image("graphic/items/" + itemToDisplay[j][i].item.getId() + ".png"), itemToDisplay[j][i].corXi, itemToDisplay[j][i].corYi);
                    k++;
                }
            }
        }
//------------------------------------------------W
        //Rysowanie miniatur broni
        int kW = 0;
        for (int i = 0; i < equipToDisplay[0].length; i++) {
            for (int j = 0; j < equipToDisplay.length; j++) {
                if (kW < core.GameStatus.equipInBag.size()) {
                    g.drawImage(new Image("graphic/equip/" + equipToDisplay[j][i].equip.getId() + ".png"), equipToDisplay[j][i].corXi, equipToDisplay[j][i].corYi);
                    kW++;
                }
            }
        }

        //Wysiwetlanie kwadratów wyboru
        g.drawRect(r.getX(), r.getY(), r.getHeight(), r.getWidth());
        g.drawRect(rW.getX(), rW.getY(), rW.getHeight(), rW.getWidth());

        Fonts.print18().drawString(420, 100, "Plecak");
        Fonts.print18().drawString(770, 100, "Wyposażenie");
        //------------------------------------------------
        Fonts.print18().drawString(100, 30, "Pozycja X kwadratu = " + String.valueOf(squareItemSelectionXPosition));
        Fonts.print18().drawString(100, 50, "Pozycja Y kwadratu = " + String.valueOf(squareItemSelectionYPosition));

        //------------------------------------------------W
        Fonts.print18().drawString(900, 30, "Pozycja X kwadratu wyposażenia = " + String.valueOf(squareEquipSelectionXPosition));
        Fonts.print18().drawString(900, 50, "Pozycja Y kwadratu wyposażenia = " + String.valueOf(squareEquipSelectionYPosition));
        //------------------------------------------------

        //@Gajwer
        if (bagCursorActivate) {
            RednerItemDescription(g);
            bagCursorActivate = false;
        }
        if (bagEqCursorActivate) {
            RednerEquipDescription(g);
            bagEqCursorActivate = false;
        }

        //Monety
        Fonts.print25().drawString(379, 576, String.valueOf(core.GameStatus.money), Color.yellow);

        //Przyciski itemów
        Fonts.print18().drawString(493, 556, "EQUIP", ArrayOfColors[0]);
        Fonts.print18().drawString(493, 595, " DROP", ArrayOfColors[1]);

        //Przyciski itemów
        Fonts.print18().drawString(788, 556, "EQUIP", ArrayOfColors[2]);
        Fonts.print18().drawString(788, 595, " DROP", ArrayOfColors[3]);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg,
            int i) throws SlickException {

        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;
        
        //update listy itemow w oczekiwaniu na zalozenie badz usuniecie
        updateItemList();
        
        //powrót do gry
        if (((xpos > 588 && xpos < 636) && (ypos > 606 && ypos < 636))
                || // X w lewym oknie
                ((xpos > 965 && xpos < 996) && (ypos > 606 && ypos < 636))// X w prawym oknie
                ) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }
        }
        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }
        for (int j = 0; j < ArrayOfColors.length; j++) {
            ArrayOfColors[j] = Color.white;
        }

        //Przycisk załóż item
        if ((xpos > 471 && xpos < 598) && (ypos > 138 && ypos < 170)) {
            ArrayOfColors[0] = colorOrange;
            if (input.isMouseButtonDown(0)) {
                ArrayOfColors[0] = Color.gray;
                //zalozItem();
            }
        }

        //Przycisk wyrzuć item
        if ((xpos > 471 && xpos < 598) && (ypos > 97 && ypos < 134)) {
            ArrayOfColors[1] = colorOrange;
            if (input.isMouseButtonDown(0)) {
                ArrayOfColors[1] = Color.gray;
                //wyrzucItem();
            }
        }

        //Przycisk załóż equip
        if ((xpos > 766 && xpos < 893) && (ypos > 138 && ypos < 170)) {
            ArrayOfColors[2] = colorOrange;
            if (input.isMouseButtonDown(0)) {
                ArrayOfColors[2] = Color.gray;
                //zalozEq();
            }
        }

        //Przycisk wyrzuć equip
        if ((xpos > 766 && xpos < 893) && (ypos > 97 && ypos < 134)) {
            ArrayOfColors[3] = colorOrange;
            if (input.isMouseButtonDown(0)) {
                ArrayOfColors[3] = Color.gray;
                //wyrzucEq();
            }
        }
        //Kliknięcie w okno plecak
        if ((xpos > 271 && xpos < 630) && (ypos > 80 && ypos < 640)) {
            if (input.isMouseButtonDown(0)) {
                czyPlecak = true;
            }

            //Klinkięcie w okno z bronią
        } else if ((xpos > 650 && xpos < 1005) && (ypos > 80 && ypos < 640)) {
            if (input.isMouseButtonDown(0)) {
                czyPlecak = false;
            }
        }

        //Uaktywnienie karteczki dla bag
        if ((xpos > 305 && xpos < 598) && (ypos > 178 && ypos < 551)) {
            if (input.isMouseButtonDown(0) || true) {
                bagCursorActivate = true;
            }
        }//Uaktywnienie karteczki dla item 
        if ((xpos > 650 && xpos < 1005) && (ypos > 178 && ypos < 551)) {
            if (input.isMouseButtonDown(0) || true) {
                bagEqCursorActivate = true;
            }
        }

        if (czyPlecak) {
            // Sterowanie kwadratem wyboru p w plecaku
            if (input.isKeyPressed(Input.KEY_UP)) {
                if (squareItemSelectionYPosition > 0) {
                    squareItemSelectionYPosition--;
                    r.setY(r.getY() - 47.5f);
                }
            }

            if (input.isKeyPressed(Input.KEY_DOWN)) {
                if (squareItemSelectionYPosition < 7) {
                    squareItemSelectionYPosition++;
                    r.setY(r.getY() + 47.5f);
                }
            }

            if (input.isKeyPressed(Input.KEY_LEFT)) {
                if (squareItemSelectionXPosition > 0) {
                    squareItemSelectionXPosition--;
                    r.setX(r.getX() - 50.5f);
                }
            }

            if (input.isKeyPressed(Input.KEY_RIGHT)) {
                if (squareItemSelectionXPosition < 5) {
                    squareItemSelectionXPosition++;
                    r.setX(r.getX() + 50.5f);
                }
            }
        } else {
            //------------------------
            // Sterowanie kwadratem wyboru broni
            if (input.isKeyPressed(Input.KEY_UP)) {
                if (squareEquipSelectionYPosition > 0) {
                    squareEquipSelectionYPosition--;
                    rW.setY(rW.getY() - 47f);
                }
            }

            if (input.isKeyPressed(Input.KEY_DOWN)) {
                if (squareEquipSelectionYPosition < 7) {
                    squareEquipSelectionYPosition++;
                    rW.setY(rW.getY() + 47f);
                }
            }

            if (input.isKeyPressed(Input.KEY_LEFT)) {
                if (squareEquipSelectionXPosition > 0) {
                    squareEquipSelectionXPosition--;
                    rW.setX(rW.getX() - 50f);
                }
            }

            if (input.isKeyPressed(Input.KEY_RIGHT)) {
                if (squareEquipSelectionXPosition < 5) {
                    squareEquipSelectionXPosition++;
                    rW.setX(rW.getX() + 50f);
                }
            }
        }
        int itemPositionInBag = 0;
        if (czyPlecak) {
            for (int j = 551; j >= 220; j -= 47) {
                for (int k = 305; k <= 557; k += 50) {
                    if (((xpos >= k) && (xpos <= k + 43)) && ((ypos <= j) && (ypos >= j - 44))) {
                        selectedItem = itemPositionInBag;
                        selectedItemX = k + 43;
                        selectedItemY = Math.abs(720 - j) + 22;
                    }
                    itemPositionInBag++;
                }
            }
        }
        int equipPositionInBag = 0;
        if (!czyPlecak) {
            for (int j = 551; j >= 220; j -= 47) {
                for (int k = 684; k <= 933; k += 50) {
                    if (((xpos >= k) && (xpos <= k + 43)) && ((ypos <= j) && (ypos >= j - 44))) {
                        selectedEquip = equipPositionInBag;
                        selectedEquipX = k + 43;
                        selectedEquipY = Math.abs(720 - j) + 22;
                    }
                    equipPositionInBag++;
                }
            }
        }
    }

    public void RednerItemDescription(Graphics g) throws SlickException {
        if (bagCursorActivate && selectedItem != -1 && core.GameStatus.itemsInBag.size() > selectedItem) {
            g.drawImage(new Image("graphic/menu/malaKartkaWieksza.png"), selectedItemX, selectedItemY);

            String n = core.GameStatus.itemsInBag.get(selectedItem).getDescription();
            int size = n.length() / 3 + 1;

            String descArray[] = new String[3];
            descArray[0] = n.substring(0, size);
            descArray[1] = n.substring(size, 2 * size);
            descArray[2] = n.substring(2 * size, n.length());

            Fonts.print28().drawString(selectedItemX + 40, selectedItemY + 15, core.GameStatus.itemsInBag.get(selectedItem).getName(), Color.black);//"Nazwa przedmiotu"
            Fonts.print18().drawString(selectedItemX + 20, selectedItemY + 45, descArray[0], Color.black); //Pierwsza linijka opisu
            Fonts.print18().drawString(selectedItemX + 20, selectedItemY + 63, descArray[1], Color.black); //Druga linijka opisu
            Fonts.print18().drawString(selectedItemX + 20, selectedItemY + 81, descArray[2], Color.black); //Trzecia linijka opisu

            if (core.GameStatus.itemsInBag.get(selectedItem).getnOF() <= 1) {
                Fonts.print18().drawString(selectedItemX + 40, selectedItemY + 105, "Punkty zdrowia: ", Color.black); //Cecha A = wartość
            }
            if (core.GameStatus.itemsInBag.get(selectedItem).getnOF() <= 2) {
                Fonts.print18().drawString(selectedItemX + 40, selectedItemY + 123, "Punkty many: ", Color.black); //Cecha B = wartość
            }
            if (core.GameStatus.itemsInBag.get(selectedItem).getnOF() <= 3) {
                Fonts.print18().drawString(selectedItemX + 40, selectedItemY + 141, "Kamień teleportacyjny: ", Color.black); //Cecha C = wartość
            }
            if (core.GameStatus.itemsInBag.get(selectedItem).getnOF() <= 4) {
                Fonts.print18().drawString(selectedItemX + 40, selectedItemY + 159, "Id klucza: ", Color.black); //Cecha D = wartość
            }

        }
    }

    public void RednerEquipDescription(Graphics g) throws SlickException {
        if (bagEqCursorActivate && selectedEquip != 0 && core.GameStatus.equipInBag.size() > selectedEquip) {
            g.drawImage(new Image("graphic/menu/malaKartkaWieksza.png"), selectedEquipX, selectedEquipY);

            String n = core.GameStatus.equipInBag.get(selectedEquip).getDescription();
            int size = n.length() / 3 + 1;

            String descArray[] = new String[3];
            descArray[0] = n.substring(0, size);
            descArray[1] = n.substring(size, 2 * size);
            descArray[2] = n.substring(2 * size, n.length());

            Fonts.print28().drawString(selectedEquipX + 40, selectedEquipY + 15, core.GameStatus.equipInBag.get(selectedEquip).getName(), Color.black);//"Nazwa przedmiotu"
            Fonts.print18().drawString(selectedEquipX + 20, selectedEquipY + 45, descArray[0], Color.black); //Pierwsza linijka opisu
            Fonts.print18().drawString(selectedEquipX + 20, selectedEquipY + 63, descArray[1], Color.black); //Druga linijka opisu
            Fonts.print18().drawString(selectedEquipX + 20, selectedEquipY + 81, descArray[2], Color.black); //Trzecia linijka opisu

            if (core.GameStatus.equipInBag.get(selectedEquip).getnOF() <= 1) {
                Fonts.print18().drawString(selectedEquipX + 40, selectedItemY + 105, "Punkty zdrowia: ", Color.black); //Cecha A = wartość
            }
            if (core.GameStatus.equipInBag.get(selectedEquip).getnOF() <= 2) {
                Fonts.print18().drawString(selectedEquipX + 40, selectedItemY + 123, "Punkty many: ", Color.black); //Cecha B = wartość
            }
            if (core.GameStatus.equipInBag.get(selectedEquip).getnOF() <= 3) {
                Fonts.print18().drawString(selectedEquipX + 40, selectedItemY + 141, "Kamień teleportacyjny: ", Color.black); //Cecha C = wartość
            }
            if (core.GameStatus.equipInBag.get(selectedEquip).getnOF() <= 4) {
                Fonts.print18().drawString(selectedEquipX + 40, selectedItemY + 159, "Id klucza: ", Color.black); //Cecha D = wartość
            }
        }
    }

    public BagState(int bag) {
    }

    @Override
    public int getID() {
        return 4;
    }

    public static void updateItemList() {
        //Generowanie współrzędnych dla wyświetlania miniatur przedmiotów
        int licznik = 0;

        float posXmqssILOC = posXmqssI;
        float posYmqssILOC = posYmqssI;
        Iterator<Item> item = core.GameStatus.itemsInBag.values().iterator();

        for (int i = 0; i < itemToDisplay[0].length; i++) {
            for (int j = 0; j < itemToDisplay.length; j++) {
                if (item.hasNext()) {
                    itemToDisplay[j][i] = new ItemToDisplay(posXmqssILOC, posYmqssILOC, item.next());
                    licznik++;
                }
                posXmqssILOC += 50.5f;
            }
            posYmqssILOC += 47.5f;
            posXmqssILOC = 305;
        }
//------------------------------------------------
//Generowanie współrzędnych dla wyświetlania miniatur broni
        licznik = 0;

        float posXmqssILOCW = posXmqssIW;
        float posYmqssILOCW = posYmqssIW;
        Iterator<Equip> equip = core.GameStatus.equipInBag.values().iterator();
        for (int i = 0; i < equipToDisplay[0].length; i++) {
            for (int j = 0; j < equipToDisplay.length; j++) {
                if (equip.hasNext()) {
                    equipToDisplay[j][i] = new EquipToDisplay(posXmqssILOCW, posYmqssILOCW, equip.next());
                    licznik++;
                }
                posXmqssILOCW += 50.0f;
            }
            posYmqssILOCW += 47.0f;
            posXmqssILOCW = 683;
        }
    }

}

class ItemToDisplay {

    float corXi; // współrzędna X wyświetlania miniatury przedmiotu
    float corYi; // współrzędna Y wyświetlania miniatury przedmiotu
    Item item; //Przedmiot

    public ItemToDisplay(float wspXp, float wspYp, Item item) {
        this.corXi = wspXp;
        this.corYi = wspYp;
        this.item = item;
    }
}

class EquipToDisplay {

    float corXi; // współrzędna X wyświetlania miniatury przedmiotu
    float corYi; // współrzędna Y wyświetlania miniatury przedmiotu
    model.Equip equip; //Przedmiot

    public EquipToDisplay(float wspXp, float wspYp, model.Equip equip) {
        this.corXi = wspXp;
        this.corYi = wspYp;
        this.equip = equip;
    }
}
