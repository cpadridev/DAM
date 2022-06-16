package _03ejercicios;

import java.util.Scanner;

public class _10QuitarBlancosSobrantes {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce texto: ");
		String texto = tec.nextLine().trim();

		int blanco1 = texto.indexOf(' ');
		String parte1 = texto.substring(0, blanco1);
		String parte2 = texto.substring(blanco1);

		System.out.println(parte1 + " " + parte2.trim());
	}
}
