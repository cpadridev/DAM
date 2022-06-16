package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class _02ActualizarCorreos {
	// Disponemos de una lista con los alumnos del centro del 2020
	// y otra lista con los alumnos del centro del 2021.

	// Implementar un método que devuelva una lista con los alumnos
	// a los que hay que eliminarles la cuenta de correo electrónico

	// Implementar un método que devuelva una lista con los alumnos
	// a los que hay que crear una cuenta

	public static void main(String[] args) {
		ArrayList<String> matricula2020 = new ArrayList<>(Arrays.asList("angel", "benito", "carlos", "david", "elena"));

		ArrayList<String> matricula2021 = new ArrayList<>(Arrays.asList("david", "elena", "fede", "hector", "ismael"));

		//Probarlo al vuelo
		System.out.println(correosAEliminar(matricula2021, matricula2020));
		
		//Probarlo guardando en variable
		ArrayList<String> aCrear = correosACrear(matricula2021, matricula2020);
		System.out.println(aCrear);
	}

	public static ArrayList<String> correosAEliminar(ArrayList<String> actual, ArrayList<String> anterior) {
		ArrayList<String> l = new ArrayList<>();

		// Recorremos alumnado del anyo anterior
		for (String nombre : anterior) {
			if (!actual.contains(nombre)) {
				l.add(nombre);
			}
		}

		// Con Iterator
//		Iterator<String> it = anterior.iterator();
//		while(it.hasNext()) {
//			String nombre = it.next();
//			if(!actual.contains(nombre)) {
//				l.add(nombre);
//			}
//		}

		// Con for
//		for(int i = 0; i< anterior.size(); i++) {
//			String nombre = anterior.get(i);
//			boolean enc = false;
//			for (int j = 0; j < actual.size() && !enc; j++) {
//				if(actual.get(j).equals(nombre)) {
//					enc = true;
//				}
//			}
//			if(!enc) {
//				l.add(nombre);
//			}
//		}

		return l;
	}

	public static ArrayList<String> correosACrear(ArrayList<String> actual, ArrayList<String> anterior) {
		ArrayList<String> l = new ArrayList<>();

		// Recorremos alumnado del anyo actual
		for (String nombre : actual) {
			if (!anterior.contains(nombre)) {
				l.add(nombre);
			}
		}
		return l;
	}

}
