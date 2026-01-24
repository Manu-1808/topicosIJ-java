package practica1_6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Practica1_6 extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("Práctica 1.6 - Eventos y Sonido");

        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.LIGHTGRAY);
        stage.setScene(scene);

        // Rectangle (tecla)
        Rectangle tecla = new Rectangle(150, 100, 100, 60);
        tecla.setFill(Color.CORNFLOWERBLUE);
        tecla.setStroke(Color.BLACK);

        // Cargar sonido
        AudioClip sonido = new AudioClip(
                getClass().getResource("/sonidos/Nota1.wav").toExternalForm()
        );

        // Evento de mouse
        tecla.setOnMouseClicked((MouseEvent e) -> {
            sonido.play();
            tecla.setFill(Color.DODGERBLUE);
        });

        tecla.setOnMouseReleased(e ->
                tecla.setFill(Color.CORNFLOWERBLUE)
        );

        root.getChildren().add(tecla);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
