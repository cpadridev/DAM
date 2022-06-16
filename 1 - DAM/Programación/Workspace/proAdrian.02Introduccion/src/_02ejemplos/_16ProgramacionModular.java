package _02ejemplos;

import java.util.Scanner;

public class _16ProgramacionModular {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Longitud de una circunferencia");

		System.out.println("Introduce radio: ");
		double radio = tec.nextDouble();

		double longitud = longitudCirculo(radio);

		System.out.printf("Longitud: %.2f%n", longitud);
		System.out.println("Perímetro de un rect de 2 x 3: " + perimetroRectangulo(2, 3));
	}

	public static double longitudCirculo(double r) {
		double longitud = 2 * Math.PI * r;

		return longitud;
	}

	public static double perimetroRectangulo(double lado1, double lado2) {
		double perimetro = lado1 * 2 + lado2 * 2;

		return perimetro;
	}
}
