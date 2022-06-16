package _03ejercicios;

import java.util.Scanner;

public class _21SumaSerie {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce entero n: ");
		int n = tec.nextInt();

		double suma = 0;
		int denominador = 1;

		while (denominador <= n) {
			suma = suma + 1.0 / denominador;
			denominador = denominador + 1;
		}

		System.out.println("Suma: " + suma);
	}
}
