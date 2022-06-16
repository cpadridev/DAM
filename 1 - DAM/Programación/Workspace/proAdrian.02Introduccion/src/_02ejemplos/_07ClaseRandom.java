package _02ejemplos;

import java.util.Random;

public class _07ClaseRandom {
	public static void main(String[] args) {
		// La clase Random se apoya en Math.random() para permitirnos hacer las cosas
		// más fáciles.
		Random r = new Random();

		System.out.println("Entero aleatorio: " + r.nextInt());
		System.out.println("Real aleatorio: " + r.nextDouble());
		System.out.println("Dado: " + (1 + r.nextInt(6)));

		// También permite especificar una semilla.
		Random r2 = new Random(100);

		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
		System.out.println(r2.nextInt());
	}
}
