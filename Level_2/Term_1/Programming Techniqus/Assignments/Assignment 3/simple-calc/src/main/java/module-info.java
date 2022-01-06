module com.anas.code.simplecalc {
    requires javafx.controls;

    opens com.anas.code.simplecalc to javafx.fxml;
    exports com.anas.code.simplecalc;
}