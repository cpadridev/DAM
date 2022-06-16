package _02ejemplos;

public class _06Fibonacci {
	static int sumasIterativo = 0;
	static int sumasRecursivo = 0;
	static int sumasRecursivo2 = 0;

	public static void main(String[] args) {
		System.out.println(fibonacciIterativo(100));
		System.out.println(sumasIterativo);
//		System.out.println(fibonacci(10));
//		System.out.println(sumasRecursivo);

		int[] f = new int[101];
		System.out.println(fibonacci2(100, f));
		System.out.println(sumasRecursivo2);
	}

	public static int fibonacciIterativo(int n) {
		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		else {
			int a = 0;
			int b = 1;
			int f = 0;
			for (int i = 3; i <= n; i++) {
				f = a + b;
				sumasIterativo++;
				a = b;
				b = f;
			}
			return f;
		}
	}

	public static int fibonacci(int n) {
		if (n == 1)
			return 0;
		else if (n == 2)
			return 1;
		else {
			sumasRecursivo++;
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static int fibonacci2(int n, int[] f) {
		if (f[n] != 0)
			return f[n];
		else {
			int res;
			if (n == 1)
				res = 0;
			else if (n == 2)
				res = 1;
			else {
				sumasRecursivo2++;
				res = fibonacci2(n - 1, f) + fibonacci2(n - 2, f);
			}
			f[n] = res;
			return res;
		}
	}
}
