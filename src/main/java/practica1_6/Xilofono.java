package practica1_6;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Xilofono extends Application {

    private final String[] sonidos = {
            "/sonidos/do.wav",
            "/sonidos/re.wav",
            "/sonidos/mi.wav",
            "/sonidos/fa.wav",
            "/sonidos/sol.wav",
            "/sonidos/la.wav",
            "/sonidos/si.wav",
            "/sonidos/doH.wav"
    };

    private final Color[] colores = {
            Color.RED, Color.ORANGE, Color.YELLOW,
            Color.GREEN, Color.CYAN, Color.BLUE, Color.VIOLET, Color.LIGHTCORAL
    };

    @Override
    public void start(Stage stage) {

        stage.setTitle("Xilófono JavaFX");

        Group root = new Group();
        Scene scene = new Scene(root, 600, 300, Color.LIGHTGRAY);
        stage.setScene(scene);

        double x = 40;

        for (int i = 0; i < sonidos.length; i++) {

            Rectangle tecla = new Rectangle(x, 100, 60, 120);
            tecla.setFill(colores[i]);
            tecla.setStroke(Color.BLACK);

            AudioClip sonido = new AudioClip(
                    getClass().getResource(sonidos[i]).toExternalForm()
            );

            tecla.setOnMousePressed(e -> {
                sonido.play();
                tecla.setOpacity(0.7);
            });

            tecla.setOnMouseReleased(e ->
                    tecla.setOpacity(1)
            );

            root.getChildren().add(tecla);
            x += 70;
        }

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
