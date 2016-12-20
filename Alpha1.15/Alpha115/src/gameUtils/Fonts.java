package gameUtils;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.TrueTypeFont;

public class Fonts {

    public Font font;
    public static TrueTypeFont printHead;
    public static TrueTypeFont printLabel;

    public Fonts() {
        char tabc[] = {'ą', 'ę', 'ó', 'ć', 'ż', 'ł', 'ś', 'ź', 'ń', 'Ł', 'Ó'};
        try {
            //Utworzenie czcionki
            font = Font.createFont(Font.TRUETYPE_FONT, new File("res/fonts/TrajanPro-Regular.otf"));
            //font = font.deriveFont(Font.BOLD, 48f);
        } catch (FontFormatException fe) {
            System.out.println("X");
        } catch (IOException ioe) {
            System.out.println("Y");
        }
        //stworzenie zmiennej printLabel i printHead, ustalenie parametrów czcionki
        printLabel = new TrueTypeFont(font.deriveFont(Font.BOLD, 18f), true, tabc);
        printHead = new TrueTypeFont(font.deriveFont(Font.BOLD, 28f), true, tabc);
    }

//    public void ttfont() throws SlickException {
//        char tabc[] = {'ą', 'ę', 'ó', 'ć', 'ż', 'ł', 'ś', 'ź', 'ń'};
//        try {
//            //Utworzenie czcionki
//            font = Font.createFont(Font.TRUETYPE_FONT, new File("res/fonts/TrajanPro-Regular.otf"));
//            //font = font.deriveFont(Font.BOLD, 48f);
//        } catch (FontFormatException fe) {
//            System.out.println("X");
//        } catch (IOException ioe) {
//            System.out.println("Y");
//        }
//        //stworzenie zmiennej printLabel, ustalenie parametrów czcionki
//        printLabel = new TrueTypeFont(font.deriveFont(Font.BOLD, 18f), true, tabc);
//        printHead = new TrueTypeFont(font.deriveFont(Font.BOLD, 28f), true, tabc);
//    }
    
    public static TrueTypeFont printf() {
        return printLabel;
    }

    public static TrueTypeFont printfH() {
        return printHead;
    }
}