package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03EdadesV3 {
	final static int NUMEDADES = 5;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean ok = false;
		do {
			//Intentar leer 5 edades sin equivocarse
			try {
				int suma = 0;
				int i = 1;
				while (i <= NUMEDADES) {
					System.out.println("Edad " + i);
					int edad = tec.nextInt();
					suma += edad;
					i++;
				}
				System.out.println("Media: " + ((double) suma / NUMEDADES));
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("Las edades deben ser enteros. Vuelve a intentarlo");
				tec.nextLine();
			}
		} while (!ok);
	}
}
