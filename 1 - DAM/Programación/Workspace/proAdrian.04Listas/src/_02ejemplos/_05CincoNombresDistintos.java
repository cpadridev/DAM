
package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _05CincoNombresDistintos {
	// Programa que lea de teclado 5 nombres distintos.
	// Si el usuario introduce un nombre que ya ha introducido antes,
	// no lo tendremos en cuenta.
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// Solución almacenando los nombres en una LISTA.
		ArrayList<String> l = new ArrayList<>();

		do {
			System.out.println("Nombre: ");
			String nombre = tec.next();

			if (!l.contains(nombre)) {
				l.add(nombre);
			} else {
				System.out.println("Repetido");
			}
		} while (l.size() < 5);

		System.out.println(l);

		// Solución almacenando los nombres en un ARRAY.
		String[] v = new String[5];

		for (int i = 0; i < v.length; i++) {
			System.out.println("Nombre: ");
			String nombre = tec.next();

			// Si el nombre no está en el array lo añadimos.
			boolean enc = false;

			for (int j = 0; j < i && !enc; j++) {
				if (nombre.equals(v[j])) {
					enc = true;
				}
			}

			if (!enc) {
				v[i] = nombre;
			} else {
				System.out.println("Repetido");

				i--;
			}
		}

		System.out.println(Arrays.toString(v));
	}
}
