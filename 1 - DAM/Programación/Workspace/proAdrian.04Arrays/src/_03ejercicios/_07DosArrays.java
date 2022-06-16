package _03ejercicios;

import java.util.Arrays;

public class _07DosArrays {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3 };
		int[] y = { 4, 6, 8 };
		int[] z = { 3, 5, 7, 8, 1 };

		System.out.println(Arrays.toString(sumaIguales(x, z)));
	}

	public static int[] sumaIguales(int[] a, int[] b) {
		int[] suma = new int[a.length]; // b.length

		for (int i = 0; i < a.length; i++) {
			suma[i] = a[i] + b[i];
		}

		return suma;
	}

	// Si el tamaño no coincide, toma el del menor.
	public static int[] sumaTamayoMenor(int[] a, int[] b) {
		int[] suma = new int[Math.min(a.length, b.length)];

//		int[] suma;
//		if(a.length < b.length) {
//			suma = new int [a.length];
//		} else {
//			suma = new int [b.length];
//		}

		for (int i = 0; i < suma.length; i++) {
			suma[i] = a[i] + b[i];
		}

		return suma;
	}

	// Si el tamaño no coincide, toma el del menor.
	public static int[] sumaTamanyoMayor(int[] a, int[] b) {
		int[] suma = new int[Math.max(a.length, b.length)];

		for (int i = 0; i < a.length; i++) {
			suma[i] += a[i];
		}

		for (int i = 0; i < b.length; i++) {
			suma[i] += b[i];
		}

		return suma;
	}
}
