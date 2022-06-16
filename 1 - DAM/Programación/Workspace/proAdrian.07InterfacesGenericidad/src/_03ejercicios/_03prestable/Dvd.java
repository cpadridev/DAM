package _03ejercicios._03prestable;

public class Dvd extends Publicacion implements Prestable {
	private int duracion;
	private boolean prestado;

	public Dvd(String codigo, String titulo, int anyo, int duracion) {
		super(codigo, titulo, anyo);
		this.duracion = duracion;
	}
	
	@Override
	public void prestar() {
		this.prestado = true;
	}

	@Override
	public void devolver() {
		this.prestado = false;
	}

	@Override
	public boolean getPrestado() {
		return this.prestado;
	}
	
	@Override
	public String toString() {
		return "Dvd [" + super.toString() + ", prestado=" + this.prestado + "]";
	}
}
