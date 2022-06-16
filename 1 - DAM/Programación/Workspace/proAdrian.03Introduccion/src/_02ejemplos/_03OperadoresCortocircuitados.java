package _02ejemplos;

import java.util.Scanner;

public class _03OperadoresCortocircuitados {
	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Dime una palabra que en la 5ª posicion tenga una 'a': ");
		String palabra = tec.next().toLowerCase();

		if (palabra.length() >= 5 && palabra.charAt(4) == 'a') {
			System.out.println("Has ganado");
		} else {
			System.out.println("Has perdido");
		}

		if (palabra.charAt(4) == 'a' && palabra.length() >= 5) {
			System.out.println("Has ganado");
		} else {
			System.out.println("Has perdido");
		}
	}
}
