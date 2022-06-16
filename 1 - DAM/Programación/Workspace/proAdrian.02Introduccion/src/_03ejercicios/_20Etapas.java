package _03ejercicios;

import java.util.Scanner;

public class _20Etapas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Número personas: ");
		int personas = tec.nextInt();

		int cont = 0;
		int inf, pub, ado, adu, vej, anc;
		inf = pub = ado = adu = vej = anc = 0;

		while (cont < personas) {
			System.out.println("Edad " + (cont + 1) + ": ");

			int edad = tec.nextInt();

			if (edad <= 10)
				inf = inf + 1;
			else if (edad <= 14)
				pub = pub + 1;
			else if (edad <= 21)
				ado = ado + 1;
			else if (edad <= 55)
				adu = adu + 1;
			else if (edad <= 70)
				vej = vej + 1;
			else
				anc = anc + 1;

			cont = cont + 1;
		}

		// Mostrar resultados:
		System.out.printf("Infancia:     %6.2f %% %n", (double) inf * 100 / personas);
		System.out.printf("Pubertad:     %6.2f %% %n", (double) pub * 100 / personas);
		System.out.printf("Adolescencia: %6.2f %% %n", (double) ado * 100 / personas);
		System.out.printf("Adultez:      %6.2f %% %n", (double) adu * 100 / personas);
		System.out.printf("Vejez:        %6.2f %% %n", (double) vej * 100 / personas);
		System.out.printf("Ancianidad:   %6.2f %% %n", (double) anc * 100 / personas);
	}
}
