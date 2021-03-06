package actor;

import core.Sprite;
import core.GameStatus;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.StateBasedGame;

/**
 *
 * Klasa sterująca wszystkimi wydarzenimai w polu gry, Poruszanie, kolizje,
 * portale.
 *
 * Nie obsłguje hudu.
 */
public class Event {

    private Movement movement;
    private CollisionsFields collisionFields;
    private Portals portals;
//    private Dialogs dialogs;

    //wykona się przy 'NOWA GRA'
    public Event(Sprite sprite) throws SlickException {
        this.movement = new Movement();
        this.collisionFields = new CollisionsFields();
        this.portals = new Portals();
//        this.dialogs.= new dialogs();
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta, GameStatus gs, Input input, int xPos, int yPos) throws SlickException {

        //wartość sprzed poruszenia się 
        int oldX = gs.x;
        int oldY = gs.y;

        //obsługa klawiszy funkcyjnych
        Keys.functionalKeyHandler(gc, sbg, input, GameStatus.sprite.heroWidth, GameStatus.sprite.heroHeight);

        //poruszenie się w wybranym kierunku
        movement.go(input, gs, delta, gs.sprite);

        //update prostokąta na graczu
        core.LoadEntity.recPlayer = new Rectangle(gs.x, gs.y, gs.sprite.heroWidth, gs.sprite.heroHeight - 5);

        int playerCenterX = gs.x + (GameStatus.sprite.heroWidth / 2) - 7;
        int playerCenterY = gs.y + (GameStatus.sprite.heroHeight / 2);

        //sprawdzanie wejścia w portal
        portals.isEnter(gs, playerCenterX, playerCenterY);

        //kolizje
        collisionFields.isCollision(gs, oldX, oldY);

        //npc
        if (collisionFields.isNpc(gs)) {
            hud.NpcDialog.displayDialog = true;
        } else {
            hud.NpcDialog.displayDialog = false;
        }

        //moby
        //odpowiednia akcja dla mobów
    }
}
