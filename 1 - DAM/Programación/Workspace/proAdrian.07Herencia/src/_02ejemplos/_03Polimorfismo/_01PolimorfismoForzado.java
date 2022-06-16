package _02ejemplos._03Polimorfismo;

import _02ejemplos._02animales.Animal;
import _02ejemplos._02animales.Canino;
import _02ejemplos._02animales.Felino;
import _02ejemplos._02animales.Gato;
import _02ejemplos._02animales.Perro;

public class _01PolimorfismoForzado {
	public static void main(String[] args) {
		Perro p = new Perro();
		Animal a = new Perro(); // Puedo guardar un Perro en una variable Animal
		Canino c = new Perro(); // Puedo guardar un Perro en una variable Canino

		//Felino f = new Perro(); // No se puede hacer esta asignacion
								// porque Perro NO ES UN Felino
	}
}
