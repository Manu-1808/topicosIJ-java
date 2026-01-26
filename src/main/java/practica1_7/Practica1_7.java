package practica1_7;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Practica1_7 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Duke");
        Group root = new Group();
        Scene escena=new Scene(root, 600,300, Color.CADETBLUE);
        primaryStage.setScene(escena);

        //image permite el acceso al archivo de imagen
        Image image= new Image(getClass().getResourceAsStream("/imagenes/duke.jpeg"));
        //ImageView se usa para mostrar la imagen
        ImageView imageView = new ImageView(image);
        imageView.setPreserveRatio(true);//conserva las proporciones de las imagenes
        imageView.setFitHeight(200);//alto de la imagen
        root.getChildren().add(imageView);//agregar a la escena

        primaryStage.show();
    }
}
