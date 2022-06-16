package ejercicio1;

public class Partido {
	private String local;
	private int golesLocal;
	private String visitante;
	private int golesVisitante;

	public Partido(String local, int golesLocal, String visitante, int golesVisitante) {
		this.local = local;
		this.golesLocal = golesLocal;
		this.visitante = visitante;
		this.golesVisitante = golesVisitante;
	}

	public String getLocal() {
		return local;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public String getVisitante() {
		return visitante;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public String toString() {
		return local + " " + golesLocal + " - " + visitante + " " + golesVisitante;
	}

	@Override
	public int hashCode() {
		return (local + "_" + visitante).hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Partido))
			return false;
		Partido p = (Partido) o;
		return local.equals(p.local) && visitante.equals(p.visitante);
	}
}
