package core;

import core.ActionHandler;
import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.tiled.TiledMap;

public class Play extends BasicGameState {
    
    private TiledMap map;
    private Image img;
    //GameStatus gs;
    int [] duration = {200,200,200,200}; 
    Animation hero, movingUp, movingDown, movingLeft, movingRight ;
    float  shiftX = GameStatus.x + 550;
    float  shiftY = GameStatus.y + 400;

    
    @Override
    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
        map = new TiledMap("Resources/graphics/maps/mapTest.tmx");
        img = new Image("Resources/Graphics/Character/heroTest.png");

        GameStatus.x = 400;
        GameStatus.y = 400;

        
        Image [] walkDown =  {img.getSubImage(0, 0, 48, 48),img.getSubImage(48, 0, 48, 48)
                             ,img.getSubImage(96, 0, 48, 48),img.getSubImage(144, 0, 48, 48)};
        Image [] walkLeft =  {img.getSubImage(0, 48, 48, 48),img.getSubImage(48, 48, 48, 48)
                             ,img.getSubImage(96, 48, 48, 48),img.getSubImage(144, 48, 48, 48)};
        Image [] walkRight = {img.getSubImage(0, 96, 48, 48),img.getSubImage(48, 96, 48, 48)
                             ,img.getSubImage(96, 96, 48, 48),img.getSubImage(144, 96, 48, 48)};
        Image [] walkUp =    {img.getSubImage(0, 144, 48, 48),img.getSubImage(48, 144, 48, 48)
                             ,img.getSubImage(96, 144, 48, 48),img.getSubImage(144, 144, 48, 48)};
        
        movingDown = new Animation(walkDown, duration, false);
        movingLeft = new Animation(walkLeft, duration, false);
        movingRight = new Animation(walkRight, duration, false);
        movingUp = new Animation(walkUp, duration, false);
        
        hero = movingDown;
        
    }

    @Override
    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        //info: tutaj kalkulacje, movement itp
        
        Input input = gc.getInput(); 
        
        //ActionHandler.handlePlay(input, gc, sbg, delta);
        
        if(input.isKeyDown(Input.KEY_W) || input.isKeyDown(Input.KEY_UP)) {
            hero = movingUp;
            GameStatus.y -= GameStatus.heroSpeed * 0.1 * delta;
        }
        if(input.isKeyDown(Input.KEY_S) || input.isKeyDown(Input.KEY_DOWN)) {
            hero = movingDown;
            GameStatus.y += GameStatus.heroSpeed * 0.1 * delta;
        }
        if(input.isKeyDown(Input.KEY_A) || input.isKeyDown(Input.KEY_LEFT)) {
            hero = movingLeft;
            GameStatus.x -= GameStatus.heroSpeed * 0.1 * delta;
        }
        if(input.isKeyDown(Input.KEY_D) || input.isKeyDown(Input.KEY_RIGHT)) {
            hero = movingRight;
            GameStatus.x += GameStatus.heroSpeed * 0.1 * delta;
        }
        if(input.isKeyDown(Input.KEY_ESCAPE)) {
            sbg.enterState(2);
        }

    }

    @Override
    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        map.render(0, 0,(int)(GameStatus.x / 32),(int)(GameStatus.y / 32),32,23);
         // przez to że render przyjmuje inty mapa tak skacze
         
         
        img.draw(GameStatus.x, GameStatus.y, GameStatus.x + 48, GameStatus.y + 48, 0, 0, 48, 48);
        //(startXonWindow,startYonWindow,endXonWindow,endYonWindow,
        //  startXpartOfpicture,startYpartOfpicture,endXpartOfpicture,endYpartOfpicture)
    }
    
    Play(int mainLoop) {
    }
    public Play() {
    }
    @Override
    public int getID() {
        return 1;
    }

}
