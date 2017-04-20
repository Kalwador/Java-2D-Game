package states;

import core.Camera;
import core.GameStatus;
import core.Sprite;
import gameUtils.Fonts;
import gameUtils.LocationName;
import hud.Hud;
import java.util.Scanner;
import javafx.event.Event;
import model.Enemy;
import model.Hero;
import model.Usage;
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
import java.lang.Integer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import model.Skill;

public class FightState extends BasicGameState {

    public static ArrayList<Skill> equippedSkills;
    public static ArrayList<Skill> enemyEquippedSkills;
    public static LadujSkille laduj = new LadujSkille();
    public static Usage usage;
    public static boolean tura = false;
    public static int licznik;
    public int tempLicznik, stun_licznik;
    public static int[] cooldown = {0, 0, 0, 0, 0, 0};
    Scanner sc = new Scanner(System.in);
    Integer eqId;
    int idOfUsingSkill;
    public Enemy enemy;

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
        enemy= new Enemy("Orc", 3, 20, 100, 0, 0, 20, 40, 20, 10, 5, 5, 20, 10, 5, 50, "Orc.png");
        laduj.ladujSkille();
        licznik = 0;
        stun_licznik = -1;
        gs = new GameStatus();
        hud = new Hud();
        event = new actor.Event(gs.sprite);
        fightCanvas = new Image("graphic/fightCanvas/101.jpg");
        fightCanvas = LocationName.getFightCanvas(100);
        
        
        event = new actor.Event(gs.sprite);
        eqId = 0;
        idOfUsingSkill = 0;
        equippedSkills = new ArrayList<Skill>();
        equippedSkills.add(LadujSkille.getSkill(5));
        equippedSkills.add(LadujSkille.skills.get(4));
        equippedSkills.add(LadujSkille.skills.get(3));
        equippedSkills.add(LadujSkille.skills.get(2));
        equippedSkills.add(LadujSkille.skills.get(1));
        equippedSkills.add(LadujSkille.skills.get(0));
        enemyEquippedSkills = new ArrayList<Skill>();
        enemyEquippedSkills.add(LadujSkille.skills.get(0));
        enemyEquippedSkills.add(LadujSkille.skills.get(1));
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        fightCanvas.draw(((gc.getWidth() / 2) - (fightCanvas.getWidth() / 2)), 0);
        hud.render(gc, g, camera, gs);
        gs.sprite.movingUp.draw(640, 400, gs.sprite.heroWidth * 3, gs.sprite.heroHeight * 3);

        if (model.Hero.tempHeroHealth <= 0) {
            Fonts.print18().drawString(550, 150, "Zostales pokonany");
        }
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
//        if(LadujSkille.equippedSkills.isEmpty()) {
//            while(LadujSkille.equippedSkills.size() < 6) {
//                System.out.println("Podaj numer umiejetnosci do przydzielenia");
//                eqId = sc.nextInt();
//                eqId--;
//                LadujSkille.equippedSkills.add(LadujSkille.getSkill(eqId));
//                System.out.println("Wybrano skill: " + LadujSkille.getSkill(eqId).getNazwa());
//                //System.out.println("w equipped skill: " + LadujSkille.equippedSkills.get(eqId).getNazwa());
//                //System.out.println("w equipped skill_id: " + LadujSkille.equippedSkills.get(eqId).getId_skill());
//            }
//        } //działa
//        
//        for (int j = 0; j < LadujSkille.equippedSkills.size()-1; j++) {
//            System.out.println("w equipped skill: " + LadujSkille.equippedSkills.get(j).getNazwa());
//        }
        //equippedSkills.add();
//        Collections.swap(LadujSkille.skills, 0, 5);
//        Collections.swap(LadujSkille.skills, 1, 4);
//        Collections.swap(LadujSkille.skills, 2, 3);
        //Collections.unmodifiableList(LadujSkille.skills);
        //potem dodanie i test dzialania ikon skilli
        //nastepnie z szymkiem zrobic gui wyboru skilli (fajnie by bylo przez przeciaganie ikonek)
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
        if (enemy.tempEnemyHealth <= 0 || Hero.tempHeroHealth <= 0) { //!zdrowie enemy kiedy ma sie konczyc walka
            sbg.enterState(1);
        }

    }

    public FightState(int state) {
    }

    public void fight(int keyNr) {
        keyNr -= 1;
        keyNr = equippedSkills.get(keyNr).getId_skill() - 1001; //obiekty
        int nrKey = equippedSkills.get(keyNr).getId_skill() - 1001; //macierz
        System.out.println("keyNr: " + keyNr);
        System.out.println("nrKey: " + nrKey);
        System.out.println("get_id_skill: " + equippedSkills.get(nrKey).getId_skill());
        System.out.println("getNazwa: " + equippedSkills.get(nrKey).getNazwa());
        System.out.println("get_Dmg: " + equippedSkills.get(nrKey).getDmg());
        System.out.println("get_Mana: " + equippedSkills.get(nrKey).getMana());
        System.out.println("get_Stun: " + equippedSkills.get(nrKey).getStun());
        System.out.println("_____________________________________________________________________");
        System.out.println("");
        String tar = equippedSkills.get(keyNr).getTarget();

        if (cooldown[nrKey] <= 0) {

            if (tempLicznik <= licznik) {
                tempLicznik = licznik + equippedSkills.get(keyNr).getStun();
            }
            usage.use(tar, keyNr);  //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            //Usage.usee("Enemy", nrKey);
            System.out.println("Tura numer " + licznik);
            System.out.println("Temp licznik " + tempLicznik);
//            if (tempLicznik == licznik) {  //enemy attack
//                if (Usage.tura == false) {
//                    Usage.tura = false;
//                    int enemyDmg = Usage.mobUse(2, 10);
//                    System.out.println("Wrog zaatakowal: " + enemyDmg);
//                    Hero.tempHeroHealth -= enemyDmg;
//                    System.out.println("Hero hp: " + Hero.tempHeroHealth);
//                }
//            } //enemy attack end
            licznik++;
            cooldown[nrKey] = equippedSkills.get(nrKey).getCooldown();
            System.out.println("Przypisano cooldown " + cooldown[nrKey]);
        } else {
            System.out.println("Umiejetnosc jest odnawiana jeszcze przez " + cooldown[nrKey] + "tur");
            //cooldown[nrKey]++;
            cooldown[0]++;
            cooldown[1]++;
            cooldown[2]++;
            cooldown[3]++;
            cooldown[4]++;
            cooldown[5]++;
        }
        //cooldown[nrKey]--;
        cooldown[0]--;
        cooldown[1]--;
        cooldown[2]--;
        cooldown[3]--;
        cooldown[4]--;
        cooldown[5]--;
        System.out.println("Cooldown wynosi aktualnie " + cooldown[nrKey]);
        System.out.println(cooldown[0]);
        System.out.println(cooldown[1]);
        System.out.println(cooldown[2]);
        System.out.println(cooldown[3]);
        System.out.println(cooldown[4]);
        System.out.println(cooldown[5]);

        if (model.Hero.tempHeroHealth <= 0) {
            System.out.println("Zostales pokonany");
        }

        //atak wroga
        stun_licznik += model.LadujSkille.getSkill(keyNr).getStun() ;
        if(stun_licznik == -1) {
//            int enemyDmg = Usage.mobUse(2, 10);
//            System.out.println("Wrog zaatakowal: " + enemyDmg);
//            Hero.tempHeroHealth -= enemyDmg;
//            System.out.println("Hero hp: " + Hero.tempHeroHealth);
            String tar2 = LadujSkille.skills.get(1).getTarget();
            System.out.println("Enemy mana: " + enemy.tempEnemyMana);
            usage.enemyUse(tar2, LadujSkille.skills.get(1).getId_skill() - 1001);
        }
        else {
            System.out.println("Stun licznik: " + stun_licznik);
            stun_licznik -=1;
            
        }

        System.out.println("koniec tury " + (licznik));
        System.out.println("");
    } //end fight
    //zrobic ataki enemy w osobnej metodzie

    @Override
    public int getID() {
        return 13;
    }

    
    
    
}

//        //atak wroga
//        stun_licznik += model.LadujSkille.getSkill(keyNr).getStun() ;
//        if(stun_licznik == -1) {
//            int enemyDmg = Usage.mobUse(2, 10);
//            System.out.println("Wrog zaatakowal: " + enemyDmg);
//            Hero.tempHeroHealth -= enemyDmg;
//            System.out.println("Hero hp: " + Hero.tempHeroHealth);
//        }
//        else {
//            System.out.println("Stun licznik: " + stun_licznik);
//            stun_licznik -=1;
//            
//        }

