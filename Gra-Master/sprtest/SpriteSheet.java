package sprtest;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    public SpriteSheet(){
        
    }
    public BufferedImage spriteSheet;
    public SpriteSheet(BufferedImage ssheet){
        this.spriteSheet = ssheet;
    }
    
    public BufferedImage grabSprite(int x, int y, int width, int height){
        BufferedImage sprite = spriteSheet.getSubimage(x, y, width, height);
        return sprite;
    }
}
