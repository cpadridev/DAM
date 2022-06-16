package _02ejemplos;

import java.util.Scanner;

public class _07Regimen {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// Pensión Completa, Media Pensión, Alojamiento-Desayuno, Solo-Alojamiento.
		System.out.println("Indica régimen de alojamiento (PC, MP, AD, SA) : ");
		String regimen = tec.next();

		System.out.println("El precio incluye: ");

		switch (regimen) {
		case "PC":
			System.out.println("Cena");
		case "MP":
			System.out.println("Comida");
		case "AD":
			System.out.println("Desayuno");
		case "SA":
			System.out.println("Limpieza de la habitación");
		}
	}
}
