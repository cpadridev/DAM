package examen;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Peso recipiente 1: ");
		int peso1 = tec.nextInt();
		System.out.println("Peso recipiente 2: ");
		int peso2 = tec.nextInt();

		int cont = 0;

// 		while(Math.abs(peso1 - peso2) > 50) {
		while (peso1 - peso2 > 50 || peso2 - peso1 > 50) {
			if (peso1 > peso2) {
				peso1 -= 20;
				peso2 += 20;
			} else {
				peso1 += 20;
				peso2 -= 20;
			}

			cont++;

			System.out.println("Recipiente 1: " + peso1 + " - Recipiente2: " + peso2);
		}

		System.out.println("Cucharadas movidas " + cont);

		tec.close();
	}
}
