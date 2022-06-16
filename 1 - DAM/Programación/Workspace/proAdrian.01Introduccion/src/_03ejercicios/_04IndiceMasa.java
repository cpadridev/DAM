package _03ejercicios;

import java.util.Scanner;

public class _04IndiceMasa {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Escribe tu peso (Kg): ");
		double peso = tec.nextDouble();
		System.out.println("Escribe tu estatura (m): ");
		double estatura = tec.nextDouble();

		System.out.println("IMC:  " + (peso / (estatura * estatura)));
	}
}
