package _02ejemplos;

import java.util.ArrayList;
import java.util.LinkedList;

public class _08CompararTiempos {
	final static int INSERCIONES = 20000000;
	final static int CONSULTAS = 1000;
	
	public static void main(String[] args) {
		System.out.println("Al final: " + insertarAlFinal());
		System.out.println("Al principio: " + insertarAlPrincipio());
//		System.out.println("Acceder a arrayList: " + accederArrayList());
//		System.out.println("Acceder a linkedList: " + accederLinkedList());
//		
	}
	public static long insertarAlFinal() {
		LinkedList<Integer> l = new LinkedList<>(); 

		long t1 = System.currentTimeMillis();
		for(int i = 0; i < INSERCIONES; i++) {
			l.add(i);
		}
		long t2 = System.currentTimeMillis();
		return t2-t1;
		
		
	}

	public static long insertarAlPrincipio() {
		LinkedList<Integer> l = new LinkedList<>(); 
		
		long t1 = System.currentTimeMillis();
		for(int i = 0; i < INSERCIONES; i++) {
			//Insertar en la posicion 0
			l.add(0,i);
		}
		long t2 = System.currentTimeMillis();
		return t2-t1;
	}

	public static long accederArrayList() {
		ArrayList<Integer> l = new ArrayList<>();
		for(int i = 0; i< INSERCIONES; i++) {
			l.add(i);
		}
		
		long t1 = System.currentTimeMillis();
		for(int i = 0; i < CONSULTAS; i++) {
			int numero = l.get(500000);
		}
		long t2 = System.currentTimeMillis();
		return t2-t1;
		
		
	}
	public static long accederLinkedList() {
		LinkedList<Integer> l = new LinkedList<>();
		for(int i = 0; i< INSERCIONES; i++) {
			l.add(i);
		}
		
		long t1 = System.currentTimeMillis();
		for(int i = 0; i < CONSULTAS; i++) {
			int numero = l.get(500000);
		}
		long t2 = System.currentTimeMillis();
		return t2-t1;
		
		
	}

}
