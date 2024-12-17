package org.example.java_231_9;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class IntegerTextFieldController {

    @FXML
    private TextField integerTextField;

    @FXML
    public void initialize() {
        integerTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("-?\\d*")) {
                integerTextField.setText(oldValue);
            }
        });
    }
}