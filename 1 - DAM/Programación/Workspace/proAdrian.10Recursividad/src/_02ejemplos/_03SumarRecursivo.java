package _02ejemplos;

public class _03SumarRecursivo {
	public static void main(String[] args) {
		int suma = sumarHasta(5);
		System.out.println(suma);
	}

	public static int sumarHasta(int n) {
		if (n == 1)
			return 1;
		else
			return n + sumarHasta(n - 1);
	}
}
