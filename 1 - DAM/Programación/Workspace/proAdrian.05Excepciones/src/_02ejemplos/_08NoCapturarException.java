package _02ejemplos;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _08NoCapturarException {
	// EN GENERAL no conviene capturar Exception
	// ¿Por qué? Porque va a silenciar errores de programación
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		// Programa que pide al usuario las edades de una serie de personas
		// Si el usuario no introduce un entero, el programa termina.
		int edades[] = new int[5];
		try {
			
			for (int i = 0; i <= edades.length; i++) { //Esta linea tiene un error de programacion
				// que no saltará al ejecutar el programa.
				System.out.println("Introduce edad " + (i + 1) + ": ");
				edades[i] = tec.nextInt();
			}
		} catch (Exception e) {
			//Silenciamos la excepcion. Estamos silenciando los ERRORES de PROGRAMACION
			//que hayamos podido cometer en el bloque try
		}

		System.out.println(Arrays.toString(edades));
	}

}
