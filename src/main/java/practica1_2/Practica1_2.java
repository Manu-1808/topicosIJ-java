package practica1_2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Practica1_2 extends Application {

    @Override
    public void start(Stage stage) {

        stage.setTitle("Práctica 1.2 - Efectos JavaFX");

        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.LIGHTBLUE);
        stage.setScene(scene);

        // textos
        Text texto1 = new Text(100, 80, "DropShadow");
        texto1.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 30));

        Text texto2 = new Text(100, 130, "InnerShadow");
        texto2.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 30));

        Text texto3 = new Text(100, 180, "GaussianBlur");
        texto3.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 30));

        Text texto4 = new Text(100, 230, "Reflection");
        texto4.setFont(Font.font(Font.getDefault().getFamily(), FontWeight.BOLD, 30));


        //efecto de sombreado(drop)
        DropShadow sombra= new DropShadow();
        sombra.setRadius(10);
        sombra.setOffsetX(-10);
        sombra.setOffsetY(10);
        sombra.setSpread(0.5);
        sombra.setColor(Color.DARKSLATEGRAY);

        texto1.setEffect(sombra);

        // efecto de sombra por dentro (inner)
        InnerShadow innerShadow = new InnerShadow();
        innerShadow.setColor(Color.DARKBLUE);
        innerShadow.setRadius(5);

        texto2.setEffect(innerShadow);

        // desenfocado
        GaussianBlur gaussianBlur = new GaussianBlur();
        gaussianBlur.setRadius(2);

        texto3.setEffect(gaussianBlur);

        // reflexion
        Reflection reflection = new Reflection();
        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflection.setFraction(0.7);

        texto4.setEffect(reflection);



        root.getChildren().add(texto1);
        root.getChildren().add(texto2);
        root.getChildren().add(texto3);
        root.getChildren().add(texto4);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


