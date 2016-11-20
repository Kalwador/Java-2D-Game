package core;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import status.Hero;
import entities.Npc;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class GameStatus {

    //ID obszaru na mapie całego świata na którym znajduje się obecnie gracz
    public static int levelID;
    public TiledMap map;
    
    //ilość npc i mobów na mapie
    public int npcNumber;
    public int enemyNumber;    
    
    //dane o bohaterze jego statystyki
    public status.Hero hero;

    //zawartośc plecaka
    public ArrayList<status.Bag> bag;

    //skille postaci
    public ArrayList<status.Skills> skills;

    //questy
    public ArrayList<status.Quest> quest;
    
    //bramy na mapie - gate
    //public ArrayList<Vector2d> gate;
    
    //aktualni npc na mapie
    public ArrayList<entities.Npc> npc;

    //aktualne moby na mapie
    public ArrayList<entities.Enemy> enemy;

    //pozycja postaci
    public int x, y;

    //wykania się tylko przy utworzeniu nowej gry
    public GameStatus() throws SlickException {
        //usawienie pozycji startu gry
        this.levelID = 101;
        map = new TiledMap("res/map/" + Integer.toString(levelID) + ".tmx");
        
        this.x = 80 * 32;
        this.y = 80 * 32;
        //czysty bohater
        this.hero = new Hero();
        this.bag = new ArrayList<>();
        this.quest = new ArrayList<>();
        this.skills = new ArrayList<>();

        //na pierwszej mapie nie ma mobów czy npc - więc kolekcje puste
        this.npc = new ArrayList<entities.Npc>();
        this.enemy = new ArrayList<entities.Enemy>();
    }

    //wywoła się przy WCZYTANIU GRY  - NIEDOKOŃCZONE
    public GameStatus(int levelID, int x, int y, status.Hero hero, status.Bag bag) throws SlickException {
        
        //ładowanie lokalizacji
        GameStatus.levelID = levelID;
        this.x = x;
        this.y = y;
        map = new TiledMap("res/map/" + Integer.toString(levelID) + ".tmx", null);

        //ładowanie statystyk bohatera
        this.hero = hero;

        //ładowanie statusu bohatera -niedokończone
        this.bag = new ArrayList<status.Bag>();
        this.quest = new ArrayList<>();
        this.skills = new ArrayList<>();

        //ładowanie wypełnienia mapy  -niedokończone
        this.npc = new ArrayList<>();
        this.enemy = new ArrayList<>();
        
    }

    public void updateGameStatus(int levelID) throws SlickException {
        GameStatus.levelID = levelID;
        this.map = new TiledMap("res/map/" + Integer.toString(levelID) + ".tmx");
        
        //aktualizajca kolekcji npc i enemy
        updateNPC();
        //i update enemy
    }
    
    public void updateNPC(){
        
        //wymazanie starej kolekcji i zastąpienie czystą 
        this.npc = new ArrayList<entities.Npc>();
        FileReader strWej;
        
        try {
            strWej = new FileReader("pociag.txt");
            BufferedReader bufor = new BufferedReader(strWej);
        
            String linia;
        
            while((linia=bufor.readLine())!=null){
                String[] pola=linia.split(";");
                
                String[] dialog = new String[10];
                
                for(int i=0;i<10;i++){
                    dialog[i] = pola[i];
                }
                
                //Npc localNPC = new Npc(Integer.parseInt(pola[0]),Integer.parseInt(pola[1]),dialog);
                //this.npc.add(localNPC);
            }
                
            strWej.close();
            
            } catch (FileNotFoundException w1) {
            System.out.println("Plik nie znaleziony.");
            } catch (IOException w2) {
                System.out.println("Bład odczytu");
            }catch (NumberFormatException w3){
                System.out.println("Bledny format liczby");
            } 
   
    }
/*
    Metoda zlicza liczbę npc lub mobów na danej mapie, 
    poprzez parametr i, który oznacza:
    1 - zlicza npc
    2 - zlicza moby
*/
    public int lineNumber(int id){
        int liczbaNPC = 0;
        String Dpath = "";
        if (id == 1) {Dpath = "res/NPCdialogs/";}
        if (id == 2) {Dpath = "res/enemy/";}
    
        try {
            String path = Dpath + Integer.toString(levelID)+ ".txt";
            FileReader strWe = new FileReader(path);
            BufferedReader bufor = new BufferedReader(strWe);
            while (bufor.readLine() != null) {
                liczbaNPC++;
            }
            strWe.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return liczbaNPC;
    }
    //metoda do robienia screenów gry
    private void makeScreen() {
        try {
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            System.out.println(screenRect.height + " " + screenRect.width + " " + screenRect.x + " " + screenRect.y);

            double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
            double mouseY = MouseInfo.getPointerInfo().getLocation().getY();

            Rectangle GAMEscreenRect = new Rectangle((int) mouseX, (int) mouseY, 1280, 720);

            BufferedImage capture = new Robot().createScreenCapture(GAMEscreenRect);
            ImageIO.write(capture, "png", new File("skrin.png"));
        } catch (AWTException aWTException) {
        } catch (IOException iOException) {
        }
    }
}
