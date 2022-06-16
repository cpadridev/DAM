package _03ejercicios._12OfertasHoteleras;

public class Hotel implements Comparable<Hotel>{
	private String nombre;
	private String ciudad;
	private int estrellas;
	
	public Hotel(String nombre, String ciudad, int estrellas) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.estrellas = estrellas;
	}
	public String toString () {
		return nombre + " (" + ciudad + ")" ;
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if(!(o instanceof Hotel)) return false;
		
		Hotel h = (Hotel) o;
		return this.nombre.equals(h.nombre) && this.ciudad.equals(h.ciudad);
	}
	public int hashCode() {
		return (nombre + ciudad).hashCode();
	}
	@Override
	public int compareTo(Hotel o) {
		if (this.nombre.equals(o.nombre)) return this.ciudad.compareTo(o.ciudad);
		else return this.nombre.compareTo(o.nombre);
	}
}
