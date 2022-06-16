package ejercicio6;

public class CamionCisterna implements Rellenable {
	private int capacidad;

	public CamionCisterna(int capacidad) {
		this.capacidad = capacidad;
	}

	public int rellenar() {
		return capacidad;
	}
}
