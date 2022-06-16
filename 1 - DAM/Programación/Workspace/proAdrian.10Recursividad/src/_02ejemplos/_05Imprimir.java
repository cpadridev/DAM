package _02ejemplos;

public class _05Imprimir {
	public static void main(String[] args) {
		imprimirHasta(5);
	}

	// Metodo recursivo que muestra desde el 1 hasta el n.
	public static void imprimirHasta(int n) {
		if (n == 1) {
			System.out.println(1);
		} else {
			imprimirHasta(n - 1);
			System.out.println(n);
		}
	}
}
