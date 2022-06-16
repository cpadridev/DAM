package ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.print("Frase 1: ");
		String frase1 = tec.nextLine();
		System.out.print("Frase 2: ");
		String frase2 = tec.nextLine();

		String[] palabrasFrase1 = frase1.split(" ");
		String[] palabrasFrase2 = frase2.split(" ");

		System.out.println(mismasPalabras(palabrasFrase1, palabrasFrase2));

		tec.close();
	}

	private static boolean mismasPalabras(String[] palabrasFrase1, String[] palabrasFrase2) {
		List<String> l = new ArrayList<>(Arrays.asList(palabrasFrase1));

		for (int i = 0; i < palabrasFrase2.length; i++) {
			if (l.contains(palabrasFrase2[i])) {
				l.remove(palabrasFrase2[i]);
			} else {
				return false;
			}
		}

		if (l.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
