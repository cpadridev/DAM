package _03ejercicios._03figuras;

public abstract class Figura {
	private int posX;
	private int posY;
	private String color;
	public Figura(int posX, int posY, String color) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;
	}
	
	public String toString() {
		return String.format("(%d,%d) - %s - %.2f m2", posX,posY,color,area());
	}
	
	public abstract double area();

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public String getColor() {
		return color;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
