package model;

import core.GameStatus;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import states.PlayState;

public class Npc {
    //id npc
    int index;
    int x;
    int y;
    
    //Tablica dialogów
    String[] dialog = new String[10];
    
    //ścieżka do pliku graficznego npc 5 cyfrowa 
    String Dpath = "res/NPCsprite/";
    String path;

    
    public Npc (int x,int y, String[] dialog){
        this.x = x;
        this.y = y;
        this.dialog = dialog;
        this.path = Dpath+GameStatus.levelID+index+".png";
    }
    
            
    public static String getDialog(int levelID) {
        String path;
        String Dpath = "res/NPCdialogs/";
        String tekst = "";
        try {
            path = Dpath + Integer.toString(GameStatus.levelID)+ ".txt";
            FileReader strWe = new FileReader(path);
            BufferedReader bufor = new BufferedReader(strWe);
            String line = null;
            while ((line = bufor.readLine()) != null) {
                tekst += (line + "\n");
            }
            strWe.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tekst;
    }
}
