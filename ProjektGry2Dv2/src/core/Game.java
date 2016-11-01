/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
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
    public static final int pause = 2;

    public Game(String gamename) {
        super(gamename);
        this.addState(new Menu(menu));
        this.addState(new Play(play));
        this.addState(new Pause(pause));
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        this.getState(menu).init(gc, this);
        this.getState(play).init(gc, this);
        this.getState(pause).init(gc, this);
//        this.getState(options).init(gc, this);
//        this.getState(character).init(gc, this);
//        this.getState(bag).init(gc, this);
//        this.getState(quest).init(gc, this);
//        this.getState(skills).init(gc, this);
//        this.getState(map).init(gc, this);
        this.enterState(menu);
    }

    public static void main(String[] args) {
        try {
            //AppGameContainer window = new AppGameContainer(new MainLoop());
            AppGameContainer window = new AppGameContainer(new Game(gamename));
            window.setDisplayMode(1100, 800, false);
            window.setTargetFrameRate(150);
            window.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }

}
