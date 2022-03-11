package com.example.elementwok;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class HelloController {
    @FXML
    Button nextButton;
    @FXML
    Button replyButton;
    @FXML
    TextField textField1;
    @FXML
    public void onNextButtonClick() throws IOException, InterruptedException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("secondPage.fxml"));
        Stage stage = (Stage) nextButton.getScene().getWindow();
        stage.hide();
        stage.setTitle("Второе окно");
        Scene scene = new Scene(fxmlLoader.load(), 600, 100);
        stage.setScene(scene);
        TimeUnit.SECONDS.sleep(1);
        stage.show();
    }
    @FXML
    public void onRelpyButtonClick() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Ваше имя");
        alert.setContentText("Вас зовут " + textField1.getText());
        alert.showAndWait();
    }
}