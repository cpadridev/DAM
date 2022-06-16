package _03ejercicios;

public class _16Ventas {
	public static void main(String[] args) {
		int[][] ventas = { { 200, 100, 100, 1000, 100, 100, 100, 100, 100, 100 },
				{ 100, 100, 100, 2000, 1000, 100, 100, 100, 100, 100 },
				{ 100, 100, 100, 200, 200, 100, 100, 100, 100, 100 },
				{ 100, 100, 100, 100, 300, 300, 300, 100, 100, 100 },
				{ 100, 100, 400, 100, 100, 100, 400, 100, 100, 100 } };
		double[] precio = { 12.5, 10.1, 20.2, 30, 31, 8.4, 7.5, 1.5, 2.5, 3.5 };

		System.out.println(mejorDistribuidor(ventas));
		System.out.println(articuloMasVendido(ventas));

		comisiones(ventas, precio);
	}

	// Devuelve la fila que más ventas suma.
	public static int mejorDistribuidor(int[][] ventas) {
		int maximo = -1;
		int mejor = -1;

		for (int i = 0; i < ventas.length; i++) {
			int total = 0;

			for (int j = 0; j < ventas[0].length; j++) {
				total += ventas[i][j];
			}

			if (total > maximo) {
				maximo = total;
				mejor = i;
			}
		}

		return mejor;
	}

	public static int articuloMasVendido(int[][] ventas) {
		int maximo = -1;
		int mejor = -1;

		for (int j = 0; j < ventas[0].length; j++) {
			int total = 0;

			for (int i = 0; i < ventas.length; i++) {
				total += ventas[i][j];
			}

			if (total > maximo) {
				maximo = total;
				mejor = j;
			}
		}

		return mejor;
	}

	public static void comisiones(int[][] ventas, double[] precios) {
		for (int i = 0; i < ventas.length; i++) {

			// Calculamos el importe vendido por el distribuidor.
			double total = 0;

			for (int j = 0; j < ventas[0].length; j++) {
				total += ventas[i][j] * precios[j];
			}

			double porcentaje = 0;

			if (total >= 70000)
				porcentaje = 8;
			else if (total >= 30000)
				porcentaje = 5;

			if (porcentaje > 0) {
				double comision = total * porcentaje / 100;
				System.out.format("Distrib: %d - Ventas: %.2f - Porcentaje: %.2f - Comision %.2f %n", i, total,
						porcentaje, comision);
			}
		}
	}
}
