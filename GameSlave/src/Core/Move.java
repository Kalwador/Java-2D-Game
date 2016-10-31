/*Move by Simon */

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.input.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Move extends Application{
    private static final int KEYBOARD_MOVEMENT_DELTA = 5;
    private static final Duration TRANSLATE_DURATION = Duration.seconds(0.25);
    
    public static void main(String[] args) {
        launch(args);
        
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        final Circle circle = createCircle();
        final Group group = new Group(createInstructions(), circle);
        final TranslateTransition transition = createTranslateTransition(circle);
        final Scene scene = new Scene(group, 600, 400, Color.AQUA);
        moveCircleOnKeyPress(scene, circle);
      /* moveCircleOnMousePress(scene, circle, transition);*/
        stage.setScene(scene);
        stage.show();
    }

    
    
    
    protected Label createInstructions(){
        Label instructions = new Label(
        "Użyj strzałek aby poruszać obiektem \n"+
        "Kliknij myszką aby przemieścić się w dane miejsce"        );
        instructions.setTextFill(Color.BLACK);
        return instructions;
    }
    
    protected Circle createCircle(){
        final Circle circle = new Circle(50,25,12,Color.BROWN);
        return circle;
    }
    
    protected TranslateTransition createTranslateTransition(final Circle circle){
        final TranslateTransition transition = new TranslateTransition(TRANSLATE_DURATION, circle);
        transition.setOnFinished(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent t) {
                circle.setCenterX(circle.getTranslateX()+circle.getCenterX());
                circle.setCenterY(circle.getTranslateY()+circle.getCenterY());
                circle.setTranslateX(0);
                circle.setTranslateY(0);
            }
        });
        return transition;
    }
    
    protected void moveCircleOnKeyPress(Scene scene, final Circle circle) {
        scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
           @Override public void handle(KeyEvent event){
               switch (event.getCode()){
                   case W:     circle.setCenterY(circle.getCenterY()- KEYBOARD_MOVEMENT_DELTA); break;
                   case D:  circle.setCenterX(circle.getCenterX()+ KEYBOARD_MOVEMENT_DELTA); break;
                   case S:   circle.setCenterY(circle.getCenterY()+ KEYBOARD_MOVEMENT_DELTA); break;
                   case A:   circle.setCenterX(circle.getCenterX()- KEYBOARD_MOVEMENT_DELTA); break;
               }
           } 
        });
    }
    
    /*protected void moveCircleOnMousePress(Scene scene, final Circle circle, final TranslateTransition transition){
        scene.setOnMousePressed(new EventHandler<MouseEvent>(){
            @Override public void handle(MouseEvent event){
                transition.setToX(event.getSceneX()-circle.getCenterX()- KEYBOARD_MOVEMENT_DELTA);
                transition.setToY(event.getSceneY()-circle.getCenterY()+ KEYBOARD_MOVEMENT_DELTA);
                transition.playFromStart();
                
            }
        });*/
    }
    

