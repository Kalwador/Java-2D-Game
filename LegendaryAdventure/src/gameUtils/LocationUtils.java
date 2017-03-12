package gameUtils;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class LocationUtils {

    private static String[] lokalization = {
        "Dom na Farmie",
        "Rodzinna Farma",
        "Przejscie przez Las",
        "Miasto",
        "Farma Gunara",
        "Tartak",
        "Cmentarz pod miastem",
        "Wies"
    };

    public static String getLokalization(int index) {
        switch (index) {
            case 100:
                return lokalization[0];
            case 101:
                return lokalization[1];
            case 102:
                return lokalization[1];
            case 103:
                return lokalization[2];
            case 104:
                return lokalization[3];
            case 105:
                return lokalization[4];
            case 106:
                return lokalization[5];
            case 107:
                return lokalization[6];
            case 108:
                return lokalization[7];
        }
        return "Brak lokalizacji";
    }

    public Image getFightCanvas(int index) {
        String path = "graphic/fightCanvas/";
        try {
            switch (index) {
                case 100:
                    return new Image(path + "canvas1.png");
                case 101:
                    return new Image(path + "canvas1.png");
                case 102:
                    return new Image(path + "canvas1.png");
                case 103:
                    return new Image(path + "canvas1.png");
                case 104:
                    return new Image(path + "canvas1.png");
                case 105:
                    return new Image(path + "canvas1.png");
                case 106:
                    return new Image(path + "canvas1.png");
                case 107:
                    return new Image(path + "canvas1.png");
                case 108:
                    return new Image(path + "canvas1.png");
            }
        } catch (SlickException ex) {
            System.out.println("FIGHT CANVAS NOT FOUND");
        }
        return null;
    }
}
