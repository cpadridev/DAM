package _03ejercicios._02juegos;

import java.util.Objects;

public class Juego implements Comparable<Juego>{
	protected String titulo;
	protected String fabricante;
	protected int anyo;
	
	public Juego(String t, String f, int a) {
		this.titulo = t;
		this.fabricante = f;
		this.anyo = a;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return String.format("titulo=%s, fabricante=%s, año=%d", this.titulo, this.fabricante, this.anyo);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Juego))
			return false;
		Juego j = (Juego) o;
		return this.anyo == j.anyo && Objects.equals(fabricante, j.fabricante)
				&& Objects.equals(titulo, j.titulo);
	}
	
	public int compareTo(Juego j) {	
		if (this.titulo .equals(j)) {
			if (this.fabricante.equals(j)) {
				return this.anyo - j.anyo;
			} else {
				return this.fabricante.compareTo(j.fabricante);
			}
		} else {
			return this.titulo.compareTo(j.fabricante);
		}
	}
}
