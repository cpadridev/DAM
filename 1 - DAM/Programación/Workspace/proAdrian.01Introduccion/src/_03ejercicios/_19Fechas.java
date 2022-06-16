package _03ejercicios;

import java.util.Scanner;

public class _19Fechas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int d1, m1, a1, d2, m2, a2;

		System.out.println("Fecha 1 (d m a): ");
		d1 = tec.nextInt();
		m1 = tec.nextInt();
		a1 = tec.nextInt();
		System.out.println("Fecha 2 (d m a): ");
		d2 = tec.nextInt();
		m2 = tec.nextInt();
		a2 = tec.nextInt();

		System.out.print("La fecha menor es: ");
		if (a1 < a2)
			System.out.println(d1 + "/" + m1 + "/" + a1);
		else if (a2 < a1)
			System.out.println(d2 + "/" + m2 + "/" + a2);
		else
		// Mismo año, nos fijamos en el mes.
		if (m1 < m2)
			System.out.println(d1 + "/" + m1 + "/" + a1);
		else if (m2 < m1)
			System.out.println(d2 + "/" + m2 + "/" + a2);
		else
		// Mismo mes, nos fijamos en el día.
		if (d1 < d2)
			System.out.println(d1 + "/" + m1 + "/" + a1);
		else if (d2 < d1)
			System.out.println(d2 + "/" + m2 + "/" + a2);
		else
			System.out.println("Fechas iguales");

		// De otra forma.
		int num1 = a1 * 365 + m1 * 30 + d1;
		int num2 = a2 * 365 + m2 * 30 + d2;

		if (num1 < num2)
			System.out.println(d1 + "/" + m1 + "/" + a1);
		else if (num2 < num1)
			System.out.println(d2 + "/" + m2 + "/" + a2);
		else
			System.out.println("Fechas iguales");
	}
}
