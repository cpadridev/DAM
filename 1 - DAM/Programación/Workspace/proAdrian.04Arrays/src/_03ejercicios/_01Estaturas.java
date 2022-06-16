package _03ejercicios;

import java.util.Scanner;

public class _01Estaturas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		double[] estaturas = new double[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Persona " + (i + 1) + ":");
			estaturas[i] = tec.nextDouble();
		}

		for (int i = 0; i < estaturas.length; i++) {
			System.out.println("Persona " + (i + 1) + ": " + estaturas[i] + " m.");
		}
	}
}
