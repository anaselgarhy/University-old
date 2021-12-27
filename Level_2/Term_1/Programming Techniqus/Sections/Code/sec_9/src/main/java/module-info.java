module com.example.sec_9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;

    opens com.example.sec_9 to javafx.fxml;
    exports com.example.sec_9;
}