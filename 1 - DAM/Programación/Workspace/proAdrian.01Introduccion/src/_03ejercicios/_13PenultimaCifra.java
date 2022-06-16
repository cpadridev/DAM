package _03ejercicios;

import java.util.Scanner;

public class _13PenultimaCifra {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Número: ");
		int numero = tec.nextInt();

		System.out.println("Penúltima cifra: " + (numero / 10 % 10));
	}
}
