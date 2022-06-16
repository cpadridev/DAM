package _03ejercicios._02genericos;

import java.util.Arrays;
import java.util.function.Function;

public class Genericos <T> {
	public static void main(String[] args) {
		
	}
	
	public static <T extends Comparable<T>> T minimo (T o1, T o2) {
		if(o1.compareTo(o2) < 0) {
			return o1;
		} else {
			return o2;
		}
	}
	
	public static <T extends Comparable<T>> T maximo (T[ ] v) {
		T maximo = v[0];
		
		for (int i = 0; i < v.length; i++) {
			if(v[i].compareTo(maximo) > 0) {
				maximo = v[i];
			}
		}
		
		return maximo;
	}

	public static <T extends Comparable<T>> int numVeces(T[ ] v, T x) {
		int contador = 0;
		
		for (int i = 0; i < v.length; i++) {
			if (v.equals(x)) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static <T extends Comparable<T>> int numVecesOrdenado(T[ ] v, T x) {
		Arrays.sort(v);
		return numVeces(v, x);
	}
	
	public static <T extends Comparable<T>> int mayores(T v[],T x) {
		int contador = 0;
		
		for (int i = 0; i < v.length; i++) {
			if(v[i].compareTo(x) > 0) {
				contador++;
			}
		}
		
		return contador;
	}
	
	public static <T extends Comparable<T>> int mayoresOrdenado(T v[], T x) {
		Arrays.sort(v);
		return mayores(v, x);	
	}
	

	public static <T extends Comparable<T>> boolean estaEn(T v[],T x) {
		for (int i = 0; i < v.length; i++) {
			if (v[i].equals(x)) {
				return true;
			}
		}
		
		return false;
	}

	public static <T extends Comparable<T>> boolean estaEnOrdenado(T v[],T x) {
		Arrays.sort(v);
		return estaEn(v, x);
	}

	public static <T extends Comparable<T>> int posicionDe(T v[],T x) {
		int posicion = -1;
		
		for (int i = 0; i < v.length; i++) {
			if (v[i].equals(x)) {
				posicion = i;
				break;
			}
		}
		
		return posicion;
	}

	public static <T extends Comparable<T>> int posicionDeOrdenado(T v[],T x) {
		Arrays.sort(v);
		return posicionDe(v, x);
	}
}
