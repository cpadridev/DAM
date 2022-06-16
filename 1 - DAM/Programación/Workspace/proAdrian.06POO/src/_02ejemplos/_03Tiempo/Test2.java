package _02ejemplos._03Tiempo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * La versión 1 tiene un problema: no tenemos control
 * sobre que valores toman los atributos
 *
 * Modificar el programa para que si el instante de tiempo introducido es incorrecto,
 * lo vuelva a pedir
 */
public class Test2 {
	static Scanner tec = new Scanner(System.in);
	//Pedir al usuario hora de entrada y hora de salida, que tienen
	//que ser distintas
	public static void main(String[] args) {
		Tiempo entrada, salida;
		do {
			System.out.println("Hora de entrada: ");
			entrada = leerTiempo();
			
			System.out.println("Hora de salida: ");
			salida = leerTiempo();
			
			if(entrada.equals(salida)) {
				System.out.println("Las horas tienen que ser distintas");
			}
			
		} while (entrada.equals(salida));
		System.out.println("Entrada: " + entrada);
		System.out.println("Salida: " + salida);
		
		
	}
	public static Tiempo leerTiempo() {
		boolean ok = false;
		
		Tiempo t = null;
		do {
			try {
				System.out.println("(hh:mm:ss): ");
				String s = tec.next();
				t = new Tiempo(s);
				ok = true;
			} catch (IllegalArgumentException e) {
				System.out.println("Dato incorrecto");
			}
		}while(!ok);
		return t;
	}
}
