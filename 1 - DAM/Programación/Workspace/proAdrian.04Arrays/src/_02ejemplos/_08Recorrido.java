package _02ejemplos;

public class _08Recorrido {
	public static void main(String[] args) {
		int[] edad = { 2, 20, 18, 33, 12, 21, 55, 67, 4, 4, 6, 29 };

		// Si edad contiene las edades de una serie de personas,
		// contar cuantas de ellas son mayores de edad.

		// Recorrido ascendente.
		int mayores = 0;

		for (int i = 0; i < edad.length; i++) {
			if (edad[i] >= 18) {
				mayores++;
			}
		}

		System.out.println("Hay " + mayores + " mayores de edad");

		// Contar cuantos jubilados (>= 65) hay.
		// Recorrido descendente.
		int jubilados = 0;

		for (int i = edad.length - 1; i >= 0; i--) {
			if (edad[i] >= 65) {
				jubilados++;
			}
		}

		System.out.println("Hay " + jubilados + " jubilados");
	}
}
