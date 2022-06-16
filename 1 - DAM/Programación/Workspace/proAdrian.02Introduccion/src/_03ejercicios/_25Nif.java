package _03ejercicios;

import java.util.Scanner;

public class _25Nif {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce NIF completo: ");
		String nif = tec.next();

		// Separar número y letra.
		char letra = nif.charAt(nif.length() - 1);
		String sNumero = nif.substring(0, nif.length() - 1);
		int num = Integer.parseInt(sNumero);

		// Comprobamos si la letra indicada es la que debería ser .
		if (calcularLetraNif(num) == letra) {
			System.out.println("El NIF es correcto");
		} else {
			System.out.println("El NIF es INCORRECTO");
		}
	}

	public static char calcularLetraNif(int numero) {
		int resto = numero % 23;
		char letra;

		if (resto == 0) {
			letra = 'T';
		} else if (resto == 1) {
			letra = 'R';
		} else if (resto == 2) {
			letra = 'W';
		} else if (resto == 3) {
			letra = 'A';
		} else if (resto == 4) {
			letra = 'G';
		} else if (resto == 5) {
			letra = 'M';
		} else if (resto == 6) {
			letra = 'Y';
		} else if (resto == 7) {
			letra = 'F';
		} else if (resto == 8) {
			letra = 'P';
		} else if (resto == 9) {
			letra = 'D';
		} else if (resto == 10) {
			letra = 'X';
		} else if (resto == 11) {
			letra = 'B';
		} else if (resto == 12) {
			letra = 'N';
		} else if (resto == 13) {
			letra = 'J';
		} else if (resto == 14) {
			letra = 'Z';
		} else if (resto == 15) {
			letra = 'S';
		} else if (resto == 16) {
			letra = 'Q';
		} else if (resto == 17) {
			letra = 'V';
		} else if (resto == 18) {
			letra = 'H';
		} else if (resto == 19) {
			letra = 'L';
		} else if (resto == 20) {
			letra = 'C';
		} else if (resto == 21) {
			letra = 'K';
		} else {
			letra = 'E';
		}

		return letra;
	}
}
