package _03ejercicios;

public class _08Lluvias {
	public static void main(String[] args) {
		double[] p = { 8, 0, 0, 1, 8, 2, 2, 2, 3, 4, 10, 5, 5, 2, 2, 0, 7, 1, 1, 1, 1, 2, 3, 4, 4, 4, 3, 2, 1, 1, 1 };

		System.out.println("Primer día de lluvia 19 litros: " + primerDiaLluviaX(p, 19));
		System.out.println("Último día de lluvia 8 litros: " + ultimoDiaLluviaX(p, 8));
	}

	public static int primerDiaLluviaX(double[] p, double x) {
		boolean encontrado = false;
		int i = 0;

		while (i < p.length && !encontrado) {
			if (p[i] == x) {
				encontrado = true;
			} else {
				i++;
			}
		}

		int primerDia;

		if (encontrado) {
			primerDia = i;
		} else {
			primerDia = -1;
		}

		return primerDia;
	}

	public static int primerDiaLluviaX2(double[] p, double x) {
		boolean encontrado = false;
		int primerDia = -1;

		for (int i = 0; i < p.length && !encontrado; i++) {
			if (p[i] == x) {
				primerDia = i;
				encontrado = true;
			}
		}

		return primerDia;
	}

	public static int primerDiaLluviaX3(double[] p, double x) {
		int i = 0;

		while (i < p.length && p[i] != x) {
			i++;
		}

		int primerDia;

		if (i < p.length) {
			primerDia = i;
		} else {
			primerDia = -1;
		}

		return primerDia;
	}

	public static int ultimoDiaLluviaX(double[] p, double x) {
		boolean encontrado = false;
		int primerDia = -1;

		for (int i = p.length - 1; i >= 0 && !encontrado; i--) {
			if (p[i] == x) {
				primerDia = i;
				encontrado = true;
			}
		}

		return primerDia;
	}
}
