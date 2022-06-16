package examen;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int suma1 = 0;
		int suma2 = 0;

		System.out.println("Introduzca un número: ");
		int num1 = tec.nextInt();
		System.out.println("Introduzca otro número: ");
		int num2 = tec.nextInt();

		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				suma1 += i;
			}
		}
		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {
				suma2 += i;
			}
		}

		if (suma1 == num2 && suma2 == num1) {
			System.out.println("SON AMIGOS");
		} else {
			System.out.println("NO SON AMIGOS");
		}

		tec.close();
	}
}
