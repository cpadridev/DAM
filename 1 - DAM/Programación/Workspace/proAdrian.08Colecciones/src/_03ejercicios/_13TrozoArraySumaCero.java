package _03ejercicios;

import java.util.HashMap;
import java.util.Map;

public class _13TrozoArraySumaCero {
	public static void main(String[] args) {
		int[] v = {20,30,10,-5,-8,-2,-25, 2};
		Map<Integer,Integer> m = new HashMap<>();
		
		int suma = 0;
		boolean enc = false;
		for (int i = 0; i < v.length && !enc; i++) {
			suma += v[i];
			Integer posicion = m.get(suma);
			if(posicion == null) {
				m.put(suma, i);
			} else {
				System.out.println("El array suma 0 entre las posiciones " + (posicion + 1) + " y " + i);
			}
		}
		System.out.println(m);
	}

}
