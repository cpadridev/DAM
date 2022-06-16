package _02ejemplos._07clasesgenericas;

import java.util.ArrayList;

public class EquipoObjetos {
	private String nombre;
	private ArrayList<Object> plantilla;
	private Object capitan;
	
	public EquipoObjetos(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
		capitan = null;
	}
	
	public boolean fichar(Object o) {
		if (!plantilla.contains(o)) {
			plantilla.add(o);
			if (capitan == null) {
				capitan = o;
			}
			return true;
		} else {
			return false;
		}
	}
	
	public boolean eliminar(Object o) {
		boolean estaba = plantilla.remove(o);
		if (estaba) {
			if (capitan.equals(o)) {
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
		for (Object o : plantilla) {
			res += "\n" + o;
		}
		return res;
	}
	
	public Object getCapitan() {
		return capitan;
	}
}
