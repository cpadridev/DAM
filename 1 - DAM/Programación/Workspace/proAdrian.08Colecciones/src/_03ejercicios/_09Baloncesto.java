package _03ejercicios;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Set;

public class _09Baloncesto {
	public static void main(String[] args) {
		String[] nombres = { "raul", "raul", "raul", "raul", "nico", "pedro", "raul", "nico", "nico", "nico", "nico",
				"paco" };

		LinkedList<String> l = new LinkedList<>();

		Collections.addAll(l, nombres);

		LinkedHashMap<String, Integer> codigos = new LinkedHashMap<>();

		Iterator<String> it1 = l.iterator();
		while (it1.hasNext()) {
			String aux = it1.next();
			if (codigos.containsKey(aux)) {
				int i = codigos.get(aux) + 1;
				codigos.put(aux, i);
			} else {
				codigos.put(aux, 1);
			}
		}

		System.out.println("Jugadores expulsados: ");

		Set<String> s = codigos.keySet();
		Iterator<String> it2 = s.iterator();
		while (it2.hasNext()) {
			String aux = it2.next();
			if (codigos.get(aux) >= 5) {
				System.out.println(aux);
			}
		}
	}
}
