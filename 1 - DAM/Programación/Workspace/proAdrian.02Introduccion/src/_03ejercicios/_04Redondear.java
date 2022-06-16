package _03ejercicios;

import java.util.Scanner;

public class _04Redondear {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Número: ");
		double n = tec.nextDouble();

		System.out.println(Math.round(n * 10) / 10.0);
	}
}
