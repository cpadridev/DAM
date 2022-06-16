package _03ejercicios;

import java.util.Scanner;

public class _05LeerEntero {
	static Scanner tec = new Scanner(System.in);

	static int num;

	public static void main(String[] args) {
		do {
			System.out.println("Introduce un número entero: ");

			leeEnteroPositivo();

		} while (num <= 0);
	}

	public static int leeEnteroPositivo() {
		num = tec.nextInt();

		return num;
	}
}
