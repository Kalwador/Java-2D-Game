package states;

import gameUtils.Fonts;
import java.util.ArrayList;
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

    String mouse;
    gameUtils.Fonts fonts;
    String actualScr;

    // @Gajwer 
    private int selectedItem;
    private int selectedItemX;
    private int selectedItemY;

    //---------- GRUPA PLECAKA --------------------
    ItemToDisplay[][] ittd = new ItemToDisplay[6][8];

    int corXsqis = 0; //pozycja X kwadratu wyboru przemiotu (0-5)
    int corYsqis = 0; //pozycja Y kwadratu wyboru przemiotu (0-7)

    float posXmqssI = 305; // współrzędna X pozycji miniatury/kwadratu wyboru
    float posYmqssI = 169; // współrzędna Y pozycji miniatury/kwadratu wyboru
    int hewiSq = 43; // wysokość/szerokość miniatury/kwadratu wyboru

    Rectangle r = new Rectangle(posXmqssI, posYmqssI, hewiSq, hewiSq);//(305, 170, 43, 43);

    ArrayList<ItemLocal> itemsLoc = new ArrayList<>(); //kolekcja przedmiotów z plecaka lokalnego

    //------------- GRUPA BRONI -------------------
    ItemToDisplay[][] ittdW = new ItemToDisplay[6][8];

    int corXsqisW = 0; //pozycja X kwadratu wyboru broni (0-5)
    int corYsqisW = 0; //pozycja Y kwadratu wyboru broni (0-7)

    float posXmqssIW = 683; // współrzędna X pozycji miniatury/kwadratu wyboru broni
    float posYmqssIW = 169; // współrzędna Y pozycji miniatury/kwadratu wyboru broni
    int hewiSqW = 43; // wysokość/szerokość miniatury/kwadratu wyboru broni

    Rectangle rW = new Rectangle(posXmqssIW, posYmqssIW, hewiSqW, hewiSqW);//(683, 169, 43, 43);

    ArrayList<ItemLocal> itemsW = new ArrayList<>(); //kolekcja broni
    //------------------------------------------------

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mouse = "";
        //Wytworzenie własnej czcionki
        fonts = new gameUtils.Fonts();

        Item i1 = new Item(1, "Luneta", "Luneta znaleziona w porcie pirackim. Pozwala wypatrzeć wilki z ogległości 50m", 1, 1, 0, 0, 0, 0);
        Item i2 = new Item(2, "Neseser", "Neseser jest ciężki. Skrywa jakiś tajemniczy przemiot... Do jego otwarcia potrzebujesz wytrychu lub klucza.", 1, 3, 0, 0, 0, 0);

        itemsLoc.add(new ItemLocal(i1, "graphic/items/miniatures/advance_lens.png"));
        itemsLoc.add(new ItemLocal(i2, "graphic/items/miniatures/tajemniczy_neseser.png"));

//        itemsLoc.add(new ItemLocal("Luneta", "graphic/items/miniatures/advance_lens.png", "graphic/items/descriptions/mkLunetaPirata.png"));
//        itemsLoc.add(new ItemLocal("Neseser", "graphic/items/miniatures/tajemniczy_neseser.png", "graphic/items/descriptions/mkNeseser.png"));
//        itemsLoc.add(new ItemLocal("Neseser", "graphic/items/miniatures/tajemniczy_neseser.png", "graphic/items/descriptions/mkNeseser.png"));
//        itemsLoc.add(new ItemLocal("Neseser", "graphic/items/miniatures/tajemniczy_neseser.png", "graphic/items/descriptions/mkNeseser.png"));
//------------------------------------------------W
        itemsW.add(new ItemLocal("Miecz", "graphic/itemsWeap/miniatures/metalsword.png", "graphic/itemsWeap/descriptions/mkMetalSword.png"));
        itemsW.add(new ItemLocal("Zbroja", "graphic/itemsWeap/miniatures/metalchestplate.png", "graphic/itemsWeap/descriptions/mkMetalChest.png"));
        itemsW.add(new ItemLocal("Miecz", "graphic/itemsWeap/miniatures/metalsword.png", "graphic/itemsWeap/descriptions/mkMetalSword.png"));
        itemsW.add(new ItemLocal("Zbroja", "graphic/itemsWeap/miniatures/metalchestplate.png", "graphic/itemsWeap/descriptions/mkMetalChest.png"));
//------------------------------------------------
        int k = 0;
        //Generowanie współrzędnych dla wyświetlania miniatur przedmiotów
        float posXmqssILOC = posXmqssI;
        float posYmqssILOC = posYmqssI;
        for (int i = 0; i < ittd[0].length; i++) {
            for (int j = 0; j < ittd.length; j++) {
                if (k < itemsLoc.size()) {
                    ittd[j][i] = new ItemToDisplay(posXmqssILOC, posYmqssILOC, itemsLoc.get(k));
                    k++;
                }
                posXmqssILOC += 50.5f;
            }
            posYmqssILOC += 47.5f;
            posXmqssILOC = 305;
        }
//------------------------------------------------W
        int kW = 0;
        //Generowanie współrzędnych dla wyświetlania miniatur broni
        float posXmqssILOCW = posXmqssIW;
        float posYmqssILOCW = posYmqssIW;
        for (int i = 0; i < ittdW[0].length; i++) {
            for (int j = 0; j < ittdW.length; j++) {
                if (kW < itemsW.size()) {
                    ittdW[j][i] = new ItemToDisplay(posXmqssILOCW, posYmqssILOCW, itemsW.get(kW));
                    kW++;
                }
                posXmqssILOCW += 50.0f;
            }
            posYmqssILOCW += 47.0f;
            posXmqssILOCW = 683;
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        //Tło sceny - rozmyty printscreen
        actualScr = screenBlur.ScreenClass.screenNumber();
        Image skrinGB = new Image(actualScr);
        g.drawImage(skrinGB, 0, 0);
        //Okna plecaka i broni
        Image menuW = new Image("graphic/menu/BagEquipScene2.png");
        g.drawImage(menuW, 0, 0);
        Fonts.print18().drawString(100, 10, mouse);
        Fonts.print18().drawString(100, 70, String.valueOf(selectedItem));
//------------------------------------------------
        int k = 0;
        //Rysowanie miniatur przedmiotów
        for (int i = 0; i < ittd[0].length; i++) {
            for (int j = 0; j < ittd.length; j++) {
                if (k < itemsLoc.size()) {
                    g.drawImage(new Image(ittd[j][i].item.miniaturePath), ittd[j][i].corXi, ittd[j][i].corYi);
                    k++;
                }
            }
        }
        //------------------stary sposób wyswietlania kartki z opisem przedmiotu----------------
//////        //Wyswietlenie tła kartki w oknie plecaka
//////        g.drawImage(new Image("graphic/items/descriptions/malaKartka.png"), 307, 403);
//////        //Wyswietlenie opisu przedmiotu
//////        try {
//////            g.drawImage(new Image(ittd[corXsqis][corYsqis].item.itemDescriptionPath), 307, 403);
//////        } catch (NullPointerException npe) {
//////            g.drawImage(new Image("graphic/items/descriptions/mkPusty.png"), 307, 403);
//////        }
//------------------------------------------------W
        //Rysowanie miniatur broni
        int kW = 0;
        for (int i = 0; i < ittdW[0].length; i++) {
            for (int j = 0; j < ittdW.length; j++) {
                if (kW < itemsLoc.size()) {
                    g.drawImage(new Image(ittdW[j][i].item.miniaturePath), ittdW[j][i].corXi, ittdW[j][i].corYi);
                    kW++;
                }
            }
        }
        //------------------stary sposób wyswietlania kartki z opisem broni----------------
//////        //Wyswietlenie tła kartki w oknie broni
//////        g.drawImage(new Image("graphic/itemsWeap/descriptions/malaKartka.png"), 683, 403);
//////        //Wyswietlenie opisu broni
//////        try {
//////            g.drawImage(new Image(ittdW[corXsqisW][corYsqisW].item.itemDescriptionPath), 683, 403);
//////        } catch (NullPointerException npe) {
//////            g.drawImage(new Image("graphic/itemsWeap/descriptions/mkPusty.png"), 683, 403);
//////        }
//------------------------------------------------
        Fonts.print18().drawString(760, 585, "Powrót do gry");
        g.drawRoundRect(750, 575, 190, 30, 6);

        //Wysiwetlanie kwadratów wyboru
        g.drawRect(r.getX(), r.getY(), r.getHeight(), r.getWidth());
        g.drawRect(rW.getX(), rW.getY(), rW.getHeight(), rW.getWidth());

        Fonts.print18().drawString(420, 100, "Plecak");
        Fonts.print18().drawString(770, 100, "Wyposażenie");
        //------------------------------------------------
        Fonts.print18().drawString(100, 30, "Pozycja X kwadratu = " + String.valueOf(corXsqis));
        Fonts.print18().drawString(100, 50, "Pozycja Y kwadratu = " + String.valueOf(corYsqis));

        //------------------------------------------------W
        Fonts.print18().drawString(900, 30, "Pozycja X kwadratu wyposażenia = " + String.valueOf(corXsqisW));
        Fonts.print18().drawString(900, 50, "Pozycja Y kwadratu wyposażenia = " + String.valueOf(corYsqisW));
        //------------------------------------------------
        Fonts.print18().drawString(310, 575, "C O N C E P T  BAG & SKILLS");

        //@Gajwer
        if (bagCursorActivate) {
            RednerItemDescription(g);
            bagCursorActivate = false;
        }
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg,
            int i) throws SlickException {

        //skrinGB = new Image("graphic/menu/skrin1.png");
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;
        //powrót do gry
        if (((xpos > 750 && xpos < 939) && (ypos > 115 && ypos < 145))
                || //powrot do gry
                ((xpos > 588 && xpos < 636) && (ypos > 606 && ypos < 636))
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
        }
        //Deaktywacja karteczki dla bag - Metoda wyłączona
//        if ((xpos > 598 && xpos < 305) && (ypos > 551 && ypos < 178)) {
//            if (input.isMouseButtonDown(0) || true) {
//                bagCursorDeactivate = true;
//            }       
//        }

        if (czyPlecak) {
            // Sterowanie kwadratem wyboru p w plecaku
            if (input.isKeyPressed(Input.KEY_UP)) {
                if (corYsqis > 0) {
                    corYsqis--;
                    r.setY(r.getY() - 47.5f);
                }
            }

            if (input.isKeyPressed(Input.KEY_DOWN)) {
                if (corYsqis < 7) {
                    corYsqis++;
                    r.setY(r.getY() + 47.5f);
                }
            }

            if (input.isKeyPressed(Input.KEY_LEFT)) {
                if (corXsqis > 0) {
                    corXsqis--;
                    r.setX(r.getX() - 50.5f);
                }
            }

            if (input.isKeyPressed(Input.KEY_RIGHT)) {
                if (corXsqis < 5) {
                    corXsqis++;
                    r.setX(r.getX() + 50.5f);
                }
            }
        } else {
            //------------------------W
            // Sterowanie kwadratem wyboru broni
            if (input.isKeyPressed(Input.KEY_UP)) {
                if (corYsqisW > 0) {
                    corYsqisW--;
                    rW.setY(rW.getY() - 47f);
                }
            }

            if (input.isKeyPressed(Input.KEY_DOWN)) {
                if (corYsqisW < 7) {
                    corYsqisW++;
                    rW.setY(rW.getY() + 47f);
                }
            }

            if (input.isKeyPressed(Input.KEY_LEFT)) {
                if (corXsqisW > 0) {
                    corXsqisW--;
                    rW.setX(rW.getX() - 50f);
                }
            }

            if (input.isKeyPressed(Input.KEY_RIGHT)) {
                if (corXsqisW < 5) {
                    corXsqisW++;
                    rW.setX(rW.getX() + 50f);
                }
            }
        }
        //@Gajwer
        int iS = 305;
        int iE = 556;
        int jS = 221;
        int jE = 551;
        int iL = 50;
        int jL = 48;
        int iW = 43;
        int iH = 44;
        int itemPositionInBag = 0;
        if (czyPlecak) {
            /*for (int j = iS; j < iE; j += iL) {
                for (int k = jS; k < jE; k += jL) {
                    if((xpos >= j && xpos <= j + iW)&&(ypos >= k && ypos <= k + iH)){
                        System.out.println("test" + licznik);
                        licznik++;
                    }
                }
            }*/

            for (int j = 551; j >= 220; j -= 47) {
                for (int k = 305; k <= 557; k += 50) {
                    if (((xpos >= k) && (xpos <= k + iW)) && ((ypos <= j) && (ypos >= j - iH))) {
                        selectedItem = itemPositionInBag;
                        selectedItemX = k + 43;
                        selectedItemY = Math.abs(720 - j) + 22;
                    }
                    itemPositionInBag++;
                }
            }
        }
    }

    public void RednerItemDescription(Graphics g) throws SlickException {
        if (bagCursorActivate && selectedItem != -1 && itemsLoc.size() > selectedItem) {
            g.drawImage(new Image("graphic/items/descriptions/malaKartkaWieksza.png"), selectedItemX, selectedItemY);

            String n = itemsLoc.get(selectedItem).outsideItem.getDescription();
            int size = n.length() / 3 + 1;

            String descArray[] = new String[3];
            descArray[0] = n.substring(0, size);
            descArray[1] = n.substring(size, 2 * size);
            descArray[2] = n.substring(2 * size, n.length());

            Fonts.print28().drawString(selectedItemX + 40, selectedItemY + 15, itemsLoc.get(selectedItem).outsideItem.getName(), Color.black);//"Nazwa przedmiotu"
            Fonts.print18().drawString(selectedItemX + 20, selectedItemY + 45, descArray[0], Color.black); //Pierwsza linijka opisu
            Fonts.print18().drawString(selectedItemX + 20, selectedItemY + 63, descArray[1], Color.black); //Druga linijka opisu
            Fonts.print18().drawString(selectedItemX + 20, selectedItemY + 81, descArray[2], Color.black); //Trzecia linijka opisu

            if (itemsLoc.get(selectedItem).outsideItem.getnOF() <= 1) {
                Fonts.print18().drawString(selectedItemX + 40, selectedItemY + 105, "Punkty zdrowia: ", Color.black); //Cecha A = wartość
            }
            if (itemsLoc.get(selectedItem).outsideItem.getnOF() <= 2) {
                Fonts.print18().drawString(selectedItemX + 40, selectedItemY + 123, "Punkty many: ", Color.black); //Cecha B = wartość
            }
            if (itemsLoc.get(selectedItem).outsideItem.getnOF() <= 3) {
                Fonts.print18().drawString(selectedItemX + 40, selectedItemY + 141, "Kamień teleportacyjny: ", Color.black); //Cecha C = wartość
            }
            if (itemsLoc.get(selectedItem).outsideItem.getnOF() <= 4) {
                Fonts.print18().drawString(selectedItemX + 40, selectedItemY + 159, "Id klucza: ", Color.black); //Cecha D = wartość
            }

        }
//        else if(bagCursorDeactivate){ //Wyłączono
//            g.drawImage(new Image("graphic/items/descriptions/malaKartka.png"), -666, -666);
//        }
    }

    public BagState(int bag) {
    }

    @Override
    public int getID() {
        return 4;
    }

}

class ItemLocal {

    String name; // nazwa przedmiotu 
    String miniaturePath; // scieżka miniatury
    String itemDescriptionPath; // scieżka do opisu przedmiotu
    model.Item outsideItem; // chwilowe połączenie z zewnątrz

    public ItemLocal(String nazwa, String sciezka_miniatury, String sciezka_opisu) {
        this.name = nazwa;
        this.miniaturePath = sciezka_miniatury;
        this.itemDescriptionPath = sciezka_opisu;
    }

    public ItemLocal(model.Item outsideItem, String miniaturePath) {
        this.outsideItem = outsideItem;
        this.miniaturePath = miniaturePath;
    }

}

class ItemToDisplay {

    float corXi; // współrzędna X wyświetlania miniatury przedmiotu
    float corYi; // współrzędna Y wyświetlania miniatury przedmiotu
    ItemLocal item; //Przedmiot

    public ItemToDisplay(float wspXp, float wspYp, ItemLocal item) {
        this.corXi = wspXp;
        this.corYi = wspYp;
        this.item = item;
    }

}
