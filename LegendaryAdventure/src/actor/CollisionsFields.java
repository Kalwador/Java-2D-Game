package actor;

import core.GameStatus;
import core.LoadEntity;

public class CollisionsFields {

    public CollisionsFields() {
    }

    /**
     * Klasa obsługująca kolizje
     *
     * @param gs meta dane gry
     * @param oldX wspórzędna X pozycji gracza na mapie sprzed poruszenia
     * @param oldY wspórzędna Y pozycji gracza na mapie sprzed poruszenia
     */
    public void isCollision(GameStatus gs, int oldX, int oldY) {
        int iter = 0;

        while (LoadEntity.collisions.size() > iter) {
            if (LoadEntity.recPlayer.intersects(LoadEntity.collisions.get(iter))) {
                gs.x = oldX;
                gs.y = oldY;
            }
            iter++;
        }
    }

    /**
     * Metoda Sprawdza naruszenie pól npc Jeśli tak sie stało ustawia ople
     * statyczne wartością naruszonego npc
     *
     * @return true jeśli npcArea została naruszone, false w przeciwnym wypadku
     */
    public boolean isNpc(GameStatus gs) {
        int iter = 0;

        while (LoadEntity.npc.size() > iter) {
            if (LoadEntity.recPlayer.intersects(LoadEntity.npc.get(iter))) {
                hud.NpcDialog.npc = gs.npc.get(GameStatus.x + GameStatus.y + GameStatus.levelID);
                return true;
            }
            iter++;
        }
        return false;
    }

    public void isEnemy(GameStatus gs, int oldX, int oldY) {
        int iter = 0;

        while (LoadEntity.mobs.size() > iter) {
            if (LoadEntity.recPlayer.intersects(LoadEntity.mobs.get(iter))) {
                //postać musi zostać cofnięta na pole przed walką aby po zakończeniu walki
                //nowa walka nie rozpoczeła się od razu
                gs.x = oldX;
                gs.y = oldY;

                //Tutaj wywołanie wejścia w fightState
                //ustawienie odpowiednich pól, obiektów aby walczyć z odpowiednim przeciwnikiem
            }
            iter++;
        }
    }
}
