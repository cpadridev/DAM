package _01pruebas;

import java.util.Scanner;

public class Programa1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Radio: ");
		double r = tec.nextDouble();

		double longitud = Circulos.longitud(r);
		double area = Circulos.area(r);
		double vol = Circulos.volumen(r);

		System.out.println("Longitud: " + longitud);
		System.out.println("Área: " + area);
		System.out.println("Volumen: " + vol);
	}
}
