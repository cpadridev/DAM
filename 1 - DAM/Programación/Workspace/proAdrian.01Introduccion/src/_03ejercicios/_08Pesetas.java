package _03ejercicios;

import java.util.Scanner;

public class _08Pesetas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce pesetas: ");
		double pesetas = tec.nextDouble();

		double euros = pesetas / 166.386;

		System.out.println(pesetas + " pesetas son " + euros + " euros");
	}
}
