package _02ejemplos;

import java.util.Scanner;

public class _10Poltergheist {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Edad: ");
		int edad = tec.nextInt();
		// Limpiar el INTRO que queda en el teclado.
		tec.nextLine();
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		System.out.println("Estatura: ");
		double estatura = tec.nextDouble();

		System.out.printf("Te llamas %s, mides %4.2f m y tienes %d años", nombre, estatura, edad);
	}
}
