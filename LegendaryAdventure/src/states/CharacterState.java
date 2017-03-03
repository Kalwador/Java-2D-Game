package states;

import gameUtils.Fonts;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class CharacterState extends BasicGameState {

    String mouse;
    String onScreenLoc;
    String actualScr;
    gameUtils.Fonts fonts;
    
    //---Pola do powiązania z zewnętrzem---
    private static String playerName = "Nazwa gracza";
    private static int strength = 44;
    private static int agility = 17;
    private static int defence = 34;
    private static int wisdom = 10;
    
    private static int actualXPtoSpend = 9;
    
    private static int health = 340;
    private static int attSpeed = 30;
    private static int mana = 50;
    private static int movSpeed = 100;
    //-----------------------------------------

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mouse = ""; onScreenLoc = " ";
        //Wytworzenie własnej czcionki
        fonts = new gameUtils.Fonts();
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        //Tło sceny - rozmyty printscreen
        actualScr = screenBlur.ScreenClass.screenNumber();
        Image skrinGB = new Image(actualScr);
        g.drawImage(skrinGB, 0, 0);
        //Okno character info
        Image menuW = new Image("graphic/menu/CharacterInfoWithBack FV1_na_eksport.png");
        g.drawImage(menuW, 0, 0);

            //Zostali spłaszczeni
//        Image warriorChar = new Image("graphic/heroSprite/warrior_small.png");
//        g.drawImage(warriorChar, 780, 200);        
//        Image levelBar = new Image("graphic/heroSprite/LevelStatic.png");
//        g.drawImage(levelBar, 670, 505);


            //Sloty lewa strona - nie kasować!!! vvvv
//        g.drawImage(nowy Obrazek(sciezka obrazka), 692, 208);         
        g.drawImage(new Image("graphic/itemsWeap/miniatures/dagger-3.png"), 692, 261);         
//        g.drawImage(nowy Obrazek(sciezka obrazka), 692, 317);         
//        g.drawImage(nowy Obrazek(sciezka obrazka), 692, 372);         
//        g.drawImage(nowy Obrazek(sciezka obrazka), 692, 426);         

            //Sloty prawa strona
//        g.drawImage(nowy Obrazek(sciezka obrazka), 868, 208);         
//        g.drawImage(nowy Obrazek(sciezka obrazka), 868, 261);         
//        g.drawImage(nowy Obrazek(sciezka obrazka), 868, 317);                
//        g.drawImage(nowy Obrazek(sciezka obrazka), 868, 372);  
        g.drawImage(new Image("graphic/itemsWeap/miniatures/Shoes_2.png"), 868, 426);  
        //         ------------------------- ^^^^

        Fonts.print18().drawString(100, 10, mouse);
        Fonts.print18().drawString(100, 30, onScreenLoc);
        
        
        //-------------Wszystkie dane liczbowe--------------
        Fonts.print18().drawString(407, 207, playerName);
        
        Fonts.print18().drawString(571, 272, String.valueOf(strength));
        Fonts.print18().drawString(571, 311, String.valueOf(agility));
        Fonts.print18().drawString(571, 351, String.valueOf(defence));
        Fonts.print18().drawString(571, 392, String.valueOf(wisdom));
        
        Fonts.print18().drawString(635, 228, String.valueOf(actualXPtoSpend));
        
        Fonts.print18().drawString(492, 447, String.valueOf(health));
        Fonts.print18().drawString(555, 463, String.valueOf(attSpeed));
        Fonts.print18().drawString(462, 480, String.valueOf(mana));
        Fonts.print18().drawString(560, 496, String.valueOf(movSpeed));
        
        Fonts.print18().drawString(678, 519, "CharacterInfo State");
    }

    //działa X (zamykanie w okienku)
    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;
        onScreenLoc = "x= " + xpos + " y=" + Math.abs(720-ypos);

        //powrót do gry
        if ((xpos > 894 && xpos < 916) && (ypos > 564 && ypos < 592)) {
            if (input.isMouseButtonDown(0)) {
                sbg.enterState(1);
            }
        }
        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            sbg.enterState(1);
        }

    }

    public CharacterState(int character) {
    }

    @Override
    public int getID() {
        return 3;
    }
}
