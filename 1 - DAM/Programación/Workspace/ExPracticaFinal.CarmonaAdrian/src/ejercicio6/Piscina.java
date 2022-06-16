package ejercicio6;

public class Piscina implements Rellenable {
	private int longitud;
	private int anchura;
	private int altura;

	public Piscina(int longitud, int anchura, int altura) {
		this.longitud = longitud;
		this.anchura = anchura;
		this.altura = altura;

	}

	public int rellenar() {
		return longitud * anchura * altura * 1000;
	}
}
