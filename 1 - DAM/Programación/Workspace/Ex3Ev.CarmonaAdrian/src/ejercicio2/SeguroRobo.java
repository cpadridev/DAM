package ejercicio2;

public class SeguroRobo extends Seguro {
	private int antiguedad;

	public SeguroRobo(String poliza, int ano, String matricula, boolean incendio, boolean lunas, int antiguedad) {
		super(poliza, ano, matricula, incendio, lunas);
		this.antiguedad = antiguedad;
	}

	@Override
	public double calcularPrecio() {
		double coste = super.calcularPrecio();

		if (antiguedad > 5) {
			coste += coste * 0.1;
		} else {
			coste += coste * 0.2;
		}

		return coste;
	}

	@Override
	public String toString() {
		return String.format("ROBO INCLUIDO%n" + "%s%n" + "Antiguedad del vehiculo: %d anos", super.toString(),
				antiguedad);
	}

}
