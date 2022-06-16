package _03ejercicios._08amarres;

public class Velero extends Barco{
	private int mastiles;

	public Velero(String matricula, double eslora, int anyo, int mastiles) {
		super(matricula, eslora, anyo);
		this.mastiles = mastiles;
	}

	public int getMastiles() {
		return mastiles;
	}

	public void setMastiles(int mastiles) {
		this.mastiles = mastiles;
	}

	public double getFactorAlquiler() {
		return super.getFactorAlquiler() + this.mastiles;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", mastiles=" + mastiles + "]";
	}
}
