package _02ejemplos;

public class _01Literales {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 010;
		int num3 = 0x10;

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		// Los literales de tipo long llevan una 'L' detrás.
		long largo1 = 4;
		long largo2 = 3000000000L;

		// Literales "raros".
		System.out.println(20 / 0.0);
		System.out.println(-20 / 0.0);
		System.out.println(0.0 / 0.0);
	}
}
