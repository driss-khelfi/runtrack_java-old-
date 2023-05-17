module com.example.job08 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.job08 to javafx.fxml;
    exports com.example.job08;
}