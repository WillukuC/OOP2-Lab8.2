module com.example.oop2lab8_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop2lab8_2 to javafx.fxml;
    exports com.example.oop2lab8_2;
}