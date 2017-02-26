package actor;

import core.GameStatus;
import core.Sprite;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Movement extends Sprite {

    public Movement() throws SlickException {
    }

    /**
     * Metoda obsługująca poruszanie się postaci
     *
     * @param input wciśnięty klawisz
     * @param gs Game Status - meta dane gry
     * @param delta ile czasu upłyneło od wykonania się ostatniej metody render
     * w PlayState
     * @param sprite aktualny model bohatera
     * @throws SlickException
     */
    public void go(Input input, core.GameStatus gs, int delta, Sprite sprite) {

        if (input.isKeyDown(Input.KEY_W) || input.isKeyDown(Input.KEY_UP)) {
            sprite.avatar = sprite.movingUp;
            sprite.avatar.update(delta);
            gs.y -= GameStatus.hero.movementSpeed * delta * 0.12f;
        }
        if (input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)) {
            sprite.avatar = sprite.movingDown;
            sprite.avatar.update(delta);
            gs.y += GameStatus.hero.movementSpeed * delta * 0.21f;
        }
        if (input.isKeyDown(Input.KEY_A) || input.isKeyDown(Input.KEY_LEFT)) {
            sprite.avatar = sprite.movingLeft;
            sprite.avatar.update(delta);
            gs.x -= GameStatus.hero.movementSpeed * delta * 0.12f;
        }
        if (input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)) {
            sprite.avatar = sprite.movingRight;
            sprite.avatar.update(delta);
            gs.x += GameStatus.hero.movementSpeed * delta * 0.21f;
        }
    }
}
