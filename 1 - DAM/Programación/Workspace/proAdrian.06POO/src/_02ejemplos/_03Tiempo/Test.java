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
public class Test {
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
		int h,m,s;
		Tiempo t = null;
		do {
			try {
		
				System.out.println("Hora: "); 
				h = tec.nextInt();
				System.out.println("Minuto: ");
				m = tec.nextInt();
				System.out.println("Segundo: ");
				s = tec.nextInt();
				t = new Tiempo(h,m,s);
				ok = true;
			} catch (InputMismatchException e) {
				tec.nextLine();
				System.out.println("El dato tiene que ser entero");
			}
		} while (!ok);
		return t;
	}
}
