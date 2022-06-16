package _02ejemplos;

import java.util.Scanner;

public class _03Media {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Media de edad de los alumnos");

		System.out.println("¿Cuántos alumnos hay? ");
		int numAlumnos = tec.nextInt();
		System.out.println("¿Cuánto suman sus edades? ");
		int sumaEdades = tec.nextInt();

		double media = (double) sumaEdades / numAlumnos;

		System.out.println("Media: " + media);
	}
}
