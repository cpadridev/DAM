package _02ejemplos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _07Escribible {
	public static void main(String[] args) {
		Set<String> simbolos = new HashSet<>(Arrays.asList(" ", "la", "c", "a", "b", "co", "s"));
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce frase: ");
		String frase = tec.nextLine();

		System.out.println(escribible(frase, simbolos));

		tec.close();
	}

	private static boolean escribible(String frase, Set<String> simbolos) {
		if (frase.length() == 0)
			return true;
		else if (simbolos.contains(frase.substring(0, 1)) && escribible(frase.substring(1), simbolos)) {
			return true;
		} else if (frase.length() >= 2 && simbolos.contains(frase.substring(0, 2))
				&& escribible(frase.substring(2), simbolos)) {
			return true;
		} else {
			return false;
		}
	}
}
