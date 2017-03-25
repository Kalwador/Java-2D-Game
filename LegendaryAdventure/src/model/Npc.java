////package model;
//
//import core.GameStatus;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import states.PlayState;
//
//public class Npc {
//    //id npc
//    int index;
//    int x;
//    int y;
//    
//    //Tablica dialogów
//    String[] dialog = new String[10];
//    
//    //ścieżka do pliku graficznego npc 5 cyfrowa 
//    String Dpath = "res/NPCsprite/";
//    String path;
//
//    
//    public Npc (int x,int y, String[] dialog){
//        this.x = x;
//        this.y = y;
//        this.dialog = dialog;
//        this.path = Dpath+GameStatus.levelID+index+".png";
//    }
//    
//            
//    public static String getDialog(int levelID) {
//        String path;
//        String Dpath = "res/NPCdialogs/";
//        String tekst = "";
//        try {
//            path = Dpath + Integer.toString(GameStatus.levelID)+ ".txt";
//            FileReader strWe = new FileReader(path);
//            BufferedReader bufor = new BufferedReader(strWe);
//            String line = null;
//            while ((line = bufor.readLine()) != null) {
//                tekst += (line + "\n");
//            }
//            strWe.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return tekst;
//    }
//}
package model;

import core.GameStatus;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import org.newdawn.slick.tiled.TiledMap;
import states.PlayState;

public class Npc {
    
    public String name;
    public String[] quotes;
    
    //wspolrzedne
    public int x;
    public int y;
    
    //nr mapy
    public  int levelID;

    public Npc(int levelID, int x, int y, String name, String[] quotes) {
        this.name = name;
        this.quotes = quotes;
        this.x=x;
        this.y=y;
       this.levelID=levelID;
    }

    public String getName() {
        return name;
    }

    public String[] getQuotes() {

        return quotes;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLevelID() {
        return levelID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuotes(String[] quotes) {
        this.quotes = quotes;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }



    public static ArrayList<Npc> npc = new ArrayList<Npc>() {{
        //103
            add(new Npc(103,62,61,"Uriziel",new String[]{"Witaj "+
               "Co Cię tutaj sporwadza wędrowcze?"}));
            add(new Npc(103,16,42,"Obywatel",new String[]{"Uważaj! "+
               "Kolejny szaleniec w mieście!"}));
            add(new Npc(103,6,42,"Strażnik Bramy",new String[]{"Przestań tak pędzić! "+
               "Tylko nie pakuj się w kłopoty!"}));
        //104  
            add(new Npc(104,18,13,"Kowal",new String[]{"Hej Ty! "+
               "Czego potrzebujesz potrzebujesz?"}));        
            add(new Npc(104,48,11,"Strażnik",new String[]{"Przestań tak pędzić! "+
               "Tylko nie pakuj się w kłopoty!"}));
            add(new Npc(104,58,37,"Strażnik",new String[]{
               "Jeszcze Ciebie tutaj brakowało."}));
            add(new Npc(104,59,35,"Strażnik",new String[]{"Przestań tak pędzić! "+
               "Tylko nie pakuj się w kłopoty!"}));
            add(new Npc(104,49,49,"Strażnik",new String[]{"Przestań tak pędzić! "+
               "Tylko nie pakuj się w kłopoty!"}));
            add(new Npc(104,64,33,"Chłopiec",new String[]{"Kiedyś będę strażnikiem"+
               "I będę nosić taką zbroję jak oni!"}));
            add(new Npc(104,36,46,"Obywatelka",new String[]{"Odejdź zwyrodnialcze! "+
               "Zaraz zawołam straż!"}));
            add(new Npc(104,7,15,"Obywatelka",new String[]{"Nie masz tu czego szukać "+
               "Odejdź!"}));
            add(new Npc(104,19,51,"Kupiec",new String[]{"Wyrolowali mnie!"+
               "Ukradli mi moich klientów!"}));
            add(new Npc(104,45,48,"Kupiec",new String[]{"Podejdź, spróbuj mojego "
                   + "chleba!"}));
            add(new Npc(104,58,48,"Kupiec",new String[]{"Wołowina, wieprzowina, drób "+
               "niech poczuje to Twój dziub!"}));
            add(new Npc(104,61,58,"Kupiec",new String[]{"Witaj wędrowcze! Na pewno"+
               " jesteś spragniony. Spróbuj tego!"}));
        //105
            add(new Npc(105,38,56,"Farmer",new String[]{"Witaj! Przydadzą się każde"+
               " ręce do roboty!"}));
            add(new Npc(105,40,59,"Farmerka",new String[]{"Jeśli szukasz pracy "+
               "porozmawiaj z moim mężem."}));
            add(new Npc(105,43,93,"Wędrowiec",new String[]{"Uważaj, w pobliżu "+
               "widziałem jakieś stwory!"}));     
        //106
            add(new Npc(106,34,86,"Właściciel ziemski",new String[]{"Pomocy! "+
               "Bandyci porwali moich pracowników!"}));     
            add(new Npc(106,68,81,"Właścicielka ziemska",new String[]{"Tutaj gdzieś "+
               "czai się smok! Ja nie zwariowałam!"}));    
            add(new Npc(106,41,48,"Bandyta",new String[]{"Jeśli nie odejdziesz "+
               "to będziesz następny!"}));    
            add(new Npc(106,39,15,"Bandyta",new String[]{"Czego tutaj szukasz? "+
               "Lepiej odejdź zanim stracę cierpliwość!"}));     
            add(new Npc(106,67,12,"Dowódca bandytów",new String[]{"Wciąż żyjesz? "+
               "Zadziwiające."}));    
        //107
            add(new Npc(107,25,41,"Nekromanta",new String[]{"Dobrze, że tutaj jesteś. "+
               "Musimy pozbyć się tych potworów!"}));   
        //108
            add(new Npc(108,43,84,"Właściciel ziemski",new String[]{"Hej Ty! "+
               "Bierz ten wóz i do roboty!"}));     
            add(new Npc(108,58,82,"Właścicielka ziemska",new String[]{"Te wiadro jest "+
               "zbyt ciężkie."}));    
            add(new Npc(108,69,84,"Właściciel ziemski",new String[]{"Wszędzie sama "+
               "konkurencja!"}));     
            add(new Npc(108,21,54,"Właścicielka ziemska",new String[]{"Hej! Dobrze "+
               "Cię widzieć. Może potrzebujesz pracy?"}));    
            add(new Npc(108,19,48,"Właściciel ziemski",new String[]{"Dzień dobry.  "+
               "Ach tak, praca."}));     
            add(new Npc(108,50,34,"Właściciel ziemski",new String[]{"Uważaj gdzie  "+
               "leziesz! Gdzieś na zachodzie czają się wilki!"}));    
            add(new Npc(108,64,36,"Właściciel ziemski",new String[]{"Weź wybij te "+
               "wilki. Jeśli ja się tym nie zajmę to dalej będą napadać!"}));         
           }};

}
