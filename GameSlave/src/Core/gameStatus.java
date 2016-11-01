/*    
    tutaj będzie obsługiwany aktualny status bohatera
    przy
    nazwa bohatera, level, hp, mana, exp
    zawartość plecaka, skille, rasa, klasa 
*/

package Core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class gameStatus {
    
    protected String mapName;
    protected int x,y; //pozycja postaci na mapie
    protected Actor.Actor hero;
    
    public gameStatus(){

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
                
                //String block = new Integer(pola[0],pola[1],pola[2],pola[3],pola[4],pola[5],pola[6],pola[7],pola[8],pola[9]);
                //lista.add(klient);
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
    public void saveGame(int i){
        //parametr i to slot z ktorego zostanie zapisana gra
    }
    
}
