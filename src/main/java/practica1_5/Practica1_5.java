package practica1_5;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Practica1_5 extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("Práctica 1.5 - PathElement alineados");

        Group root = new Group();
        Scene scene = new Scene(root, 900, 600, Color.LIGHTGRAY);
        stage.setScene(scene);

        double startX = 100;
        double startY = 80;
        double espacio = 60;

        // move to
        agregarEjemplo(
                root,
                "MoveTo + LineTo",
                new Rectangle(20, 20, Color.CORNFLOWERBLUE),
                new Path(
                        new MoveTo(startX, startY),
                        new LineTo(startX + 200, startY)
                ),
                startX,
                startY - 15
        );

        // hlineto
        startY += espacio;
        agregarEjemplo(
                root,
                "HLineTo",
                new Circle(10, Color.LIGHTGREEN),
                new Path(
                        new MoveTo(startX, startY),
                        new HLineTo(startX + 200)
                ),
                startX,
                startY - 15
        );

        // vlineto
        startY += espacio;
        agregarEjemplo(
                root,
                "VLineTo",
                new Rectangle(20, 20, Color.ORANGE),
                new Path(
                        new MoveTo(startX, startY),
                        new VLineTo(startY + 40)
                ),
                startX,
                startY - 15
        );

        //cuadcurbe
        startY += espacio;
        agregarEjemplo(
                root,
                "QuadCurveTo",
                new Circle(10, Color.PINK),
                new Path(
                        new MoveTo(startX, startY),
                        new QuadCurveTo(startX + 100, startY - 40, startX + 200, startY)
                ),
                startX,
                startY - 15
        );

        // cubiccurbe
        startY += espacio;
        agregarEjemplo(
                root,
                "CubicCurveTo",
                new Rectangle(20, 20, Color.MEDIUMPURPLE),
                new Path(
                        new MoveTo(startX, startY),
                        new CubicCurveTo(
                                startX + 60, startY - 40,
                                startX + 140, startY + 40,
                                startX + 200, startY
                        )
                ),
                startX,
                startY - 15
        );

        //arc to
        startY += espacio;
        ArcTo arc = new ArcTo();
        arc.setX(startX + 200);
        arc.setY(startY);
        arc.setRadiusX(30);
        arc.setRadiusY(30);
        arc.setSweepFlag(true);

        agregarEjemplo(
                root,
                "ArcTo",
                new Circle(10, Color.RED),
                new Path(
                        new MoveTo(startX, startY),
                        arc
                ),
                startX,
                startY - 15
        );

        // closepath
        startY += espacio;
        agregarEjemplo(
                root,
                "ClosePath",
                new Rectangle(20, 20, Color.DARKCYAN),
                new Path(
                        new MoveTo(startX, startY),
                        new LineTo(startX + 60, startY),
                        new LineTo(startX + 60, startY + 40),
                        new LineTo(startX, startY + 40),
                        new ClosePath()
                ),
                startX,
                startY - 15
        );

        stage.show();
    }

    //
    private void agregarEjemplo(Group root, String nombre, Shape figura, Path path,
                                double textX, double textY) {

        // Texto
        Text texto = new Text(textX, textY, nombre);
        texto.setFont(Font.font("Arial", 14));

        // Estilo del Path
        path.setStroke(Color.DODGERBLUE);
        path.setStrokeWidth(2);
        path.getStrokeDashArray().setAll(6d, 6d);
        path.setFill(Color.TRANSPARENT);

        // Animación
        PathTransition pt = new PathTransition(
                Duration.seconds(3),
                path,
                figura
        );
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.setAutoReverse(true);
        pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pt.play();

        root.getChildren().addAll(path, figura, texto);
    }

    public static void main(String[] args) {
        launch();
    }
}
