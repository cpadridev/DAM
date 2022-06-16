package _02ejemplos;

public class _02ConversionDeTipos {
	public static void main(String[] args) {
		byte b1 = 3; // El 3 se convierte implícitamente de int a byte

		// Esta conversión implicita no se puede hacer
// 		byte b2 = 130;

		// Convierte la variable b1 a int.
		int i1 = b1;

		// También se puede covertir de entero a real
		int edad = 30;
		double edad2 = edad;
		float edad3 = edad;

		// Pero no al revés.
		double estatura = 1.89;
// 		int estatura2 = estatura;

		// Conversiones de tipo explícitas.
		double peso = 85.8;
		int quilos = (int) peso;
	}
}
