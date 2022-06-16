package _03ejercicios._03prestable;

public class Publicacion {
	protected String codigo;
	protected String titulo;
	protected int anyo;
	
	public Publicacion(String codigo, String titulo, int anyo) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyo = anyo;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAnyo() {
		return anyo;
	}

	@Override
	public String toString() {
		return "codigo=" + this.codigo + ", titulo=" + this.titulo + ", anyo=" + this.anyo;
	}
}
