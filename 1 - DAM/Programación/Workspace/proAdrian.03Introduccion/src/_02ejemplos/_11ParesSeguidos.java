package _02ejemplos;

import java.util.Scanner;

public class _11ParesSeguidos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Juego: Cuantos pares consigues introducir sin fallar");

		int numero, pares = 0;

//		do {
//			System.out.println("Introduce un numero: ");
//			numero = tec.nextInt();
//
//			if(numero % 2 == 0) {
//				pares ++;
//			}
//		} while (numero % 2 == 0);

		System.out.println("Introduzca un numero: ");
		numero = tec.nextInt();

		while (numero % 2 == 0) {
			if (numero % 2 == 0) {
				pares++;
			}

			System.out.println("Introduce un numero: ");
			numero = tec.nextInt();
		}

		System.out.println("Has conseguido " + pares + " numeros");
	}
}
