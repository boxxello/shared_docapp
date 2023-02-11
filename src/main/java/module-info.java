module com.docapp.shared_docapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires com.google.gson;


    opens com.docapp.shared_docapp to javafx.fxml;
    exports com.docapp.shared_docapp;
}