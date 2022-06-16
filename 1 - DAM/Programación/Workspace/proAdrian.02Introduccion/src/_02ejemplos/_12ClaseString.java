package _02ejemplos;

import java.util.Scanner;

public class _12ClaseString {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		// Equals: Comprueba si un string es igual que otro.
		System.out.println("Nombre: ");
		String nombre = tec.next();

		if (nombre.equals("adri")) {
			System.out.println("Te llamas adri");
		} else {
			System.out.println("No te llamas adri");
		}

		// toUpperCase() y toLowerCase(): Devuelven el String en Mayúsc. / Minúsc.
		System.out.println("Nombre en minúsc. " + nombre.toLowerCase());
		System.out.println("Nombre en mayúsc. " + nombre.toUpperCase());

		// charAt():
		// Permite consultar qué carácter hay en determinada posición. La primera
		// posición es la 0. Se produce un error si la posición es incorrecta.
		System.out.println("La inicial de tu nombre es " + nombre.charAt(0));

		// Guardar en variable
		char segundaLetra = nombre.charAt(1);

		// Leer carácter
		System.out.println("¿Cuál es la inicial de tu nombre?: ");
		char inicial = tec.next().charAt(0);

		// indexOf():
		// Carácter: Devuelve la posición de la primera aparición del carácter en el
		// String. Devuelve -1 si el carácter no está.
		System.out.println("casablanca".indexOf('a')); // --> "1"
		// String: Devuelve la posicion de la primera aparicion del String en el String.
		System.out.println("casablanca".indexOf("blanca")); // --> "4"

		// Cáracter, posición): Devuelve la primera posicion A PARTIR de la posición.
		System.out.println("casablanca".indexOf('a', 4)); // --> "6"
		// En que posición está la segunda 'a' de nombre.
		System.out.println(nombre.indexOf('a', nombre.indexOf('a') + 1));

		// substring():
		// Posición1, posición2: Devuelve el String posicionado entre los dos
		// parámetros.
		System.out.println("casablanca".substring(0, 4)); // --> "casa"
		// Posición: Devuelve un String a partir de la posición indicada.
		System.out.println("casablanca".substring(4)); // --> "blanca"
		// System.out.println("casablanca".substring(4, 100)); --> ERROR

		// length: Número de carácteres que tiene la cadena.
		System.out.println("casablanca".length());

		// trim(): Devuelve la cadena sin espacios delante o detrás.
		System.out.println("   casablanca   ".trim());
	}
}
