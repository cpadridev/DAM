package _03ejercicios;

import java.util.Scanner;

public class _02Hipotenusa {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce cateto 1: ");
		double c1 = tec.nextDouble();
		System.out.println("Introduce cateto 2: ");
		double c2 = tec.nextDouble();

		double h = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2, 2));

		System.out.println("Hipotenusa: " + h);
	}
}
