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


    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Pane mainCanvas = new Pane(); //glowny canvas/płutno gry

        mainCanvas.setPrefSize(SIZE_W, SIZE_H);
        mainCanvas.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));

        
        initMainLoop(mainCanvas.getChildren());//definicja petli glownej
        
        Menu.sceneMenu(window); //powrot do menu
        /*
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

        */
        
    }

   

    public void initAnimation(ObservableList<Node> mainCanvas) {
        Label label1 = new Label("Glowne okno gry"); //notka
        Button doMenu = new Button("Do Menu");
        doMenu.setOnAction(e->Menu.sceneMenu(window));
        
        mainCanvas.add(doMenu);
    }

    public void initMainLoop(ObservableList<Node> mainCanvas) {
        lastTime = System.nanoTime();
        mainLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                currentTime = now;
                fps++;
                delta += currentTime - lastTime;
                updateAnimation(mainCanvas);

                if (delta > ONE_SECOND) {
                    System.out.println("FPS: "+fps);
                    delta -= ONE_SECOND;
                    fps = 0;
                }
                lastTime = currentTime;
            }
        };
    }

    public void updateAnimation(ObservableList<Node> rootPane) {
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
