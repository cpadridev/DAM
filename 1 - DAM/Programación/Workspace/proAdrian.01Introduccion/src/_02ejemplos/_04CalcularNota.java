package _02ejemplos;

import java.util.Scanner;

public class _04CalcularNota {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Nota 1: ");
		double nota1;
		nota1 = tec.nextDouble();

		System.out.println("Nota 2: ");
		double nota2 = tec.nextDouble();

		System.out.println("Número de practicas: ");
		int practicas = tec.nextInt();

		// Guardando resultado en una variable.
		double media = (nota1 + nota2) / 2 * 0.8 + practicas * 0.2;
		System.out.println("Media: " + media);

		// "Al vuelo".
		System.out.println("Media: " + ((nota1 + nota2) / 2 * 0.8 + practicas * 0.2));
	}
}
