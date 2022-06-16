package _02ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class _01SituacionesInesperadas {
	public static void main(String[] args) {
		int[] numeros = { 50, 10, 2, 0, 1, 5 };
		Scanner tec = new Scanner(System.in);
		

		System.out.println("Vamos a dividir dos elementos del array " + Arrays.toString(numeros));

		System.out.println("Posicion del dividendo: ");
		int posDividendo = tec.nextInt();

		System.out.println("Posicion del divisor: ");
		int posDivisor = tec.nextInt();

		int cociente = numeros[posDividendo] / numeros[posDivisor];
		System.out.println("Cociente: " + cociente);

	}
}
