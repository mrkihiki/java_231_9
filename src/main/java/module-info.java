module org.example.java_231_9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.scripting;
    requires exp4j;


    opens org.example.java_231_9 to javafx.fxml;
    exports org.example.java_231_9;
}