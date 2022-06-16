package _03ejercicios;

import java.util.Scanner;

public class _20Salario {
	final static int JORNADA = 40;

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Horas trabajadas: ");
		int horas = tec.nextInt();

		// Separamos en horas ordinarias y extraordinarias.
		int ordinarias, extra;

		if (horas <= JORNADA) {
			ordinarias = horas;
			extra = 0;
		} else {
			ordinarias = JORNADA;
			extra = horas - JORNADA;
		}

		// Cálculo salario bruto.
		double salarioBruto = ordinarias * 6 + extra * 10;

		// Aplico impuestos.
		if (salarioBruto <= 350) {
			System.out.println("Salario neto: " + salarioBruto * 0.98);
		} else {
			System.out.println("Salario neto: " + salarioBruto * 0.90);
		}
	}
}
