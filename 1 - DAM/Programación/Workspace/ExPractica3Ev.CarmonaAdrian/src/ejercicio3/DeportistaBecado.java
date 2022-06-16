package ejercicio3;

public class DeportistaBecado extends DeportistaInterno {
	protected double porcentajeBeca;

	public DeportistaBecado(String dni, String nombre, String deporte, String regimen, double porcentajeBeca) {
		super(dni, nombre, deporte, regimen);
		this.porcentajeBeca = porcentajeBeca;
	}

	public void setPorcentajeBeca(double porcentajeBeca) {
		this.porcentajeBeca = porcentajeBeca;
	}

	@Override
	public String toString() {
		return String.format("BECADO%n%s %nBeca: %.0f%%", super.toString(), porcentajeBeca);
	}

	@Override
	public double calcularImporteAPagar() {
		return super.calcularImporteAPagar() * (1 - porcentajeBeca / 100);
	}
}
