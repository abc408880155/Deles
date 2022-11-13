module com.example.deles {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.deles to javafx.fxml;
    exports com.example.deles;
}