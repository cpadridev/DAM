package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04RecuperarseDeExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		int edad;
		boolean ok = false;
		do {
			try {
				System.out.println("Introduce edad: ");
				edad = tec.nextInt();
				ok = true;
				if(edad >= 18) {
					System.out.println("Mayor de edad");
				} else {
					System.out.println("Menor de edad");
				}
			} catch (InputMismatchException e) {
				System.out.println("La edad debe ser un numero entero");
				tec.nextLine();
			}
		} while (!ok);	
		
		System.out.println("Fin del programa");
	
	}
}
