package _03ejercicios._12OfertasHoteleras;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Rastreador {
	public static void main(String[] args) {
		
		List<Oferta> ofertas = new ArrayList<>();
		ofertas.add(new Oferta(new Hotel("Las Arenas","Valencia",5),300));
		ofertas.add(new Oferta(new Hotel("Las Arenas","Valencia",5),320));
		ofertas.add(new Oferta(new Hotel("Las Arenas","Valencia",5),350));
		
		
		ofertas.add(new Oferta(new Hotel("Only you","Valencia",5),300));
		ofertas.add(new Oferta(new Hotel("Only you","Valencia",5),250));

		ofertas.add(new Oferta(new Hotel("Plaza","Alacuas",3),50));
		ofertas.add(new Oferta(new Hotel("Plaza","Alacuas",3),70));
		ofertas.add(new Oferta(new Hotel("Plaza","Alacuas",3),60));
		
		//Se pide Crear un Map<Hotel, Double> que contenga la oferta MÁS BARATA 
		//de cada hotel de los que hay en la lista de ofertas.
		//Si fuera necesario, modificar las clases Hotel y Oferta 
		//(equals, hashCode, toString, getters, setters, ...) 
		Map<Hotel, Double> m = new TreeMap<>();
		for(Oferta o: ofertas) {
			Hotel h = o.getHotel();
			double precioOferta = o.getPrecio();
			
			Double mejorPrecio = m.get(h);
			if(mejorPrecio == null) {
				m.put(h, precioOferta);
			} else {
				if(precioOferta < mejorPrecio) {
					m.put(h, precioOferta);
				}
			}
		}
		System.out.println(m);
		
		
		
		
	}
}



