package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _11SecuenciarTryCatch {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean ok = false;
		int d1 = 0, d2 = 0;

		// Primer dato
		do {
			try {
				System.out.println("Dato 1");
				d1 = tec.nextInt();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir un entero");
				tec.nextLine();
			}
		} while (!ok);

		// Segundo dato
		ok = false;
		do {
			try {
				System.out.println("Dato 2");
				d2 = tec.nextInt();
				ok = true;
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir un entero");
				tec.nextLine();
			}
		} while (!ok);

		// Calculo
		ok = false;
		do {
			try {
				System.out.println("Operacion (+, - , *, /): ");
				String op = tec.next();
				System.out.println("Resultado: " + calcular(d1,d2,op));
				ok = true;
			} catch (ArithmeticException e) {
				System.out.println("No se puede dividir por cero");
			}
		} while (!ok);

	}

	public static int calcular(int d1, int d2, String op) {
		// En este método lo conveniente NO es capturar la excepción, SINO PROPAGARLA
		// PROPAGAR una excepción es no hacer nada con ella en el método y dejar que sea
		// otro método el que la capture.
		// Si la capturamos, el método main no se entera de que la excepción se ha
		// producido
		// y no puede reaccionar para volver a pedir los datos.
		int resultado = 0;
//		try {
		switch (op) {
		case "+":
			resultado = d1 + d2;
			break;
		case "-":
			resultado = d1 - d2;
			break;
		case "*":
			resultado = d1 * d2;
			break;
		case "/":
			resultado = d1 / d2;
			break;
		}
//		} catch (ArithmeticException e) {
//			System.out.println("No se puede dividir por cero");
//		}
		return resultado;
	}

}
