module com.example.job09 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.job09 to javafx.fxml;
    exports com.example.job09;
}