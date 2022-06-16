package _03ejercicios._06contrareloj;

import java.util.Objects;

import _02ejemplos._03Tiempo.Tiempo;

public class Corredor {
	private int dorsal;
	private String nombre;
	private Tiempo salida;
	private Tiempo llegada;
	private static int siguienteDorsal;
	
	public Corredor(int dorsal, String nombre, Tiempo salida) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.salida = salida;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Tiempo getSalida() {
		return salida;
	}

	public void setSalida(Tiempo salida) {
		this.salida = salida;
	}

	public Tiempo getLlegada() {
		return llegada;
	}

	public void setLlegada(Tiempo llegada) {
		if (llegada.compareTo(this.salida) == -1) {
			throw new  IllegalArgumentException("La hora de llegada no debe ser anterior al de salida");
		}
		
		this.llegada = llegada;
	}
	
	public int getDuracion() {
		if (this.llegada == null) {
			throw new UnsupportedOperationException("El corredor todavía no ha llegado");
		}
		
		int horaSalida = salida.getHora();
		int minSalida = salida.getMinuto();
		int segSalida = salida.getSegundo();

		int horaLlegada = llegada.getHora();
		int minLlegada = llegada.getMinuto();
		int segLlegada = llegada.getSegundo();

		return (horaLlegada - horaSalida) * 3600 + (minLlegada - minSalida) * 60 + (segLlegada - segSalida);
	}

	@Override
	public String toString() {
		if (this.llegada != null) {
			return String.format("(%d) - %s - Salida: %s - Llegada: %s - Duracion: %d", this.dorsal, this.nombre, this.salida, this.llegada, this.getDuracion());
		} else {
			return String.format("(%d) - %s - Salida: %s", this.dorsal, this.nombre, this.salida);
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corredor other = (Corredor) obj;
		return dorsal == other.dorsal && Objects.equals(llegada, other.llegada) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(salida, other.salida);
	}
	
	public int compareTo(Corredor c) {
		return this.dorsal - c.dorsal;
	}
	
	public static int generarDorsal() {
		return siguienteDorsal++;
	}
}
