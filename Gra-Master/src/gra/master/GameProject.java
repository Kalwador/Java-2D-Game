/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;



public class GameProject extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button wznow = new Button();
        Button zapisz = new Button();
        Button ustawienia = new Button();
        Button wyjscie = new Button();
        Circle kolko = new Circle(0,0,30);
        wznow.setText("Wznów grę");
        wznow.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("wznawiam gre");
            }
        });
        zapisz.setText("Zapisz grę");
        zapisz.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("zapisuje gre");
            }
        });
        ustawienia.setText("Ustawiena");
        ustawienia.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("ustawienia");
            }
        });
        wyjscie.setText("Wyjście");
        wyjscie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("wychodze z gry");
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
        });
        
        Pane root = new Pane();
        
        //root.getChildren().add(kolko);
        root.getChildren().add(wznow);
        root.getChildren().add(zapisz);
        root.getChildren().add(ustawienia);
        root.getChildren().add(wyjscie);
        wznow.setLayoutX(350);
        wznow.setLayoutY(200);
        zapisz.setLayoutX(350);
        zapisz.setLayoutY(250);
        ustawienia.setLayoutX(350);
        ustawienia.setLayoutY(300);
        wyjscie.setLayoutX(350);
        wyjscie.setLayoutY(350);
       
        kolko.setFill(Color.GREEN);
        
        
        Scene scene = new Scene(root, 800, 600);
        
        primaryStage.setTitle(".::GameProject::.");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }    
}
