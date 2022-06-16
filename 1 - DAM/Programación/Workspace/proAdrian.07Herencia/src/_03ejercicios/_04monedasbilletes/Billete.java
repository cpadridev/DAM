package _03ejercicios._04monedasbilletes;

public class Billete extends Dinero {
	private double altura;
	private double anchura;
	
	public Billete(double valor, int anyo, double altura, double anchura) {
		super(valor, anyo);
		this.altura = altura;
		this.anchura = anchura;
	}

	@Override
	public String toString() {
		return "Billete [" + super.toString() +", altura=" + altura + "mm, anchura=" + anchura + "mm]";
	}
}
