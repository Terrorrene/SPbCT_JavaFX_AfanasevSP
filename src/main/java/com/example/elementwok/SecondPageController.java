package com.example.elementwok;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class SecondPageController {
    @FXML
    Button backButton;
    @FXML
    public void onBackButtonClick() throws IOException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.hide();
        stage.setTitle("Второе окно");
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        stage.setScene(scene);
        TimeUnit.SECONDS.sleep(1);
        stage.show();
    }
}
