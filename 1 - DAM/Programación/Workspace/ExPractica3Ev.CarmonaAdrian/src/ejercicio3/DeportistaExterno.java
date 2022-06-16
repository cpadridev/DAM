package ejercicio3;

public class DeportistaExterno extends Deportista {
	private double mensualidad;

	public DeportistaExterno(String dni, String nombre, String deporte, double mensualidad) {
		super(dni, nombre, deporte);
		this.mensualidad = mensualidad;
	}

	@Override
	public String toString() {
		return "EXTERNO\n" + super.toString();
	}

	public double calcularImporteAPagar() {
		return mensualidad;
	}
}
