package _02ejemplos._03Polimorfismo;

import _02ejemplos._02animales.Animal;
import _02ejemplos._02animales.Gato;
import _02ejemplos._02animales.Lobo;
import _02ejemplos._02animales.Perro;

public class _02PolimorfismoNoForzado {
	public static void main(String[] args) {
		Animal[] animales = {new Perro(),new Gato(), new Lobo()};
	}
	//Método que recorre todos los animales de un array
	//y llama al método saludar
	public static void todosSaludan (Animal[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i].saludar(); //<<--POLIMORFISMO
			Animal a = v[i]; //<<--- POLIMORFISMO
			a.saludar();
		}
	}
}
