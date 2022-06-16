package ejercicio3;

public class Gimnasta extends DeportistaBecado {
	public Gimnasta(String dni, String nombre, String regimen) {
		super(dni, nombre, "Gimnasia deportiva", regimen, 100);
	}

	@Override
	public void mostrarRecibo() {
		System.out.printf("NOMBRE: %s%nTOTAL A PAGAR: CUOTA GRATUITA", nombre);
	}
}
