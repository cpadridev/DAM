package _02ejemplos;

import java.util.Arrays;
import java.util.Random;

public class _07ClaseArrays {
	public static void main(String[] args) {
		int[] v1 = { 1, 2, 3, 4, 5 };
		int[] v2 = { 1, 2, 3, 4, 5 };

		// Las operaciones con arrays COMPLETOS, generalmente no funcionan.

		if (v1 == v2) {
			System.out.println("Los arrays son iguales");
		} else {
			System.out.println("Los arrays son distintos");
		}

		if (v1.equals(v2)) {
			System.out.println("Los arrays son iguales");
		} else {
			System.out.println("Los arrays son distintos");
		}

		System.out.println(v1);
		System.out.println(v2);

		Random r = new Random();

		System.out.println(r);

		// Disponemos de una clase, llamada Arrays, que hace operaciones
		// con arrays completos.

		// Imprimir un array.
		System.out.println(Arrays.toString(v1));

		// Ordenar un array.
		int[] v3 = { 4, 2, 1, 7, 3, 12, 9 };
		System.out.println("Antes de ordenar: " + Arrays.toString(v3));

		Arrays.sort(v3);

		System.out.println("Después de ordenar: " + Arrays.toString(v3));

		String[] v4 = { "luis", "ana", "Pablo", "lucas" };

		System.out.println("Antes de ordenar: " + Arrays.toString(v4));

		Arrays.sort(v4);

		System.out.println("Después de ordenar: " + Arrays.toString(v4));

		// Comparar arrays.
		if (Arrays.equals(v1, v2)) {
			System.out.println("Los arrays son iguales");
		} else {
			System.out.println("Los arrays son distintos");
		}

		// Rellenar un array.
		double[] v5 = new double[10];

		System.out.println(Arrays.toString(v5));

		Arrays.fill(v5, 4.67);

		System.out.println(Arrays.toString(v5));

		Arrays.fill(v5, 10);

		System.out.println(Arrays.toString(v5));
	}
}
