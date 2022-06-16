package practica;

import java.util.Scanner;

public class ValidarHora {
	public static void main(String[] args) {
		// Leer texto.
		Scanner tec = new Scanner(System.in);

		System.out.println("Introduce hora: ");
		String texto = tec.next();

		// Interpretar hora que quiere decirnos el usuario.
		int hora = 12;
		int minutos = 0;
		int posDosPuntos = texto.indexOf(":");

		// El texto contiene ":"
		if (posDosPuntos != -1) {
			// Separamos hora y minutos.
			String textoHora = texto.substring(0, posDosPuntos);
			String textoMinutos = texto.substring(posDosPuntos + 1);

			// Si no ha dejado la hora vacia, la convertimos a entero.
			if (textoHora.length() != 0) {
				hora = Integer.parseInt(textoHora);
			}

			// Si no ha dejado los minutos vacios, los convertimos a entero.
			if (textoMinutos.length() != 0) {
				minutos = Integer.parseInt(textoMinutos);
			}
		} else {
			// El texto NO texto contiene ":".
			int numero = Integer.parseInt(texto);

			if (texto.length() == 1) {
				hora = numero;
			} else if (texto.length() == 2) {
				if (numero < 24) {
					hora = numero;
				} else {
					hora = numero / 10;
					minutos = numero % 10 * 10;
				}
			} else if (texto.length() == 3) {
				hora = numero / 100;
				minutos = numero % 100;
			} else { // length == 4
				hora = numero / 100;
				minutos = numero % 100;
			}
		}

		// Validar hora.
		System.out.printf("%02d:%02d%n", hora, minutos);

		if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60) {
			System.out.println("CORRECTA");
		} else {
			System.out.println("INCORRECTA");
		}

		tec.close();
	}
}
