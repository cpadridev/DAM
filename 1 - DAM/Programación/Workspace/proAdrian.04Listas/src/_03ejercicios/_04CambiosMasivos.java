package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _04CambiosMasivos {
	
	public static void main(String[] args) {
		String x = "x";
		String y = "y";
		
		ArrayList<String> l = new ArrayList<>(Arrays.asList(x, y, x, y));
		sustituir(l, x, y);
		
		ArrayList<String> l1 = new ArrayList<>(Arrays.asList(x, y, x, y));
		eliminarTodos(l1, x);
	}
	
	//Método que, en la lista l, sustituya todas las apariciones de x por y
	public static void sustituir(ArrayList<String> l, String x, String y) {
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).equals("x")) {
				l.set(i, "y");
			}
		}
		System.out.println(l);
	}
	
	//Método que, en la lista l, elimine todas las apariciones de x
	public static void eliminarTodos(ArrayList<String> l, String x) {
		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).equals("x")) {
				l.remove(i);
			}
		}
		System.out.println(l);
	}
	
}
