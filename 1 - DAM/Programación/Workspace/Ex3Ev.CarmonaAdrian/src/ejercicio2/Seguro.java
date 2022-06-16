package ejercicio2;

public class Seguro {
	protected String poliza;
	protected int ano;
	protected String matricula;
	protected boolean incendio;
	protected boolean lunas;

	public Seguro(String poliza, int ano, String matricula, boolean incendio, boolean lunas) {
		this.poliza = poliza;
		this.ano = ano;
		this.matricula = matricula;
		this.incendio = incendio;
		this.lunas = lunas;
	}

	protected double calcularPrecio() {
		double coste = 250;

		if (incendio && lunas) {
			coste += 50;
		} else {
			if (incendio) {
				coste += 30;
			}
			if (lunas) {
				coste += 40;
			}
		}

		return coste;
	}

	@Override
	public String toString() {
		String comprobarIncendio;
		String comprobarLunas;

		if (incendio) {
			comprobarIncendio = "Incluido";
		} else {
			comprobarIncendio = "Excluido";
		}

		if (lunas) {
			comprobarLunas = "Incluido";
		} else {
			comprobarLunas = "Excluido";
		}

		return String.format(
				"Poliza: %s%n" + "Ano: %d%n" + "Matricula: %s%n" + "Incendio: %s%n" + "Lunas: %s%n" + "Precio: %.2f euros",
				poliza, ano, matricula, comprobarIncendio, comprobarLunas, calcularPrecio());
	}
}
