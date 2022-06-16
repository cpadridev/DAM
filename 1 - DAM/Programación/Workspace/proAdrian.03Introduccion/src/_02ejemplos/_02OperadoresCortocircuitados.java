package _02ejemplos;

import java.util.Scanner;

public class _02OperadoresCortocircuitados {
	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {

		if (leerNotaTeoria() >= 5 && leerNotaPractica() >= 5) {
			System.out.println("APTO");
		} else {
			System.out.println("NO APTO");
		}
	}

	public static double leerNotaTeoria() {
		System.out.println("Teoría: ");
		double teoria = tec.nextDouble();

		return teoria;
	}

	public static double leerNotaPractica() {
		System.out.println("Práctica 1: ");
		double p1 = tec.nextDouble();
		System.out.println("Práctica 1: ");
		double p2 = tec.nextDouble();

		return (p1 + p2) / 2;
	}
}
