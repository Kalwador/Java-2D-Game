package hud;

import core.GameStatus;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Frame {

    public GameStatus gs;
    public GameContainer gc;

    //grafiki
    public static Image mainFrame, dialogWindow;

    //napis w oknie dialogowym
    public static String npcMessage;

    public Frame() throws SlickException {
        mainFrame = new Image("graphic/menu/hud.png");
    }

    public void render(Graphics g) throws SlickException {
        g.drawImage(mainFrame, 0, 0);
    }
}
