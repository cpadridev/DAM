package _03ejercicios;

import java.util.Scanner;

public class _07Superficie {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce la longitud de la habitacion: ");
		double longitud = tec.nextDouble();
		System.out.println("Introduce la anchura de la habitacion: ");
		double anchura = tec.nextDouble();

		double superficie = longitud * anchura;

		System.out.println("La superficie de tu habitacion es " + superficie + " m2");
	}
}
