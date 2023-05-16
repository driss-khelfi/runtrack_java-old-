module com.example.job04 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.job04 to javafx.fxml;
    exports com.example.job04;
}