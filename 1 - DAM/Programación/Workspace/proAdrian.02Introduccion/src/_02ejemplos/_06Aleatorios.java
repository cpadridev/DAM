package _02ejemplos;

public class _06Aleatorios {
	public static void main(String[] args) {
		double n = Math.random();

		System.out.println("En [0,1 [ :" + n);
		System.out.println("En [0,10[ :" + (n * 10));
		System.out.println("En [0,5 [ :" + (n * 5));
		System.out.println("En [10,15[ :" + (10 + (n * 5)));

		System.out.println("Entero en [10,15[ " + (int) (10 + (n * 5)));

		// Lanzar un dado.
		System.out.println("Entero en [1, 7[ " + (int) (1 + n * 6));
	}
}
