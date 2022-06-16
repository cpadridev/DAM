package _03ejercicios;

import java.util.Scanner;

public class _02Por2 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Escribe un número: ");
		int num = tec.nextInt();

		System.out.println("El doble de " + num + " es " + num * 2);
	}
}
