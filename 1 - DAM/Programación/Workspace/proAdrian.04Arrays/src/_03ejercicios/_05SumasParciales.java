package _03ejercicios;

import java.util.Arrays;

public class _05SumasParciales {
	public static void main(String[] args) {
		int[] edad = { 2, 3, 8, 20, 1, 55 };

		// Guardando el resultado en un array.
		int[] sumas = sumasParciales(edad);

		System.out.println(Arrays.toString(sumas));

		// Al vuelo.
		System.out.println(Arrays.toString(sumasParciales(edad)));
	}

	public static int[] sumasParciales(int[] v) {
		int[] t = new int[v.length];
		t[0] = v[0];

		for (int i = 1; i < t.length; i++) {
			t[i] = t[i - 1] + v[i];
		}

		return t;
	}

	public static int[] sumasParcialesVersionMala(int[] v) {
		int[] t = new int[v.length];

		for (int i = 0; i < t.length; i++) {
			// Cálculo la suma de los elementos de v desde la posición 0 a la i.
			for (int j = 0; j <= i; j++) {
				t[i] += v[j];
			}
		}

		return t;
	}
}
