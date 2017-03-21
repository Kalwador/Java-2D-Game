package states;

import core.Camera;
import core.GameStatus;
import core.Sprite;
import gameUtils.LocationName;
import hud.Hud;
import javafx.event.Event;
import model.Enemy;
import model.Hero;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import model.Usage;
import model.LadujSkille;

public class FightState extends BasicGameState {

    public static LadujSkille laduj = new LadujSkille();
    public static Usage usage;
    public static boolean tura = false;
    public static int licznik;
    public int tempLicznik;

    Image fightCanvas;
    /**
     * Kamera obsługująca pole widzenia na ekranie
     */
    Camera camera;
    /**
     * Meta dane gry
     */
    GameStatus gs;

    /**
     * Zdarzenia w oknie gry
     */
    private actor.Event event;

    /**
     * Paski boczne i ich obsługa
     */
    private Hud hud;
    Sprite sprite;

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        laduj.ladujSkille();
        licznik=0;
        tempLicznik=-1;
        Enemy.tempEnemyHealth=0;
        gs = new GameStatus();
        hud = new Hud();
        event = new actor.Event(gs.sprite);
        fightCanvas = new Image("graphic/fightCanvas/101.jpg");
        fightCanvas = LocationName.getFightCanvas(100);
        event = new actor.Event(gs.sprite);
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        fightCanvas.draw(((gc.getWidth() / 2) - (fightCanvas.getWidth() / 2)), 0);
        hud.render(gc, g, camera, gs);
        gs.sprite.movingUp.draw(640, 400, gs.sprite.heroWidth * 3, gs.sprite.heroHeight * 3);
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int i) throws SlickException {
        Input input = gc.getInput();
        if (input.isKeyPressed(Input.KEY_ESCAPE) || input.isKeyPressed(Input.KEY_Y)) {
            sbg.enterState(1);
        }

        int xPos = Mouse.getX();
        int yPos = Mouse.getY();
        /**
         * update hud
         */
        hud.update(gc, sbg, gs, input, xPos, yPos);

        /**
         * Obsługa wszystkich wydarzeń w oknie gry
         */
        event.update(gc, sbg, i, gs, input, xPos, yPos);

        //--WALKA--
        //if (input.isKeyPressed(Input.KEY_1)||(input.isKeyPressed(Input.KEY_2))||(input.isKeyPressed(Input.KEY_3))||(input.isKeyPressed(Input.KEY_4))||(input.isKeyPressed(Input.KEY_5))||(input.isKeyPressed(Input.KEY_6))){
        
            if (input.isKeyPressed(Input.KEY_1)) {
                fight(0);
            }
            if (input.isKeyPressed(Input.KEY_2)) {
                fight(1);
            }
            if (input.isKeyPressed(Input.KEY_3)) {
                fight(2);
            }
            if (input.isKeyPressed(Input.KEY_4)) {
                fight(3);
            }
            if (input.isKeyPressed(Input.KEY_5)) {
                fight(4);
            }
            if (input.isKeyPressed(Input.KEY_6)) {
                fight(5);
            }
            if(Enemy.tempEnemyHealth<=-20||Hero.tempHeroHealth<=0){
            sbg.enterState(1);
            }
        
        
    }

    public FightState(int state) {
    }

    public void fight(int keyNr) {
        String tar = model.LadujSkille.getSkill(keyNr).getTarget();
       
        if(tempLicznik<=licznik){
            tempLicznik = licznik + model.LadujSkille.getSkill(keyNr).getStun();
        }
        usage.use(tar, keyNr);
        System.out.println("Tura numer " + licznik);
        System.out.println("Temp licznik " + tempLicznik);
        if (tempLicznik == licznik) {
            if (Usage.tura == false) {
                Usage.mobUse(10, 50);
                Usage.tura = false;
                System.out.println("____________");
                System.out.println("Zwykly atak wroga");
            }
        }
        licznik++;
        
    }

    @Override
    public int getID() {
        return 13;
    }

}
