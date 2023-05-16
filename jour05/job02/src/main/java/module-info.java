module com.example.job02 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.job02 to javafx.fxml;
    exports com.example.job02;
}