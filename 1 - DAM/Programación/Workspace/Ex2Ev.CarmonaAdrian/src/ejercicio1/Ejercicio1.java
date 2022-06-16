package ejercicio1;

public class Ejercicio1 {
	public static void main(String[] args) {
		int[][] hacheMayuscula = {
				{0,0,0,0,0,0},
				{0,1,0,0,1,0},
				{0,1,0,0,1,0},
				{0,1,1,1,1,0},
				{0,1,0,0,1,0},
				{0,1,0,0,1,0},
				{0,0,0,0,0,0}
		};
	
		int[][] oMinuscula = {
				{0,0,0,0,0,0},
				{0,0,1,1,0,0},
				{0,1,0,0,1,0},
				{0,1,0,0,1,0},
				{0,0,1,1,0,0},
				{0,0,0,0,0,0},
		};

		// Completar para mostrar las letras con borde usando los metodos
		// anadirBorde(...) e imprimirLetra(...)

		imprimirLetra(hacheMayuscula);
		imprimirLetra(oMinuscula);

		hacheMayuscula = anadirBorde(hacheMayuscula);
		oMinuscula = anadirBorde(oMinuscula);

		imprimirLetra(hacheMayuscula);
		imprimirLetra(oMinuscula);
	}

	public static void imprimirLetra(int[][] letra) {
		for (int i = 0; i < letra.length; i++) {
			for (int j = 0; j < letra[i].length; j++) {
				if (letra[i][j] == 0) {
					System.out.print(" ");
				} else {
					System.out.print((char) 9609);
				}
			}
			System.out.println();

		}
	}

	public static int[][] anadirBorde(int[][] letra) {
		int ancho = letra[0].length + 2;
		int alto = letra.length + 2;
		int[][] borde = new int[alto][ancho];

		for (int i = 0; i < borde.length; i++) {
			for (int j = 0; j < borde[0].length; j++) {
				if (i == 0 || i == borde.length - 1) {
					borde[i][j] = 1;
				} else {
					if (j == 0 || j == borde[0].length - 1) {
						borde[i][j] = 1;
					} else {
						borde[i][j] = 0;
					}
				}
			}
		}

		for (int i = 1; i < borde.length - 1; i++) {
			for (int j = 1; j < borde[0].length - 1; j++) {
				borde[i][j] = letra[i - 1][j - 1];
			}
		}

		return borde;
	}
}
