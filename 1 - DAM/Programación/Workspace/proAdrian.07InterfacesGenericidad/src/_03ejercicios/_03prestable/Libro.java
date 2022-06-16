package _03ejercicios._03prestable;

public class Libro extends Publicacion implements Prestable {
	private boolean prestado;
	
	public Libro(String codigo, String titulo, int anyo) {
		super(codigo, titulo, anyo);
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
		return "Libro [" + super.toString() + ", prestado=" + this.prestado + "]";
	}
	
	
}
