package _03ejercicios._05Filtrado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;

import _03ejercicios._03prestable.Dvd;
import _03ejercicios._03prestable.Libro;
import _03ejercicios._03prestable.Publicacion;

public class Filtrado {
	public static void main(String[] args) {
		ArrayList<Publicacion> p = new ArrayList<Publicacion>();
		p.add(new Libro("1", "aaaaaaaa",   2020    ));
		p.add(new Libro("2", "aaaa",       2012    ));
		p.add(new Libro("3", "aaaaaa",     2022    ));
		p.add(new Libro("5", "aaaaaa",     2006    ));
		p.add(new Dvd  ("4", "casa",       2003, 55));
		p.add(new Dvd  ("6", "aaaaaaaaaa", 2000, 60));
		p.add(new Dvd  ("7", "aaaaaaaaa",  2001, 60));
		
		System.out.println("------------");
		mostrarPubFiltradas(p, new Predicate<Publicacion>() {
			@Override
			public boolean test(Publicacion p1) {
				if (p1.getAnyo() % 2 == 0) {
					return true;
				} else {
					return false;
				}
			}
		});
		
		System.out.println("------------");
		
		mostrarPubFiltradas(p, new Predicate<Publicacion>() {
			@Override
			public boolean test(Publicacion p1) {
				if (p1.getTitulo().length() > 5) {
					return true;
				} else {
					return false;
				}
			}
		});
		
		System.out.println("------------");
		
		mostrarPubFiltradas(p, new Predicate<Publicacion>() {
			@Override
			public boolean test(Publicacion p1) {
				LocalDate current_date = LocalDate.now();
				if (p1.getAnyo() == current_date .getYear()) {
					return true;
				} else {
					return false;
				}
			}
		});
		
		System.out.println("------------");
		
		mostrarPubFiltradas(p, new Predicate<Publicacion>() {
			@Override
			public boolean test(Publicacion p1) {
				if (p1.getAnyo() >= 200 && p1.getAnyo() <= 2005 && p1.getTitulo().equals("casa")) {
					return true;
				} else {
					return false;
				}
			}
		});
		
		System.out.println("------------");
		
		mostrarPubFiltradas(p, new Predicate<Publicacion>() {
			@Override
			public boolean test(Publicacion p1) {
				if (p1 instanceof Libro) {
					return true;
				} else {
					return false;
				}
			}
		});
	}
	
	public static void mostrarPubFiltradas(ArrayList<Publicacion> p1, Predicate<Publicacion> p) { 
		for(Publicacion pub: p1) {
			if(p.test(pub)) {
				System.out.println(pub);
			}
		}
	}
}

