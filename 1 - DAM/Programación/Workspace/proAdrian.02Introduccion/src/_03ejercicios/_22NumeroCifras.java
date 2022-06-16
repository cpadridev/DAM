package _03ejercicios;

import java.util.Scanner;

public class _22NumeroCifras {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Número: ");
		int numero = tec.nextInt();

		int cifras = 0;

		if (numero == 0) {
			cifras++;

			System.out.println("Número de cifras: " + cifras);
		} else {
			while (numero != 0) {
				numero = numero / 10;
				cifras++;
			}

			System.out.println("Número de cifras: " + cifras);
		}

		// De otra forma.
		System.out.println("Número: ");
		numero = tec.nextInt();

		cifras = 1;

		while (numero >= 10) {
			numero = numero / 10;
			cifras++;
		}

		System.out.println("Número de cifras: " + cifras);
	}
}
