package _03ejercicios;

import java.util.Scanner;

public class _11LongitudEntero {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce entero largo: ");
		long num = tec.nextLong();

		String texto = String.valueOf(num);
		System.out.println(texto.length());
		// Sin usar el método valueOf.
		texto = "" + num;

		System.out.println(texto.length());
	}
}
