package core;

import model.Hero;
import java.util.ArrayList;
import java.util.HashMap;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class GameStatus extends core.LoadEntity {
    /**
     * Czy muzyka włączona
     */
    public static boolean musicOn;
    
    /**
     * levelID ID obszaru na którym znajduje się obecnie gracz
     */
    public static int levelID;
    public TiledMap map;
    public String mapPath;
    public static int x, y;
    public static int money;

    /**
     * Dane o bohaterze, jego statystyki, wygląd, rasa itd
     */
    public static int spriteNumber;
    public static Sprite sprite;
    public static model.Hero hero;
    /**
     * status postaci
     */
    public static HashMap<Integer, model.Item> itemsInBag;
    public static HashMap<Integer, model.Equip> equipInBag;
    public static ArrayList<model.Skill> skills;
    public static ArrayList<model.Quest> quest;
    /**
     * dane o entity
     */
    LoadEntity loadEntity;
    /**
     * Cząsteczki/Entities na mapie
     */
    public ArrayList<model.Npc> npc;
    public ArrayList<model.Enemy> enemy;
    public ArrayList<model.Item> loot;
    public ArrayList<model.Portal> portalMapList;
    /**
     *
     */
    public static HashMap<Integer, model.Item> itemsInGame;
    public static HashMap<Integer, model.Equip> equipInGame;
    public static HashMap<Integer, model.Skill> skillsInGame;

    //wykania się tylko przy utworzeniu nowej gry
    public GameStatus() throws SlickException {
        musicOn = true;
        
        //ustawianie pozycji startu gry
        this.levelID = 100;
        mapPath = "graphic/map/" + Integer.toString(levelID) + ".tmx";
        map = new TiledMap(mapPath);
        
        spriteNumber = 1;
        
        this.sprite = new Sprite();

        this.x = 238;
        this.y = 200;
        
        //czysty bohater
        this.hero = new Hero();
        this.itemsInBag = new HashMap<>();
        this.equipInBag = new HashMap<>();
        this.itemsInGame = new HashMap<>();
        this.equipInGame = new HashMap<>();
        this.quest = new ArrayList<>();
        this.skills = new ArrayList<>();
        
        this.money = 0;

        //na pierwszej mapie nie ma mobów czy npc - więc kolekcje puste
        this.npc = new ArrayList<model.Npc>();
        this.enemy = new ArrayList<model.Enemy>();
        this.loot = new ArrayList<model.Item>();
        this.portalMapList = new ArrayList<model.Portal>();

        //wczytanie danych o mapie
        updateEntityFieldList(map);
        updatePortalMapList(portalMapList);
        loadAllItemsInGame(itemsInGame);
        loadAllEquipInGame(equipInGame);
    }
}
