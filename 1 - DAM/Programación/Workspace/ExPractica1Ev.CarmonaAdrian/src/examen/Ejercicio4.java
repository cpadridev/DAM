package examen;

public class Ejercicio4 {
	public static void main(String[] args) {

		System.out.println("Prueba 1:");
		System.out.println("------------");
		int[] t1Bases = { 3, 7, 5, 8, 9 };
		int[] t1Alturas = { 6, 3, 9, 4, 5 };
		areaMaxima(t1Bases, t1Alturas);

		System.out.println("\nPrueba 2:");
		System.out.println("------------");
		int[] t2Bases = { 3, 7, 2, 8 };
		int[] t2Alturas = { 1, 6, 3, 2, 4, 9 };
		areaMaxima(t2Bases, t2Alturas);

		System.out.println("\nPrueba 3:");
		System.out.println("------------");
		int[] t3Bases = { 9, 4, 3, 7, 2, 8, 5 };
		int[] t3Alturas = { 8, 2, 4, 9 };
		areaMaxima(t3Bases, t3Alturas);

	}

	public static void areaMaxima(int[] bases, int[] alturas) {
		int longitud = Math.min(bases.length, alturas.length);
		int maximo = 0;
		double areaMaxima = (bases[0] * alturas[0]) / 2.0;

		for (int i = 1; i < longitud; i++) {
			double area = (bases[i] * alturas[i]) / 2.0;

			if (area > areaMaxima) {
				maximo = i;
				areaMaxima = area;
			}
		}

		System.out.println("Posicion del triangulo con area maxima: " + maximo);
		System.out.println("Base: " + bases[maximo]);
		System.out.println("Altura: " + alturas[maximo]);
		System.out.println("Area: " + areaMaxima);
	}

	public static void areaMaxima2(int[] bases, int[] alturas) {
		int longitud = bases.length;

		if (alturas.length < longitud)
			longitud = alturas.length;

		int maximo = -1;
		double areaMaxima = -1;

		for (int i = 0; i < longitud; i++) {
			double area = (bases[i] * alturas[i]) / 2.0;

			if (area > areaMaxima) {
				maximo = i;
				areaMaxima = area;
			}
		}

		System.out.println("Posicion del triangulo con area maxima: " + maximo);
		System.out.println("Base: " + bases[maximo]);
		System.out.println("Altura: " + alturas[maximo]);
		System.out.println("Area: " + areaMaxima);
	}
}
