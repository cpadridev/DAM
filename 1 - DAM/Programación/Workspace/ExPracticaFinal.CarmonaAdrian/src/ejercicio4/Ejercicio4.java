package ejercicio4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio4 {
	public static void main(String[] args) {
		ArrayList<Oferta> ofertas = new ArrayList<>();
		ofertas.add(new Oferta("Las Arenas", 120));
		ofertas.add(new Oferta("Melia Plaza Valencia", 100));
		ofertas.add(new Oferta("Westin Valencia", 110));
		ofertas.add(new Oferta("Las Arenas", 95));
		ofertas.add(new Oferta("Westin Valencia", 86));
		ofertas.add(new Oferta("Melia Plaza Valencia", 141));
		ofertas.add(new Oferta("Westin Valencia", 160));
		ofertas.add(new Oferta("Westin Valencia", 200));
		ofertas.add(new Oferta("Las Arenas", 98));
		ofertas.add(new Oferta("Westin Valencia", 180));
		ofertas.add(new Oferta("Parador El Saler", 101));
		ofertas.add(new Oferta("Melia Plaza Valencia", 88));

		System.out.println(buscarMejoresPrecios(ofertas));

	}

	public static Map<String, Double> buscarMejoresPrecios(List<Oferta> ofertas) {
		Map<String, Double> mejoresOfertas = new HashMap<>();

		for (Oferta o : ofertas) {
			if (!mejoresOfertas.containsKey(o.getHotel())) {
				mejoresOfertas.put(o.getHotel(), o.getPrecio());
			} else {
				if (mejoresOfertas.get(o.getHotel()) > o.getPrecio()) {
					mejoresOfertas.replace(o.getHotel(), o.getPrecio());
				}
			}
		}

		return mejoresOfertas;
	}
}
