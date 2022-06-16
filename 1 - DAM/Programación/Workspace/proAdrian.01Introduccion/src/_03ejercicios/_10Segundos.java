package _03ejercicios;

import java.util.Scanner;

public class _10Segundos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Segundos: ");
		int segundos = tec.nextInt();

		int dias, horas, minutos;

		// Días completos y segundos que sobran.
		dias = segundos / 86400; // (24 * 60 * 60)
		segundos = segundos % 86400;

		// Horas completas y segundos que sobran.
		horas = segundos / 3600;
		segundos = segundos % 3600;

		// Minutos completos y segundos que sobran.
		minutos = segundos / 60;
		segundos = segundos % 60;

		System.out.println(dias + " días");
		System.out.println(horas + " horas");
		System.out.println(minutos + " minutos");
		System.out.println(segundos + " segundos");
	}
}
