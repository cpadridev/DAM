package _03ejercicios;

import java.util.Scanner;

public class _07Palabras3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Texto: ");
		String texto = tec.nextLine();

		int posBlanco = texto.indexOf(' ');

		System.out.println(texto.substring(0, posBlanco));

		texto = texto.substring(posBlanco + 1);

		posBlanco = texto.indexOf(' ');

		System.out.println(texto.substring(0, posBlanco));

		texto = texto.substring(posBlanco + 1);

		posBlanco = texto.indexOf(' ');

		System.out.println(texto.substring(0, posBlanco));

		texto = texto.substring(posBlanco + 1);
	}
}
