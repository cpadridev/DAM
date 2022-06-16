package application.model;

@SuppressWarnings("serial")
public class StockInsuficienteException extends Exception {
	public StockInsuficienteException() {
		super();
	}

	public StockInsuficienteException(String mensaje) {
		super(mensaje);
	}
}
