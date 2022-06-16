package ejercicio2;

public class ContratoFijoMasFibra extends ContratoFijo {
	@SuppressWarnings("unused")
	private int velocidad;

	public ContratoFijoMasFibra(String titular, int lineaPrincipal, double precioMinuto, int permanencia,
			int velocidad) {
		super(titular, lineaPrincipal, precioMinuto, permanencia);
		this.velocidad = velocidad;
	}

	@Override
	protected double calcularPrecio(int minutosHablados) {
		return super.calcularPrecio(minutosHablados) + 10;
	}

	@Override
	protected double calcularCancelacion() {
		return super.calcularCancelacion() * 2;
	}
}
