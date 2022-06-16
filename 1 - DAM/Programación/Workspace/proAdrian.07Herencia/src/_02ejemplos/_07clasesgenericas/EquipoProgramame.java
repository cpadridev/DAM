package _02ejemplos._07clasesgenericas;

import java.util.ArrayList;

public class EquipoProgramame {
	private String nombre;
	private ArrayList<Programador> plantilla;
	private Programador capitan;
	
	public EquipoProgramame(String nombre) {
		this.nombre = nombre;
		plantilla = new ArrayList<>();
		capitan = null;
	}
	
	public boolean fichar(Programador p) {
		if (!plantilla.contains(p)) {
			plantilla.add(p);
			if (capitan == null) {
				capitan = p;
			}
			return true;
		} else {
			return false;
		}
	}
	
	public boolean eliminar(Programador p) {
		boolean estaba = plantilla.remove(p);
		if (estaba) {
			if (capitan.equals(p)) {
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
		for (Programador p : plantilla) {
			res += "\n" + p;
		}
		return res;
	}
	
	public Programador getCapitan() {
		return capitan;
	}
}
