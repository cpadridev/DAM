package examen;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Código: ");
		String codigo = tec.next();

		String[] partes = separar(codigo);

		System.out.println("Letras: " + partes[0]);
		System.out.println("Números: " + partes[1]);

		tec.close();
	}

	public static String[] separar(String codigo) {
		String[] resultado = new String[2];

		String parte1 = codigo.substring(0, codigo.indexOf("-"));
		String parte2 = codigo.substring(codigo.indexOf("-") + 1);

		if (parte1.length() < parte2.length()) {
			resultado[0] = parte1;
			resultado[1] = parte2;
		} else {
			resultado[0] = parte2;
			resultado[1] = parte1;
		}

		return resultado;
	}
}
