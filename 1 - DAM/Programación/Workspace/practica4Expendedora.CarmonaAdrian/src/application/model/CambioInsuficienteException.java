package application.model;

@SuppressWarnings("serial")
public class CambioInsuficienteException extends Exception {
	public CambioInsuficienteException() {
		super();
	}

	public CambioInsuficienteException(String mensaje) {
		super(mensaje);
	}
}
