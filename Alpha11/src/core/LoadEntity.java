package core;

import static core.GameStatus.levelID;
import entities.Portal;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.tiled.TiledMap;

public class LoadEntity {
    
    //do kolizji, eventów, przejść
    int collisionID, npcID, itemID, enemyID, portalID;
    public int collisionTileID, npcTileID, itemTileID, enemyTileID, portalTileID;
    public int testField, testNpc, testItem, testEnemy, testPortal;
    boolean[][] exist;
    public static ArrayList<Rectangle> collisions;
    public static ArrayList<Rectangle> portals;
    public static Rectangle recPlayer, recField;

    public void updateEntityFieldList(TiledMap map) {
        

        for (int i = 5; i < 7; i++) { 
            exist = new boolean[map.getWidth()][map.getHeight()];
            testField = map.getTileId(0, 0, i);
            for (int j = 0; j < map.getWidth(); j++) {
                for (int k = 0; k < map.getHeight(); k++) {
                    collisionTileID = map.getTileId(j, k, i);
                    if (collisionTileID == testField) {
                        exist[j][k] = true;
                    }
                }
            }
            if(i == 5) {updateCollisionFields(map);}
            if(i == 6) {updatePortalFields(map);}
//            if(i == 7) {updateNpc(map);}
//            if(i == 8) {updateLoot(map);}
        }
    }

    //metoda znajdująca pola kolizyjne    
    public void updateCollisionFields(TiledMap map) {
        collisions = new ArrayList<>();
        for (int i = 0; i < map.getWidth(); i++) {
            for (int j = 0; j < map.getHeight(); j++) {
                if (exist[i][j] == true) {
                    recField = new Rectangle(i * 32, j * 32, 32, 32);
                    collisions.add(recField);
                }
            }
        }
    }
    //metoda znajdująca pola kolizyjne    
    public void updatePortalFields(TiledMap map) {
        portals = new ArrayList<>();
        for (int i = 0; i < map.getWidth(); i++) {
            for (int j = 0; j < map.getHeight(); j++) {
                if (exist[i][j] == true) {
                    recField = new Rectangle(i * 32, j * 32, 32, 32);
                    portals.add(recField);
                }
            }
        }
    }

    //DO POPRAWIENIA
    public void updateNpcMapList(ArrayList<entities.Npc> npc) {

        //wymazanie starej kolekcji i zastąpienie czystą 
        npc = new ArrayList<entities.Npc>();
        FileReader strWej;

        try {
            strWej = new FileReader("pociag.txt");
            BufferedReader bufor = new BufferedReader(strWej);

            String linia;

            while ((linia = bufor.readLine()) != null) {
                String[] pola = linia.split(";");

                String[] dialog = new String[10];

                for (int i = 0; i < 10; i++) {
                    dialog[i] = pola[i];
                }

                //Npc localNPC = new Npc(Integer.parseInt(pola[0]),Integer.parseInt(pola[1]),dialog);
                //this.npc.add(localNPC);
            }

            strWej.close();

        } catch (FileNotFoundException w1) {
            System.out.println("Plik nie znaleziony - UPDATE NPC");
        } catch (IOException w2) {
            System.out.println("Bład odczytu - UPDATE NPC");
        } catch (NumberFormatException w3) {
            System.out.println("Bledny format liczby - UPDATE NPC");
        }

    }

    public void updatePortalMapList(ArrayList<entities.Portal> portal) {
        FileReader strIn;
        String path = "res/portal/" + core.GameStatus.levelID + ".txt";
        try {
            strIn = new FileReader(path);
            BufferedReader bufor = new BufferedReader(strIn);

            String row;

            while ((row = bufor.readLine()) != null) {
                String[] field = row.split(";");

                Portal newPortal = new Portal(
                        Integer.parseInt(field[0]), Integer.parseInt(field[1]),
                        Integer.parseInt(field[2]), Integer.parseInt(field[3]),
                        Integer.parseInt(field[4]),
                        Integer.parseInt(field[5]), Integer.parseInt(field[6]));

                portal.add(newPortal);
            }
            strIn.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Plik nie znaleziony - LoadPortal");
        } catch (IOException e2) {
            System.out.println("Bład odczytu - LoadPortal");
        } catch (NumberFormatException e3) {
            System.out.println("Bledny format liczby - LoadPortal");
        }
    }

    /*
    Metoda zlicza liczbę npc lub mobów na danej mapie, 
    poprzez parametr i, który oznacza:
    1 - zlicza npc
    2 - zlicza moby
     */
    public int lineNumber(int id) {
        int liczbaNPC = 0;
        String Dpath = "";
        if (id == 1) {
            Dpath = "res/NPCdialogs/";
        }
        if (id == 2) {
            Dpath = "res/enemy/";
        }

        try {
            String path = Dpath + Integer.toString(levelID) + ".txt";
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


    
}
