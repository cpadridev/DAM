package _02ejemplos;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class _05TestVelocidadHash {
	public static void main(String[] args) {
		long t1, t2;
		final int ELEMENTOS = 10000;
		
		HashSet<Integer> hs1 = new HashSet<>();
		t1 = System.currentTimeMillis();
		for(int i = 0; i<ELEMENTOS; i++) {
			hs1.add(i);
		}
		t2 = System.currentTimeMillis();
		System.out.println("Tiempo: " + (t2 - t1));
		
		
		HashSet<Entero> hs2 = new HashSet<>();
		t1 = System.currentTimeMillis();
		for(int i = 0; i<ELEMENTOS; i++) {
			hs2.add(new Entero(i));
		}
		t2 = System.currentTimeMillis();
		System.out.println("Tiempo: " + (t2 - t1));
		
	}
}
