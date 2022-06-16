package _02ejemplos;

public class _10AlMenosDosPares {
	public static void main(String[] args) {
		int[] v = { 2, 1, 4, 8, 3, 5, 8 };

		// Contar el número de pares: RECORRIDO.
//		int numPares = 0;
//		for (int i = 0; i < v.length; i++) {
//			if(v[i] % 2 == 0) {
//				numPares++;
//			}
//		}

		// Averiguar si en v hay al menos dos números pares.
		boolean encontrado = false;
		int numPares = 0;

		for (int i = 0; i < v.length && !encontrado; i++) {
			if (v[i] % 2 == 0) {
				numPares++;

				if (numPares == 2) {
					encontrado = true;
				}
			}
		}

		if (encontrado) {
			System.out.println("Hay al menos dos pares");
		} else {
			System.out.println("No hay al menos dos pares");
		}
	}
}
