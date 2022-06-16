package _03ejercicios;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class _03OperacionesMasivas {
	public static void main(String[] args) {
		int[] v1 = { 1, 1, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9 };
		int[] v2 = { 1, 3, 10, 11, 12, 5 };
		Integer[] v = {1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9};
		System.out.println("Quitar duplicados Integer: ");
		System.out.println(Arrays.toString(quitarDuplicados(v)));
		System.out.println("Quitar duplicados: ");
		System.out.println(Arrays.toString(quitarDuplicados(v1)));
		System.out.println("Union: ");
		System.out.println(Arrays.toString(union(v1, v2)));
		System.out.println("Interseccion: ");
		System.out.println(Arrays.toString(interseccion(v1, v2)));
		System.out.println("Diferencia: ");
		System.out.println(Arrays.toString(diferencia(v1, v2)));
	}
	
	public static Integer[] quitarDuplicados(Integer[] v) {
		LinkedHashSet<Integer> l = new LinkedHashSet<>(Arrays.asList(v));
		
		return l.toArray(new Integer[0]);
	}

	public static int[] quitarDuplicados(int v[]) {
		LinkedHashSet<Integer> l = new LinkedHashSet<>();
		
		for (int i = 0; i < v.length; i++) {
			l.add(v[i]);
		}
		
		int[] array = new int[l.size()];
		int i = 0;
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			array[i] = n;
			i++;
		}
		
		return array;
	}

	public static int[] union(int v1[], int v2[]) {
		LinkedHashSet<Integer> l = new LinkedHashSet<>();
		
		for (int i = 0; i < v1.length; i++) {
			l.add(v1[i]);
		}
		
		for (int i = 0; i < v2.length; i++) {
			l.add(v2[i]);
		}
		
		int[] array = new int[l.size()];
		int i = 0;
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			array[i] = n;
			i++;
		}
		
		return array;
	}

	public static int[] interseccion(int v1[], int v2[]) {
		LinkedHashSet<Integer> l1 = new LinkedHashSet<>();
		
		for (int i = 0; i < v1.length; i++) {
			l1.add(v1[i]);
		}
		
		LinkedHashSet<Integer> l2 = new LinkedHashSet<>();
		
		for (int i = 0; i < v2.length; i++) {
			l2.add(v2[i]);
		}
		
		l1.retainAll(l2);
		
		int[] array = new int[l1.size()];
		int i = 0;
		
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			array[i] = n;
			i++;
		}
		
		return array;
	}

	public static int[] diferencia(int v1[], int v2[]) {
		LinkedList<Integer> l1 = new LinkedList<>();
		
		for (int i = 0; i < v1.length; i++) {
			l1.add(v1[i]);
		}
		
		LinkedList<Integer> l2 = new LinkedList<>();
		
		for (int i = 0; i < v2.length; i++) {
			l2.add(v2[i]);
		}
		
		l1.removeAll(l2);
		
		int[] array = new int[l1.size()];
		int i = 0;
		
		Iterator<Integer> it = l1.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			array[i] = n;
			i++;
		}

		return array;
	}
}
