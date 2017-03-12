package screenBlur;

import java.awt.AWTException;
import java.awt.Graphics;
import java.awt.Image;
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

public class ScreenClass {

    //nr aktualnie tworzonego screena
    public static int nrScreena = 0;

    /**
     * Metoda do robienia screenów gry.
     *
     * @param bWspX slickowa wspX myszki
     * @param bWspY slickowa wspY myszki
     */
    public static void makeScreen(int bWspX, int bWspY) {
        try {

            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

            double mouseX = MouseInfo.getPointerInfo().getLocation().getX() - bWspX;
            double mouseY = MouseInfo.getPointerInfo().getLocation().getY() - bWspY;

            Rectangle GAMEscreenRect = new Rectangle((int) mouseX, (int) mouseY, 1280, 720);

            BufferedImage capture = new Robot().createScreenCapture(GAMEscreenRect);

            float[] matrix = new float[400];
            for (int i = 0; i < 400; i++) {
                matrix[i] = 1.0f / 400.0f;
            }

            BufferedImageOp op = new ConvolveOp(new Kernel(20, 20, matrix), ConvolveOp.EDGE_NO_OP, null);
            BufferedImage capture1 = new BufferedImage(1280, 720, BufferedImage.TYPE_INT_RGB);
            nrScreena++;
            ImageIO.write(op.filter(capture, capture1), "png", new File("graphic/menu/skrin" + nrScreena + ".png"));
            if (nrScreena > 2) {
                deleteScreen();
            }

        } catch (AWTException aWTException) {
            System.out.println("Błąd AWT - makeScreen");
        } catch (IOException iOException) {
            System.out.println("Błąd IO - makeScreen");
        }
    }
    /**
     * Metoda wykonuje mały zrzut ekranu do ikon save bazując na aktualnym dużym screenie
     * @param index nr screena 
     */
    public static void makeSmallScreen(int index) {
        try {

            BufferedImage bufferedImage = new BufferedImage(109, 104,
                    BufferedImage.TYPE_INT_RGB);

            Graphics g = bufferedImage.createGraphics();

            g.drawImage(ImageIO.read(new File("graphic/menu/skrin" + nrScreena + ".png")).getScaledInstance(109, 104, Image.SCALE_SMOOTH), 0, 0, null);
            g.dispose();

            ImageIO.write(bufferedImage, "png", new File("save/save" + index + ".png"));

        } catch (IOException iOException) {
            System.out.println("Błąd IO - makeScreen");
        }
    }

    /**
     *
     * @return zwraca ścieżkę z nr obecnego screena
     */
    public static String screenNumber() {
        return "graphic/menu/skrin" + nrScreena + ".png";
    }

    /**
     * Metoda usuwa screeny nie używane przez program
     */
    public static void deleteScreen() {
        try {
            File file = null;
            for (int i = 0; i < nrScreena; i++) {
                file = new File("graphic/menu/skrin" + i + ".png");
                if (file.exists()) {
                    if (file.delete()) {
                        System.out.println(file.getName() + " is deleted!");
                    } else {
                        System.out.println(file.getName() + " delete operation is failed.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception - class:ScreenClass   methode:deleteScreen ");
            e.printStackTrace();
        }
    }
}
