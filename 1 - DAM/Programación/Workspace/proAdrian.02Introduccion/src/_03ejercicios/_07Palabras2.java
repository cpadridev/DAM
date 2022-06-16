package _03ejercicios;

import java.util.Scanner;

public class _07Palabras2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Texto: ");
		String texto = tec.nextLine();

		int posBlanco1 = texto.indexOf(' ');
		int posBlanco2 = texto.indexOf(' ', posBlanco1 + 1);
		int posBlanco3 = texto.indexOf(' ', posBlanco2 + 1);

		if (posBlanco1 == -1) {
			// No hay espacios.
			System.out.println("Primera: " + texto);
		} else {
			System.out.println("Primera: " + texto.substring(0, posBlanco1));
			if (posBlanco2 == -1) {
				System.out.println("Segunda: " + texto.substring(posBlanco1 + 1));
			} else {
				System.out.println("Segunda: " + texto.substring(posBlanco1 + 1, posBlanco2));
				if (posBlanco3 == -1) {
					System.out.println("Tercera: " + texto.substring(posBlanco2 + 1));
				} else {
					System.out.println("Tercera: " + texto.substring(posBlanco2 + 1, posBlanco3));
				}
			}
		}
	}
}
