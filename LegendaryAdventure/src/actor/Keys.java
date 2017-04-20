package actor;

import hud.Console;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

public class Keys {

    /**
     * Klasa dostarczająca obsługę przycisków dla różych scen w takcie gry
     *
     * @param gc GameContainer - meta dane gry
     * @param sbg StateBasedGame - informacje o scenach gry
     * @param input Input - kontroler klawiatury
     * @param xpos wspórzędna X pozycji gracza na mapie, przechowywana w
     * @param ypos wspórzędna Y pozycji gracza na mapie
     */
    //obsługa klawiszy funkcyjnych
    public static void functionalKeyHandler(GameContainer gc, StateBasedGame sbg, Input input, int xpos, int ypos) {
        
        xpos = input.getMouseX();
        ypos = input.getMouseY();

        if (input.isKeyPressed(Input.KEY_ESCAPE)) {
            switch (sbg.getCurrentStateID()) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    screenBlur.ScreenClass.makeScreen(xpos, ypos);
                    sbg.enterState(9);
                    break;
                }
                default: {
                    sbg.enterState(1);
                    break;
                }
            }
        }
        //character info
        if (input.isKeyPressed(Input.KEY_C)) {
            if (sbg.getCurrentStateID() == 3) {
                sbg.enterState(1);
            } else {
                screenBlur.ScreenClass.makeScreen(xpos, ypos);
                sbg.enterState(3);
            }
        }
        //plecak
        if ((input.isKeyPressed(Input.KEY_B)) || (input.isKeyPressed(Input.KEY_TAB)) || (input.isKeyPressed(Input.KEY_I))) {
            if (sbg.getCurrentStateID() == 4) {
                sbg.enterState(1);
            } else {
                screenBlur.ScreenClass.makeScreen(xpos, ypos);
                sbg.enterState(4);
            }
        }
        //okno questów 
        if ((input.isKeyPressed(Input.KEY_Q)) || (input.isKeyPressed(Input.KEY_L))) {
            if (sbg.getCurrentStateID() == 5) {
                sbg.enterState(1);
            } else {
                screenBlur.ScreenClass.makeScreen(xpos, ypos);
                sbg.enterState(5);
            }
        }

        //okno skili
        if (input.isKeyPressed(Input.KEY_K)) {
            if (sbg.getCurrentStateID() == 6) {
                sbg.enterState(1);
            } else {
                screenBlur.ScreenClass.makeScreen(xpos, ypos);
                sbg.enterState(6);
            }
        }
        //okno mapy
        if (input.isKeyPressed(Input.KEY_M)) {
            if (sbg.getCurrentStateID() == 7) {
                sbg.enterState(1);
            } else {
                sbg.enterState(7);
            }
        }
        //okno zapisu gry
        if (input.isKeyPressed(Input.KEY_Z)) {
            if (sbg.getCurrentStateID() == 12) {
                sbg.enterState(1);
            } else {
                screenBlur.ScreenClass.makeScreen(xpos, ypos);
                sbg.enterState(12);
            }
        }
        //okno pauzy
        if (input.isKeyPressed(Input.KEY_P)) {
            if (sbg.getCurrentStateID() == 9) {
                sbg.enterState(1);
            } else {
                screenBlur.ScreenClass.makeScreen(xpos, ypos);
                sbg.enterState(9);
            }
        }
        //konsola
        if (input.isKeyPressed(Input.KEY_GRAVE)) {
            Console.showConsole();
        }
        if (input.isKeyPressed(Input.KEY_F1)) {
            Console.consoleF1();
        }
        if (input.isKeyPressed(Input.KEY_F2)) {
            Console.consoleF2();
        }
        if (input.isKeyPressed(Input.KEY_F3)) {
            Console.consoleF3();
        }
        if (input.isKeyPressed(Input.KEY_F4)) {
            Console.consoleF4();
        }
        if (input.isKeyPressed(Input.KEY_F5)) {
            Console.consoleF5();
        }
    }
}
