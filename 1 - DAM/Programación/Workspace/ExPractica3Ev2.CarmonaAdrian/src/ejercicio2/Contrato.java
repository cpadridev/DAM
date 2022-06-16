package ejercicio2;

public abstract class Contrato {
	protected String titular;
	protected int lineaPrincipal;
	protected double precioMinuto;
	protected double permanencia;

	protected Contrato(String titular, int lineaPrincipal, double precioMinuto, int permanencia) {
		this.titular = titular;
		this.lineaPrincipal = lineaPrincipal;
		this.precioMinuto = precioMinuto;
		this.permanencia = permanencia;
	}

	protected abstract double calcularPrecio(int minutosHablados);

	protected double calcularCancelacion() {
		return permanencia * 10;
	}

	@Override
	public String toString() {
		return "Contrato [titular=" + titular + ", precioPorMinuto=" + precioMinuto + ", precioCancelacion="
				+ calcularCancelacion() + "]";
	}
}
