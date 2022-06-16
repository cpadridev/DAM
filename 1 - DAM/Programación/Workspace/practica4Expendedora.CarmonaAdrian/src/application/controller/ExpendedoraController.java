package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.CambioInsuficienteException;
import application.model.CreditoInsuficienteException;
import application.model.Expendedora;
import application.model.StockInsuficienteException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.media.AudioClip;

/**
 * Controlador de la expendedora
 * 
 * @author adrpen
 */
public class ExpendedoraController implements Initializable {
	Expendedora e;

	AudioClip monedas = new AudioClip(this.getClass().getResource("sounds/Monedas.mp3").toString());
	AudioClip devolver = new AudioClip(this.getClass().getResource("sounds/Devolver.mp3").toString());
	AudioClip productos = new AudioClip(this.getClass().getResource("sounds/Productos.mp3").toString());
	AudioClip error = new AudioClip(this.getClass().getResource("sounds/Error.mp3").toString());

	@FXML
	private Button btn005e;

	@FXML
	private Button btn01e;

	@FXML
	private Button btn02e;

	@FXML
	private Button btn05e;

	@FXML
	private Button btn1e;

	@FXML
	private Button btn2e;

	@FXML
	private Button btnDevolver;

	@FXML
	private Button btnPro1;

	@FXML
	private Button btnPro2;

	@FXML
	private Button btnPro3;

	@FXML
	private Button btnPro4;

	@FXML
	private Button btnPro5;

	@FXML
	private Button btnPro6;

	@FXML
	private TextField txtCambioDisponible;

	@FXML
	private TextField txtCredito;

	@FXML
	private TextField txtImporteVentas;

	@FXML
	private TextField txtSalidaProducto;

	@FXML
	private TextField txtSalidaTexto;

	@FXML
	void btn005eOnAction(ActionEvent event) {
		anadir(0.05);
	}

	@FXML
	void btn01eOnAction(ActionEvent event) {
		anadir(0.1);
	}

	@FXML
	void btn02eOnAction(ActionEvent event) {
		anadir(0.2);
	}

	@FXML
	void btn05eOnAction(ActionEvent event) {
		anadir(0.5);
	}

	@FXML
	void btn1eOnAction(ActionEvent event) {
		anadir(1);
	}

	@FXML
	void btn2eOnAction(ActionEvent event) {
		anadir(2);
	}

	@FXML
	void btnDevolverOnAction(ActionEvent event) {
		double devolucion = e.devolverCredito();

		if (devolucion != 0) {
			txtSalidaTexto.setText("Le devolvemos su dinero: " + String.format("%.2f", devolucion) + " euros");
			devolver.play();
			informacion("Devolucion", "Le devolvemos su dinero: " + String.format("%.2f", devolucion) + " euros");
		}

		actualizarExpendedora();
	}

	@FXML
	void btnPro1OnAction(ActionEvent event) {
		comprar(0);
	}

	@FXML
	void btnPro2OnAction(ActionEvent event) {
		comprar(1);
	}

	@FXML
	void btnPro3OnAction(ActionEvent event) {
		comprar(2);
	}

	@FXML
	void btnPro4OnAction(ActionEvent event) {
		comprar(3);
	}

	@FXML
	void btnPro5OnAction(ActionEvent event) {
		comprar(4);
	}

	@FXML
	void btnPro6OnAction(ActionEvent event) {
		comprar(5);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String[] nombres = { "Chocolate", "Coca Cola", "Papas", "Nachos", "Sandwich", "Zumo" };
		double[] precios = { 0.8, 1.5, 1, 1, 1, 1.25 };
		int[] stocks = { 8, 5, 7, 3, 9, 0 };
		e = new Expendedora(10, nombres, precios, stocks);
		actualizarExpendedora();
	}

	/**
	 * Actualiza la expendedora y la muestra por pantalla.
	 */
	private void actualizarExpendedora() {
		txtCredito.setText("Credito: " + String.format("%.2f", e.getCredito()) + " euros");
		txtCambioDisponible.setText("Cambio: " + String.format("%.2f", e.getCambioDisponible()) + " euros");
		txtImporteVentas.setText("Importe de ventas: " + String.format("%.2f", e.getImporteVentas()) + " euros");
		txtSalidaProducto.setText("RETIRE SU PRODUCTO");

		if (e.getCredito() == 0 || txtSalidaTexto.getText().equals("No es posible anadir credito")) {
			txtSalidaTexto.setText("INSERTE MONEDAS");
		}

		btnPro1.setText(e.getNombre(0) + "\n" + String.format("%.2f", e.getPrecio(0)) + " euros\n" + e.getStock(0) + " uds");
		btnPro2.setText(e.getNombre(1) + "\n" + String.format("%.2f", e.getPrecio(1)) + " euros\n" + e.getStock(1) + " uds");
		btnPro3.setText(e.getNombre(2) + "\n" + String.format("%.2f", e.getPrecio(2)) + " euros\n" + e.getStock(2) + " uds");
		btnPro4.setText(e.getNombre(3) + "\n" + String.format("%.2f", e.getPrecio(3)) + " euros\n" + e.getStock(3) + " uds");
		btnPro5.setText(e.getNombre(4) + "\n" + String.format("%.2f", e.getPrecio(4)) + " euros\n" + e.getStock(4) + " uds");
		btnPro6.setText(e.getNombre(5) + "\n" + String.format("%.2f", e.getPrecio(5)) + " euros\n" + e.getStock(5) + " uds");
	}

	/**
	 * Muestra los mensajes de resultado al anadir credito.
	 * 
	 * @param importe credito que se introduce a la expendedora
	 */
	private void anadir(double importe) {
		if (e.getCredito() == 10) {
			txtSalidaTexto.setText("Credito maximo alcanzado");
			error("Anadir credito", "Credito maximo alcanzado");
		} else {
			if (e.getCredito() + importe > 10) {
				txtSalidaTexto.setText("No es posible anadir credito");
				error("Anadir credito", "No es posible anadir credito");
			} else {
				txtSalidaTexto.setText("Ha insertado " + String.format("%.2f", importe) + " euros");
				monedas.play();
				e.anadirDinero(importe);
			}
		}

		actualizarExpendedora();
	}

	/**
	 * Muestra los mensajes de compra por pantalla.
	 * 
	 * @param i número del producto
	 */
	private void comprar(int i) {
		try {
			double cambio = e.comprar(i);

			txtSalidaProducto.setText("Se ha comprado " + e.getNombre(i));
			txtSalidaTexto.setText("Se ha comprado " + e.getNombre(i));
			productos.play();
			informacion("Compra", "Se ha comprado " + e.getNombre(i));

			if (cambio != 0) {
				txtSalidaTexto.setText("Le devolvemos su dinero: " + String.format("%.2f", cambio) + " euros");
				devolver.play();
				informacion("Devolucion", "Le devolvemos su dinero: " + String.format("%.2f", cambio) + " euros");
			}

			actualizarExpendedora();
		} catch (CreditoInsuficienteException e) {
			error("Credito insuficiente", "No hay credito suficiente");
		} catch (CambioInsuficienteException e) {
			error("Cambio insuficiente", "No hay cambio suficiente");
		} catch (StockInsuficienteException e) {
			error("Stock insuficiente", "No hay stock suficiente");
		}
	}

	/**
	 * Muestra una alerta de error.
	 * 
	 * @param h titulo del mensaje
	 * @param m mensaje
	 */
	public void error(String h, String m) {
		Alert a = new Alert(AlertType.ERROR);
		error.play();
		a.setTitle("Error");
		a.setHeaderText(h);
		a.setContentText(m);
		a.showAndWait();
	}

	/**
	 * Muestra una alerta de informacion.
	 * 
	 * @param h titulo del mensaje
	 * @param m mensaje
	 */
	public void informacion(String h, String m) {
		Alert a = new Alert(AlertType.INFORMATION);
		a.setTitle("Informacion");
		a.setHeaderText(h);
		a.setContentText(m);
		a.showAndWait();
	}
}