package _03ejercicios;

import java.util.Scanner;

public class _12Calculadora {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Primer número: ");
		double num1 = tec.nextDouble();
		System.out.println("Segundo número: ");
		double num2 = tec.nextDouble();
		System.out.println("Operación: ");
		String op = tec.next();
//		char op2 = tec.next().charAt(0);

		if (op.equals("+")) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			// O con printf.
			System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
		} else if (op.equals("-")) {
			System.out.printf("%6.2f - %6.2f = %6.2f%n", num1, num2, num1 - num2);
		} else if (op.equals("*")) {
			System.out.printf("%6.2f * %6.2f = %6.2f%n", num1, num2, num1 * num2);
		} else if (op.equals("/")) {
			System.out.printf("%6.2f / %6.2f = %6.2f%n", num1, num2, num1 / num2);
		} else {
			System.out.println("Operación incorrecta");
		}
	}
}
