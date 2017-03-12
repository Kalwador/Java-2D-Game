package gameUtils;

import gameUtils.LocationUtils;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import model.Save;
import core.GameStatus;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Equip;
import model.Item;
import org.newdawn.slick.SlickException;

public class TXTsave {

    static private String absolutePath = "save/save";

    public static boolean deleteSave(int index) {
        String path = absolutePath + index + ".txt";
        String linia = "";
        try {
            FileReader file = new FileReader(path);
            BufferedReader bufor = new BufferedReader(file);
            linia = bufor.readLine();
            if (linia.charAt(0) == '0') {
                return false;
            }
            linia = "0" + linia.substring(1);
            file.close();
        } catch (FileNotFoundException w1) {
            System.out.println("SAVE FILE NOT FOUND");
        } catch (IOException w2) {
            System.out.println("DATA LOAD FILURE - IO EXCEPTION");
        } catch (NumberFormatException w3) {
            System.out.println("Bledny format liczby");
        }
        try {
            PrintWriter file = new PrintWriter(path);
            file.println(linia);
            file.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Plik nie znaleziony.");
        }
        return true;
    }

    public static model.Save loadData(int index) {
        model.Save newElem = new model.Save();
        newElem.setNr(index);
        newElem.setMiniaturePath(absolutePath + index + ".png");
        try {
            FileReader file = new FileReader(absolutePath + index + ".txt");
            BufferedReader bufor = new BufferedReader(file);
            String[] pola = bufor.readLine().split(";");
            if (pola[0].equals("0")) {
                return new Save();
            }
            newElem.setMapLocation(LocationUtils.getLokalization(Integer.parseInt(pola[1])));
            newElem.setSaveDate(pola[4]);
            file.close();
        } catch (FileNotFoundException w1) {
            System.out.println("SAVE FILE NOT FOUND");
        } catch (IOException w2) {
            System.out.println("DATA LOAD FILURE - IO EXCEPTION");
        } catch (NumberFormatException w3) {
            System.out.println("Bledny format liczby");
        }
        return newElem;
    }

    public static void loadSave(int index) throws SlickException {
        String[] data = null;
        try {
            FileReader file = new FileReader(absolutePath + index + ".txt");
            BufferedReader bufor = new BufferedReader(file);
            data = bufor.readLine().split(";");
            file.close();
        } catch (FileNotFoundException w1) {
            System.out.println("LOAD SAVE - FILE NOT FOUND");
        } catch (IOException w2) {
            System.out.println("LOAD SAVE - FILURE - IO EXCEPTION");
        } catch (NumberFormatException w3) {
            System.out.println("LOAD SAVE - NumberFormatException");
        }
        GameStatus.levelID = Integer.parseInt(data[1]);
        GameStatus.x = Integer.parseInt(data[2]);
        GameStatus.y = Integer.parseInt(data[3]);
        GameStatus.money = Integer.parseInt(data[5]);
        GameStatus.spriteNumber = Integer.parseInt(data[148]);
        GameStatus.sprite = new core.Sprite();

        GameStatus.hero = new model.Hero(
                data[6],
                Integer.parseInt(data[7]),
                Integer.parseInt(data[8]),
                Integer.parseInt(data[9]),
                Integer.parseInt(data[10]),
                Integer.parseInt(data[11]),
                Integer.parseInt(data[12]),
                Integer.parseInt(data[13]),
                Double.parseDouble(data[14]),
                Double.parseDouble(data[15]),
                Integer.parseInt(data[18]),
                Integer.parseInt(data[19]),
                Integer.parseInt(data[20]),
                Integer.parseInt(data[21])
        );
        int j = 1;
        HashMap<Integer, model.Item> itemsTemp = new HashMap<>();
        for (int i = 22; i < 70; i++) {
            if (data[i].equals("0")) {
                break;
            }
            model.Item item = core.GameStatus.itemsInGame.get(Integer.parseInt(data[i].substring(3, data[i].length())));
            item.setAmount(Integer.parseInt(data[i].substring(0, 3)));
            itemsTemp.put(j, item);
            j++;
        }
        core.GameStatus.itemsInBag = itemsTemp;

        j = 1;
        HashMap<Integer, model.Equip> equipTemp = new HashMap<>();
        for (int i = 70; i < 118; i++) {
            if (data[i].equals("0")) {
                break;
            }
            model.Equip equip = core.GameStatus.equipInGame.get(Integer.parseInt(data[i].substring(3, data[i].length())));
            equip.setAmount(Integer.parseInt(data[i].substring(0, 3)));
            equipTemp.put(j, equip);
            j++;
        }
        core.GameStatus.equipInBag = equipTemp;
        //wczytywanie skili

    }

    public static void saveGame(int index) {
        StringBuilder data = new StringBuilder();
        final char ZNAK = ';';
        data.append("1");
        data.append(ZNAK);
        data.append(GameStatus.levelID);
        data.append(ZNAK);
        data.append(GameStatus.x);
        data.append(ZNAK);
        data.append(GameStatus.y);
        data.append(ZNAK);
        data.append(new SimpleDateFormat("yyyy/MM/dd").format(new Date()));
        data.append(ZNAK);
        data.append(GameStatus.money);
        data.append(ZNAK);
        data.append(GameStatus.hero.heroName);
        data.append(ZNAK);
        data.append(GameStatus.hero.heroLevel);
        data.append(ZNAK);
        data.append(GameStatus.hero.tempHeroExperience);
        data.append(ZNAK);
        data.append(GameStatus.hero.maxHeroExperience);
        data.append(ZNAK);
        data.append(GameStatus.hero.tempHeroHealth);
        data.append(ZNAK);
        data.append(GameStatus.hero.maxHeroHealth);
        data.append(ZNAK);
        data.append(GameStatus.hero.tempHeroMana);
        data.append(ZNAK);
        data.append(GameStatus.hero.maxHeroMana);
        data.append(ZNAK);
        data.append(GameStatus.hero.heroAttack);
        data.append(ZNAK);
        data.append(GameStatus.hero.heroDeffence);
        data.append(ZNAK);
        data.append(Double.toString(model.Hero.movementSpeed));
        data.append(ZNAK);
        data.append(Double.toString(model.Hero.attackSpeed));
        data.append(ZNAK);
        data.append(GameStatus.hero.strenght);
        data.append(ZNAK);
        data.append(GameStatus.hero.agility);
        data.append(ZNAK);
        data.append(GameStatus.hero.inteligence);
        data.append(ZNAK);
        data.append(GameStatus.hero.levelPoints);
        data.append(ZNAK);

        int licznikMiejsc = 0;
        StringBuilder tempData = new StringBuilder();
        for (Item item : GameStatus.itemsInBag.values()) {
            tempData = new StringBuilder();
            int i = item.getAmount();
            if (i < 10) {
                tempData.append("00" + i + item.getId());
            } else {
                if (i < 100) {
                    tempData.append("0" + i + item.getId());
                } else {
                    tempData.append("" + i + item.getId());
                }
            }
            licznikMiejsc++;
            data.append(tempData);
            data.append(ZNAK);
        }
        if (licznikMiejsc < 48) {
            for (int i = licznikMiejsc; i < 48; i++) {
                data.append("0");
                data.append(ZNAK);
            }
        }
        licznikMiejsc = 0;
        for (Equip equip : GameStatus.equipInBag.values()) {
            tempData = new StringBuilder();
            int i = equip.getAmount();
            if (i < 10) {
                tempData.append("00" + i + equip.getId());
            } else {
                if (i < 100) {
                    tempData.append("0" + i + equip.getId());
                } else {
                    tempData.append("" + i + equip.getId());
                }
            }
            licznikMiejsc++;
            data.append(tempData);
            data.append(ZNAK);
        }
        if (licznikMiejsc < 48) {
            for (int i = licznikMiejsc; i < 48; i++) {
                data.append("0");
                data.append(ZNAK);
            }
        }
        //skille
        for (int i = 0; i < 9; i++) {
            data.append("true");
            data.append(ZNAK);
        }
        for (int i = 0; i < 11; i++) {
            data.append("true");
            data.append(ZNAK);
        }
        for (int i = 0; i < 10; i++) {
            data.append("true");
            data.append(ZNAK);
        }
        data.append(core.GameStatus.spriteNumber);
        data.append(ZNAK);

        String path = absolutePath + index + ".txt";
        try {
            PrintWriter file = new PrintWriter(path);
            file.println(data.toString());
            file.close();
        } catch (FileNotFoundException e1) {
            System.out.println("SAVE GAME - Plik nie znaleziony.");
        }
    }
}
