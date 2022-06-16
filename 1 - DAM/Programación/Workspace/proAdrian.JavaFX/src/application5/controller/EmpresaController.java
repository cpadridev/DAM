package application5.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application5.model.Empleado;
import application5.model.Empresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EmpresaController implements Initializable {

	@FXML
	private Button btnPrimero;

	@FXML
	private Button btnAnterior;

	@FXML
	private Button btnSiguiente;

	@FXML
	private Button btnUltimo;

	@FXML
	private Button btnSubirSueldo;

	@FXML
	private TextField txtAnyo;

	@FXML
	private TextField txtDni;

	@FXML
	private TextField txtNombre;

	@FXML
	private TextField txtNombreEmpresa;

	@FXML
	private TextField txtNumeroEmpleado;

	@FXML
	private TextField txtSueldo;

	@FXML
	void btnPrimeroOnAction(ActionEvent event) {
		posActual = 0;
		actualizarFormulario();
	}

	@FXML
	void btnAnteriorOnAction(ActionEvent event) {
		if (posActual > 0) {
			posActual--;
			actualizarFormulario();
		}
	}

	@FXML
	void btnSiguienteOnAction(ActionEvent event) {
		if (posActual < e.getPlantilla().size() - 1) {
			posActual++;
			actualizarFormulario();
		}
	}

	@FXML
	void btnUltimoOnAction(ActionEvent event) {
		posActual = e.getPlantilla().size() - 1;
		actualizarFormulario();
	}

	@FXML
	void btnSubirSueldoOnAction(ActionEvent event) {

	}

	Empresa e;
	int posActual = 0;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		e = new Empresa("Programadores en Acción");
		e.contratar(new Empleado("Pepe", "12345678A", 2000, 1750));
		e.contratar(new Empleado("Luis", "12345678B", 2001, 1150));
		e.contratar(new Empleado("Ana", "12345678C", 2002, 1500));
		e.contratar(new Empleado("Carlos", "12345678D", 2003, 1550));
		e.contratar(new Empleado("Rocio", "12345678E", 2004, 2750));
		actualizarFormulario();
	}

	private void actualizarFormulario() {
		txtNombreEmpresa.setText(e.getNombre());

		Empleado emp = e.getPlantilla().get(posActual);

		txtNombre.setText(emp.getNombre());
		txtDni.setText(emp.getDni());
		txtAnyo.setText(String.valueOf(emp.getAno()));
		txtSueldo.setText(String.valueOf(emp.getSueldo()));
		txtNumeroEmpleado.setText(String.valueOf(posActual));

		if (posActual == 0) {
			btnPrimero.setDisable(true);
			btnAnterior.setDisable(true);
		} else {
			btnPrimero.setDisable(false);
			btnAnterior.setDisable(false);
		}

		if (posActual == e.getNumeroEmpleados()) {
			btnUltimo.setDisable(true);
			btnSiguiente.setDisable(true);
		} else {
			btnUltimo.setDisable(false);
			btnSiguiente.setDisable(false);
		}
	}

}
