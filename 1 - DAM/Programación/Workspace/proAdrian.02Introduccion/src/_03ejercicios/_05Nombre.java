package _03ejercicios;

import java.util.Scanner;

public class _05Nombre {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Nombre: ");
		String nombre = tec.nextLine();

		// Solución 1.
		char primera = nombre.charAt(0);
		char ultima = nombre.charAt(nombre.length() - 1);

		if (primera == ultima) {
			System.out.println("Coinciden");
		} else {
			System.out.println("No coinciden");
		}

		// Solución 2.
		if (nombre.charAt(0) == nombre.charAt(nombre.length() + 1)) {
			System.out.println("Coinciden");
		} else {
			System.out.println("No coinciden");
		}
	}
}
