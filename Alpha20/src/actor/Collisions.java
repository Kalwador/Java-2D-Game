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

//        private static ArrayList<Rectangle> tempCollisions = LoadEntity.collisions.stream()
//                .filter(x -> x.g)  .collect(Collectors.toList());


        //tutaj można zawęzić pole przeszukiwania - przyśpieszyć gre
        //poprzez użycia streama i przefiltrowanie wszystkich rectangle 
        //w poszukiwaniu tych które są blisko gracza
        //obsłużyć npe jeśli w pobliżu nie ma żadnych kolizji
        
        
        
//        while (LoadEntity.collisions.stream().filter(u -> u.g)) > iter) {


        while (LoadEntity.collisions.size() > iter) {
            if (LoadEntity.recPlayer.intersects(LoadEntity.collisions.get(iter))) {
                gs.x = oldX;
                gs.y = oldY;
            }
            iter++;
        }
    }
}
