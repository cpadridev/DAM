package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;

public class _01Listas {
	public static void main(String[] args) {
		// Array de Strings.
		String[] aProfes = new String[5];
		aProfes[0] = "Javi";
		aProfes[1] = "Chema";

		System.out.println(Arrays.toString(aProfes));

		// Lista de Strings.
		ArrayList<String> lProfes = new ArrayList<>();

		System.out.println(lProfes);

		// Añadir elementos a la lista.
		lProfes.add("Javi");
		lProfes.add("Chema");
		lProfes.add("Jero");
		lProfes.add("Nicolas");
		lProfes.add("Javi");

		System.out.println(lProfes);

		// Insertar elementos en la lista.
		lProfes.add(1, "Alejandro");

		System.out.println(lProfes);

		// Se puede eliminar por contenido y por posición.
		lProfes.remove(1);

		System.out.println(lProfes);

		boolean eliminado = lProfes.remove("Javi"); // Elimina la primera ocurrencia.

		System.out.println(eliminado);

		eliminado = lProfes.remove("Javier"); // Elimina la primera ocurrencia.

		System.out.println(eliminado);
		System.out.println(lProfes);

		// Sobreescribir
		System.out.println(lProfes.set(0, "CHEMA")); // <-- Devuelve lo que había en la posición 0.
		System.out.println(lProfes);

		// Consultar por posición.
		String p = lProfes.get(1);

		System.out.println("Profe de la posicion 1: " + p);

		// Consultar por contenido.
		int posicion = lProfes.indexOf("Jeronimo");

		System.out.println("Jero está en la posicion " + posicion);

		// Buscar un elemento.
		System.out.println(lProfes.contains("Nicolas"));
	}
}
