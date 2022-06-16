package _03ejercicios._04ordenacion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import _03ejercicios._03prestable.Libro;
import _03ejercicios._03prestable.Publicacion;

public class Ordenacion {
	public static void main(String[] args) {
		ArrayList<Publicacion> p = new ArrayList<Publicacion>();
		p.add(new Libro("3", "b", 1));
		p.add(new Libro("2", "a", 3));
		p.add(new Libro("1", "c", 2));
		
		System.out.println("Mostrar por codigo");
		mostrarPorCodigo(p);
		System.out.println("Mostrar por titulo");
		mostrarPorTitulo(p);
		System.out.println("Mostrar por anyo");
		mostrarPorAnyo(p);
		System.out.println("Mostrar por anyo decreciente");
		mostrarPorAnyoDecreciente(p);
	}
	
	public static void mostrarPorCodigo(ArrayList<Publicacion> p) { 
		Collections.sort(p, new Comparator<Publicacion>() {
		    public int compare(Publicacion p1, Publicacion p2) {
		        return p1.getCodigo().compareTo(p2.getCodigo());
		    }
		});
		
		mostrarOrdenacion(p);
	}
	
	public static void mostrarPorTitulo(ArrayList<Publicacion> p) { 
		Collections.sort(p, new Comparator<Publicacion>() {
		    public int compare(Publicacion p1, Publicacion p2) {
		        return p1.getTitulo().compareTo(p2.getTitulo());
		    }
		});
		
		mostrarOrdenacion(p);
	}
	
	public static void mostrarPorAnyo(ArrayList<Publicacion> p) { 
		Collections.sort(p, new Comparator<Publicacion>() {
		    public int compare(Publicacion p1, Publicacion p2) {
		        return p1.getAnyo() - p2.getAnyo();
		    }
		});
		
		mostrarOrdenacion(p);
	}
	
	public static void mostrarPorAnyoDecreciente(ArrayList<Publicacion> p) { 
		Collections.sort(p, new Comparator<Publicacion>() {
		    public int compare(Publicacion p1, Publicacion p2) {
		        return p2.getAnyo() - p1.getAnyo();
		    }
		});
		
		mostrarOrdenacion(p);
	}
	
	public static void mostrarOrdenacion(ArrayList<Publicacion> l) {
		for (Publicacion p : l) {
			System.out.println(p);
		}
	}
}