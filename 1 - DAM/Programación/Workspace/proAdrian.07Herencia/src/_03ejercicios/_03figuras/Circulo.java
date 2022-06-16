package _03ejercicios._03figuras;

public class Circulo extends Figura {
	private int radio;
	public Circulo(int posX, int posY, String color, int radio) {
		super(posX, posY, color);
		this.radio = radio;
	}
	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public double area() {
		return Math.PI * radio * radio;
	}
}
