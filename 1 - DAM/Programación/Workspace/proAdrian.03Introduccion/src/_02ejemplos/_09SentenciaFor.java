package _02ejemplos;

public class _09SentenciaFor {
	public static void main(String[] args) {
		// Imprimir por pantalla del 1 al 10.
		System.out.println("Con while");

		int a = 1;

		while (a <= 10) {
			System.out.println(a);

			a++;
		}

		System.out.println("Con for");

		for (int b = 1; b <= 10; b++) {
			System.out.println(b);
		}
	}

}
