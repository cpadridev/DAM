package _03ejercicios._02juegos;

public class JuegoEnVenta extends JuegoAlquilerVenta {
	public JuegoEnVenta(String t, String f, int a, double precio, int numCopiasDisponibles) {
		super(t, f, a, precio, numCopiasDisponibles);

	}

	public boolean vender() {
		if (this.numCopiasDisponibles > 0) {
			this.numCopiasDisponibles++;
			
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return String.format("Juego en venta [ %s ]", super.toString());
	}
}