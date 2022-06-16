package _03ejercicios;

import java.util.Scanner;

public class _02Nif {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("NIF: ");
		String nif = tec.next();

		if (validarNif(nif)) {
			System.out.println("VÁLIDO");
		} else {
			System.out.println("NO VALIDO");
		}

	}

	public static boolean validarNif(String nif) {
		boolean valido;
		try {
			// Separar letra y números
			char letra = nif.charAt(nif.length() - 1);
			String sNumeros = nif.substring(0, nif.length() - 1);
			int numero = Integer.parseInt(sNumeros);

			// Comprobar si letra y número se corresponden
			String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
			//char[] letr = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
			int posLetra = numero % 23;

			if (letra != letras.charAt(posLetra)) {
			//if (letra != letr[posLetra]) {
				valido = false;
			} else {
				valido = true;
			}
		} catch (NumberFormatException e) {
			valido = false;
		}
		return valido;
	}
}
