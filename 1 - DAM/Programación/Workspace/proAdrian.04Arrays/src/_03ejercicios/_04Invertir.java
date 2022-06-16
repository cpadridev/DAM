package _03ejercicios;

import java.util.Arrays;

public class _04Invertir {
	public static void main(String[] args) {
		int[] edad = { 20, 2, 7, 3, 4 };

		System.out.println("Array original: " + Arrays.toString(edad));

		// Invertimos el array y lo guardamos en otro array.
		int[] edad2 = invertirArray(edad);

		System.out.println("Array invertido: " + Arrays.toString(edad2));

		// También se puede imprimir "al vuelo".
		System.out.println("Array invertido: " + Arrays.toString(invertirArray(edad)));

		// El tercer método invierte el array que recibe como parámetro.
		invertirArray3(edad);

		System.out.println("Array original invertido: " + Arrays.toString(edad));
	}

	public static int[] invertirArray(int[] v) {
		int[] invertido = new int[v.length];
		int j = v.length - 1;

		for (int i = 0; i < v.length; i++) {
			invertido[j] = v[i];
			j--;
		}

		return invertido;
	}

	public static int[] invertirArray2(int[] v) {
		int[] invertido = new int[v.length];

		for (int i = 0; i < v.length; i++) {
			invertido[v.length - 1 - i] = v[i];
		}

		return invertido;
	}

	public static void invertirArray3(int[] v) {
		int j = v.length - 1;

		for (int i = 0; i < v.length / 2; i++) {
			// Intercambiamos los elementos de las posiciones i y j.
			int aux = v[i];
			v[i] = v[j];
			v[j] = aux;
			// Decrementamos j.
			j--;
		}
	}
}
