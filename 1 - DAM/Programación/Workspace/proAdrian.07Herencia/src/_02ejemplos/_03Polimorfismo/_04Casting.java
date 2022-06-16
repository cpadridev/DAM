package _02ejemplos._03Polimorfismo;

import _03ejercicios._03figuras.*;

public class _04Casting {
	public static void main(String[] args) {
		//Array de figuras que contiene circulos
		Figura v1[] = {new Circulo(10,10,"ROJO",20), new Circulo(20,30,"AZUL",30)};
		//Podemos recorrer el array y llamar al metodo toString, o area, pero no a getRadio
		for (int i = 0; i < v1.length; i++) {
			System.out.println(v1[i].toString());
			System.out.println(v1[i].area());
			System.out.println(v1[i].getPosX());
			
			//System.out.println(v1[i].getRadio());
			
			//Si estoy seguro de que los objetos de v1[] son Circulos
			//Puedo hacer un casting
			System.out.println(((Circulo)v1[i]).getRadio());
		}
		
		//Array de figuras que contiene circulos y rectangulos
		System.out.println("---------------");
		Figura v2[] = {new Circulo(10,10,"ROJO",20), new Rectangulo(20,30,"AZUL",40,50)};
		for (int i = 0; i < v2.length; i++) {
			//Esto compila, PERO producirá ERROR DE EJECUCIÓN
			try {
				System.out.println(((Circulo)v2[i]).getRadio());
			}catch (Exception e) {
				System.out.println("ERROR EN EL CASTING");
			}
		}
		//Puedo hacer un Casting distinto para cada elemento????
		System.out.println("---------------");
		for (int i = 0; i < v2.length; i++) {
			if(v2[i] instanceof Circulo) {
				System.out.println(((Circulo) v2[i]).getRadio());
			} else if(v2[i] instanceof Rectangulo) {
				System.out.println(((Rectangulo) v2[i]).getAltura());
			}
		}
		
		//No todos los casting compilan. En este caso Java detecta que es IMPOSIBLE
		// que una variable de tipo String pueda tener almacenado un objeto de tipo
		//Circulo
		String s = "pepe";
		//System.out.println(((Circulo)s).getRadio()); //Este no compila
		
		//Imposible que una variable de tipo Integer tenga almacenado un objeto 
		//de tipo String
		Integer i = 30;
		System.out.println(""+ i);
		//System.out.println(((String)i).length()); //Este no compila
	}
}
