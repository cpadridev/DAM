package application3.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class SaludarController {

	@FXML
	private Button btnSaludar;

	@FXML
	private TextField txtNombre;

	@FXML
	void btnSaludarOnAction(ActionEvent event) {
		btnSaludar.setOnAction(e -> {
			Alert a = new Alert(AlertType.INFORMATION);
			a.setTitle("Saludo");
			a.setHeaderText("Bienvenido!!!");
			a.setContentText("Hola " + txtNombre.getText());
			a.showAndWait();
		});
	}
}
