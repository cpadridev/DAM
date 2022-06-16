package _02ejemplos._05ordenacion;

import java.util.Comparator;

public class Ordenacion {
	/**
	 * Ordena un array de int siguiendo el método
	 * de SELECCION DIRECTA
	 * @param v
	 */
	public static void ordenar(int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			//Localizamos a partir de la posicion i
			int posMin = i;
			for(int j = i + 1; j < v.length; j++) {
				if(v[j] < v[posMin]) {
					posMin = j;
				}
			}
			//Intercambia los elementos de las posiciones i y posMin
			int aux = v[i];
			v[i] = v[posMin];
			v[posMin] = aux;
		}
	}

	public static void ordenar(double[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			//Localizamos a partir de la posicion i
			int posMin = i;
			for(int j = i + 1; j < v.length; j++) {
				if(v[j] < v[posMin]) {
					posMin = j;
				}
			}
			//Intercambia los elementos de las posiciones i y posMin
			double aux = v[i];
			v[i] = v[posMin];
			v[posMin] = aux;
		}
	}
//	public static void ordenar(String[] v) {
//		for (int i = 0; i < v.length - 1; i++) {
//			//Localizamos a partir de la posicion i
//			int posMin = i;
//			for(int j = i + 1; j < v.length; j++) {
//				if(v[j].compareTo(v[posMin])<0) {
//					posMin = j;
//				}
//			}
//			//Intercambia los elementos de las posiciones i y posMin
//			String aux = v[i];
//			v[i] = v[posMin];
//			v[posMin] = aux;
//		}
//	}
	public static void ordenar(Object[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			//Localizamos a partir de la posicion i
			int posMin = i;
			for(int j = i + 1; j < v.length; j++) {
				if(((Comparable)v[j]).compareTo(v[posMin])<0) {
					posMin = j;
				}
			}
			//Intercambia los elementos de las posiciones i y posMin
			Object aux = v[i];
			v[i] = v[posMin];
			v[posMin] = aux;
		}
	}
	public static void ordenar(Object[] v, Comparator c) {
		for (int i = 0; i < v.length - 1; i++) {
			//Localizamos a partir de la posicion i
			int posMin = i;
			for(int j = i + 1; j < v.length; j++) {
				if(c.compare(v[j], v[posMin]) < 0) {
				//if(((Comparable)v[j]).compareTo(v[posMin])<0) {
					posMin = j;
				}
			}
			//Intercambia los elementos de las posiciones i y posMin
			Object aux = v[i];
			v[i] = v[posMin];
			v[posMin] = aux;
		}
	}
}
