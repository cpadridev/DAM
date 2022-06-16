package _03ejercicios;

import java.util.Scanner;

public class _03Edades {
	final static int NUMEDADES = 5;
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int suma = 0;
		int i = 1;
		while (i <= NUMEDADES) {
			System.out.println("Edad " + i);
			int edad = tec.nextInt();
			suma += edad;
			i++;
		}
		System.out.println("Media: " + ((double)suma / NUMEDADES));
	}
}
