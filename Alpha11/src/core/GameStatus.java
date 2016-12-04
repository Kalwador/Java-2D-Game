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

public class GameStatus extends core.LoadEntity {

    //ID obszaru na mapie całego świata na którym znajduje się obecnie gracz
    public static int levelID;
    public TiledMap map;
    public String mapPath;

    //dane o bohaterze jego statystyki
    public status.Hero hero;

    //dane o entity
    LoadEntity loadEntity;

    //zawartośc plecaka
    public ArrayList<status.Bag> bag;

    //skille postaci
    public ArrayList<status.Skills> skills;

    //questy
    public ArrayList<status.Quest> quest;

    //aktualni npc na mapie
    public ArrayList<entities.Npc> npc;

    //aktualne moby na mapie
    public ArrayList<entities.Enemy> enemy;

    //aktualni npc na mapie
    public ArrayList<entities.Loot> loot;

    //bramy na mapie - portalMapList
    public ArrayList<entities.Portal> portalMapList;

    //pozycja postaci
    public int x, y;

    //wykania się tylko przy utworzeniu nowej gry
    public GameStatus() throws SlickException {
        //usawienie pozycji startu gry
        this.levelID = 101;
        mapPath = "graphic/map/" + Integer.toString(levelID) + ".tmx";
        map = new TiledMap(mapPath);

        this.x = (91 * 32) + 1;
        this.y = (84 * 32) + 1;

        //czysty bohater
        this.hero = new Hero();
        this.bag = new ArrayList<>();
        this.quest = new ArrayList<>();
        this.skills = new ArrayList<>();

        //na pierwszej mapie nie ma mobów czy npc - więc kolekcje puste
        this.npc = new ArrayList<entities.Npc>();
        this.enemy = new ArrayList<entities.Enemy>();
        this.loot = new ArrayList<entities.Loot>();
        this.portalMapList = new ArrayList<entities.Portal>();
        
        //wczytanie danych o mapie
        updateEntityFieldList(map);
        updatePortalMapList(portalMapList);

    }
}
