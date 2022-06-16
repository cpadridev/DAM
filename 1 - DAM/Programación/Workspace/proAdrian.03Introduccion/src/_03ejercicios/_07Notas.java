package _03ejercicios;

import java.util.Scanner;

public class _07Notas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int nota, aprobados = 0, media = 0, alumnos = 0;

		do {
			System.out.println("Introduce una nota: ");
			nota = tec.nextInt();

			if (nota >= 0) {
				media += nota;
				alumnos++;

				if (nota > 5) {
					aprobados++;
				}
			}
		} while (nota >= 0);

		media = media / alumnos;

		System.out.printf("Has introducido %d notas %n", alumnos);
		System.out.printf("Han aprobado %d alumnos %n", aprobados);
		System.out.printf("La nota media es %d %n", media);
	}
}
