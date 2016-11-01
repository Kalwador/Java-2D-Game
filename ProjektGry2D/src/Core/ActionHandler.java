/*
    Obsługa wszystkich zdarzeń, klawiatury, myszki,
 */
package Core;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class ActionHandler {
    float gameSpeed; //przyda się do konsoli
    public static void handle(Input input,int delta) {
        if(input.isKeyDown(Input.KEY_W) || input.isKeyDown(Input.KEY_UP)) {MainLoop.y -= 0.2 * delta;}
        if(input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)) {MainLoop.y += 0.4 * delta;}
        if(input.isKeyDown(Input.KEY_A) || input.isKeyDown(Input.KEY_LEFT)) {MainLoop.x -= 0.2 * delta;}
        if(input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)) {MainLoop.x += 0.4 * delta;}
        if(input.isKeyPressed(Input.KEY_ESCAPE)) {/*metoda otwierajaca menuPause*/}
    }
}
