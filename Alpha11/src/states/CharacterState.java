package states;

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
    Font font;
    TrueTypeFont printLabel;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        mouse = "";

        //czcionki opisane w bagstate
        char tabc[] = {'ą', 'ę', 'ó', 'ć', 'ż', 'ł', 'ś', 'ź', 'ń'};

        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File("res/fonts/TrajanPro-Regular.otf"));
            font = font.deriveFont(Font.BOLD, 48f);
        } catch (FontFormatException fontFormatException) {
            System.out.println("X");
        } catch (IOException iOException) {
            System.out.println("Y");
        }

//        TrueTypeFont ttf = new TrueTypeFont(font, true, tabc);
//        ttf.drawString(50, 50, "Zaż" + "\n" + "ółć..." + "Zażółć gęślą jaźń");
        printLabel = new TrueTypeFont(font.deriveFont(Font.BOLD, 18f), true, tabc);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {

        //Tło sceny - rozmyty printscreen
        Image skrinGB = new Image("graphic/menu/skrin1.png");
        g.drawImage(skrinGB, 0, 0);
        //Okna skilli i char info
        Image menuW = new Image("graphic/menu/CharInfandSkills.png");
        g.drawImage(menuW, 0, 0);
        
        Image warriorChar = new Image("graphic/heroSprite/warrior_small.png");
        g.drawImage(warriorChar, 780, 200);
        
        Image levelBar = new Image("graphic/heroSprite/LevelStatic.png");
        g.drawImage(levelBar, 670, 505);
        
        printLabel.drawString(100, 10, mouse);

        printLabel.drawString(313, 162, "Siła    Umysł  Obrona  Magia");
        printLabel.drawString(380, 585, "Powrót do gry");
        g.drawRoundRect(370, 575, 190, 30, 6);

        printLabel.drawString(390, 100, "Umiejętności");
        printLabel.drawString(800, 100, "Info");
        printLabel.drawString(700, 575, "CharacterInfo & Skills");
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        int xpos = Mouse.getX();
        int ypos = Mouse.getY();
        mouse = "x= " + xpos + " y=" + ypos;

        //powrót do menu
        if ((xpos > 370 && xpos < 551) && (ypos > 114 && ypos < 143)) {
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
