package application.model;

@SuppressWarnings("serial")
public class CreditoInsuficienteException extends Exception {
	public CreditoInsuficienteException() {
		super();
	}

	public CreditoInsuficienteException(String mensaje) {
		super(mensaje);
	}
}
