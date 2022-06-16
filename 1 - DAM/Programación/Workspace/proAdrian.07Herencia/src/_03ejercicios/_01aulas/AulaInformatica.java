package _03ejercicios._01aulas;

public class AulaInformatica extends Aula{
	private int numOrdenadores;
	
	public AulaInformatica(int codigo, double longitud, double anchura, int numOrdenadores) {
		super(codigo, longitud, anchura);
		this.numOrdenadores = numOrdenadores;
	}
	
	public int getNumOrdenadores() {
		return numOrdenadores;
	}

	public void setNumOrdenadores(int numOrdenadores) {
		this.numOrdenadores = numOrdenadores;
	}

	@Override
	public double capacidad() {
		//REESCRITURA TOTAL
		return numOrdenadores * 2;
	}
	public String toString() {
		return super.toString() + " - " + numOrdenadores + " ord.";
	}
}




