package _03ejercicios;

public class _02Lluvias {
	public static void main(String[] args) {
		double[] p = { 0, 0, 0, 1, 1, 2, 2, 2, 3, 4, 10, 5, 5, 2, 2, 0, 7, 1, 1, 1, 1, 2, 3, 4, 4, 4, 3, 2, 1, 1, 1 };

		System.out.println("Lluvia total: " + lluviaTotal(p));
		System.out.println("Lluvia media: " + lluviaMedia(p));
		System.out.println("Lluvia máxima: " + lluviaMaxima(p));
		System.out.println("Lluvia mínima: " + lluviaMinima(p));
		System.out.println("Día más lluvia: " + (diaMasLluvia(p) + 1));
		System.out.println("Día menos lluvia: " + (diaMenosLluvia(p) + 1));
		System.out.println("Días sin lluvia: " + contarDiasLluviaX(p, 0));
		System.out.println("LLuvias primera quincena: " + lluviaTotalPeriodo(p, 0, 14));
		System.out.println("Días lluvia creciente: " + contarDiasLluviaCreciente(p));
		System.out.println("Días lluvia creciente: " + contarDiasLluviaCreciente2(p));
	}

	public static double lluviaTotal(double[] p) {
		double total = 0;

		for (int i = 0; i < p.length; i++) {
			total += p[i];
		}

		return total;
	}

	public static double lluviaMedia(double[] p) {
		return lluviaTotal(p) / p.length;
	}

	public static double lluviaMedia2(double[] p) {
		double total = 0;

		for (int i = 0; i < p.length; i++) {
			total += p[i];
		}

		return total / p.length;
	}

	public static double lluviaMaxima(double[] p) {
		double maximo = p[0];

		for (int i = 1; i < p.length; i++) {
			if (p[i] > maximo) {
				// Estoy en un nuevo máximo.
				maximo = p[i];
			}
		}

		return maximo;
	}

	public static double lluviaMinima(double[] p) {
		double minimo = p[0];

		for (int i = 1; i < p.length; i++) {
			if (p[i] < minimo) {
				// Estoy en un nuevo máximo.
				minimo = p[i];
			}
		}

		return minimo;
	}

	public static int diaMasLluvia(double[] p) {
		double maximo = p[0];
		int diaMaximo = 0;

		for (int i = 1; i < p.length; i++) {
			if (p[i] > maximo) {
				// Estoy en un nuevo máximo.
				maximo = p[i];
				diaMaximo = i;
			}
		}

		return diaMaximo;
	}

	public static int diaMenosLluvia(double[] p) {
		double minimo = p[0];
		int diaMinimo = 0;

		for (int i = 1; i < p.length; i++) {
			if (p[i] < minimo) {
				// Estoy en un nuevo máximo.
				minimo = p[i];
				diaMinimo = i;
			}
		}

		return diaMinimo;
	}

	public static int contarDiasLluviaX(double[] p, double x) {
		int cont = 0;

		for (int i = 0; i < p.length; i++) {
			if (p[i] == x) {
				cont++;
			}
		}

		return cont;
	}

	public static double lluviaTotalPeriodo(double[] p, int ini, int fin) {
		double suma = 0;

		for (int i = ini; i <= fin; i++) {
			suma = suma + p[i];
		}

		return suma;
	}

	public static double lluviaTotalPeriodoWhile(double[] p, int ini, int fin) {
		double suma = 0;
		int i = ini;

		while (i <= fin) {
			suma = suma + p[i];
			i++;
		}

		return suma;
	}

	public static double lluviaTotalPeriodoMala(double[] p, int ini, int fin) {
		double suma = 0;

		for (int i = 0; i < p.length; i++) {
			if (i >= ini && i <= fin) {
				suma = suma + p[i];
			}
		}

		return suma;
	}

	public static int contarDiasLluviaCreciente(double[] p) {
		int cont = 0;

		for (int i = 0; i < p.length - 1; i++) {
			if (p[i] < p[i + 1]) {
				cont++;
			}
		}

		return cont;
	}

	public static int contarDiasLluviaCreciente2(double[] p) {
		int cont = 0;

		for (int i = 1; i < p.length; i++) {
			if (p[i] > p[i - 1]) {
				cont++;
			}
		}

		return cont;
	}
}
