module com.example.topdirectorsdatatable {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.topdirectorsdatatable to javafx.fxml;
    exports com.example.topdirectorsdatatable;
}