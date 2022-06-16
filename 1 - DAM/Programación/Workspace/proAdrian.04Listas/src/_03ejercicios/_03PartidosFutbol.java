package _03ejercicios;

import java.util.ArrayList;
import java.util.Arrays;

public class _03PartidosFutbol {
	//Dada una lista con los nombres de los equipos de la liga,
	//devolver otra lista con los partidos que habrá que disputar
	//Ejemplo:
	// Equipos: a b c
	// Partidos a-b a-c b-a b-c c-a c-b
	public static void main(String[] args) {
		ArrayList<String> equipos = new ArrayList<>(Arrays.asList("a","b","c"));
		for(String partido: obtenerPartidos(equipos)) {
			System.out.println(partido);
		}	
	}
	public static ArrayList<String> obtenerPartidos (ArrayList<String> e) {
		ArrayList<String> res = new ArrayList<>();
		
		for(String local: e) {
			for(String visitante: e) {
				if(!local.equals(visitante)) {
					res.add(local + " - " + visitante);
				}
			}
		}
		
		return res;
	}

}
