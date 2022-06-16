package _02ejemplos;

import java.util.Scanner;

public class _14Contador {
	public static void main(String[] args) {
		// Mostrar "hola" 10 veces. Para ello usamos un CONTADOR. Un contador es una
		// variable entera que refleja el número de veces que se ha hecho algo. Se suele
		// inicializar a cero y se incrementa su valor en 1 en cada iteración del bucle.
		// Número de veces que "hola" ha salido por pantalla.
		int cont = 0;

		while (cont < 10) {
			System.out.println("Hola");

			cont = cont + 1;
		}

		// Mostrar el mensaje "Hola, que tal" el número de veces que indique el usuario.
		Scanner tec = new Scanner(System.in);

		System.out.println("¿Cuántas veces quieres que te salude?: ");
		int veces = tec.nextInt();

		cont = 0;

		while (cont < veces) {
			System.out.println("Hola, que tal");

// 			cont = cont + 1;
			cont++;
		}
	}
}
