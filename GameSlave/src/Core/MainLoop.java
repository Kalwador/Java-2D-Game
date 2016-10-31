package Core;
 
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class MainLoop extends BasicGame
{
    private TiledMap map;
    private Image img;
    private float x,y;
    //private Image heroPath = new Image("Resources/Graphics/Character/Facet4.png",true); //test do postci

    
    @Override
    public void init(GameContainer gc) throws SlickException{
        //info: tutaj inicjalizujemy wszystkie obiekty które się pojawią
        map = new TiledMap("Resources/graphics/maps/map.tmx");
        img = new Image("Resources/Graphics/Character/Facet4.png");
        
        x = 400;
        y = 400;
        
    }
 
    @Override
    public void update(GameContainer gc, int delta) throws SlickException{
        //info: tutaj kalkulacje, movement itp
        int objectLayer = map.getLayerIndex("Object");
        
        Input input = gc.getInput();
        
        if(input.isKeyDown(Input.KEY_W)) {y -= 0.2 * delta;}
        if(input.isKeyDown(Input.KEY_S)) {y += 0.2 * delta;}
        if(input.isKeyDown(Input.KEY_A)) {x -= 0.2 * delta;}
        if(input.isKeyDown(Input.KEY_D)) {x += 0.2 * delta;}
        
        
        
    }
 
    @Override
    public void render(GameContainer gc, Graphics g) throws SlickException{
        //info: tutaj wyświtlamy to co wyliczyliśmy w update
        map.render(0, 0);
        img.draw(x,y,x+48,y+48,0,0,48,48); 
        //(startXonWindow,startYonWindow,endXonWindow,endYonWindow,
        //  startXpartOfpicture,startYpartOfpicture,endXpartOfpicture,endYpartOfpicture)
    }
    
    
    public MainLoop()
    {
        super("Projekt Gry 2D RPG");
    }
    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer window = new AppGameContainer(new MainLoop());
            window.setDisplayMode(1000, 1000, false);
            window.setTargetFrameRate(150);
            window.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
   
}