module RelojTest {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires RelojDigitalv2;
    exports com.javier.test.fxml;
    exports com.javier.test;
    opens com.javier.test.fxml to javafx.fxml;
}