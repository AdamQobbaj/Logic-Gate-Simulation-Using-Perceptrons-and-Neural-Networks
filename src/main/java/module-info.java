module com.example.project2ai {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires org.jfree.jfreechart;


    opens com.example.project2ai to javafx.fxml;
    exports com.example.project2ai;
}