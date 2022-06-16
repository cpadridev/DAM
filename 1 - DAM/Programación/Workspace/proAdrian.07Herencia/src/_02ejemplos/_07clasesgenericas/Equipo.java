package _02ejemplos._07clasesgenericas;

import java.util.ArrayList;

public class Equipo <T> {
	private String nombre;
	private ArrayList<T> plantilla;
	private T capitan;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
		capitan = null;
	}
	
	public boolean fichar(T t) {
		if (!plantilla.contains(t)) {
			plantilla.add(t);
			if (capitan == null) {
				capitan = t;
			}
			return true;
		} else {
			return false;
		}
	}
	
	public boolean eliminar(T t) {
		boolean estaba = plantilla.remove(t);
		if (estaba) {
			if (capitan.equals(t)) {
				if (plantilla.size() < 0) {
					capitan = plantilla.get(0);
				} else {
					capitan = null;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String res = nombre + "\nCapitan: " + capitan;
		for (T t : plantilla) {
			res += "\n" + t;
		}
		return res;
	}
	
	public T getCapitan() {
		return capitan;
	}
}
