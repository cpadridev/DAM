package _02ejemplos._03Polimorfismo;

import _02ejemplos._01alumnos.Persona;

public class _03PolimorfismoNoForzado {
	public static void main(String[] args) {
		Persona p1 = new Persona("1111111A","Pepe");
		Persona p2 = new Persona("2222222B","Luis");
		
		if (p1.equals(p2)) {
			System.out.println("Misma persona");
		} else {
			System.out.println("Distinta persona");
		}
	}
}
