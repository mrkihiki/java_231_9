package org.example.java_231_9;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Controller1 {
    @FXML
    private Button button;
    @FXML
    private TextArea L;
    @FXML
    private TextArea R;

    @FXML
    protected void onHelloButtonClick() {
        String tem;
        if (button.getText().equals("->")){
            button.setText("<-");
        }
        else {button.setText("->");}
        tem = L.getText();
        L.setText(R.getText());
        R.setText(tem);

    }
}