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


public class Main extends Application {
    
    Stage window;
    Scene menu, mainScene;
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        
        Label label1 = new Label("Menu");
        
        Button button1 = new Button("Graj");
        button1.setOnAction(e -> window.setScene(mainScene));
         
        
        //layout1 
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        menu = new Scene(layout1,200,200);
        
        
        //button 2
        Button button2 = new Button("do menu");
        button2.setOnAction(e -> window.setScene(menu));
    
    
        //layout2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        mainScene = new Scene(layout2,600,300);
        
        window.setScene(menu);
        window.setTitle("gra");
        window.show();
    }
}
