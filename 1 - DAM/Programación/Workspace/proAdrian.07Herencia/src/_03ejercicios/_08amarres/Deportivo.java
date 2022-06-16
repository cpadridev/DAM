package _03ejercicios._08amarres;

public class Deportivo extends Barco{
	private double potencia;
	
	
	public Deportivo(String matricula, double eslora, int anyo, double potencia) {
		super(matricula, eslora, anyo);
		this.potencia = potencia;
	}
	
	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public double getFactorAlquiler() {
		return super.getFactorAlquiler() + this.potencia;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", potencia=" + potencia + "]";
	}
}
