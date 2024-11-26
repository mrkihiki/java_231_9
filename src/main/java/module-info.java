module org.example.java_231_9 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.java_231_9 to javafx.fxml;
    exports org.example.java_231_9;
}