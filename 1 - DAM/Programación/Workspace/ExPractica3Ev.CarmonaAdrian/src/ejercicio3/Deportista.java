package ejercicio3;

public abstract class Deportista {
	protected String dni;
	protected String nombre;
	protected String deporte;

	protected Deportista(String dni, String nombre, String deporte) {
		this.dni = dni;
		this.nombre = nombre;
		this.deporte = deporte;
	}

	@Override
	public String toString() {
		return String.format("Nombre: %s%n" + "DNI: %s%n" + "Deporte: %s", nombre, dni, deporte);
	}

	public abstract double calcularImporteAPagar();

	public void mostrarRecibo() {
		System.out.printf("NOMBRE: %s%n TOTAL A PAGAR: %d €", nombre, calcularImporteAPagar());
	}
}
