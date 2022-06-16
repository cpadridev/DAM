package _02ejemplos._03Tiempo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
	static Scanner tec = new Scanner(System.in);
	//Pedir al usuario hora de entrada y hora de salida, que tienen
	//que ser distintas
	public static void main(String[] args) {
		System.out.println("Casa".compareTo("pedro"));
		Tiempo entrada, salida;
		do {
			System.out.println("Hora de entrada: ");
			entrada = leerTiempo();
			
			System.out.println("Hora de salida: ");
			salida = leerTiempo();
			
			if(entrada.compareTo(salida)>=0) {
				System.out.println("La hora de entrada tiene que ser anterior a la de salida");
			}
			
		} while (entrada.compareTo(salida)>=0);
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
