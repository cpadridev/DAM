package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _10AnidarTryCatch {
	//En el ejemplo 9 mostramos el mismo mensaje si introduce mal el primer dato que si introduce mal el segundo.
	//Como podriamos mostrar un mensaje de error diferenciado para el primer y el segundo dato
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean ok = false;
		do {
			try {
				System.out.println("Dato 1");
				int d1 = tec.nextInt();
				try {
					System.out.println("Dato 2");
					int d2 = tec.nextInt();
					System.out.println("Operacion (+, - , *, /): ");
					String op  = tec.next();
					System.out.println("Resultado: " + calcular(d1,d2,op));
					ok = true;

				} catch (InputMismatchException e) {
					System.out.println("El segundo dato debe ser un entero");
					tec.nextLine();
				}
				
			} catch (InputMismatchException e) {
				System.out.println("El primer dato debe ser un entero");
				tec.nextLine();
			} catch (ArithmeticException e) {
				System.out.println("No se puede dividir por cero. Vuelve a intentarlo");
			}
		}while(!ok);
	}
	
	public static int calcular(int d1, int d2, String op) {
		//En este método lo conveniente NO es capturar la excepción, SINO PROPAGARLA
		//PROPAGAR una excepción es no hacer nada con ella en el método y dejar que sea 
		// otro método el que la capture.
		//Si la capturamos, el método main no se entera de que la excepción se ha producido
		//y no puede reaccionar para volver a pedir los datos.
		int resultado = 0;
//		try {
			switch (op) {
			case "+": resultado = d1 + d2;	break;
			case "-": resultado = d1 - d2;	break;
			case "*": resultado = d1 * d2;	break;
			case "/": resultado = d1 / d2;	break;		
			}
//		} catch (ArithmeticException e) {
//			System.out.println("No se puede dividir por cero");
//		}
		return resultado;
	}

}
