package _02ejemplos;

public class _04Caracteres {
	public static void main(String[] args) {
		// Los literales de tipo char se representan con comillas simples.
		char inicial = 'J';

		System.out.println("La inicial de mi nombre es " + inicial);

		// Las variables de tipo char se usan como las de otro tipo.
		if (inicial == 'A') {
			System.out.println("Tu nombre empieza por A");
		} else {
			System.out.println("Tu nombre no empieza por A");
		}

		// Hay una relación entre carácteres y números.
		System.out.println((int) 'A');
		System.out.println((char) 100);

		if (inicial >= 'A' && inicial <= 'Z') {
			System.out.println("Tu inicial está en mayúscula");
		} else {
			System.out.println("Tu inicial no está en mayúscula");
		}

		// Secuencias de escape.
		System.out.println("Hola\nque\ntal");
		System.out.println("Nombre\tApellido1\tApellido2\tTotal");
		System.out.println("Los tabuladores en java se ponen con \t");
		System.out.println("Los tabuladores en java se ponen con \\t");
		System.out.println("Saludó diciendo \"hola\"");

		char comillaSimple = '\'';

		System.out.println("Hola que tal \b");
	}
}
