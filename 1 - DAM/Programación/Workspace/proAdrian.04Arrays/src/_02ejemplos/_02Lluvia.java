package _02ejemplos;

import java.util.Scanner;

public class _02Lluvia {
	final static int DIAS = 3;

	public static void main(String[] args) {
		// Lluvias de enero. Leer cuanto ha llovido cada día
		// y mostrar la media de lluvias.
		Scanner tec = new Scanner(System.in);

		System.out.println("Lluvia del dia 1: ");
		double lluvia1 = tec.nextDouble();
		System.out.println("Lluvia del dia 2: ");
		double lluvia2 = tec.nextDouble();
		System.out.println("Lluvia del dia 3: ");
		double lluvia3 = tec.nextDouble();
		System.out.println("Lluvia del dia 4: ");
		double lluvia4 = tec.nextDouble();
		System.out.println("Lluvia del dia 5: ");
		double lluvia5 = tec.nextDouble();

		double media = (lluvia1 + lluvia2 + lluvia3 + lluvia4 + lluvia5) / 5;
		double mayores = 0;

		if (lluvia1 > media)
			mayores++;
		if (lluvia2 > media)
			mayores++;
		if (lluvia3 > media)
			mayores++;
		if (lluvia4 > media)
			mayores++;
		if (lluvia5 > media)
			mayores++;

		System.out.println("Ha llovido más que la media en " + mayores + " dias");
	}
}
