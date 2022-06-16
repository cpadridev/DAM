package ejercicio2;

public class ContratoMovil extends Contrato {
	private int minutosGratis;
	private int gbDatos;

	public ContratoMovil(String titular, int lineaPrincipal, double precioMinuto, int permanencia, int minutosGratis,
			int gbDatos) {
		super(titular, lineaPrincipal, precioMinuto, permanencia);
		this.minutosGratis = minutosGratis;
		this.gbDatos = gbDatos;
	}

	@Override
	protected double calcularPrecio(int minutosHablados) {
		// Evitamos que salga negativo si ha hablado menos de lo que tiene gratis.
		int minutosAPagar = Math.max(0, minutosHablados - minutosGratis);

		// El precio por minuto esta en centimos y el precio del GB en euros.
		return (minutosAPagar * precioMinuto) / 100.0 + gbDatos * 5;
	}
}
