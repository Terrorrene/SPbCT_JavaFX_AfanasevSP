module com.example.systemurovtask {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.systemurovtask to javafx.fxml;
    exports com.example.systemurovtask;
}