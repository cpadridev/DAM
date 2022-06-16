package _03ejercicios._02juegos;

public class JuegoEnAlquiler extends JuegoAlquilerVenta {
	protected int numDiasAlquiler;

	public JuegoEnAlquiler(String t, String f, int a, double precio, int numCopiasDisponibles, int numDiasAlquiler) {
		super(t, f, a, precio, numCopiasDisponibles);
		this.numDiasAlquiler = numDiasAlquiler;
	}

	public boolean alquilar() {
		if (this.numCopiasDisponibles > 0) {
			this.numCopiasDisponibles--;

			return true;
		} else {
			return false;
		}
	}

	public void devolver() {
		this.numCopiasDisponibles++;
	}

	@Override
	public String toString() {
		return String.format("Juego en alquiler [ %s, numDiasAlquiler=%d ]", super.toString(), this.numDiasAlquiler);
	}
}
