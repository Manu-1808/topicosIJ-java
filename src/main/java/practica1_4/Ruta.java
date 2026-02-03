package practica1_4;


import javafx.animation.FadeTransition;
import javafx.animation.PathTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.util.Duration;

import java.io.IOException;

public class Ruta extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Figuras");
        Group root = new Group();
        Scene escena = new Scene(root, 500, 550);
        stage.setScene(escena);

        //Crear un rectangulo, indicando posiic[on y dimensiones
        javafx.scene.shape.Rectangle cuadro = new Rectangle(100,100,50,50);
        cuadro.setFill(Color.DODGERBLUE);//color de relleno
        cuadro.setArcHeight(20);//Redondear esquina sobre la altura
        cuadro.setArcWidth(20);//Redondear esqquina sobre el ancho
        root.getChildren().add(cuadro);//adicionar al grupo raiz

        //Crear la transicion y asignar al nodo "cuadro"
        ScaleTransition escalar = new ScaleTransition(Duration.seconds(4),cuadro);
        escalar.setToX(3);//Escala del eje x
        escalar.setToY(3);
        escalar.setAutoReverse(true);
        escalar.setCycleCount(Timeline.INDEFINITE);
        //escalar.play();


        FadeTransition desvanecer = new FadeTransition(Duration.seconds(4), cuadro);
        desvanecer.setFromValue(1);//A partir de que intensidad de color 1 a 0
        desvanecer.setToValue(0);
        desvanecer.setAutoReverse(true);
        desvanecer.setCycleCount(Timeline.INDEFINITE);
        //desvanecer.play();

        Path ruta = new Path();
        ruta.getElements().add(new MoveTo(20,20));
        ruta.getElements().add(new CubicCurveTo(380,0,380,120,200,120));
        ruta.getElements().add(new CubicCurveTo(0,120,0,240,380,240));
        ruta.setStroke(Color.DODGERBLUE);
        ruta.getStrokeDashArray().setAll(5d,5d);
        root.getChildren().add(ruta);

        PathTransition seguirRuta = new PathTransition();
        seguirRuta.setDuration(Duration.seconds(4));
        seguirRuta.setPath(ruta);
        seguirRuta.setNode(cuadro);

        seguirRuta.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        seguirRuta.setAutoReverse(true);
        seguirRuta.setCycleCount(Timeline.INDEFINITE);
        seguirRuta.play();

        stage.show();
    }

    static void main(String[] args) {
        launch();

    }
}
