package _03ejercicios._05televisores;

public class TVTubo extends Televisor{
	private int lineas;
	
	public TVTubo(String marca, String modelo, double precio, double pulgadas, int lineas) {
		super(marca, modelo, precio, pulgadas);
		this.lineas = lineas;
	}
	
	@Override
	public String toString() {
		return "TVTubo [" + super.toString() + resolucion() + "]";
	}
	
	public String resolucion() {
		return lineas + "lineas";
	}
}
