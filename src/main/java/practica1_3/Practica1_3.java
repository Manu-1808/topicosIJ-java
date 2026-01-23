package practica1_3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Practica1_3 extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("Práctica 1.3 - Figuras JavaFX");

        Group root = new Group();
        Scene scene = new Scene(root, 900, 600, Color.LIGHTGRAY);
        stage.setScene(scene);

        // rectangulo
        Rectangle rectangle = new Rectangle(50, 50, 120, 80);
        rectangle.setFill(Color.CORNFLOWERBLUE);
        rectangle.setStroke(Color.DARKBLUE);

        //circulo
        Circle circle = new Circle(260, 90, 40);
        circle.setFill(Color.LIGHTGREEN);
        circle.setStroke(Color.DARKGREEN);

        // raya
        Line line = new Line(50, 170, 170, 170);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(3);

        // arco
        Arc arc = new Arc(260, 170, 50, 40, 45, 270);
        arc.setType(ArcType.OPEN);
        arc.setStroke(Color.DARKRED);
        arc.setStrokeWidth(3);
        arc.setFill(Color.TRANSPARENT);

        // poligonos
        Polygon polygon = new Polygon(
                50.0, 260.0,
                110.0, 200.0,
                170.0, 260.0
        );
        polygon.setFill(Color.ORANGE);
        polygon.setStroke(Color.DARKORANGE);

        // Polyline
        Polyline polyline = new Polyline(
                230.0, 200.0,
                260.0, 240.0,
                290.0, 200.0,
                320.0, 240.0
        );
        polyline.setStroke(Color.PURPLE);
        polyline.setStrokeWidth(3);

        // QuadCurve
        QuadCurve quadCurve = new QuadCurve(50, 350, 110, 300, 170, 350);
        quadCurve.setStroke(Color.BROWN);
        quadCurve.setStrokeWidth(3);
        quadCurve.setFill(Color.TRANSPARENT);

        // CubicCurve
        CubicCurve cubicCurve = new CubicCurve(
                230, 350,
                260, 300,
                290, 400,
                320, 350
        );
        cubicCurve.setStroke(Color.DARKMAGENTA);
        cubicCurve.setStrokeWidth(3);
        cubicCurve.setFill(Color.TRANSPARENT);


        // SVGPath (estrella)
        SVGPath svgPath = new SVGPath();
        svgPath.setContent(
                "M 500 130 L 520 180 L 580 180 L 530 210 L 550 260 " +
                        "L 500 230 L 450 260 L 470 210 L 420 180 L 480 180 Z"
        );
        svgPath.setFill(Color.RED);
        svgPath.setStroke(Color.DARKRED);

        // texto
        Text text = new Text(400, 330, "JavaFX Shapes");
        text.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 28));
        text.setFill(Color.DARKSLATEGRAY);

        root.getChildren().addAll(
                rectangle, circle, line, arc,
                polygon, polyline,
                quadCurve, cubicCurve, svgPath, text
        );

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
