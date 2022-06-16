package _03ejercicios;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class _08Diccionario {
	public static void main(String[] args) {
		LinkedHashMap<String, Set<String>> diccionario = new LinkedHashMap<>();

		anyadirTraduccion(diccionario, "hola", "hello");
		anyadirTraduccion(diccionario, "hola", "hi");
		anyadirTraduccion(diccionario, "mama", "mom");
		System.out.println(diccionario);
		quitarTraduccion(diccionario, "hola", "hi");
		quitarTraduccion(diccionario, "mama", "mom");
		System.out.println(diccionario);
		System.out.println(traduccionesDe(diccionario, "hola"));
	}

	public static boolean anyadirTraduccion(Map<String, Set<String>> diccionario, String cast, String ingl) {
		Set<String> traduccion = diccionario.get(cast);

		if (traduccion == null) {
			traduccion = new TreeSet<>();

			traduccion.add(ingl);

			diccionario.put(cast, traduccion);

			return true;
		} else {
			return traduccion.add(ingl);
		}
	}

	public static boolean quitarTraduccion(Map<String, Set<String>> diccionario, String cast, String ingl) {
		Set<String> traduccion = diccionario.get(cast);

		if (traduccion == null) {
			return false;
		} else {
			if (traduccion.size() == 1) {
				diccionario.remove(cast);
				return true;
			} else {
				traduccion.remove(ingl);

				diccionario.put(cast, traduccion);
				return true;
			}
		}
	}

	public static Set<String> traduccionesDe(Map<String, Set<String>> diccionario, String cast) {
		return diccionario.get(cast);
	}
}
