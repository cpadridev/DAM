package ejercicio2;

public class ContratoFijo extends Contrato {
	public ContratoFijo(String titular, int lineaPrincipal, double precioMinuto, int permanencia) {
		super(titular, lineaPrincipal, precioMinuto, permanencia);
	}

	@Override
	protected double calcularPrecio(int minutosHablados) {
		return 16 + (minutosHablados * precioMinuto / 100.0);
	}
}
