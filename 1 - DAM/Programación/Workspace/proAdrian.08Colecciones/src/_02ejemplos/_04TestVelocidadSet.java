package _02ejemplos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class _04TestVelocidadSet {
	public static void main(String[] args) {
		final int ELEMENTOS = 200000;
		Random r = new Random();
		
		//Creamos tres colecciones con los mismos datos
		LinkedList<Integer> l = new LinkedList<>();
		while (l.size() < ELEMENTOS) {
			//System.out.println(l.size());
			int elemento = r.nextInt(ELEMENTOS*100);
			if(!l.contains(elemento)) l.add(elemento);
		}
		TreeSet<Integer> ts = new TreeSet<>(l);
		HashSet<Integer> hs = new HashSet<>(l);
 		
		//Vamos a buscar muchas veces algo que no está y a ver cuánto tarda
		final int BUSQUEDAS = 1000000;
		int numeroBuscado = ELEMENTOS * 100;
		long t1, t2;
		
//		System.out.println("Midiendo ...");
//		t1 = System.currentTimeMillis();
//		for(int i = 0; i< BUSQUEDAS; i++) {
//			if(l.contains(numeroBuscado)) {
//				System.out.println("Encontrado");
//			}
//		}
//		t2 = System.currentTimeMillis();
//		System.out.println("Lista: " + (t2-t1));
		
		System.out.println("Midiendo ...");
		t1 = System.currentTimeMillis();
		for(int i = 0; i< BUSQUEDAS; i++) {
			if(ts.contains(numeroBuscado)) {
				System.out.println("Encontrado");
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("TreeSet: " + (t2-t1));

		System.out.println("Midiendo ...");
		t1 = System.currentTimeMillis();
		for(int i = 0; i< BUSQUEDAS; i++) {
			if(hs.contains(numeroBuscado)) {
				System.out.println("Encontrado");
			}
		}
		t2 = System.currentTimeMillis();
		System.out.println("HashSet: " + (t2-t1));
		
	}
}
