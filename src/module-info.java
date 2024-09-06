module com.example.temperatureconverterexercise {
    requires javafx.controls;
    requires javafx.fxml;

    // Opens the package to javafx.fxml for reflection purposes
    opens com.example.temperatureconverterexercise to javafx.fxml;

    // Exports the package so other modules can use it
    exports com.example.temperatureconverterexercise;
}
