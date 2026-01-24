module com.example.topicosij {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;
    requires javafx.media;

    opens com.example.topicosij to javafx.fxml;
    //exports com.example.topicosij;
    exports practica1_1;
    exports practica1_2;
    exports practica1_3;
    exports practica1_4;
    exports practica1_5;
    exports practica1_6;
    opens practica1_2 to javafx.fxml;
}
