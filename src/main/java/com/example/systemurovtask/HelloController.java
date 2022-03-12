package com.example.systemurovtask;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    Button clearButton;
    @FXML
    Button answerButton;
    @FXML
    Button closeButton;
    @FXML
    TextField xField;
    @FXML
    TextField aField;
    @FXML
    TextField bField;
    @FXML
    TextField answerField;
    @FXML
    Label warningLabel;
    @FXML
    protected void onAnswerButtonClick() {
        if ((xField != null || xField.getText() != "") && (aField != null || aField.getText() != "")
                && (bField != null || bField.getText() != "")){
        String xtext = xField.getText();
        String atext = aField.getText();
        String btext = bField.getText();
        double x = Double.parseDouble(xtext);
        double a = Double.parseDouble(atext);
        double b = Double.parseDouble(btext);
        double y = 0;
        if (x <= 7 && (a > 0 || b > 0))
            y = (x + 4) / (a*a + b*b);
        if (x <= 7 && a == 0 && b == 0)
            warningLabel.setVisible(true);
        else warningLabel.setVisible(false);
        if (x > 7) y = x * (a + b) * (a + b);
        answerField.setText(Double.toString(y));
        }
    }
    @FXML
    protected void onClearButtonClick() {
        aField.clear();
        bField.clear();
        xField.clear();
        answerField.clear();
    }
    @FXML
    protected void onCloseButtonClick() {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }
}