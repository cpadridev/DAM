package _03ejercicios;

import java.util.Scanner;

public class _06Email {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Email: ");
		String email = tec.next();

		int posArroba = email.indexOf('@');
		int posPunto = email.indexOf('.');

		System.out.println("Nombre: " + email.substring(0, posArroba));
		System.out.println("Dominio: " + email.substring(posArroba + 1, posPunto));
		System.out.println("Subdominio: " + email.substring(posPunto + 1));
	}
}
