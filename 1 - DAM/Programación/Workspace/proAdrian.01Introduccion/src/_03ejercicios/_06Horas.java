package _03ejercicios;

import java.util.Scanner;

public class _06Horas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Escribe un número de segundos: ");
		int segundos = tec.nextInt();

		int horas = segundos / 3600;
		segundos = segundos % 60;

		System.out.println(horas + " horas completas");
		System.out.println("y sobran " + segundos + " segundos");	
	}
}
