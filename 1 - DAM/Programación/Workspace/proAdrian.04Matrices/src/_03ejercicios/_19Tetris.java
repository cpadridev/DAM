package _03ejercicios;

public class _19Tetris {
	public static void main(String[] args) {
		int[][] m = { 
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 0, 0, 0, 0, 0, 0 }, 
				{ 0, 0, 2, 0, 0, 0, 0, 0 },
				{ 1, 0, 2, 2, 2, 2, 2, 0 }, 
				{ 1, 0, 2, 4, 4, 0, 3, 0 }, 
				{ 1, 1, 2, 4, 4, 3, 3, 3 } };

		eliminarFilas(m);
	}

	public static void eliminarFilas(int[][] m) {
		boolean filaCompleta = true;

		for (int i = 0; i < m[i].length; i++) {
			if (m[14][i] == 0) {
				filaCompleta = false;
			}
		}

		if (filaCompleta) {
			for (int i = 14; i != 0; i--) {
				for (int j = 7; j != -1; j--) {
					m[i][j] = m[i - 1][j];
				}
			}

			for (int i = 0; i < 5; i++) {
				m[0][i] = 0;
			}

			mostrarTetris(m);
		}
	}

	public static void mostrarTetris(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.print(i + ": ");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j]);
			}
			System.out.println("");
		}
	}
}
