package _03ejercicios;

import java.util.Scanner;

public class _17SumaNPrimeros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Suma de 1 a n. Introduce n: ");
		int n = tec.nextInt();

		int suma = 0;
		int numero = 1;

		while (numero <= n) {
			suma = suma + numero;
			numero = numero + 1;
		}

		System.out.println("Suma: " + suma);

		// Con for
		suma = 0;

		for (int i = 1; i <= n; i++) {
			suma += i;
		}

		System.out.println("Suma: " + suma);
	}
}
