package core;

import model.Hero;
import java.util.ArrayList;
import model.Npc;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class GameStatus extends core.LoadEntity {

    /**
     * levelID ID obszaru na którym znajduje się obecnie gracz
     */
    public static int levelID;
    public TiledMap map;
    public String mapPath;
    public int x, y;
    
    /**
     * Dane o bohaterze, jego statystyki, wygląd, rasa itd
     */
    public Sprite sprite;
    public model.Hero hero;
    
    /**
     * dane o entity
     */
    LoadEntity loadEntity;
    
    /**
     * status postaci
     */
    public ArrayList<model.Item> item;
    public ArrayList<model.Equip> equip;
    public ArrayList<model.Skill> skills;
    public ArrayList<model.Quest> quest;
    
    /**
     * Cząsteczki/Entities na mapie
     */
    public ArrayList<model.Npc> npc;
    public ArrayList<model.Enemy> enemy;
    public ArrayList<model.Loot> loot;
    public ArrayList<model.Portal> portalMapList;

    //wykania się tylko przy utworzeniu nowej gry
    public GameStatus() throws SlickException {
        
        //ustawianie pozycji startu gry
        this.levelID = 101;
        mapPath = "graphic/map/" + Integer.toString(levelID) + ".tmx";
        map = new TiledMap(mapPath);
        
        this.sprite = new Sprite();
        
        this.x = (91 * 32) + 1;
        this.y = (84 * 32) + 1;
        
        //czysty bohater
        this.hero = new Hero();
        this.item = new ArrayList<>();
        this.equip = new ArrayList<>();
        this.quest = new ArrayList<>();
        this.skills = new ArrayList<>();

        //na pierwszej mapie nie ma mobów czy npc - więc kolekcje puste
        this.npc = new ArrayList<model.Npc>();
        this.enemy = new ArrayList<model.Enemy>();
        this.loot = new ArrayList<model.Loot>();
        this.portalMapList = new ArrayList<model.Portal>();

        //wczytanie danych o mapie
        updateEntityFieldList(map);
        updatePortalMapList2(portalMapList);
    }
    
}
