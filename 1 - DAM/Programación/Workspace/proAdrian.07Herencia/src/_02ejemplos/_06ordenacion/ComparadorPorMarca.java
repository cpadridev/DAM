package _02ejemplos._06ordenacion;

import java.util.Comparator;

import _02ejemplos._05ordenacion.Vehiculo;

public class ComparadorPorMarca implements Comparator<Vehiculo> {
	
	public int compare(Vehiculo v1, Vehiculo v2) {
		return v1.getMarca().compareTo(v2.getMarca());
	}

}
