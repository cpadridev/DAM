package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _05LeerEdad {
	static Scanner tec = new Scanner(System.in);
	
	public static void main(String[] args) {
		int edad = leerEdad(120);
		if(edad >= 18) System.out.println("Mayor de edad");
		else System.out.println("Menor de edad");
	}
	
	//pide y lee edad (entero) entre 0 y valorMaximo. Si el usuario 
	//introduce un valor fuera de rango o no introduce un entero, 
	//se muestra un mensaje adecuado y se vuelve a pedir
	public static int leerEdad(int valorMaximo) {
		int edad = 0;
		boolean ok = false;
		do {
			try {
				System.out.println("Introduce edad: ");
				edad = tec.nextInt();
				if(edad >= 0 && edad <= valorMaximo) {
					ok = true;
				} else {
					System.out.println("Edad fuera de rango");
				}
				
			} catch (InputMismatchException e) {
				System.out.println("La edad debe ser un numero entero");
				tec.nextLine();
			}
		} while (!ok);	
		return edad;
	}

}
