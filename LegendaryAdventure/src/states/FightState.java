package states;

import core.Camera;
import core.GameStatus;
import core.Sprite;
import gameUtils.LocationName;
import hud.Hud;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import gameUtils.UseSkill;
import gameUtils.LoadSkills;

public class FightState extends BasicGameState {

    public static LoadSkills skills = new LoadSkills();
    public static UseSkill usage;
    public static boolean tura = false;
    public static int licznik;
    public int tempLicznik;
    public static int[] cooldown = {0, 0, 0, 0, 0, 0};

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
        skills.ladujSkille();
        licznik = 0;
        //core.GameStatus.enemy.tempEnemyHealth = 0;
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
            fight(1);
        }
        if (input.isKeyPressed(Input.KEY_2)) {
            fight(2);
        }
        if (input.isKeyPressed(Input.KEY_3)) {
            fight(3);
        }
        if (input.isKeyPressed(Input.KEY_4)) {
            fight(4);
        }
        if (input.isKeyPressed(Input.KEY_5)) {
            fight(5);
        }
        if (input.isKeyPressed(Input.KEY_6)) {
            fight(6);
        }
        if (core.GameStatus.enemy.tempEnemyHealth <= -100 || core.GameStatus.hero.tempHeroHealth <= 0) { //!zdrowie enemy kiedy ma sie konczyc walka
            sbg.enterState(1);
        }

    }

    public FightState(int state) {
    }

    public void fight(int keyNr) { //hey nr -1
        String tar = gameUtils.LoadSkills.getSkill(keyNr).getTarget();
        keyNr -= 1;

        if (cooldown[keyNr] <= 0) {

            if (tempLicznik <= licznik) {
                tempLicznik = licznik + gameUtils.LoadSkills.getSkill(keyNr).getStun();
            }
            usage.use(tar, keyNr);
            System.out.println("Tura numer " + licznik);
            System.out.println("Temp licznik " + tempLicznik);
            if (tempLicznik == licznik) {
                if (UseSkill.tura == false) {
                    UseSkill.mobUse(10, 50);
                    UseSkill.tura = false;
                    System.out.println("____________");
                    System.out.println("Zwykly atak wroga");
                }
            }
            licznik++;
            cooldown[keyNr] = gameUtils.LoadSkills.getSkill(keyNr).getCooldown();
            System.out.println("Przypisano cooldown " + cooldown[keyNr]);
        } else {
            System.out.println("Umiejetnosc jest odnawiana jeszcze przez " + cooldown[keyNr] + "tur");
            //cooldown[keyNr]++;
            cooldown[0]++;
            cooldown[1]++;
            cooldown[2]++;
            cooldown[3]++;
            cooldown[4]++;
            cooldown[5]++;
        }
        //cooldown[keyNr]--;
        cooldown[0]--;
        cooldown[1]--;
        cooldown[2]--;
        cooldown[3]--;
        cooldown[4]--;
        cooldown[5]--;
        System.out.println("Cooldown wynosi aktualnie " + cooldown[keyNr]);
        System.out.println(cooldown[0]);
        System.out.println(cooldown[1]);
        System.out.println(cooldown[2]);
        System.out.println(cooldown[3]);
        System.out.println(cooldown[4]);
        System.out.println(cooldown[5]);
    }

    @Override
    public int getID() {
        return 13;
    }
}
