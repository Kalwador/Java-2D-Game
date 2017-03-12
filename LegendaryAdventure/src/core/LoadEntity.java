package core;

import model.Portal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
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

    
    // w trakcie prac, 
    // ostateczną formę przybieże po obsłuzeniu itemów npc i mobów
    public void updateEntityFieldList(TiledMap map) {
        for (int i = 5; i < 6; i++) {
//            if (i == 6) {
//                continue; // nie sprawdza warstwy portali
//            }
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
        collisions.trimToSize();
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

    /**
     * Metoda aktualizująca portale na mapie poprzez parsowanie pliku xml,
     * @param portal kolekcja przechowująca dane o portalach na aktualnej mapie
     * @throws FileNotFoundException
     * @throws XMLStreamException
     */
    public void updatePortalMapList(ArrayList<model.Portal> portalMapList) {
        Portal newPortal;
        String path = "res/portal/" + core.GameStatus.levelID + ".xml";
        File filePath = new File(path);
        try {
            XMLInputFactory iFactory = XMLInputFactory.newInstance();
            InputStream xmlFile = new FileInputStream(filePath);
            XMLStreamReader parser = iFactory.createXMLStreamReader(xmlFile);
            // dopoki masz nastepny element ...
            newPortal = new Portal();
            while (parser.hasNext()) {
                switch (parser.next()) {
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
                    case XMLStreamConstants.END_ELEMENT:

                        if (parser.getLocalName().equals("Portal")) {
                            portalMapList.add(newPortal);
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

    public void loadAllItemsInGame(HashMap<Integer, model.Item> itemsInGame) {
        model.Item newItem;
        String path = "res/items/items.xml";
        File filePath = new File(path);
        try {
        XMLInputFactory iFactory = XMLInputFactory.newInstance();
        InputStream xmlFile = new FileInputStream(filePath);
        XMLStreamReader parser = iFactory.createXMLStreamReader(xmlFile);
            newItem = new model.Item() {};
            while (parser.hasNext()) {
                switch (parser.next()) {
                    case XMLStreamConstants.START_ELEMENT:
                        if (parser.getLocalName().equals("Potion")) {
                            newItem = new model.Item();
                        }
                        
                        if (parser.getLocalName().equals("Food")) {
                            newItem = new model.Item();
                        }
                        
                        if (parser.getLocalName().equals("Herb")) {
                            newItem = new model.Item();
                        }
                        if (parser.getLocalName().equals("id")) {
                            newItem.setId(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("name")) {
                            newItem.setName(""+parser.getElementText()+"");
                        }
                        if (parser.getLocalName().equals("description")) {
                            newItem.setDescription(""+parser.getElementText()+"");
                        }
                        if (parser.getLocalName().equals("amount")) {
                            newItem.setAmount(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("nOF")) {
                            newItem.setnOF(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("hp")) {
                            newItem.setHp(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("mp")) {
                            newItem.setMp(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("kt")) {
                            newItem.setKt(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("id_klucza")) {
                            newItem.setId_klucza(Integer.parseInt(parser.getElementText()));
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        
                        if (parser.getLocalName().equals("Potion")) {
                            itemsInGame.put(newItem.getId(), newItem);
                        }
                        if (parser.getLocalName().equals("Food")) {
                            itemsInGame.put(newItem.getId(), newItem);
                        }
                        if (parser.getLocalName().equals("Herb")) {
                            itemsInGame.put(newItem.getId(), newItem);
                        }
                        break;
                }
            }
        } catch (FileNotFoundException e1) {
            System.out.println("Plik nie znaleziony - loadItems");
        } catch (XMLStreamException e2) {
            System.out.println("Bład pliku XML - loadItems");
        } catch (NumberFormatException e3) {
            System.out.println("Bledny format liczby - loadItems");
        }
    }
    
        public void loadAllEquipInGame(HashMap<Integer, model.Equip> equipInGame) {
        model.Equip newEquip;
        String path = "res/equip/equip.xml";
        File filePath = new File(path);
        try {
        XMLInputFactory iFactory = XMLInputFactory.newInstance();
        InputStream xmlFile = new FileInputStream(filePath);
        XMLStreamReader parser = iFactory.createXMLStreamReader(xmlFile);
            newEquip = new model.Equip();
            while (parser.hasNext()) {
                switch (parser.next()) {
                    case XMLStreamConstants.START_ELEMENT:
                        if (parser.getLocalName().equals("Weapon")) {
                            newEquip = new model.Equip();
                        }
                        
                        if (parser.getLocalName().equals("Armor")) {
                             newEquip = new model.Equip();
                        }
                        if (parser.getLocalName().equals("id")) {
                            newEquip.setId(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("name")) {
                            newEquip.setName(""+parser.getElementText()+"");
                        }
                        if (parser.getLocalName().equals("description")) {
                            newEquip.setDescription(""+parser.getElementText()+"");
                        }
                        if (parser.getLocalName().equals("type")) {
                            newEquip.setType(""+parser.getElementText()+"");
                        }
                        if (parser.getLocalName().equals("amount")) {
                            newEquip.setAmount(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("nOF")) {
                            newEquip.setnOF(Integer.parseInt(parser.getElementText()));
                        }
                        
                        if (parser.getLocalName().equals("dmg")) {
                            newEquip.setDmg(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("def")) {
                            newEquip.setDef(Integer.parseInt(parser.getElementText()));
                        }
                        if (parser.getLocalName().equals("speed")) {
                            newEquip.setDef(Integer.parseInt(parser.getElementText()));
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        
                        if (parser.getLocalName().equals("Weapon")) {
                            equipInGame.put(newEquip.getId(), newEquip);
                        }
                        if (parser.getLocalName().equals("Armor")) {
                            equipInGame.put(newEquip.getId(), newEquip);
                        }
                        break;
                }
            }
        } catch (FileNotFoundException e1) {
            System.out.println("Plik nie znaleziony - loadEquip");
        } catch (XMLStreamException e2) {
            System.out.println("Bład pliku XML - loadEquip");
        } catch (NumberFormatException e3) {
            System.out.println("Bledny format liczby - loadEquip");
        }
    }
}
