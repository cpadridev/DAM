package _02ejemplos;

import java.util.Scanner;

public class _08AgruparCases {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Numero de dia de la semana (1-7): ");
		int dia = tec.nextInt();

		// El default es opcional.
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
		case 7:
			System.out.println("Fin de semana");
		}
	}
}
