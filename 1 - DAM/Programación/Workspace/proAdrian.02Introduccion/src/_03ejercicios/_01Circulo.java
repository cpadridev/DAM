package _03ejercicios;

import java.util.Scanner;

public class _01Circulo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Radio: ");
		double r = tec.nextDouble();

		double longitud = 2 * Math.PI * r;
		double area = Math.PI * r * r; // Math.PI * Math.pow(r,2);
		double volumen = (4.0 / 3) * Math.PI * Math.pow(r, 3);
// 		Volumen = 4 * Math.PI / 3 * Math.pow(r, 3);

		System.out.println("Longitud: " + longitud);
		System.out.println("Área: " + area);
		System.out.println("Volumen " + volumen);
	}
}
