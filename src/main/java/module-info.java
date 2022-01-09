module dbf.exploitr.dropbox_fixer {
    requires javafx.controls;
    requires javafx.fxml;


    opens dbf.exploitr.dropbox_fixer to javafx.fxml;
    exports dbf.exploitr.dropbox_fixer;
}