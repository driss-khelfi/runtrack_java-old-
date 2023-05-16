module com.example.job06 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.job06 to javafx.fxml;
    exports com.example.job06;
}