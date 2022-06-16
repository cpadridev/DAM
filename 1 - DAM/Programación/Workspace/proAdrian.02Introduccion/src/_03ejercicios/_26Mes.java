package _03ejercicios;

import java.util.Scanner;

public class _26Mes {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Número de mes: ");
		int numMes = tec.nextInt();

		System.out.printf("El mes %d tiene %d días %n", numMes, diasMes(numMes));

		System.out.println("Nombre de mes: ");
		String nombreMes = tec.next();

		System.out.printf("El mes %s tiene %d días %n", nombreMes, diasMes(nombreMes));
	}

	public static int diasMes(int mes) {
		int dias;

		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			dias = 31;
		} else if (mes == 2) {
			dias = 28;
		} else {
			dias = 30;
		}

		return dias;
	}

	public static int diasMes(String mes) {
		int dias;
		mes = mes.toUpperCase();

		if (mes.equals("ENERO")) {
			dias = 31;
		} else if (mes.equals("FEBRERO")) {
			dias = 28;
		} else if (mes.equals("MARZO")) {
			dias = 31;
		} else if (mes.equals("ABRIL")) {
			dias = 30;
		} else if (mes.equals("MAYO")) {
			dias = 31;
		} else if (mes.equals("JUNIO")) {
			dias = 30;
		} else if (mes.equals("JULIO")) {
			dias = 31;
		} else if (mes.equals("AGOSTO")) {
			dias = 31;
		} else if (mes.equals("SEPTIEMBRE")) {
			dias = 30;
		} else if (mes.equals("OCTUBRE")) {
			dias = 31;
		} else if (mes.equals("NOVIEMBRE")) {
			dias = 30;
		} else {
			dias = 31;
		}

		return dias;
	}
}
