package _02ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class _02EvitarExcepcion {
	public static void main(String[] args) {
		int[] numeros = { 50, 10, 2, 0, 1, 5 };
		Scanner tec = new Scanner(System.in);

		System.out.println("Vamos a dividir dos elementos del array " + Arrays.toString(numeros));

		System.out.println("Posicion del dividendo: ");
		//int posDividendo = tec.nextInt();
		String dividendo = tec.next();
		int posDividendo = Integer.parseInt(dividendo);

		System.out.println("Posicion del divisor: ");
		int posDivisor = tec.nextInt();
		if (posDividendo >= 0 && posDividendo < numeros.length) {
			if (posDivisor >= 0 && posDivisor < numeros.length) {
				if(numeros[posDivisor] != 0) {
					int cociente = numeros[posDividendo] / numeros[posDivisor];
					System.out.println("Cociente: " + cociente);
				} else {
					System.out.println("No se puede dividir por cero");
				}
			} else {
				System.out.println("Posicion del divisor incorrecta");
			}
		} else {
			System.out.println("Posicion del dividendo incorrecta");
		}

	}
}
