package _03ejercicios;

public class _10PrimerImpar {
	public static void main(String[] args) {
		int[] enteros = { 2, 4, 4, 2, 2, 2, 3, 19, 10, 2 };

		System.out.println(primerImpar(enteros));
	}

	public static int primerImpar (int enteros[]) {
		int suma = 0;

		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i] % 2 != 0) {
				for (int j = i + 1; j < enteros.length; j++) {
					suma += enteros[j];
				}

				break;
			}
		}

		return suma;
	}
}
