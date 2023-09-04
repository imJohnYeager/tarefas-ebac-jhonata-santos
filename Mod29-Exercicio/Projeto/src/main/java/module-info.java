module br.jyeager.projeto {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens br.jyeager.domain to javafx.fxml;
    exports br.jyeager.domain;
}