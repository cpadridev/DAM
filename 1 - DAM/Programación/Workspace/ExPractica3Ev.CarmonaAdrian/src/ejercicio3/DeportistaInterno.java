package ejercicio3;

public class DeportistaInterno extends Deportista {
	protected String regimen;

	public DeportistaInterno(String dni, String nombre, String deporte, String regimen) {
		super(dni, nombre, deporte);
		if (!regimen.equals("SOLO_ALOJAMIENTO") && !regimen.equals("ALOJAMIENTO+DESAYUNO")
				&& !regimen.equals("PENSION_COMPLETA")) {
			throw new IllegalArgumentException("Regimen no valido");

		}
		this.regimen = regimen;
	}

	@Override
	public String toString() {
		String texto = "";
		if (regimen.equals("SOLO_ALOJAMIENTO")) {
			texto = "Solo alojamiento";
		} else if (regimen.equals("ALOJAMIENTO+DESAYUNO")) {
			texto = "Media";
		} else {
			texto = "Completa";
		}

		return String.format("INTERNO%n%s%nPension: %s", super.toString(), texto);
	}

	public double calcularImporteAPagar() {
		if (regimen.equals("SOLO_ALOJAMIENTO")) {
			return 300;
		} else if (regimen.equals("ALOJAMIENTO+DESAYUNO")) {
			return 500;
		} else {
			return 800;
		}
	}
}
