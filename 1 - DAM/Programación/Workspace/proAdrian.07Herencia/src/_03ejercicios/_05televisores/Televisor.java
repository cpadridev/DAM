package _03ejercicios._05televisores;

import java.util.Objects;

public class Televisor {
	protected String marca;
	protected String modelo;
	protected double precio;
	protected double pulgadas;
	
	public Televisor(String marca, String modelo, double precio, double pulgadas) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.pulgadas = pulgadas;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Televisor other = (Televisor) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& Double.doubleToLongBits(pulgadas) == Double.doubleToLongBits(other.pulgadas);
	}

	@Override
	public String toString() {
		return "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", pulgadas=" + pulgadas + ", resolucion=";
	}
	
	public int compareTo(Televisor t) {
		if (this.marca.equals(t.marca)) {
			if (this.modelo.equals(t.modelo)) {
				return 0;
			} else {
				if (this.modelo.compareTo(t.modelo) > 0) {
					return 1;
				} else {
					return -1;
				}
			}
		} else {
			if (this.marca.compareTo(t.marca) > 0) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}
