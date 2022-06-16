package _03ejercicios;

import java.util.Scanner;

public class _15NImpares {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("n números impares. Introduce n: ");
		int n = tec.nextInt();

		int impar = 1;
		int cont = 0;

		while (cont < n) {
			System.out.println(impar);

			impar = impar + 2;
			cont = cont + 1;
		}

		// Con for
		impar = 1;

		for (int i = 0; i < n; i++) {
			System.out.println(impar);
			impar += 2;
		}
	}
}
