package _03ejercicios;

import java.util.Scanner;

public class _23Circulo {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Radio: ");
		double r = tec.nextDouble();

		double longitud = longitudCircunferencia(r);
		double area = areaCirculo(r);
		double vol = volumenEsfera(r);

		System.out.println("Longitud: " + longitud);
		System.out.println("Área: " + area);
		System.out.println("Volumen: " + vol);
	}

	public static double longitudCircunferencia(double radio) {
		double l = 2 * Math.PI * radio;
		
		return l;
	}

	public static double areaCirculo(double radio) {
		return Math.PI * radio * radio;
	}

	public static double volumenEsfera(double radio) {
		double v = (4.0 / 3) * Math.PI * Math.pow(radio, 3);

		return v;
	}
}
