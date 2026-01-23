module com.example.topicosij {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.topicosij to javafx.fxml;
    exports com.example.topicosij;
}
