package _02ejemplos;

import java.util.Scanner;

public class _09Strings {
	public static void main(String[] args) {
		// Crear Strings.
		String nombre1 = new String("Pepe");
		nombre1 = new String("Luis");
		nombre1 = "Ana";
		String nombre2 = "Pablo";

		// Leer desde teclado.
		Scanner tec = new Scanner(System.in);

		System.out.println("Nombre completo: ");

		// Leemos toda la línea.
		String nombreCompleto = tec.nextLine();

		System.out.println("Nombre completo: " + nombreCompleto);
		System.out.println("Alias: ");

		// Leemos la primera palabra.
		String alias = tec.next();
		System.out.println("Alias: " + alias);
	}
}
