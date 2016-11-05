/*    
    tutaj będzie obsługiwany aktualny status bohatera
    nazwa bohatera, level, hp, mana, exp
    zawartość plecaka, skille, rasa, klasa 
*/

package core;

import core.actor.Hero;

public class GameStatus {
    
    public String mapName;
    public int x,y; //pozycja postaci na mapie
    public core.actor.Hero hero;
    public double heroSpeed,heroH,heroW;

    public GameStatus() {
        this.mapName = "";
        this.x = 1;
        this.y = 1;
        this.heroSpeed = 1;
        this.heroH=48;
        this.heroW=48;
    }
    


    public GameStatus(String mapName, Hero hero) {
        this.mapName = mapName;
        this.hero = hero;
    }
    
    
}
