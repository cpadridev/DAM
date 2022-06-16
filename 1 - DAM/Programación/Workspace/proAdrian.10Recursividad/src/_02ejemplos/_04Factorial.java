package _02ejemplos;

public class _04Factorial {
	public static void main(String[] args) {
		int f = factorial(5);
		System.out.println(f);
		System.out.println(factorialIterativo(5));
	}

	public static int factorial(int n) {
		if (n == 0) { // caso base.
			return 1;
		} else { // caso general o recursivo.
			return n * factorial(n - 1);
		}
	}

	public static int factorialIterativo(int n) {
		int f = 1;

		for (int i = 1; i <= n; i++) {
			f = f * i;
		}

		return f;
	}
}
