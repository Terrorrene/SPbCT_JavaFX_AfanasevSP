module com.example.elementwok {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.elementwok to javafx.fxml;
    exports com.example.elementwok;
}