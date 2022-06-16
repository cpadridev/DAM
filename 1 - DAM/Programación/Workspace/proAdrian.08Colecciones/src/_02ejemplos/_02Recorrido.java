package _02ejemplos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class _02Recorrido {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<>(Arrays.asList("casa","perro","asa"));
		TreeSet<String> t = new TreeSet<>(Arrays.asList("casa","perro","asa"));
		
		//Con foreach
		for(String s: l) {
			System.out.print (s + " ");
		}
		System.out.println();
		
		for(String s: t) {
			System.out.print (s + " ");
		}
		System.out.println();
		
		//Con iterator
		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		//Eliminar de t los elementos de 4 letras
		//TENEMOS QUE USAR iterator NECESARIAMENTE
		Iterator<String> it2 = t.iterator();
		while(it2.hasNext()) {
			String s = it2.next();
			if(s.length() == 4) {
				it2.remove();
			}
		}
	}
}
