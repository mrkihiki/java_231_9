package org.example.java_231_9;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

public class Controller3 {


    public CheckBox CheckBox1;
    public CheckBox CheckBox2;
    public CheckBox CheckBox3;
    public TextArea TextA1;
    public TextArea TextA2;
    public TextArea TextA3;
    public Text Text1;
    public Text Text2;
    public Text Text3;
    public Text Text4;

    @FXML
    protected void OnCheckBox1() {
        if(CheckBox1.isSelected()){
            TextA1.setText("1");
        }else {
            TextA1.setText(null);
        }
    }
    @FXML
    protected void OnCheckBox2() {
        if(CheckBox2.isSelected()){
            TextA2.setText("1");
        }else {
            TextA2.setText(null);
        }
    }
    @FXML
    protected void OnCheckBox3() {
        if(CheckBox3.isSelected()){
            TextA3.setText("1");
        }else {
            TextA3.setText(null);
        }
    }
    @FXML
    protected void onHelloButtonClick() {
        String cheque="Итог = ";
        int a  = 0;
        cheque=" :"+cheque;
        if(CheckBox1.isSelected()){
            a=(2*Integer.parseInt(TextA1.getText()));
            cheque=Text1.getText()+" *"+TextA1.getText()+cheque;
        }
        if(CheckBox2.isSelected()){
            a=a+(5*Integer.parseInt(TextA2.getText()));
            cheque=Text2.getText()+" *"+TextA2.getText()+cheque;
        }
        if(CheckBox3.isSelected()){
            a=a+(25*Integer.parseInt(TextA3.getText()));
            cheque=Text3.getText()+" *"+TextA3.getText()+cheque;
        }
        cheque=cheque+a;
        Text4.setText(cheque);
    }

    @FXML
    public void initialize() {
        TextA1.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*?")) {
                TextA1.setText(oldValue);
            }
        });
        TextA2.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*?")) {
                TextA2.setText(oldValue);
            }
        });
        TextA3.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!newValue.matches("\\d*?")) {
                TextA3.setText(oldValue);
            }
        });
    }
}