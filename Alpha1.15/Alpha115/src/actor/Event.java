package actor;

import core.Sprite;
import core.GameStatus;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

public class Event {

    private Movement movement;
    private Collisions collisions;
    private Portals portals;

    //wykona się przy 'NOWA GRA'
    public Event(Sprite sprite) throws SlickException {
        this.movement = new Movement();
        this.collisions = new Collisions();
        this.portals = new Portals();
    }

    public boolean update(GameContainer gc, StateBasedGame sbg, int delta, GameStatus gs, Input input, int xPos, int yPos) throws SlickException {
        
        //wartość sprzed poruszenia się 
        int oldX = gs.x;
        int oldY = gs.y;
        
        //obsługa klawiszy funkcyjnych
        Keys.functionalKeyHandler(gc, sbg, input, gs.sprite.heroW, gs.sprite.heroH);

        //poruszenie się w wybranym kierunku
        movement.go(input, gs, delta, gs.sprite);

        //update prostokąta na graczu
        core.LoadEntity.recPlayer = new Rectangle(gs.x, gs.y, gs.sprite.heroW - 15, gs.sprite.heroH);
        
        int playerCenterX = gs.x + (gs.sprite.heroW / 2) - 7;
        int playerCenterY = gs.y + (gs.sprite.heroH / 2);
        
        //sprawdzanie wejścia w portal
        if (portals.isEnter(gs,playerCenterX,playerCenterY)) {
            return true;
        }

        //kolizje 
        collisions.isBlocked(gs, oldX, oldY);

        return false;
    }
}
