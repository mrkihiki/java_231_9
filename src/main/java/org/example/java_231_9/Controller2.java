package org.example.java_231_9;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class Controller2 {
    @FXML
    private Label Label1;
    @FXML
    private Label Label2;
    @FXML
    private Label Label3;
    @FXML
    private CheckBox CheckBox1;
    @FXML
    private CheckBox CheckBox2;
    @FXML
    private CheckBox CheckBox3;

    @FXML
    protected void OnCheckBox1() {
        if(CheckBox1.isSelected()){
            Label1.setVisible(true);
        }else {
            Label1.setVisible(false);
        }
    }
    @FXML
    protected void OnCheckBox2() {
        if(CheckBox2.isSelected()){
            Label2.setVisible(true);
        }else {
            Label2.setVisible(false);
        }
    }
    @FXML
    protected void OnCheckBox3() {
        if(CheckBox3.isSelected()){
            Label3.setVisible(true);
        }else {
            Label3.setVisible(false);
        }
    }
}