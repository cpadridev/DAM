package _03ejercicios;

import java.util.Scanner;

public class _19SumaDivisoresN {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Mostrar divisores de n. Introduce n: ");
		int n = tec.nextInt();

		int suma = 0;
		int numero = 1;

		while (numero <= n) {
			if (n % numero == 0) {
				suma = suma + numero;
			}

			numero = numero + 1;
		}

		System.out.println("Suma: " + suma);

		// De otra forma (mejorado).
		suma = 1 + n;
		numero = 2;

		while (numero <= n / 2) {
			if (n % numero == 0) {
				suma = suma + numero;
			}

			numero = numero + 1;
		}

		System.out.println("Suma: " + suma);

		// Con for
		suma = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				suma += i;
			}
		}

		System.out.println("Suma: " + suma);
	}
}
