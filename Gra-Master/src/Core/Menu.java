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
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Menu {
    public static void setScene(Stage window) {
        //wielkosc okna
        final int SIZE_W = 800;
        final int SIZE_H = 600;
        
        //pane to okno-siatka na ktorej szkielecie można rozmieszczac przyciski
        Pane layoutMenu = new Pane();
        layoutMenu.setPrefSize(SIZE_W, SIZE_H); //wielkość okna
        layoutMenu.setBackground(new Background(new BackgroundFill(Color.BLACK, null, null)));//kolor okna
        //przyciski menu
        Button wznow = new Button("Wznów grę");
        Button zapisz = new Button(" Zapisz grę ");
        Button ustawienia = new Button(" Ustawiena ");
        Button wyjscie = new Button("   Wyjście    ");
        
        //dodaje do siatki przyciski i usawiam ich polozenie
        layoutMenu.getChildren().add(wznow);
        wznow.setLayoutX(350);
        wznow.setLayoutY(200);
        layoutMenu.getChildren().add(zapisz);
        zapisz.setLayoutX(350);
        zapisz.setLayoutY(250);
        layoutMenu.getChildren().add(ustawienia);
        ustawienia.setLayoutX(350);
        ustawienia.setLayoutY(300);
        layoutMenu.getChildren().add(wyjscie);
        wyjscie.setLayoutX(350);
        wyjscie.setLayoutY(350);

        //definuje scene "menu"
        Scene menu;
        menu = new Scene(layoutMenu, 800, 600);
        
        
        Scene mainScene;
        //scena glowna
        
        Button doMenu = new Button("Do Menu");
        doMenu.setOnAction(e->window.setScene(menu));
        
        Label label1 = new Label("Glowne okno gry"); //dopisek do okna
        
        //definiuje scene glowna
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label1,doMenu);
        mainScene = new Scene(layout2,600,300);
        
        //definicje przyciskow
        wznow.setOnAction(new EventHandler<ActionEvent>() {
            //lub button.setOnAction(e -> window.setScene(mainScene));
            @Override
            public void handle(ActionEvent event) {
                window.setScene(mainScene);
            }
        });
        zapisz.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("zapisuje gre");
            }
        });
        ustawienia.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("ustawienia");
            }
        });
        wyjscie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("wychodze z gry");
                //definicja wyjsca z gry
            }
        });
        //pane jeden z dostpepnych szkieletow menu, taka siatka
        
        
        
        
        
        //ustawiam scene startowa
        window.setScene(menu);
        //tytol okna
        window.setTitle("PRojekt Gry 2D RPG");
        //pokaz okno
        window.show();
    }
}
