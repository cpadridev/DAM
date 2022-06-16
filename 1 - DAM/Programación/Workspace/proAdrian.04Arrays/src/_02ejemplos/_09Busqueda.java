package _02ejemplos;

public class _09Busqueda {
	public static void main(String[] args) {

		int[] edad = { 2, 8, 16, 4, 21, 19, 4 };

		// ¿Cuántos mayores de edad? RECORRIDO.
		int mayores = 0;

		for (int i = 0; i < edad.length; i++) {
			if (edad[i] >= 18) {
				mayores++;
			}
		}

		System.out.println("Mayores de edad: " + (mayores));

		// ¿Hay alguien en edad de estudiar la ESO? (12 a 16).
		boolean encontrado = false;

		for (int i = 0; i < edad.length && !encontrado; i++) {
//          encontrado == false 
			if (edad[i] >= 12 && edad[i] <= 16) {
				encontrado = true;
			}
		}

		if (encontrado) {
			System.out.println("Hay alguien en edad de estudiar la ESO");
		} else {
			System.out.println("NO HAY NADIE en edad de estudiar la ESO");
		}

		// ¿Hay alguien en edad de jubilación?.
		int i = 0;

		while (i < edad.length && edad[i] < 65) {
			i++;
		}

		if (edad[i] >= 65) {
//		if(i < edad.length) {
			System.out.println("Hay alguien en edad de jubilación");
		} else {
			System.out.println("No hay nadie en edad de jubilación");
		}

		// Con for
//		int j;
//
//		for (j = 0; j < edad.length && edad[i] < 65; j++) {}
//		
//		if(j < edad.length) {
//			System.out.println("Hay alguien en edad de jubilación");
//		} else {
//			System.out.println("No hay nadie en edad de jubilación");
//		}
	}
}
