package org.example.java_231_9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class Start {

    @FXML
    protected void onHelloButtonClick1() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Stage stage= new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 600, 800);
        stage.setTitle("1");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onHelloButtonClick2() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("2.fxml"));
        Stage stage= new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 600, 800);
        stage.setTitle("2");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onHelloButtonClick3() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("3.fxml"));
        Stage stage= new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 600, 800);
        stage.setTitle("3");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void onHelloButtonClick4(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("4.fxml"));
        Stage stage= new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 600, 800);
        stage.setTitle("3");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void onHelloButtonClick5(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("5.fxml"));
        Stage stage= new Stage();
        Scene scene = new Scene(fxmlLoader.load(), 600, 800);
        stage.setTitle("3");
        stage.setScene(scene);
        stage.show();
    }
}