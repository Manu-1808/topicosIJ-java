package com.example.topicosij;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Reflection;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) {

        Label lblSombra = new Label("DropShadow");
        lblSombra.setFont(new Font("Arial", 30));

        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(10);
        dropShadow.setOffsetX(5);
        dropShadow.setOffsetY(5);
        dropShadow.setColor(Color.GRAY);

        lblSombra.setEffect(dropShadow);

        Label lblBlur = new Label("GaussianBlur");
        lblBlur.setFont(new Font("Arial", 30));

        GaussianBlur gaussianBlur = new GaussianBlur();
        gaussianBlur.setRadius(8);

        lblBlur.setEffect(gaussianBlur);

        Label lblInner = new Label("InnerShadow");
        lblInner.setFont(new Font("Arial", 30));

        InnerShadow innerShadow = new InnerShadow();
        innerShadow.setColor(Color.DARKBLUE);
        innerShadow.setRadius(10);
        innerShadow.setOffsetX(4);
        innerShadow.setOffsetY(4);

        lblInner.setEffect(innerShadow);

        Label lblReflection = new Label("Reflection");
        lblReflection.setFont(new Font("Arial", 30));

        Reflection reflection = new Reflection();
        reflection.setTopOpacity(0.8);
        reflection.setBottomOpacity(0.3);
        reflection.setFraction(0.7);
        reflection.setTopOffset(0);

        lblReflection.setEffect(reflection);

        VBox root = new VBox(20);
        root.getChildren().addAll(
                lblSombra,
                lblBlur,
                lblInner,
                lblReflection
        );
        root.setStyle("-fx-padding: 30; -fx-background-color: white;");

        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("Práctica 1.2 - Efectos JavaFX");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

