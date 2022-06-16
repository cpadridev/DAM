package _02ejemplos;

public class _02SalidaPantalla {
	public static void main(String[] args) {
		// Escritura en la misma línea o distinta línea.
		System.out.print("Hola ");
		System.out.println("soy");
		System.out.println("adri");

		// Escritura de textos literales.
		System.out.println("20 + 2");
		System.out.println(20 + 2);

		// Podemos unir textos y números.
		System.out.println("5 por 14 son " + 5 * 14);

		// Puede ser necesario el uso de paréntesis.
		System.out.println("5 mas 14 son " + 5 + 14);
		System.out.println("5 mas 14 son " + (5 + 14));
		System.out.println(5 + 14 + " es el resultado de 5 mas 14");
	}
}
