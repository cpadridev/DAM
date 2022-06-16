package _03ejercicios;

import java.util.Scanner;

public class _15MenorDeDos2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Escribe primer número: ");
		int num1 = tec.nextInt();
		System.out.println("Escribe segundo número: ");
		int num2 = tec.nextInt();

		if (num1 < num2) {
			System.out.println("El menor es " + num1);
		} else {
			if (num1 > num2) {
				System.out.println("El menor es " + num2);
			} else {
				System.out.println("Son iguales");
			}
		}

		// Sin llaves.
		if (num1 < num2)
			System.out.println("El menor es " + num1);
		else if (num1 > num2)
			System.out.println("El menor es " + num2);
		else
			System.out.println("Son iguales");
	}
}
