package _02ejemplos;

public class _08SalidaFormateada {
	public static void main(String[] args) {
		// Salida no formateada.
		System.out.println(Math.PI);
		System.out.println(Math.PI / 100);

		// Salida formateada: System.out.printf().
		int edad = 42;

		System.out.println("Edad: " + edad);
		System.out.printf("Edad %d %n", edad);

		int dado1 = (int) (Math.random() * 6 + 1);
		int dado2 = (int) (Math.random() * 6 + 1);

		System.out.printf("Ha salido un %d y un %d, que suman %d %n", dado1, dado2, dado1 + dado2);

		// Formatear números enteros: %d (decimal - base 10).
		int numero = 721;

		System.out.printf("Precio: %d € %n", numero);
		System.out.printf("Precio: %8d € %n", numero);
		System.out.printf("Precio: %-8d € %n", numero);
		System.out.printf("Precio: %08d € %n", numero);

		// Formatear números reales: %f (floating point).
		double peso = 48.238;

		System.out.printf("Peso: %f Kg%n", peso);
		System.out.printf("Peso: %8.3f Kg%n", peso);
		System.out.printf("Peso: %8.2f Kg%n", peso);
		System.out.printf("Peso: %8.4f Kg%n", peso);

		System.out.printf("Peso: %-8.3f Kg%n", peso);
		System.out.printf("Peso: %-8.2f Kg%n", peso);
		System.out.printf("Peso: %-8.4f Kg%n", peso);

		System.out.printf("Peso: %08.3f Kg%n", peso);
		System.out.printf("Peso: %08.2f Kg%n", peso);
		System.out.printf("Peso: %08.4f Kg%n", peso);
	}
}
