package _03ejercicios._05gestionhospital;

public class Paciente implements Comparable<Paciente> {
	private String nombre;
	private int edad;
	private int estado;

	public Paciente(String n, int e) {
		this.nombre = n;
		this.edad = e;
		this.estado = (int) (Math.random() * 6);
	}

	public int getEdad() {
		return edad;
	}

	public int getEstado() {
		return estado;
	}

	public void mejorar() {
		if (this.estado != 0) {
			this.estado--;
		}
	}

	public void empeorar() {
		if (this.estado != 5) {
			this.estado++;
		}
	}

	@Override
	public String toString() {
		String estado = "";

		switch (this.estado) {
		case 0:
			estado = "curado";
			break;
		case 1:
			estado = "muy leve";
			break;
		case 2:
			estado = "leve";
			break;
		case 3:
			estado = "enfermo";
			break;
		case 4:
			estado = "grave";
			break;
		case 5:
			estado = "muy grave";
			break;
		}

		return String.format("%s - %d años - %s", this.nombre, this.edad, estado);
	}

	@Override
	public int compareTo(Paciente p) {
		if (this.estado == p.estado) {
			return 0;
		} else {
			if (this.estado > p.estado) {
				return 1;
			} else {
				return -1;
			}
		}
	}
}
