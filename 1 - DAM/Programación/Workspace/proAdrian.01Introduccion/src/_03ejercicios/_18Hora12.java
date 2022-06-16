package _03ejercicios;

import java.util.Scanner;

public class _18Hora12 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Hora:minutos");
		int h = tec.nextInt();
		int m = tec.nextInt();

		if (h == 0) {
			System.out.println("12:" + m + " AM");
		} else if (h <= 11) {
			System.out.println(h + ":" + m + " AM");
		} else if (h == 12) {
			System.out.println("12:" + m + " PM");
		} else {
			System.out.println(h - 12 + ":" + m + " PM");
		}
	}
}
