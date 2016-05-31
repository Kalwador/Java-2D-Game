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
    //okno
    Stage window;
    //scena menu i scena w ktorej bedzie gra
    //potem moze bedzie kilka scen ktore beda sie ladowaly dla danych lokacji
    Scene menu,mainScene;
    
    public static void main(String[] args) {
        launch(args);
    }   
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;  //tworzenie okna
        
       

        //przyciski
        Button wznow = new Button("Wznów grę");
        Button zapisz = new Button();
        Button ustawienia = new Button();
        Button wyjscie = new Button();
        //definicje przyciskow
        wznow.setOnAction(new EventHandler<ActionEvent>() {
        //lub button.setOnAction(e -> window.setScene(mainScene));
            @Override
            public void handle(ActionEvent event) {
                window.setScene(mainScene);
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
        wyjscie.setText("  Wyjście    ");
        wyjscie.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("wychodze z gry");
                //definicja wyjsca z gry
            }
        });
        //pane jeden z dostpepnych szkieletow menu, taka siatka
        Pane layoutMenu = new Pane();
        //dodaje do siatki przyciski, mozna i inne rzeczy
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
        menu = new Scene(layoutMenu,800,600);
        
        Button doMenu = new Button("Do Menu");
        doMenu.setOnAction(e->window.setScene(menu));
        
        Label label1 = new Label("Glowne okno gry"); //dopisek do okna
        
        //definiuje scene glowna
        VBox layout2 = new VBox(20);
        layout2.getChildren().addAll(label1,doMenu);
        mainScene = new Scene(layout2,600,300);
        
        //ustawiam scene startowa
        window.setScene(menu);
        //tytol okna
        window.setTitle("PRojekt Gry 2D RPG");
        //pokaz okno
        window.show();
    }
}