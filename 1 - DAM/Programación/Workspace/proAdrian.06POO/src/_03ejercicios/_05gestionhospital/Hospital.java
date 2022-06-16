package _03ejercicios._05gestionhospital;

public class Hospital {
	final static int MAXC = 200;
	private Paciente[] listaCamas;
	private int numLibres;

	public Hospital(Paciente[] listaCamas, int numLibres) {
		this.listaCamas = new Paciente[MAXC];
		this.numLibres = MAXC;
	}

	public int getNumLibres() {
		return this.numLibres;
	}

	public boolean hayLibres() {
		if (numLibres > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void ingresarPaciente(String n, int e) throws IllegalArgumentException {
		int camaLibre = primeraLibre();
		if (camaLibre == 0) {
			throw new IllegalArgumentException();
		}
		Paciente paciente = new Paciente(n, e);
		this.numLibres++;
	}

	public int primeraLibre() {
		boolean encontrado = false;
		int i;
		for (i = 1; i < listaCamas.length && !encontrado; i++) {
			if (listaCamas[i] == null)
				encontrado = true;
		}

		if (encontrado)
			return i;
		else
			return 0;

	}

	private void darAltaPaciente(int i) {
		if (listaCamas[i] == null) {
			throw new IllegalArgumentException("La cama esta vacia");
		}
		listaCamas[i] = null;
		this.numLibres--;
	}

	public void darAltas() {
		for (int i = 0; i < listaCamas.length; i++) {
			listaCamas[i].mejorar();
			if (listaCamas[i].getEstado() <= 0) {
				darAltaPaciente(i);
			}
		}
	}

	@Override
	public String toString() {
		String texto = "";

		for (int i = 0; i < listaCamas.length; i++) {
			texto += (i + 1) + "" + listaCamas[i];
		}

		return texto;
	}
}
