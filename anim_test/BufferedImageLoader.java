package sprtest;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class BufferedImageLoader {

    public BufferedImage loadimage(String pathRelativeToThis) throws IOException{
        URL url = this.getClass().getResource(pathRelativeToThis);
        BufferedImage img = ImageIO.read(url);
        return img;
    }
}
