package _03ejercicios;

public class _12Capicua {
	public static void main(String[] args) {
		String[] palabras = { "buho", "oveja", "vaca", "lobo", "cerdo", "avestruz", "capicua", "ardilla", "nutria" };

		boolean existe = existeCapicua(palabras);

		if (existe) {
			System.out.println("Existe la palabra \"capicua\"");
		} else {
			System.out.println("No existe la palabra \"capicua\"");
		}
	}

	public static boolean existeCapicua(String palabras[]) {
		boolean existe = false;

		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].equals("capicua")) {
				existe = true;
			}
		}

		return existe;
	}
}
