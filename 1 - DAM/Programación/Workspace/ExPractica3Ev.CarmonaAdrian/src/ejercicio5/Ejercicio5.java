package ejercicio5;

import java.util.ArrayList;

public class Ejercicio5 {
	public static void main(String[] args) {
		ArrayList<String> listaPalabras = new ArrayList<>();
		listaPalabras.add("casa");
		listaPalabras.add("coche");
		listaPalabras.add("silla");
		listaPalabras.add("lampara");

		// Mostramos la lista original
		System.out.println(listaPalabras);
		// ------

		// COMPLETAR: Convertir todas las palabras de la lista a mayúsculas usando el
		// método Listas.modificarElementosLista
		Listas.modificarElementosLista(listaPalabras, String::toUpperCase);

		// ------

		// Volvemos a mostrar la lista
		System.out.println(listaPalabras);
		// ------
	}
}
