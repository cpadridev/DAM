package _02ejemplos;

public class _06Length {
	public static void main(String[] args) {
		String nombre = "pepe";
		String[] estaciones = { "primavera", "verano", "otoño", "invierno" };

		// Longitud de un String.
		System.out.println("Longitud del nombre " + nombre.length());

		// Longitud de un array.
		System.out.println("Longitud del array estaciones " + estaciones.length);

		// Longitud de la primera estación (estaciones[0]).
		System.out.println("Longitud de primavera " + estaciones[0].length());
	}
}
