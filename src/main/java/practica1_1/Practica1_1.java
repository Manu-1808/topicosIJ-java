package practica1_1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Practica1_1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        stage.setTitle("Luz y sombra");
        Group root= new Group();
        Scene escena= new Scene(root,300,250, Color.LIGHTBLUE);
        stage.setScene(escena);

        Text texto= new Text(100,150, "JavaFX");
        texto.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD,36));
        root.getChildren().add(texto);

        stage.show();

    }
}
