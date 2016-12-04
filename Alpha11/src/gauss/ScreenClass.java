/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gauss;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Jarek
 */
public class ScreenClass {
    public static int nrScreena = 0;
    //metoda do robienia screenów gry
    public static void makeScreen() {
        try {
            
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            //System.out.println(screenRect.height + " " + screenRect.width + " " + screenRect.x + " " + screenRect.y);

            double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
            double mouseY = MouseInfo.getPointerInfo().getLocation().getY();

            Rectangle GAMEscreenRect = new Rectangle((int) mouseX, (int) mouseY, 1280, 720);

            BufferedImage capture = new Robot().createScreenCapture(GAMEscreenRect);
            //ImageIO.write(capture, "png", new File("skrin.png"));

            float[] matrix = new float[400];
            for (int i = 0; i < 400; i++) {
                matrix[i] = 1.0f / 400.0f;
            }

            BufferedImageOp op = new ConvolveOp(new Kernel(20, 20, matrix), ConvolveOp.EDGE_NO_OP, null);
            BufferedImage capture1 = new BufferedImage(1280, 720, BufferedImage.TYPE_INT_RGB);
            //BufferedImage blurredImage = op.filter(capture, capture1);

            ImageIO.write(op.filter(capture, capture1), "png", new File("graphic/menu/skrin1.png"));
            op=null;capture=null;capture1=null;
//            nrScreena ++;

        } catch (AWTException aWTException) {
            System.out.println("Błąd AWT - makeScreen");
        } catch (IOException iOException) {
            System.out.println("Błąd IO - makeScreen");
        }
    }
}
