package _03ejercicios;

public class _27String {
	public static void main(String[] args) {
		System.out.println(veces3("casaaal", 'a'));

		repetir("hola", 3);
	}

	public static int veces(String texto, char letra) {
		int cont = 0;
		int posLetra = texto.indexOf(letra);

		while (posLetra != -1) {
			cont++;
			texto = texto.substring(posLetra + 1);
			posLetra = texto.indexOf(letra);
		}

		return cont;
	}

	public static int veces2(String texto, char letra) {
		int cont = 0;
		int posLetra = texto.indexOf(letra);

		while (posLetra != -1) {
			cont++;
			posLetra = texto.indexOf(letra, posLetra + 1);
		}

		return cont;
	}

	public static int veces3(String texto, char letra) {
		int cont = 0;
		int pos = 0;

		while (pos < texto.length()) {
			if (texto.charAt(pos) == letra) {
				cont++;
			}

			pos++;
		}

		return cont;
	}

	public static void repetir(String texto, int veces) {
		int cont = 0;

		while (cont < veces) {
			System.out.println(texto);

			cont++;
		}
	}
}
