package _03ejercicios._03figuras;

public class Rectangulo extends Figura {
	private int altura;
	private int anchura;
	public int getAltura() {
		return altura;
	}
	public int getAnchura() {
		return anchura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	public Rectangulo(int posX, int posY, String color, int altura, int anchura) {
		super(posX, posY, color);
		this.altura = altura;
		this.anchura = anchura;
	}
	public double area() {
		return altura * anchura;
	}
}
