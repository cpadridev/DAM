package _02ejemplos;

public class _05ValorVsReferencia {
	public static void main(String[] args) {
		int numero = 20;

		incrementar(numero);

		System.out.println(numero);

		int[] edad = { 1, 2, 3 };

		incrementar(edad);

		System.out.println(edad[0]);
		System.out.println(edad[1]);
		System.out.println(edad[2]);

		String nombre = "Javi";

		anyadirSaludo(nombre);

		System.out.println(nombre);
	}

	public static void incrementar(int numero) {
		numero = numero + 1;
	}

	public static void incrementar(int[] numero) {
		numero[0]++;
		numero[1]++;
		numero[2]++;
	}

	public static void anyadirSaludo(String s) {
		s = "HOLA " + s;
	}
}
