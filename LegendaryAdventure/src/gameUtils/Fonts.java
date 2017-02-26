package gameUtils;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import org.newdawn.slick.TrueTypeFont;

public class Fonts {

    public Font font;
    private static TrueTypeFont printHead;
    private static TrueTypeFont printLabel;
    private static TrueTypeFont printBig;
    private static TrueTypeFont printBigLogo;
    private static TrueTypeFont printMediumLogo;

    public Fonts() {
        char tabc[] = {'ą', 'ę', 'ó', 'ć', 'ż', 'ł', 'ś', 'ź', 'ń', 'Ł', 'Ó','Ś','Ę',};
        try {
            //Utworzenie czcionki
            font = Font.createFont(Font.TRUETYPE_FONT, new File("res/fonts/TrajanPro-Regular.otf"));
            //font = font.deriveFont(Font.BOLD, 48f);
        } catch (FontFormatException fe) {
            System.out.println("FONT - FontFormatException");
        } catch (IOException ioe) {
            System.out.println("FILE - IOException");
        }
        
        //stworzenie zmiennej printLabel i printHead, ustalenie parametrów czcionki
        printLabel = new TrueTypeFont(font.deriveFont(Font.BOLD, 18f), true, tabc);
        printHead = new TrueTypeFont(font.deriveFont(Font.BOLD, 28f), true, tabc);
        printBig = new TrueTypeFont(font.deriveFont(Font.BOLD, 25f), true, tabc);
        printMediumLogo = new TrueTypeFont(font.deriveFont(Font.BOLD, 46f), true, tabc);
        printBigLogo = new TrueTypeFont(font.deriveFont(Font.BOLD, 78f), true, tabc);
    }
    
    public static TrueTypeFont print18() {
        return printLabel;
    }

    public static TrueTypeFont print28() {
        return printHead;
    }
    
    public static TrueTypeFont print25() {
        return printBig;
    }
    
    public static TrueTypeFont print46() {
        return printMediumLogo;
    }
    
    public static TrueTypeFont print78() {
        return printBigLogo;
    }
}