package _02ejemplos;

import java.util.Scanner;

public class _06MediaDeEdades {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Edad persona 1: ");
		int edad1 = tec.nextInt();

		System.out.println("Edad persona 2: ");
		int edad2 = tec.nextInt();

		System.out.println("Media: " + (edad1 + edad2) / 2.0);

		double media = (edad1 + edad2) / 2;
		System.out.println("Media: " + media);
	}
}
