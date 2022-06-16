package _03ejercicios._08amarres;

import java.util.Objects;

public class Amarre {
	private int posicion;
	private Cliente cliente;
	private Barco barco;
	private int dias;
	
	public Amarre(int posicion, Cliente cliente, Barco barco, int dias) {
		this.posicion = posicion;
		this.cliente = cliente;
		this.barco = barco;
		this.dias = dias;
	}
	
	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public double calcularPrecioAlquiler() {
		return this.dias * this.barco.getFactorAlquiler();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Amarre other = (Amarre) obj;
		return Objects.equals(barco, other.barco) && Objects.equals(cliente, other.cliente) && dias == other.dias
				&& posicion == other.posicion;
	}

	@Override
	public String toString() {
		return "Amarre [posicion=" + posicion + ", cliente=" + cliente + ", barco=" + barco + ", dias=" + dias + "]";
	}
}
