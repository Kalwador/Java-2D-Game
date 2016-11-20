package states;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import java.util.ArrayList;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class BagState extends BasicGameState {

    String mouse;
    ItemToDisplay[][] ittd = new ItemToDisplay[6][8];

    int corXsqis = 0; //pozycja X kwadratu wyboru przemiotu (0-5)
    int corYsqis = 0; //pozycja Y kwadratu wyboru przemiotu (0-7)

    float posXmqssI = 63; // współrzędna X pozycji miniatury/kwadratu wyboru
    float posYmqssI = 100; // współrzędna Y pozycji miniatury/kwadratu wyboru
    int hewiSq = 43; // wysokość/szerokość miniatury/kwadratu wyboru

    Rectangle r = new Rectangle(posXmqssI, posYmqssI, hewiSq, hewiSq);//(63, 154, 43, 43);

    ArrayList<Item> items = new ArrayList<>();

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mouse = "";

        items.add(new Item("Luneta", "res/items/miniatures/advance_lens.png", "res/items/descriptions/LunetaPirataOpis.png"));
        items.add(new Item("Neseser", "res/items/miniatures/tajemniczy_neseser.png", "res/items/descriptions/TajemniczyNeseserOpis.png"));
        items.add(new Item("Neseser", "res/items/miniatures/tajemniczy_neseser.png", "res/items/descriptions/TajemniczyNeseserOpis.png"));
        items.add(new Item("Neseser", "res/items/miniatures/tajemniczy_neseser.png", "res/items/descriptions/TajemniczyNeseserOpis.png"));

        int k = 0;
        for (int i = 0; i < ittd[0].length; i++) {
            for (int j = 0; j < ittd.length; j++) {
                if (k < items.size()) {
                    ittd[j][i] = new ItemToDisplay(posXmqssI, posYmqssI, items.get(k));
                    k++;
                }
                posXmqssI += 50.5f;
            }
            posYmqssI += 47.5f;
            posXmqssI = 63;
        }
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        Image menuW = new Image("res/menu/PlecSkill_3.png");
        g.drawImage(menuW, 0, 0);
        g.drawString(mouse, 100, 10);

        int k = 0;
        for (int i = 0; i < ittd[0].length; i++) {
            for (int j = 0; j < ittd.length; j++) {
                if (k < items.size()) {
                    g.drawImage(new Image(ittd[j][i].item.miniaturePath), ittd[j][i].corXi, ittd[j][i].corYi);
                    k++;
                }
            }
        }

        try {
            g.drawImage(new Image(ittd[corXsqis][corYsqis].item.itemDescriptionPath), 474, 158);
        } catch (NullPointerException npe) {
            g.drawImage(new Image("res/items/descriptions/Pusty.png"), 474, 158);
        }

        g.drawString("Powrót do menu", 920, 555);
        g.drawRoundRect(920, 555, 300, 60, 6);

        g.drawRect(r.getX(), r.getY(), r.getHeight(), r.getWidth());

        g.drawString("Pozycja X kwadratu = " + String.valueOf(corXsqis), 100, 30);
        g.drawString("Pozycja Y kwadratu = " + String.valueOf(corYsqis), 100, 50);

        g.drawString("C O N C E P T   \nB A G  &  S K I L L S", 520, 575);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;
        //powrót do menu
        if ((xpos > 920 && xpos < 1218) && (ypos > 139 && ypos < 200)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }
        }
        if(input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }
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
    }

    public BagState(int bag) {
    }

    @Override
    public int getID() {
        return 4;
    }
}

class Item {

    String name; // nazwa przedmiotu - nieistotne
    String miniaturePath; // scieżka miniatury
    String itemDescriptionPath; // scieżka do opisu przedmiotu

    public Item(String nazwa, String sciezka_miniatury, String sciezka_opisu) {
        this.name = nazwa;
        this.miniaturePath = sciezka_miniatury;
        this.itemDescriptionPath = sciezka_opisu;
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
