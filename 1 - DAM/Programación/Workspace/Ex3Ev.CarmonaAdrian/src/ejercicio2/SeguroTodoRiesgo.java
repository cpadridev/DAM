package ejercicio2;

public class SeguroTodoRiesgo extends SeguroRobo {
	private double franquicia;

	public SeguroTodoRiesgo(String poliza, int ano, String matricula, int antiguedad, double franquicia) {
		super(poliza, ano, matricula, true, true, antiguedad);
		this.franquicia = franquicia;
	}

	@Override
	public double calcularPrecio() {
		return 700 - (0.25 * franquicia);
	}

	@Override
	public String toString() {
		return String.format("DAÑOS PROPIOS INCLUIDOS%n" + "%s%n", super.toString());
	}
}
