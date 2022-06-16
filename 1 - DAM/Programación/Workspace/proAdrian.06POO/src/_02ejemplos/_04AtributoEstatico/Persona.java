package _02ejemplos._04AtributoEstatico;

import java.util.NoSuchElementException;

public class Persona {
	//Impedir que se creen más de 5 objetos de la clase Persona
	private String dni;
	private String nombre;
	private static int numPersonas = 0;

	public Persona(String dni, String nombre) {
		if(numPersonas == 5) throw new NoSuchElementException(); 
		else {
			this.dni = dni;
			this.nombre = nombre;
			numPersonas ++;
		}
	}
	public static void main(String[] args) {
		Persona p1 = new Persona("1","ana"); System.out.println(numPersonas);
		Persona p2 = new Persona("2","ana"); System.out.println(numPersonas);
		Persona p3 = new Persona("3","ana"); System.out.println(numPersonas);
		Persona p4 = new Persona("4","ana"); System.out.println(numPersonas);
		Persona p5 = new Persona("5","ana"); System.out.println(numPersonas);
		Persona p6 = new Persona("6","ana"); System.out.println(numPersonas);
	}
}
