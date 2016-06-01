package Core;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainLoop extends Application {

    Stage window;
    
    final int SIZE_W = 800;//wielkosci okna
    final int SIZE_H = 600;
    
    //do licznika fpsow
    final long ONE_SECOND = 1000000000; //jedna sekonda
    long currentTime = 0;
    long lastTime = 0;
    int fps = 0;
    double delta = 0; //suma roznic pomiedzy currentTime a lastTime
    Text tFPS; //do wyswietlania fpsow
    AnimationTimer mainLoop; //licznik petli gry
    private Polygon star;
   
    private int dirx = 1;
    private int diry = 1;
   

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Pane mainCanvas = new Pane(); //glowny canvas/płutno gry

        mainCanvas.setPrefSize(SIZE_W, SIZE_H);
        mainCanvas.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));

    //initialize all objects of the main loop
      initNodes(mainCanvas.getChildren());
      //define the main loop
      initMainLoop(mainCanvas.getChildren());
      //main scene
        //scena glowna
        Scene mainScene = new Scene(mainCanvas);
        //okno glowne
        window.setScene(mainScene);
        window.setResizable(false);
        window.setOnCloseRequest(event -> {
            mainLoop.stop();
            System.exit(0);
        });
        window.show();
        mainLoop.start();

        
        
    }

   public void initNodes(ObservableList<Node> rootPane){
      initAnimation(rootPane);
   }
   
   public void initAnimation(ObservableList<Node> mainCanvas){
      star = new Polygon();
      Double[] starCoord = new Double[]{ 
            35.0, 120.5, 37.9, 129.1, 46.9, 129.1, 39.7, 134.5, 42.3,
            143.1, 35.0 , 139.0, 27.7, 143.1, 30.3, 134.5, 23.1, 129.1,
            32.1,129.1};
      star.getPoints().addAll(starCoord);
      star.setTranslateX(350);
      star.setTranslateY(180);
      star.setFill(Color.YELLOW);
      mainCanvas.add(star);
      star.setScaleX(star.getScaleX()+5);
      star.setScaleY(star.getScaleY()+5);
   }
   
   public void initMainLoop(ObservableList<Node> mainCanvas){
      lastTime = System.nanoTime();
      mainLoop = new AnimationTimer() {
         
         @Override
         public void handle(long now) {
            currentTime = now;
            fps++;
            delta += currentTime-lastTime;
            
            updateAnimation(mainCanvas);
            
            if(delta > ONE_SECOND){
               System.out.println("FPS : "+fps);
               delta -= ONE_SECOND;
               fps = 0;
            }
            
            lastTime = currentTime;
         }
      };
   }
   
   public void updateAnimation(ObservableList<Node> mainCanvas){
      Bounds starbounds = star.getBoundsInParent();
      
      double posx = star.getTranslateX();
      double posy = star.getTranslateY();

      if((starbounds.getMaxX() >= SIZE_W-200) || (starbounds.getMinX() <= 0.0)){
         dirx = -dirx;
         star.setScaleX(1);
         star.setScaleY(1);
      }
      if((starbounds.getMaxY() >= SIZE_H-200) || (starbounds.getMinY() <= 0.0)){
         diry = -diry;
         star.setScaleX(1);
         star.setScaleY(1);
      }
      star.setTranslateX(posx/*+(3*dirx)*/);
      star.setTranslateY(posy/*+(3*diry)*/);
      
      
      star.setScaleX(star.getScaleX()+0.1);
      star.setScaleY(star.getScaleY()+0.1);

   }
   
   public static void main(String[] args){
      launch(args);
   }
   

}