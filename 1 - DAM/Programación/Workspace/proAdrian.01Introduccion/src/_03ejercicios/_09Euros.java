package _03ejercicios;

import java.util.Scanner;

public class _09Euros {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce euros: ");
		double euros = tec.nextDouble();

		double pesetas = euros * 166.386;

		System.out.println(euros + " euros son " + pesetas + " pesetas");
	}
}
