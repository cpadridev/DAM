package _03ejercicios;

import java.util.Scanner;

public class _08Partir {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce texto: ");
		String texto = tec.nextLine();
		System.out.println("Introduce posición: ");
		int posicion = tec.nextInt();

		if (posicion < 0) {
			System.out.println("No se puede partir");
		} else if (posicion >= texto.length()) {
			System.out.println("No se puede partir");
		} else if (texto.charAt(posicion) != ' ') {
			System.out.println("No se puede partir");
		} else {
			System.out.println("Primera parte: " + texto.substring(0, posicion));
			System.out.println("Segunda parte: " + texto.substring(posicion + 1));
		}

		// De otra forma (con operadores lógicos)
		if (posicion < 0 || posicion >= texto.length() || texto.charAt(posicion) != ' ') {
			System.out.println("No se puede partir");
		} else {
			System.out.println("Primera parte: " + texto.substring(0, posicion));
			System.out.println("Segunda parte: " + texto.substring(posicion + 1));
		}

		// De otra forma (con operadores lógicos)
		if (posicion > 0 && posicion < texto.length() && texto.charAt(posicion) == ' ') {
			System.out.println("Primera parte: " + texto.substring(0, posicion));
			System.out.println("Segunda parte: " + texto.substring(posicion + 1));
		} else {
			System.out.println("No se puede partir");
		}
	}
}
