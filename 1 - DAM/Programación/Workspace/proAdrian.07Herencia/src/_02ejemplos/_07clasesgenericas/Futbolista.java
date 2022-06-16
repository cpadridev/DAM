package _02ejemplos._07clasesgenericas;

import java.util.Objects;

public class Futbolista {
	private int numero;
	private String nombre;
	private int goles;
	
	public Futbolista(int numero, String nombre) {
		this.numero = numero;
		this.nombre = nombre;
		this.goles = 0;
	}

	@Override
	public String toString() {
		return numero + " - " + nombre + " - " + goles + " goles";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public int getGoles() {
		return goles;
	}
}
