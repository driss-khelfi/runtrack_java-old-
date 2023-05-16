module com.example.job03 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.job03 to javafx.fxml;
    exports com.example.job03;
}