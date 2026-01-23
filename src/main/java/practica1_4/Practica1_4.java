package practica1_4;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Practica1_4 extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("Práctica 1.4 - Animaciones JavaFX");

        Group root = new Group();
        Scene scene = new Scene(root, 1000, 650, Color.LIGHTGRAY);
        stage.setScene(scene);

        /* ===================== FIGURAS ===================== */

        // Rectangle
        Rectangle rectangle = new Rectangle(50, 50, 120, 80);
        rectangle.setFill(Color.CORNFLOWERBLUE);

        // Circle
        Circle circle = new Circle(300, 90, 40, Color.LIGHTGREEN);

        // Line
        Line line = new Line(50, 200, 200, 200);
        line.setStroke(Color.BLACK);
        line.setStrokeWidth(4);

        // Arc
        Arc arc = new Arc(300, 200, 50, 40, 45, 270);
        arc.setType(ArcType.OPEN);
        arc.setStroke(Color.DARKRED);
        arc.setStrokeWidth(3);
        arc.setFill(Color.TRANSPARENT);

        // Polygon
        Polygon polygon = new Polygon(
                50.0, 320.0,
                110.0, 260.0,
                170.0, 320.0
        );
        polygon.setFill(Color.ORANGE);

        // Polyline
        Polyline polyline = new Polyline(
                250.0, 260.0,
                280.0, 300.0,
                310.0, 260.0,
                340.0, 300.0
        );
        polyline.setStroke(Color.PURPLE);
        polyline.setStrokeWidth(3);

        // QuadCurve
        QuadCurve quadCurve = new QuadCurve(50, 420, 110, 370, 170, 420);
        quadCurve.setStroke(Color.BROWN);
        quadCurve.setFill(Color.TRANSPARENT);
        quadCurve.setStrokeWidth(3);

        // CubicCurve
        CubicCurve cubicCurve = new CubicCurve(
                250, 420,
                280, 370,
                310, 470,
                340, 420
        );
        cubicCurve.setStroke(Color.DARKMAGENTA);
        cubicCurve.setFill(Color.TRANSPARENT);
        cubicCurve.setStrokeWidth(3);

        // Path
        Path path = new Path(
                new MoveTo(450, 60),
                new LineTo(500, 110),
                new LineTo(450, 160),
                new ClosePath()
        );
        path.setFill(Color.YELLOW);
        path.setStroke(Color.GOLDENROD);

        // SVGPath
        SVGPath svgPath = new SVGPath();
        svgPath.setContent(
                "M 600 130 L 620 180 L 680 180 L 630 210 L 650 260 " +
                        "L 600 230 L 550 260 L 570 210 L 520 180 L 580 180 Z"
        );
        svgPath.setFill(Color.RED);

        // Text
        Text text = new Text(450, 350, "Animaciones JavaFX");
        text.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 26));

        root.getChildren().addAll(
                rectangle, circle, line, arc,
                polygon, polyline,
                quadCurve, cubicCurve,
                path, svgPath, text
        );

        /* ===================== ANIMACIONES ===================== */

        // ScaleTransition
        ScaleTransition scale = new ScaleTransition(Duration.seconds(2), rectangle);
        scale.setFromX(1);
        scale.setToX(1.5);
        scale.setFromY(1);
        scale.setToY(1.5);
        scale.setAutoReverse(true);
        scale.setCycleCount(Animation.INDEFINITE);

        // FadeTransition
        FadeTransition fade = new FadeTransition(Duration.seconds(2), circle);
        fade.setFromValue(1.0);
        fade.setToValue(0.3);
        fade.setAutoReverse(true);
        fade.setCycleCount(Animation.INDEFINITE);

        // TranslateTransition
        TranslateTransition translate = new TranslateTransition(Duration.seconds(3), line);
        translate.setFromX(0);
        translate.setToX(150);
        translate.setAutoReverse(true);
        translate.setCycleCount(Animation.INDEFINITE);

        // RotateTransition
        RotateTransition rotate = new RotateTransition(Duration.seconds(3), polygon);
        rotate.setFromAngle(0);
        rotate.setToAngle(360);
        rotate.setCycleCount(Animation.INDEFINITE);

        // FillTransition
        FillTransition fill = new FillTransition(Duration.seconds(2), svgPath,
                Color.RED, Color.DARKBLUE);
        fill.setAutoReverse(true);
        fill.setCycleCount(Animation.INDEFINITE);

        // StrokeTransition
        StrokeTransition stroke = new StrokeTransition(Duration.seconds(2), arc,
                Color.DARKRED, Color.DARKGREEN);
        stroke.setAutoReverse(true);
        stroke.setCycleCount(Animation.INDEFINITE);

        // Iniciar animaciones
        scale.play();
        fade.play();
        translate.play();
        rotate.play();
        fill.play();
        stroke.play();

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
