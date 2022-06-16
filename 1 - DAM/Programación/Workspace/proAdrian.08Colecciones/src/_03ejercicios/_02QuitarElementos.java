package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class _02QuitarElementos {
	public static void main(String[] args) {
		ArrayList<String> coleccion = new ArrayList<String>(
				Arrays.asList(new String[] { "supermercado", "superheroe", "habitacion", "ordenador" }));

		System.out.println(coleccion.toString());

		eliminarElementos(coleccion, "super");

		System.out.println(coleccion.toString());
	}

	public static void eliminarElementos(Collection<String> elementos, String prefijo) {
		Iterator<String> it = elementos.iterator();

		while (it.hasNext()) {
			String s = it.next();
			if (s.indexOf(prefijo) == 0) {
				it.remove();
			}
		}
	}
}
