package _02ejemplos;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _07CapturarVariasExcepciones {
	public static void main(String[] args) {
		int[] numeros = { 50, 10, 2, 0, 1, 5 };
		Scanner tec = new Scanner(System.in);

		try {
			System.out.println("Vamos a dividir dos elementos del array " + Arrays.toString(numeros));

			System.out.println("Posicion del dividendo: ");
			int posDividendo = tec.nextInt();

			System.out.println("Posicion del divisor: ");
			int posDivisor = tec.nextInt();

			int cociente = numeros[posDividendo] / numeros[posDivisor];
			System.out.println("Cociente: " + cociente);
		} catch (InputMismatchException e) {
			System.out.println("La posicion tiene que ser un entero");
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por cero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("La posicion indicada es incorrecta");
		} catch (RuntimeException e) {
			System.out.println("Se ha producido algun error de ejecucion");
		} 

	}
}
