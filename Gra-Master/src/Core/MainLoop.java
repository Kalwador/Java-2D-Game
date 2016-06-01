package Core;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainLoop extends Application {
    Stage window;
    
    final long ONE_SECOND = 1000000000;
        long currentTime = 0;
        long lastTime = 0;
    public static void main(String[] args) {
        launch(args);
    }   
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        
        
        
        
        window = primaryStage;
        Menu.setScene(window);

    }
}