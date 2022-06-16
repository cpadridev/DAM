package _02ejemplos;

import java.util.Scanner;

public class _17VariablesGlobalesIncorrecto {
	static int radio;
	static double longitud;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce radio:  ");
		radio = tec.nextInt();

		longitudCircunferencia();

		System.out.println(longitud);
	}

	public static void longitudCircunferencia() {
		longitud = 2 * Math.PI * radio;
	}
}
