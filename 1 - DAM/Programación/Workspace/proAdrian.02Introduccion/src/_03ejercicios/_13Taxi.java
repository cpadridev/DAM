package _03ejercicios;

import java.util.Scanner;

public class _13Taxi {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("DÍA o NOCHE: ");
		String dn = tec.next();
		System.out.println("Día de la semana (1 a 7): ");
		int dia = tec.nextInt();
		System.out.println("Quilómetros: ");
		double km = tec.nextDouble();

		double precio;

		if (dia < 7) {
			// Laborable
			if (dn.equalsIgnoreCase("DÍA")) {
				// Por el dia
				precio = 0.73;
			} else {
				// Por la noche
				precio = 0.84;
			}
		} else {
			// Domingo
			precio = 0.93;
		}

		double total = precio * km;

		// Aplicamos importe minimo
		if (dn.equalsIgnoreCase("DÍA")) {
//			if(total < 2.95) {
//				total = 2.95;
//			}
			total = Math.max(total, 2.95);
		} else {
//			if(total < 4) {
//				total = 4;
//			}
			total = Math.max(total, 4);
		}
		System.out.println("Total: " + total);
	}
}
