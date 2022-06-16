package ejercicio3;

public class Vehiculo implements Comparable<Vehiculo> {
	private String matricula;
	private int cilindrada;

	public Vehiculo(String matricula, int cilindrada) {
		this.matricula = matricula;
		this.cilindrada = cilindrada;
	}

	public String getMatricula() {
		return matricula;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public int compareTo(Vehiculo v) {
		return this.matricula.compareTo(v.matricula);
	}

	@Override
	public String toString() {
		return matricula + " - " + cilindrada + " cc.";
	}
}
