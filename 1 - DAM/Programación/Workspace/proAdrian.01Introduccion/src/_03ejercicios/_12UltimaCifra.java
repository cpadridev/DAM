package _03ejercicios;

import java.util.Scanner;

public class _12UltimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Número: ");
		int numero = tec.nextInt();

		System.out.println("Última cifra: " + (numero % 10));
	}
}
