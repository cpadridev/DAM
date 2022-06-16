package _03ejercicios._01aulas;

public class Aula {
	private int codigo;
	private double longitud;
	private double anchura;
	public Aula(int codigo, double longitud, double anchura) {
		this.codigo = codigo;
		this.longitud = longitud;
		this.anchura = anchura;
	}
	public int getCodigo() {
		return codigo;
	}
	public double getLongitud() {
		return longitud;
	}
	public double getAnchura() {
		return anchura;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public void setAnchura(double anchura) {
		this.anchura = anchura;
	}
	
	public double superficie() {
		return longitud * anchura;
	}
	
	public double capacidad() {
		return superficie() / 1.4;
	}
	public int capacidad2() {
		return (int) (superficie() / 1.4);
	}
	public String toString() {
		return codigo + " - " + superficie() + " m2 - " + capacidad() + " alu.";
	}
}
