package examen;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Mb consumidos: ");
		double mb = tec.nextDouble();
		System.out.println("Minutos hablados: ");
		int min = tec.nextInt();

		// 5 euros de contrato.
		double coste = 5;
		// Consumo datos.
		double costeDatos;
		// Llamadas.
		double costeLlamadas;

		if (mb < 1000)
			costeDatos = mb * 0.05;
		else if (mb < 1500)
			costeDatos = mb * 0.03;
		else if (mb < 5000)
			costeDatos = mb * 0.02;
		else
			costeDatos = mb * 0.01;

		if (mb >= 5000)
			costeLlamadas = 0;
		else {
			if (min <= 200) {
				costeLlamadas = 5;
			} else {
				costeLlamadas = 5 + (min - 200) * 0.07;
			}
		}

		coste = coste + costeDatos + costeLlamadas;

		System.out.println("Coste por datos: " + costeDatos + " euros (sin iva)");
		System.out.println("Coste por llamadas: " + costeLlamadas + " euros (sin iva)");
		System.out.println("Total: " + coste + " euros (sin iva)");
		System.out.println("Total IVA INCLUIDO: " + calcularIVA(coste, 21));

		tec.close();
	}

	public static double calcularIVA(double num, double porcentaje) {
		return num + (num * porcentaje / 100);
	}
}
