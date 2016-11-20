package core;


import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame {

    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    
    public static final String gameName = "Projekt Gry 2D";
    public static final int menu = 0;
    public static final int play = 1;
    public static final int options = 2;
    public static final int character = 3;
    public static final int bag = 4;
    public static final int quests = 5;
    public static final int skills = 6;
    public static final int map = 7;
    
    
    public Main() {

        super(gameName);
        this.addState(new states.MenuState(menu));
        this.addState(new states.PlayState(play));
        this.addState(new states.OptionsState(options));
        this.addState(new states.CharacterState(character));
        this.addState(new states.BagState(bag));
        this.addState(new states.QuestsState(quests));
        this.addState(new states.SkillsState(skills));
        this.addState(new states.MapState(map));
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        enterState(play);
        this.getState(menu).init(gc, this);
        this.getState(play).init(gc, this);
        this.getState(options).init(gc, this);
        this.getState(character).init(gc, this);
        this.getState(bag).init(gc, this);
        this.getState(quests).init(gc, this);
        this.getState(skills).init(gc, this);
        this.getState(map).init(gc, this);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer window = new AppGameContainer(new Main());
            window.setDisplayMode(WIDTH, HEIGHT, false);
            window.setTargetFrameRate(100);
            window.setShowFPS(false); 
            window.setVSync(true);
            window.setMaximumLogicUpdateInterval(10);
            window.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
