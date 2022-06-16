package _02ejemplos;

public class _05PostIncremento {
	public static void main(String[] args) {
		// Mostrar números del 1 al 10.
		int numero = 1;

		while (numero <= 10) {
			System.out.println(numero);

			numero++;
		}

		// Mostrar números del 1 al 10.
		numero = 1;

		while (numero <= 10) {
			System.out.println(numero++);
		}

		// Mostrar números del 1 al 10.
		numero = 0;

		while (numero < 10) {
			System.out.println(++numero);
		}
	}
}
