package states;

import actor.Fonts;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Rectangle;
import java.awt.font.GlyphVector;
import java.io.File;
import java.io.IOException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.lwjgl.input.Mouse;
import org.lwjgl.util.ReadableColor;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.font.Glyph;
import org.newdawn.slick.font.effects.ShadowEffect;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class CharacterState extends BasicGameState {

    String mouse;
    String onScreenLoc;
    Font font;
    TrueTypeFont printLabel;
    String actualScr;
    Fonts fonts = new Fonts();
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

        fonts.ttfont();}

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

        fonts.printLabel.drawString(100, 10, mouse);
        fonts.printLabel.drawString(100, 30, onScreenLoc);
        
        
        //-------------Wszystkie dane liczbowe--------------
        fonts.printLabel.drawString(407, 207, playerName);
        
        fonts.printLabel.drawString(571, 272, String.valueOf(strength));
        fonts.printLabel.drawString(571, 311, String.valueOf(agility));
        fonts.printLabel.drawString(571, 351, String.valueOf(defence));
        fonts.printLabel.drawString(571, 392, String.valueOf(wisdom));
        
        fonts.printLabel.drawString(635, 228, String.valueOf(actualXPtoSpend));
        
        fonts.printLabel.drawString(492, 447, String.valueOf(health));
        fonts.printLabel.drawString(555, 463, String.valueOf(attSpeed));
        fonts.printLabel.drawString(462, 480, String.valueOf(mana));
        fonts.printLabel.drawString(560, 496, String.valueOf(movSpeed));
        
        fonts.printLabel.drawString(678, 519, "CharacterInfo State");
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
