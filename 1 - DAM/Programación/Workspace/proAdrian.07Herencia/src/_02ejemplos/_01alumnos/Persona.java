package _02ejemplos._01alumnos;

public class Persona extends Object implements Comparable<Persona> {
	protected String dni;
	private String nombre;
	public Persona(String dni,String nombre) {
		this.dni = dni;
		this.nombre  = nombre;
	}
	
	
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Persona)) return false;
		
		if(this.dni.equals(((Persona)o).dni)) return true;
		else return false;
	}


	public int compareTo(Persona p) {
		return this.dni.compareTo(p.dni);
	}
	
	public String toString() {
		return dni + " - " + nombre.toUpperCase();
		
	}
	
}
