package _02ejemplos;

import java.util.Scanner;

public class _09IfEstatura {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Estatura: ");
		double estatura = tec.nextDouble();

		if (estatura > 2) {
			System.out.println("Muy alto");
		} else {
			if (estatura > 1.7) {
				System.out.println("Alto");
			} else {
				if (estatura > 1.6) {
					System.out.println("Estatura media");
				} else {
					System.out.println("Bajo");
				}
			}
		}

		if (estatura > 2)
			System.out.println("Muy alto");
		else if (estatura > 1.7)
			System.out.println("Alto");
		else if (estatura > 1.6)
			System.out.println("Estatura media");
		else
			System.out.println("Bajo");
	}
}
