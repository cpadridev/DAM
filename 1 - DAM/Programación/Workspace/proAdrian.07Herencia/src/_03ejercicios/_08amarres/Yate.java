package _03ejercicios._08amarres;

public class Yate extends Barco{
	private double potencia;
	private int camarotes;
	
	public Yate(String matricula, double eslora, int anyo, double potencia, int camarotes) {
		super(matricula, eslora, anyo);
		this.potencia = potencia;
		this.camarotes = camarotes;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public int getCamarotes() {
		return camarotes;
	}

	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}

	public double getFactorAlquiler() {
		return potencia * camarotes;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", potencia=" + potencia + ", camarotes=" + camarotes + "]";
	}
}
