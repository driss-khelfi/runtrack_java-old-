module com.example.job05 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.job05 to javafx.fxml;
    exports com.example.job05;
}