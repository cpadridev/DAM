package _02ejemplos;

import java.util.Scanner;

public class _01TipoBoolean {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Edad: ");
		int edad = tec.nextInt();

		boolean puedeConducir = edad >= 18;

		System.out.println("Puede conducir: " + puedeConducir);

		if (edad >= 18)
			System.out.println("Puede conducir");
		else
			System.out.println("No puede conducir");

//		if (edad = 18)
//			System.out.println("Tienes 18");
//		else
//			System.out.println("No tienes 18");

		if (puedeConducir)
			System.out.println("Puede conducir");
		else
			System.out.println("No puede conducir");

		// Este tipo de expresiones funciona, PERO HAY QUE EVITARLAS.
		if (puedeConducir == true)
			System.out.println("Puede conducir");
		else
			System.out.println("No puede conducir");

		// Se puede poner como condición una llamada a un método y devuelve un boolean.
		if (puedeConducir(edad))
			System.out.println("Puede conducir");
		else
			System.out.println("No puede conducir");
	}

	public static boolean puedeConducir(int edad) {
		boolean puede;

		if (edad >= 18)
			puede = true;
		else
			puede = false;

		return puede;
	}
}
