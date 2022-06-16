package _02ejemplos;

import java.util.Scanner;

public class _01Lluvia {
	final static int DIAS = 3;

	public static void main(String[] args) {
		// Lluvias de enero. Leer cuanto ha llovido cada día
		// y mostrar la media de lluvias.

		Scanner tec = new Scanner(System.in);

		double suma = 0;

		for (int dia = 1; dia <= DIAS; dia++) {
			System.out.println("Lluvia del dia " + dia + ": ");
			double lluvia = tec.nextDouble();

			suma += lluvia;
		}

		System.out.println("Media: " + (suma / DIAS));
	}
}
