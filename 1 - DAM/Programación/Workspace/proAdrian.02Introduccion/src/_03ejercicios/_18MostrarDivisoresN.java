package _03ejercicios;

import java.util.Scanner;

public class _18MostrarDivisoresN {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Mostrar divisores de n. Introduce n: ");
		int n = tec.nextInt();

		int numero = 1;

		while (numero <= n) {
			if (n % numero == 0) {
				System.out.println(numero);
			}

			numero = numero + 1;
		}

		// De otra forma (mejorado).
		System.out.println(1);

		numero = 2;

		while (numero <= n / 2) {
			if (n % numero == 0) {
				System.out.println(numero);
			}

			numero = numero + 1;
		}

		System.out.println(n);

		// Con for
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
	}
}
