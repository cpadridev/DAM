package _02ejemplos._06ordenacion;

import java.util.Arrays;
import java.util.Comparator;

import _02ejemplos._05ordenacion.Vehiculo;

public class OrdenarVariosCriterios {
	public static void main(String[] args) {
		//Vamos a ordenar un array de vehiculos usando
		//distintos criterios de ordenacion
		Vehiculo v[] = {
				new Vehiculo("4348BBC","Seat","Ibiza"),
				new Vehiculo("1122BBD","Opel","Vectra"),
				new Vehiculo("2233CDF","Citroen","C3"),
		};
		
		//Ordenación segun el criterio que indica el metodo compareTo de la clase
		//Vehiculo (Ordenacion natural u ordenacion por defecto). Es decir
		// por matricula
		Arrays.sort(v);
		System.out.println(Arrays.toString(v));
		
		//Usando una clase externa que implementa Comparator<Vehiculo>
		Arrays.sort(v, new ComparadorPorMarca());
		System.out.println(Arrays.toString(v));

		//Usando una clase interna (inner class) que implementa Comparator<Vehiculo>
		Arrays.sort(v, new ComparadorLongitudModelo());
		System.out.println(Arrays.toString(v));
		
		//Usando una clase "al vuelo" o "anónima" (Annonimous class)
		Arrays.sort(v, new Comparator<Vehiculo> () {
			public int compare(Vehiculo v1, Vehiculo v2) {
				return v1.getModelo().length() - v2.getModelo().length();
			}
		});
		System.out.println(Arrays.toString(v));
		
		//Usando una expresión lambda
		Arrays.sort(v, (v1,v2)-> v1.getModelo().length() - v2.getModelo().length());
		System.out.println(Arrays.toString(v));
	}
	
	

}

//Clase interna (Evita "ensuciar" el proyecto con ficheros .java de clases
// que solo se usan en un sitio.

class ComparadorLongitudModelo implements Comparator<Vehiculo> {
	public int compare(Vehiculo v1, Vehiculo v2) {
		return v1.getModelo().length() - v2.getModelo().length();
	}
}





