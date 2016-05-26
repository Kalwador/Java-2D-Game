package sprtest;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


public class Sprtest extends JFrame {
    int kCode = 0;
    int i=1;
    int sx = 32;
    int sy = 64;
    public class kListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent key){
            int keyCode = key.getKeyCode();
            
            if(keyCode == KeyEvent.VK_A){
                sx-=2;
            }
            if(keyCode == KeyEvent.VK_D){
                sx+=2;
            }
            if(keyCode == KeyEvent.VK_W){
                sy-=2;
            }
            if(keyCode == KeyEvent.VK_S){
                sy+=2;
            }
            kCode = keyCode;
        }
        @Override
        public void keyReleased(KeyEvent key){
            if (kCode!=0){
            try {
            Thread.sleep(50);
            kCode = 0;
            } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            }
            }
        }
            
    }
    BufferedImage sprite;    
    Animator nogi;
    Animator nogiW;
    Animator nogiN;
    Animator nogiS;
    Animator nogiE;
    //Utworzenie okna
    public Sprtest(){
        addKeyListener(new kListener());
        setTitle("Test animacji");
        setSize(200,200);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        init();
    }
    
    private void init(){     
        BufferedImageLoader loader = new BufferedImageLoader();
        BufferedImage spriteSheet = null;   
        
        //Java mi kazała to wrzucić - nie wiem co to, ale działa jak należy
        try {
            spriteSheet = loader.loadimage("sprite.png");
        } catch (IOException ex) {
            Logger.getLogger(Sprtest.class.getName()).log(Level.SEVERE, null, ex);
        }
        SpriteSheet ss = new SpriteSheet(spriteSheet);
        
        //Utworzenie listy i dodanie do niej części obrazka ( poszczególnych klatek )
        //dodajDoListy(obrazek(x,y,szerokosc,wysokosc))
        ArrayList<BufferedImage> frameNogi = new ArrayList<BufferedImage>();
        frameNogi.add(ss.grabSprite(0*32, 3*64, 32, 64));
        
        ArrayList<BufferedImage> frameNogiE = new ArrayList<BufferedImage>();
        frameNogiE.add(ss.grabSprite(1*32, 0*64, 32, 64));
        frameNogiE.add(ss.grabSprite(2*32, 0*64, 32, 64));
        frameNogiE.add(ss.grabSprite(3*32, 0*64, 32, 64));
        frameNogiE.add(ss.grabSprite(4*32, 0*64, 32, 64));
        frameNogiE.add(ss.grabSprite(5*32, 0*64, 32, 64));
        frameNogiE.add(ss.grabSprite(6*32, 0*64, 32, 64));
        
        ArrayList<BufferedImage> frameNogiW = new ArrayList<BufferedImage>();
        frameNogiW.add(ss.grabSprite(0*32, 2*64, 32, 64));
        frameNogiW.add(ss.grabSprite(1*32, 2*64, 32, 64));
        frameNogiW.add(ss.grabSprite(2*32, 2*64, 32, 64));
        frameNogiW.add(ss.grabSprite(3*32, 2*64, 32, 64));
        frameNogiW.add(ss.grabSprite(4*32, 2*64, 32, 64));
        frameNogiW.add(ss.grabSprite(5*32, 2*64, 32, 64));
        frameNogiW.add(ss.grabSprite(6*32, 2*64, 32, 64));
        
        ArrayList<BufferedImage> frameNogiN = new ArrayList<BufferedImage>();
        frameNogiN.add(ss.grabSprite(1*32, 1*64, 32, 64));
        frameNogiN.add(ss.grabSprite(2*32, 1*64, 32, 64));
        frameNogiN.add(ss.grabSprite(3*32, 1*64, 32, 64));
        frameNogiN.add(ss.grabSprite(4*32, 1*64, 32, 64));
        frameNogiN.add(ss.grabSprite(5*32, 1*64, 32, 64));
        frameNogiN.add(ss.grabSprite(6*32, 1*64, 32, 64));
        
        ArrayList<BufferedImage> frameNogiS = new ArrayList<BufferedImage>();
        frameNogiS.add(ss.grabSprite(1*32, 3*64, 32, 64));
        frameNogiS.add(ss.grabSprite(2*32, 3*64, 32, 64));
        frameNogiS.add(ss.grabSprite(3*32, 3*64, 32, 64));
        frameNogiS.add(ss.grabSprite(4*32, 3*64, 32, 64));
        frameNogiS.add(ss.grabSprite(5*32, 3*64, 32, 64));
        frameNogiS.add(ss.grabSprite(6*32, 3*64, 32, 64));
        
        nogiW = new Animator(frameNogiW);
        nogiW.setSpeed(100);
        nogiE = new Animator(frameNogiE);
        nogiE.setSpeed(100);
        nogiN = new Animator(frameNogiN);
        nogiN.setSpeed(100);
        nogiS = new Animator(frameNogiS);
        nogiS.setSpeed(100);
        nogi = new Animator(frameNogi);
        nogiW.start();
        nogi.start();
        nogiE.start();
        nogiN.start();
        nogiS.start();

        
    }
    Image dbImage;
    Graphics dbg;
    
    @Override
    public void paint(Graphics g){
        dbImage = createImage(getWidth(), getHeight());
        dbg = dbImage.getGraphics();
        paintComponent(dbg);
        g.drawImage(dbImage, 0, 0, null);
    }
            //a=65 d=68 w=87 s=83
    public void paintComponent(Graphics g) {
        switch (kCode) {
            case 65:
                if (nogiW != null) {
                    nogiW.update(System.currentTimeMillis());
                    g.drawImage(nogiW.sprite, sx, sy, 32, 64, null);
                }   repaint();
                break;
            case 68:
                if (nogiE != null) {
                    nogiE.update(System.currentTimeMillis());
                    g.drawImage(nogiE.sprite, sx, sy, 32, 64, null);
                }   repaint();
                break;
            case 87:
                if (nogiN != null) {
                    nogiN.update(System.currentTimeMillis());
                    g.drawImage(nogiN.sprite, sx, sy, 32, 64, null);
                }   repaint();
                break;
            case 83:
                if (nogiS != null) {
                    nogiS.update(System.currentTimeMillis());
                    g.drawImage(nogiS.sprite, sx, sy, 32, 64, null);
                }   repaint();
                break;
            default:
                if (nogi != null ) {
            nogi.update(System.currentTimeMillis());
            g.drawImage(nogi.sprite, sx, sy, 32, 64, null);
                break;
        }

        }
        repaint();       
    }
    
    public static void main(String[] args) {
        Sprtest main = new Sprtest();
    }
    
}
