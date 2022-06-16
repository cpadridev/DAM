package _02ejemplos._02animales;

public class Gato extends Felino implements Mascota{
	public void saludar() {
		System.out.println("Miau Miau!!");
	}

	@Override
	public void trepar() {
		System.out.println("Se trepar pero no bajar");
		
	}
	public void pasear() {
		System.out.println("Soy un gato paseando");
	}
}
