package _03ejercicios._08amarres;

import java.util.Objects;

public class Barco {
	protected String matricula;
	protected double eslora;
	protected int anyo;
	
	
	public Barco(String matricula, double eslora, int anyo) {
		this.matricula = matricula;
		this.eslora = eslora;
		this.anyo = anyo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public double getFactorAlquiler() {
		return this.eslora * 2;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barco other = (Barco) obj;
		return anyo == other.anyo && Double.doubleToLongBits(eslora) == Double.doubleToLongBits(other.eslora)
				&& Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "Barco [matricula=" + matricula + ", eslora=" + eslora + ", anyo=" + anyo;
	}
}
