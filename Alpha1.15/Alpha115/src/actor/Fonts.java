/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actor;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
public class Fonts {
    
    Font font;
    public TrueTypeFont printLabel;
    
    public void ttfont() throws SlickException{
        char tabc[] = {'ą', 'ę', 'ó', 'ć', 'ż', 'ł', 'ś', 'ź', 'ń'};
        try {
            //Utworzenie czcionki
            font = Font.createFont(Font.TRUETYPE_FONT, new File("res/fonts/TrajanPro-Regular.otf"));
            //font = font.deriveFont(Font.BOLD, 48f);
        } catch (FontFormatException fe) {
            System.out.println("X");
        } catch (IOException ioe) {
            System.out.println("Y");
        }
        //stworzenie zmiennej printLabel, ustalenie parametrów czcionki
        printLabel = new TrueTypeFont(font.deriveFont(Font.BOLD, 18f), true, tabc);
    }
}
