package core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

public class Play extends BasicGameState {
    
        
        
        
        
        
        

    private TiledMap map;
    private Image img,quest_img;
    GameStatus gs = new GameStatus();
    int[] duration = {200, 200, 200, 200};
    Animation hero, movingUp, movingDown, movingLeft, movingRight;
    double shiftX = gs.x;
    double shiftY = gs.y;
    //zmienne do kolizji
    int layID = 2, tileID = 10;
    
    private Image npc; //obraz + pozycja npc
    int npcX=896;
    int npcY=480;
    //private Image quest_img;
    int layID_npc = 1, tileID_npc = 11;
    private String questTekst=""; //quest-napis

    

    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        map = new TiledMap("Resources/graphics/maps/mapTest.tmx");
        img = new Image("Resources/Graphics/Character/heroTest.png");
        quest_img=new Image("resources/graphics/menus/quest_text_background.png");

        gs.x = 800;
        gs.y = 800;
           
        //npc wyswietlanie na mapie
        npc= new Image("Resources/Graphics/Character/Kobieta4.png");
        Image  stay =npc.getSubImage(0, 0, 48, 48);
        
        Image[] walkDown = {img.getSubImage(0, 0, 48, 48), img.getSubImage(48, 0, 48, 48), img.getSubImage(96, 0, 48, 48), img.getSubImage(144, 0, 48, 48)};
        Image[] walkLeft = {img.getSubImage(0, 48, 48, 48), img.getSubImage(48, 48, 48, 48), img.getSubImage(96, 48, 48, 48), img.getSubImage(144, 48, 48, 48)};
        Image[] walkRight = {img.getSubImage(0, 96, 48, 48), img.getSubImage(48, 96, 48, 48), img.getSubImage(96, 96, 48, 48), img.getSubImage(144, 96, 48, 48)};
        Image[] walkUp = {img.getSubImage(0, 144, 48, 48), img.getSubImage(48, 144, 48, 48), img.getSubImage(96, 144, 48, 48), img.getSubImage(144, 144, 48, 48)};

        movingDown = new Animation(walkDown, duration, false);
        movingLeft = new Animation(walkLeft, duration, false);
        movingRight = new Animation(walkRight, duration, false);
        movingUp = new Animation(walkUp, duration, false);

        hero = movingDown;
        npc=stay; //wyswietlanie npc stojacego twarza w dol
        
        quest_img.setAlpha(0);

    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        //info: tutaj kalkulacje, movement itp
        double oldX = gs.x, oldY = gs.y;
        Input input = gc.getInput();

        //ActionHandler.handlePlay(input, gc, gs, sbg, delta);
        if (input.isKeyDown(Input.KEY_W) || input.isKeyDown(Input.KEY_UP)) {
            hero = movingUp;
            gs.y -= gs.heroSpeed * 0.1f * delta;
        }
        if (input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)) {
            hero = movingDown;
            gs.y += gs.heroSpeed * 0.2f * delta;
            if (gs.y / 32 == 49) {
                gs.y = (int) oldY;
            }
        }
        if (input.isKeyDown(Input.KEY_A) || input.isKeyDown(Input.KEY_LEFT)) {
            hero = movingLeft;
            gs.x -= gs.heroSpeed * 0.1f * delta;
        }
        if (input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)) {
            hero = movingRight;
            gs.x += gs.heroSpeed * 0.2f * delta;
            if (gs.x / 32 == 49) {
                gs.x = (int) oldX;
            }
        }
        if (input.isKeyDown(Input.KEY_ESCAPE)) {
            sbg.enterState(2);
        }
        //wprowadzenie do kolizji -> szymonSanok
        layID = map.getLayerIndex("Objects");
        tileID = map.getTileId((gs.x / 32), (gs.y / 32), layID);
        if (tileID > 0) {

            gs.x = (int) oldX;
            gs.y = (int) oldY;
        }
        
        layID_npc = map.getLayerIndex("Npc");
        tileID_npc = map.getTileId((gs.x / 32), (gs.y / 32), layID_npc);
       
       
       //czy(jak podchopdze do npc to wyswietla sie txt z ramka)
        if(tileID_npc==2740 && input.isKeyPressed(Input.KEY_ENTER)){
            quest_img.setAlpha(100);
             //unfinished
            questTekst=npc_tekst();
        }else
        if(tileID_npc!=2740){
            quest_img.setAlpha(0);
            questTekst="";
        }
        
        
    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        map.render(0, 0, 0, 15, 50, 50);

        //współrzędne -> szymonSanok
        g.drawString("x " + String.valueOf(gs.x/32) + " y " + String.valueOf(gs.y/32), 10f, 30f);
        g.drawString("tileID " + String.valueOf(tileID) + " layID " + String.valueOf(layID), 10f, 60f);
        // mapa skacze, wiem i poprawie to - kalvador :)

        hero.draw(gs.x, gs.y - 496);
        npc.draw(npcX,npcY);
        quest_img.draw(400,680,600,111); //render ramki i tekstu questa
        g.drawString(questTekst,420,700);
        
        //img.draw(GameStatus.x, GameStatus.y, GameStatus.x + 48, GameStatus.y + 48, 0, 0, 48, 48);
        //(startXonWindow,startYonWindow,endXonWindow,endYonWindow,
        //  startXpartOfpicture,startYpartOfpicture,endXpartOfpicture,endYpartOfpicture)

    }

    Play(int mainLoop) {
    }

    public Play() {
    }

    @Override
    public int getID() {
        return 1;
    }
    
    //pobieranie tekstu z pliku txt
    public String npc_tekst() 
    {
        String tekst="";
        try{
            FileReader strWe = new FileReader("src/save/npc1.txt");
            BufferedReader bufor = new BufferedReader(strWe);
            String line=null;
            while((line = bufor.readLine()) != null) {
                tekst+=(line+"\n");
            }
            strWe.close();
        }catch(IOException e){
            e.printStackTrace();
        }
       return tekst;
    }
    
    
    

}