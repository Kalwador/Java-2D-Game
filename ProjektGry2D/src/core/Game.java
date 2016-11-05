package core;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Game extends StateBasedGame {

    public static final String gamename = "Projekt Gry 2D";
    public static final int menu = 0;
    public static final int play = 1;
    public static final int options = 2;
//    public static final int character = 3;
//    public static final int bag = 4;
//    public static final int quests = 5;
//    public static final int skills = 6;
//    public static final int map = 7;

    public Game(String gamename) {
        super(gamename);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
        this.addState(new Options(options));
//        this.addState(new Character(character));
//        this.addState(new Bag(bag));
//        this.addState(new Quests(quests));
//        this.addState(new Skills(skills));
//        this.addState(new Map(map));
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        this.enterState(play);
        this.getState(menu).init(gc, this);
        this.getState(play).init(gc, this);
        this.getState(options).init(gc, this);
//        this.getState(character).init(gc, this);
//        this.getState(bag).init(gc, this);
//        this.getState(quests).init(gc, this);
//        this.getState(skills).init(gc, this);
//        this.getState(map).init(gc, this);

    }

    public static void main(String[] args) {
        try {
            //AppGameContainer window = new AppGameContainer(new MainLoop());
            AppGameContainer window = new AppGameContainer(new Game(gamename));
            window.setDisplayMode(1600, 800, false);
            window.setTargetFrameRate(150);
            window.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}