package _03ejercicios;

import java.util.Random;

public class _03Dados {
	public static void main(String[] args) {
		// Con Math.random.
		int dado1 = (int) (1 + Math.random() * 6);
		int dado2 = (int) (1 + Math.random() * 6);

		System.out.println("Dado 1: " + dado1);
		System.out.println("Dado 2: " + dado2);
		System.out.println("Suma: " + (dado1 + dado2));

		// Con la clase Random.
		Random r = new Random();
		int dado3 = 1 + r.nextInt(6);
		int dado4 = 1 + r.nextInt(6);

		System.out.println("Dado 3: " + dado3);
		System.out.println("Dado 4: " + dado4);
		System.out.println("Suma: " + (dado3 + dado4));
	}
}
