package _03ejercicios;

import java.util.Scanner;

public class _09DesplazarIzquierda {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// Leer una palabra.
		System.out.println("Palabra: ");
		String palabra = tec.next();

		String desplazada = palabra.substring(1) + palabra.charAt(0);

		System.out.println(desplazada);
	}
}
