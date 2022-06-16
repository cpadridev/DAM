package _03ejercicios;

import java.util.Random;
import java.util.Scanner;

public class _09BlackJack {
	final static int BLACKJACK = 21;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		Random r = new Random();
		int carta;
		int suma = 0;
		String otra = "";

		do {
			// Número aleatorio entre 1 y 10.
//			carta = 1 + (int) (Math.random() * 10);
			carta = r.nextInt(10) + 1;

			// Añadimos la carta al total.
			suma = suma + carta;

			System.out.println("Carta: " + carta + " Total: " + suma);
			// Preguntamos si quiere otra carta.
			if (suma < BLACKJACK) {
				System.out.println("Quieres otra carta (s/n)? ");
				otra = tec.next();
			}
		} while (suma < BLACKJACK && otra.equalsIgnoreCase("s"));

		if (suma == BLACKJACK) {
			System.out.println("Blackjack!! Enhorabuena");
		} else if (suma > BLACKJACK) {
			System.out.println("Lo sentimos, te has pasado");
		} else {
			System.out.println("Tu puntuación final es " + suma);
		}
	}
}
