package core;

import static core.GameStatus.levelID;
import model.Portal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.tiled.TiledMap;

public class LoadEntity {

    //do kolizji, eventów, przejść
    int collisionID, npcID, itemID, enemyID, portalID;
    public int collisionTileID, npcTileID, itemTileID, enemyTileID, portalTileID;
    public int testField, testNpc, testItem, testEnemy, testPortal;
    boolean[][] exist;
    public static ArrayList<Rectangle> collisions;
    public static ArrayList<Rectangle> npc;
    public static Rectangle recPlayer, recField;

    public void updateEntityFieldList(TiledMap map) {
        for (int i = 5; i < 7; i++) {
            if (i == 6) {
                continue; // nie sprawdza warstwy portali
            }
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
            if (i == 5) {
                updateCollisionFields(map);
            }
//            if(i == 7) {updateNpc(map);}
//            if(i == 8) {updateLoot(map);}
        }
    }

    /**
     * Metoda znajdująca pola kolizyjne
     *
     * @param map Aktualna mapa
     */
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

    public void updateNpcFields(TiledMap map) {
        npc = new ArrayList<>();
        for (int i = 0; i < map.getWidth(); i++) {
            for (int j = 0; j < map.getHeight(); j++) {
                if (exist[i][j] == true) {
                    recField = new Rectangle(i * 32, j * 32, 32, 32);
                    npc.add(recField);
                }
            }
        }
    }

    public void updatePortalMapList(ArrayList<model.Portal> portal) {
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

    /**
     * Metoda aktualizująca portale na mapie poprzez parsowanie pliku xml,
     *
     * @param portal kolekcja przechowująca dane o portalach na aktualnej mapie
     * @throws FileNotFoundException
     * @throws XMLStreamException
     */
//    File xmlFile = new File("./src/parsexml/dane.xml");
    public void updatePortalMapList2(ArrayList<model.Portal> portal) {
        Portal newPortal;
        String path = "res/portal/" + core.GameStatus.levelID + ".xml";
        File filePath = new File(path);
        try {
            // tworzenie parsera
        XMLInputFactory iFactory = XMLInputFactory.newInstance();
        InputStream xmlFile = new FileInputStream(filePath);
        XMLStreamReader parser = iFactory.createXMLStreamReader(xmlFile);
            // dopoki masz nastepny element ...
            newPortal = new Portal();
            while (parser.hasNext()) {
                 
                // jesli jest to ... , wowczas ...
                
                switch (parser.next()) {
// START ELEMENT // 
                    case XMLStreamConstants.START_ELEMENT:
                        if (parser.getLocalName().equals("Portal")) {
                            newPortal = new Portal();
                        }
                        if (parser.getLocalName().equals("xStart")) {
                            newPortal.setxStart(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("xEnd")) {
                             newPortal.setxEnd(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("yStart")) {
                             newPortal.setyStart(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("yEnd")) {
                             newPortal.setyEnd(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("levelID")) {
                             newPortal.setLevelID(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("xNew")) {
                             newPortal.setxNew(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("yNew")) {
                             newPortal.setyNew(Integer.parseInt(parser.getElementText()));
                        }
                        break;
// END ELEMENT //
                    case XMLStreamConstants.END_ELEMENT:
                        
                        if (parser.getLocalName().equals("Portal")) {
                            portal.add(newPortal);
                        }
                        break;
                }
            }
        } catch (FileNotFoundException e1) {
            System.out.println("Plik nie znaleziony - LoadPortal2 - " + GameStatus.levelID);
        } catch (XMLStreamException e2) {
            System.out.println("Bład pliku XML - LoadPortal");
        } catch (NumberFormatException e3) {
            System.out.println("Bledny format liczby - LoadPortal");
        }
    }
}
