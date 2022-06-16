package _02ejemplos;

import java.util.Scanner;

public class _10ForRaros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Pares hasta el N: ");
		int n = tec.nextInt();

		// Con while.
		int a = 2;

		while (a <= n) {
			System.out.println(a);

			a += 2; // a = a + 2;
		}

		System.out.println("-----");

		// Con for.
		for (int b = 2; b <= n; b += 2) {
			System.out.println(b);
		}

		System.out.println("-----");

		// Con for raro que no tiene la parte de inicialización.
		int c = 2;

		for (; c <= n; c += 2) {
			System.out.println(c);
		}

		System.out.println("-----");

		// Con for raro que no tiene la parte de inicializacionóni de avance.
		int d = 2;

		for (; d <= n;) {
			System.out.println(d);

			d += 2;
		}

		// Sumar los numeros entre 1 y n.

		// Con while.
		int suma = 0;
		int e = 1;

		while (e <= n) {
			suma = suma + e;
			e++;
		}

		// Con for.
		int suma2 = 0;

		for (int f = 1; f <= n; f++) {
			suma2 = suma2 + f; // suma2 += f;
		}

		// For raro que no inicializa la variable adecuada.
		int g = 1;

		for (int suma3 = 0; g <= n; g++) {
			suma3 = suma3 + g;
		}

		// For raro que hace varias cosas en la inicialización.
		for (int h = 1, suma4 = 0; h <= n; h++) {
			suma4 = suma4 + h;
		}

		// For raro que hace varias cosas en el avance.
		for (int i = 1, suma5 = 0; i <= n; suma5 += i, i++) {
		}
	}
}
