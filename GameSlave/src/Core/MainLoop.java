package Core;
 
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class MainLoop extends BasicGame
{
    private TiledMap map;
    
    @Override
    public void init(GameContainer container) throws SlickException{
        map = new TiledMap("Resources/graphics/maps/map.tmx");
    }
 
    @Override
    public void update(GameContainer container, int delta) throws SlickException{
        int objectLayer = map.getLayerIndex("Object");
        
        //map.getTileId(0, 0, objectLayer);
    }
 
    public void render(GameContainer container, Graphics g) throws SlickException{
        map.render(0, 0);
    }
    
    
    public MainLoop()
    {
        super("Projekt Gry 2D RPG");
    }
    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new MainLoop());
            app.setDisplayMode(1000, 1000, false);
            app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
   
}