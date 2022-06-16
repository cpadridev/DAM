package _03ejercicios._02juegos;

public abstract class JuegoAlquilerVenta extends Juego {
	protected double precio;
	protected int numCopiasDisponibles;
	
	public JuegoAlquilerVenta(String t, String f, int a, double precio, int numCopiasDisponibles) {
		super(t, f, a);
		this.precio = precio;
		this.numCopiasDisponibles = numCopiasDisponibles;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getNumCopiasDisponibles() {
		return numCopiasDisponibles;
	}

	public void setNumCopiasDisponibles(int numCopiasDisponibles) {
		this.numCopiasDisponibles = numCopiasDisponibles;
	}

	@Override
	public String toString() {
		return String.format("%s, precio=%.2f, numCopiasDisponibles=%d", super.toString(), this.precio, this.numCopiasDisponibles);
	}
	
	
}
