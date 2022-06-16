package _03ejercicios._03prestable;

import java.util.ArrayList;

public class TestPublicaciones {
	public static void main(String[] args) {
		ArrayList<Publicacion> misPublicaciones = new ArrayList<>();
		misPublicaciones.add(new Libro("a1", "Introduccion java", 2020));
		misPublicaciones.add(new Dvd("a2", "Consejos programacion", 2020, 60));
		((Libro) misPublicaciones.get(0)).prestar();

		
		// Recorrido que muestra los títulos.
		for (Publicacion p : misPublicaciones) {
			System.out.println(p.getTitulo());
		}
		
		// Recorrido que cuente cuantos están prestados.
		int cont = 0;
		
		for (Publicacion p : misPublicaciones) {
			if (((Prestable) p).getPrestado()) {
				cont++;
			}
		}
		System.out.println("Prestadas: " + cont);
		
		ArrayList<Prestable> misPrestables = new ArrayList<>();
		misPrestables.add(new Libro("a1", "Introduccion java", 2020));
		misPrestables.add(new Dvd("a2", "Consejos programacion", 2020, 60));
		((Libro) misPrestables.get(0)).devolver();
		
		// Recorrido que muestra los títulos.
		for (Prestable p : misPrestables) {
			System.out.println(((Publicacion) p).getTitulo());
		}
		
		// Recorrido que cuente cuantos están prestados.
		int cont1 = 0;
		
		for (Prestable p : misPrestables) {
			if (p.getPrestado()) {
				cont1++;
			}
		}
		System.out.println("Prestadas: " + cont1);
	}
}
