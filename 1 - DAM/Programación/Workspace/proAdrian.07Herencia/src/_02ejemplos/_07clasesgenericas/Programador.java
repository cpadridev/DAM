package _02ejemplos._07clasesgenericas;

import java.util.Objects;

public class Programador {
	private String dni;
	private String nombre;
	private String lenguaje;
	
	public Programador(String dni, String nombre, String lenguaje) {
		this.dni = dni;
		this.nombre = nombre;
		this.lenguaje = lenguaje;
	}

	@Override
	public String toString() {
		return dni + " - " + nombre + " - " + lenguaje;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Programador other = (Programador) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	public String getLenguaje() {
		return lenguaje;
	}
}
 