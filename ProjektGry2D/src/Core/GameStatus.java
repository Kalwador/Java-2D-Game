/*    
    tutaj będzie obsługiwany aktualny status bohatera
    nazwa bohatera, level, hp, mana, exp
    zawartość plecaka, skille, rasa, klasa 
*/

package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GameStatus {
    
    public String mapName;
    static public float x = 0,y = 0; //pozycja postaci na mapie
    static public core.actor.Hero hero;
    static public int heroSpeed = 1;
    
    public GameStatus(){
        mapName = "";
        x = 0;
        y = 0;
    }
    
    public void saveGame(int i){
        //parametr i to slot z ktorego zostanie zapisana gra
    }
    
    public void loadStatus(int i){
        //parametr i to slot z ktorego zostanie wczytana gra
        
        ArrayList<String> lista=new ArrayList<String>(); /*KOMPOZYCJA*/

        FileReader strIN;
        
        try {
            strIN = new FileReader("slot"+String.valueOf(x)+".txt"); // niewiem czy bedzie dzialac - sprawdzic 
            BufferedReader bufor = new BufferedReader(strIN);
        
            String line;
        
            while((line=bufor.readLine())!=null){
                String[] pola=line.split(";");
                //nie dokończone - Kalvador
            }
                
            strIN.close();
            
            } catch (FileNotFoundException w1) {
            System.out.println("Plik nie znaleziony.");
            } catch (IOException w2) {
                System.out.println("Bład odczytu");
            }catch (NumberFormatException w3){
                System.out.println("Bledny format liczby");
            } 
        
    }
    
    
}
