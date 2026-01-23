module com.example.topicosij {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;

    opens com.example.topicosij to javafx.fxml;
    //exports com.example.topicosij;
    exports practica1_1;
    exports practica1_2;
    opens practica1_2 to javafx.fxml;
}
