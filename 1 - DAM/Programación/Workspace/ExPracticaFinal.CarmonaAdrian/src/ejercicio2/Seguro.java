package ejercicio2;

public class Seguro {
	protected int ano;
	protected String matricula;
	protected boolean incendio;
	protected boolean lunas;
	protected Conductor conductor;
	
	public Seguro(int ano, String matricula, boolean incendio, boolean lunas, Conductor conductor){
		this.ano = ano;
		this.matricula = matricula;
		this.incendio = incendio;
		this.lunas = lunas;
		this.conductor = conductor; 
	}

	public int getAno() {
		return ano;
	}

	public String getMatricula() {
		return matricula;
	}

	public boolean getIncendio() {
		return incendio;
	}

	public boolean getLunas() {
		return lunas;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public double calcularPrecio() {
		double coste = 200;

		if (conductor.getEdad() < 25) {
			coste += coste * 0.6;
		}
		
		if (conductor.getAnoCarnet() < 10) {
			coste += coste * 0.7;
		}
		
		if (incendio && lunas) {
			coste += 40;
		} else {
			if (incendio) {
				coste += 20;
			}
			if (lunas) {
				coste += 30;
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
				"Ano: %d%nMatricula: %s%nIncendio: %s%nLunas: %s%nConductor: %s%nPrecio: %.2f €"
				, ano, matricula, comprobarIncendio, comprobarLunas, conductor, calcularPrecio());
	}
	
	public int compareTo(Seguro s) {
		if (ano == s.getAno()) {
			return matricula.compareTo(s.getMatricula());
		} else {
			return ano - s.getAno();
		}
	}
}
