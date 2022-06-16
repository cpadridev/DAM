package _02ejemplos;

import java.util.Scanner;

public class _08SentenciaIf {
	public static void main(String args[]) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce tu edad: ");
		int edad = tec.nextInt();

		if (edad >= 18) {
			System.out.println("Tienes " + edad + " años");
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Tienes " + edad + " años");
			System.out.println("Eres menor de edad");
		}

		// De otra forma.
		System.out.println("Tienes " + edad + " años");
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		} else {
			System.out.println("Eres menor de edad");
		}

		// Las llaves se pueden omitir.
		System.out.println("Tienes " + edad + " años");
		if (edad >= 18)
			System.out.println("Eres mayor de edad");
		else
			System.out.println("Eres menor de edad");
	}
}
