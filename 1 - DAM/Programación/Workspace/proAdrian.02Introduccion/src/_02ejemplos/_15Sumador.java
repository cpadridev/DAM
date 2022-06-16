package _02ejemplos;

public class _15Sumador {
	public static void main(String[] args) {
		// Un sumador es una variable a la que vamos añadiendo cantidades en cada
		// iteración del bucle. Generalmente se inicializa a cero, aunque no tiene
		// porqué.
		// Sumar los números que van del 1 al 10.
		int numero = 1;
		int suma = 0;

		while (numero <= 10) {
			suma = suma + numero;
// 			numero ++;
			numero = numero + 1;

			System.out.println("Suma: " + suma);
		}

		System.out.println("Suma: " + suma);
	}
}
