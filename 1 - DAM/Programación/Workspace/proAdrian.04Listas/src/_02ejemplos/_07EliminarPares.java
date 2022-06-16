package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _07EliminarPares {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 7, 0, 4, 0, 2, 0, 9));

		// Con un for-each: No se puede modificar la lista mientras la recorremos.
//		for(int numero: l) {
//			if(numero % 2 == 0) {
//				l.remove(numero);
//			}
//		}

		// Con Iterator.
		Iterator<Integer> it = l.iterator();

		while (it.hasNext()) {
			int numero = it.next();

			if (numero % 2 == 0) {
				it.remove(); // Eliminamos sobre el iterator, no sobre la lista.
			}
		}

		System.out.println(l);
	}
}
