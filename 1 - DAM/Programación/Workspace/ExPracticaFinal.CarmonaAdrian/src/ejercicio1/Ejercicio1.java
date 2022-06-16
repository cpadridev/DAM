package ejercicio1;

import java.util.Arrays;

public class Ejercicio1 {
	public static void main(String[] args) {
		int[][] notasPrueba1 = {
				{9,1,3,4,5,6,7,4},
				{5,7,6,3,5,8,1,6},
				{5,5,5,5,5,5,5,5},
				{8,9,4,3,5,8,7,3},
				{9,10,8,7,5,8,8,10},
				{7,2,6,9,6,5,7,6}
		};

		int[][] notasPrueba2 = {
				{5,6,6,1,6,4},
				{8,9,3,7,3,7}
		};

		System.out.println(Arrays.toString(calcularNotasFinales(notasPrueba1)));
		System.out.println(Arrays.toString(calcularNotasFinales(notasPrueba2)));
	}

	public static double[] calcularNotasFinales(int m[][]) {
		double[] mediaNotas = new double[m.length];

			for (int i = 0; i < m.length; i++) {
				if (m[i].length < 3) {
					throw new IllegalArgumentException("La matriz debe de tener al menos 3 columnas");
				}

				double max = 0;
				double min = 10;
				double sumNotas = 0;

				for (int j = 0; j < m[i].length; j++) {
					if (m[i][j] > max) {
						max = m[i][j];
					}

					if (m[i][j] < min) {
						min = m[i][j];
					}

					sumNotas += m[i][j];
				}

				mediaNotas[i] = Math.round((sumNotas - max - min) / (m[i].length - 2) * 100) / 100.0;
			}

		return mediaNotas;
	}
}
