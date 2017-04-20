package core;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class Main extends StateBasedGame {

    public static final String GAMENAME = "Legendary Adventure - Alpha 4.0";
    
    public static final int WIDTH = 1280;
    public static final int HEIGHT = 720;
    
    public static final int MENU = 0;
    public static final int PLAY = 1;
    public static final int OPTIONS = 2;
    public static final int CHARACTER = 3;
    public static final int BAG = 4;
    public static final int QUESTS = 5;
    public static final int SKILLS = 6;
    public static final int MAP = 7;
    public static final int CREDITS = 8;
    public static final int PAUSE = 9;
    public static final int NEWGAME = 10;
    public static final int LOADGAME = 11;
    public static final int SAVEGAME = 12;
    public static final int FIGHT = 13;
    public static final int CREATE = 14;

    public Main() {
        super(GAMENAME);
        this.addState(new states.MenuState(MENU));
        this.addState(new states.PlayState(PLAY));
        this.addState(new states.OptionsState(OPTIONS));
        this.addState(new states.CharacterState(CHARACTER));
        this.addState(new states.BagState(BAG));
        this.addState(new states.QuestsState(QUESTS));
        this.addState(new states.SkillsState(SKILLS));
        this.addState(new states.MapState(MAP));
        this.addState(new states.CreditsState(CREDITS));
        this.addState(new states.PauseState(PAUSE));
        this.addState(new states.NewGameState(NEWGAME));
        this.addState(new states.LoadGameState(LOADGAME));
        this.addState(new states.SaveState(SAVEGAME));
        this.addState(new states.FightState(FIGHT));
        this.addState(new states.CreateState(CREATE));
    }

    @Override
    public void initStatesList(GameContainer gc) throws SlickException {
        enterState(MENU);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer window = new AppGameContainer(new Main());
            window.setDisplayMode(WIDTH, HEIGHT, false);
            window.setTargetFrameRate(100);
            window.setShowFPS(false);
            window.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}
