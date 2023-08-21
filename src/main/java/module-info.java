module com.example.videoeditor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.videoeditor to javafx.fxml;
    exports com.example.videoeditor;
}