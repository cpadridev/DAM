package _03ejercicios;

import java.util.Scanner;

public class _02Bisiesto {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Año: ");
		int anyo = tec.nextInt();

		while (anyo > 0) {
			if (esBisiesto(anyo)) {
				System.out.println("Bisiesto");
			} else {
				System.out.println("No bisiesto");
			}

			System.out.println("Año: ");
			anyo = tec.nextInt();
		}
	}

	public static boolean esBisiesto(int anyo) {
		boolean resultado;

		if (anyo % 4 == 0) {
			if (anyo % 100 == 0) {
				if (anyo % 400 == 0) {
					resultado = true;
				} else {
					resultado = false;
				}
			} else {
				resultado = true;
			}
		} else {
			resultado = false;
		}

		return resultado;
	}

	public static boolean esBisiesto2(int anyo) {
		boolean resultado;

		if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
			resultado = true;
		} else {
			resultado = false;
		}

		return resultado;
	}

	public static boolean esBisiesto3(int anyo) {
		return (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0);
	}

	public static boolean esBisiesto4(int anyo) {
		if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
