package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03EdadesV1 {
	final static int NUMEDADES = 5;
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int suma = 0;
		int i = 1;
		while (i <= NUMEDADES) {
			try {
				System.out.println("Edad " + i);
				int edad = tec.nextInt();
				suma += edad;
				i++;
			} catch (InputMismatchException e) {
				System.out.println("La edad debe ser un entero");
				tec.nextLine();
			}
		}
		System.out.println("Media: " + ((double)suma / NUMEDADES));
	}
}
