package _02ejemplos;

public class _04IncrementoDecremento {
	public static void main(String[] args) {
		int a, b, c, d;
		a = b = c = d = 10;
		// El incremento y decremento se pueden poner antes o después del nombre de la
		// variable. El efecto es el mismo:
		a++; // 11
		++b; // 11
		c--; // 9
		--d; // 9

		System.out.println(a + " " + b + " " + c + " " + d);

		// Si el incremento o decremento son parte de una expresión más grande, entonces
		// no es lo mismo que vaya antes o que vaya después.
		int x, y;

		// Preincremento: El valor de la variable incrementada cambia ANTES de que la
		// variable se use.
		x = 10;
		y = ++x;

		System.out.println("x = " + x + " y = " + y);

		// Postincremento: El valor de la variable incrementada cambia DESPUÉS de que la
		// variable se use.
		x = 10;
		y = x++;

		System.out.println("x = " + x + " y = " + y);
	}
}
