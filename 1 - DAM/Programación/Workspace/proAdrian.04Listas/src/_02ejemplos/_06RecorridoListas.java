package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _06RecorridoListas {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));

		// Hay tres formas de recorrer una lista:

		// 1.- Al estilo en que recorremos los arrays.
		int suma = 0;

// 		for(int i = 0; i < v.length; i++) {
		for (int i = 0; i < l.size(); i++) {
// 			suma += v[i];
			suma += l.get(i);
		}

		System.out.println(suma);

		// 2.- Con un bucle for-each.
		suma = 0;

		for (int par : l) {
			suma += par;
		}

		System.out.println(suma);

		// 3.- Con un objeto Iterator.
		suma = 0;
		Iterator<Integer> it = l.iterator();

		while (it.hasNext()) {
			suma += it.next();
		}

		System.out.println(suma);
	}
}
