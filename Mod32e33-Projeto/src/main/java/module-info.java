module br.jyeager.domain {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    opens br.jyeager.domain to javafx.fxml;
    exports br.jyeager.domain;
}