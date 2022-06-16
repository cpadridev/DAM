package _03ejercicios._03prestable;

public class Revista extends Publicacion {
	private int numRevista;
	
	public Revista(String codigo, String titulo, int anyo, int numRevista) {
		super(codigo, titulo, anyo);
		this.numRevista = numRevista;
	}

	@Override
	public String toString() {
		return "Revista [" + super.toString() + ", numRevista=" + this.numRevista + "]";
	}
	
	
}
