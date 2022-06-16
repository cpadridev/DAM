package _03ejercicios;

import java.util.Scanner;

public class _05Minutos {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Escribe cantidad de segundos: ");
		int segundos = tec.nextInt();

		int minutos = segundos / 60;
		segundos = segundos % 60;

		System.out.println(minutos + " minutos completos");
		System.out.println("y sobran " + segundos + " segundos");
	}
}
