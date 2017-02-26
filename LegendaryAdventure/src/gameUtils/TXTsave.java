package gameUtils;

import gameUtils.LocationName;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import model.SaveToDisplay;
import core.GameStatus;
import java.text.SimpleDateFormat;
import java.util.Date;
import model.Equip;
import model.Item;

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

    public static model.SaveToDisplay loadData(int index) {
        model.SaveToDisplay newElem = new model.SaveToDisplay();
        newElem.setNr(index);
        newElem.setMiniaturePath(absolutePath + index + ".png");
        try {
            FileReader file = new FileReader(absolutePath + index + ".txt");
            BufferedReader bufor = new BufferedReader(file);
            String[] pola = bufor.readLine().split(";");
            if (pola[0].equals("0")) {
                return new SaveToDisplay();
            }
            newElem.setMapLocation(LocationName.getLokalization(Integer.parseInt(pola[1])));
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

    public static void loadSave(int index) {
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
        String data = "";
        final char ZNAK = ';';

        data += "1" + ZNAK;
        data += GameStatus.levelID + ZNAK;
        data += GameStatus.x + ZNAK;
        data += GameStatus.y + ZNAK;
        data += new SimpleDateFormat("yyyy/MM/dd").format(new Date()) + ZNAK;
        data += GameStatus.money + ZNAK;
        data += GameStatus.hero.heroName + ZNAK;
        data += GameStatus.hero.heroLevel + ZNAK;
        data += GameStatus.hero.tempHeroExperience + ZNAK;
        data += GameStatus.hero.maxHeroExperience + ZNAK;
        data += GameStatus.hero.tempHeroHealth + ZNAK;
        data += GameStatus.hero.maxHeroHealth + ZNAK;
        data += GameStatus.hero.tempHeroMana + ZNAK;
        data += GameStatus.hero.maxHeroMana + ZNAK;
        data += GameStatus.hero.heroAttack + ZNAK;
        data += GameStatus.hero.heroDeffence + ZNAK;
        data += model.Hero.movementSpeed + ZNAK;
        data += model.Hero.attackSpeed + ZNAK;
        data += GameStatus.hero.strenght + ZNAK;
        data += GameStatus.hero.agility + ZNAK;
        data += GameStatus.hero.inteligence + ZNAK;
        data += GameStatus.hero.levelPoints + ZNAK;

        String tempData;
        for (Item item : GameStatus.itemsInBag.values()) {
            tempData = "";
            int i = item.amount;
            if (i < 10) {
                tempData = "00" + i + item.id;
            } else {
                if (i < 100) {
                    tempData = "0" + i + item.id;
                } else {
                    tempData = "" + i + item.id;
                }
            }
            data += tempData + ZNAK;
        }
        for (Equip equip : GameStatus.equipInBag.values()) {
            tempData = "";
            int i = equip.getAmount();
            if (i < 10) {
                tempData = "00" + i + equip.getId();
            } else {
                if (i < 100) {
                    tempData = "0" + i + equip.getId();
                } else {
                    tempData = "" + i + equip.getId();
                }
            }
            data += tempData + ZNAK;
        }
        //skille
        
        String path = absolutePath + index + ".txt";
        try {
            PrintWriter file = new PrintWriter(path);
            file.println(data);
            file.close();
        } catch (FileNotFoundException e1) {
            System.out.println("SAVE GAME - Plik nie znaleziony.");
        }
    }
}
