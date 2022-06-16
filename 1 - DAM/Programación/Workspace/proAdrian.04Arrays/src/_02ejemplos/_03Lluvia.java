package _02ejemplos;

import java.util.Scanner;

public class _03Lluvia {
	final static int DIAS = 3;

	public static void main(String[] args) {
		// Lluvias de enero. Leer cuanto ha llovido cada día
		// y mostrar la media de lluvias.
		Scanner tec = new Scanner(System.in);

		// Creamos un array de DÍAS elementos en el que guardar todas las lluvias.
		double[] lluvia = new double[DIAS];
		double suma = 0;

		for (int dia = 0; dia < DIAS; dia++) {
			System.out.println("Lluvia del dia " + (dia + 1) + ": ");
			lluvia[dia] = tec.nextDouble();

			suma += lluvia[dia];
		}

		double media = (suma / DIAS);
		System.out.println("Media: " + media);

		// Contar cuantos días ha llovido más que la media.
		int mas = 0;

		for (int dia = 0; dia < DIAS; dia++) {
			if (lluvia[dia] > media) {
				mas = mas + 1;
			}
		}

		System.out.println("Cuantos dias ha llovido más que la media: " + mas);
	}
}
