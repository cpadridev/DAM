package _02ejemplos._03Polimorfismo;

import _02ejemplos._02animales.Animal;
import _02ejemplos._02animales.Gato;
import _02ejemplos._02animales.Mascota;
import _02ejemplos._02animales.Perro;
import _02ejemplos._02animales.Tigre;

public class _05CastingInterface {
	public static void main(String[] args) {
		Animal[] a = {new Perro(), new Gato()};
		for (int i = 0; i < a.length; i++) {
			a[i].saludar();
			// a[i].pasear(); //Animal no tiene método pasear
			((Mascota)a[i]).pasear(); //Se puede hacer casting a un tipo interface
		}
		
		//Se puede usar un interface como tipo estático
		Mascota[] m = {new Perro(), new Gato()};
		for (int i = 0; i < m.length; i++) {
			((Animal)m[i]).saludar();
			// a[i].pasear(); //Animal no tiene método pasear
			m[i].pasear();
		}

	}			

}
