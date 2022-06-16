package _03ejercicios;

import java.util.Random;
import java.util.Scanner;

public class _11AdivinarNumero2 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner tec = new Scanner(System.in);

		int adivinar = r.nextInt(100) + 1;
		int numero, contador = 0;

		do {
			System.out.println("Intenta adivinar: ");
			numero = tec.nextInt();

			if (numero == adivinar) {
				System.out.println("Has acertado");
			} else if (numero < adivinar) {
				System.out.println("Te has quedado corto");
			} else {
				System.out.println("Te has pasado");
			}

			contador++;

			if (contador == 5) {
				break;
			}
		} while (numero != adivinar);

		System.out.println("Fin del programa");
	}
}
