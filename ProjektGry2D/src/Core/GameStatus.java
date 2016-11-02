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
    public double heroSpeed;

    public GameStatus(String mapName, int x, int y, Hero hero) {
        this.mapName = "";
        this.x = 0;
        this.y = 0;
        this.heroSpeed = 1;
    }
    


    public GameStatus(String mapName, Hero hero) {
        this.mapName = mapName;
        this.hero = hero;
    }
    
    
}
