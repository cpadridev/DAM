package _03ejercicios;

import java.util.Arrays;

public class _06Rotaciones {
	public static void main(String[] args) {
		int[] v = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < v.length; i++) {
			rotarIzquierda(v);

			System.out.println(Arrays.toString(v));
		}

		System.out.println();

		for (int i = 0; i < v.length; i++) {
			rotarDerecha(v);

			System.out.println(Arrays.toString(v));
		}
	}

	public static void rotarIzquierda(int[] v) {
		// Guardamos el primer elemento.
		int aux = v[0];

		// Desplazamos a la izquierda los elementos del 1 al final.
		for (int i = 1; i < v.length; i++) {
			v[i - 1] = v[i];
		}

		// Guardamos aux al final.
		v[v.length - 1] = aux;
	}

	public static void rotarDerecha(int[] v) {
		// Guardamos el último elemento.
		int aux = v[v.length - 1];

		// Desplazamos a la derecha los elementos del penúltimo al primero.
		for (int i = v.length - 2; i >= 0; i--) {
			v[i + 1] = v[i];
		}

		// Guardamos aux al final.
		v[0] = aux;
	}
}
