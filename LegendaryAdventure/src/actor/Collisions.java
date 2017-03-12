package actor;

import core.GameStatus;
import core.LoadEntity;

public class Collisions {

    public Collisions() {
    }

    /**
     * Klasa obsługująca kolizje
     *
     * @param gs meta dane gry
     * @param oldX wspórzędna X pozycji gracza na mapie sprzed poruszenia
     * @param oldY wspórzędna Y pozycji gracza na mapie sprzed poruszenia
     */
    public void isBlocked(GameStatus gs, int oldX, int oldY) {
        int iter = 0;
        
        while (LoadEntity.collisions.size() > iter) {
            if (LoadEntity.recPlayer.intersects(LoadEntity.collisions.get(iter))) {
                gs.x = oldX;
                gs.y = oldY;
            }
            iter++;
        }
    }
}
