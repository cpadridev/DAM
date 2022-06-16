package ejercicio2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjercicioMaps {
	public static void main(String[] args) {
		List<String> vueltas = Arrays.asList(new String[]
				{"Arturo", "Encarna", "Maria", "Fran", "Carlos", "Daniel", "Miguel", "Maria", "Encarna",
				"Maria", "Fran", "Carlos", "Daniel", "Miguel", "Maria", "Antonio", "Pablo", "Maria", "Fran", "Pablo",
				"Daniel", "Miguel", "Maria", "Encarna", "Maria", "Fran", "Carlos", "Daniel", "Miguel", "Maria",
				"Antonio", "Pablo" });
		
		Map<String,String> patrocinios = new HashMap<>();
		patrocinios.put("Arturo", "Javi");
		patrocinios.put("Encarna", "Javi");
		patrocinios.put("Maria", "Esther");
		patrocinios.put("Fran", "Esther");
		patrocinios.put("Carlos", "Monica");
		patrocinios.put("Daniel", "Monica");
		
		mostrarPagos(vueltas,patrocinios);

	}
	
	
	private static void mostrarPagos(List<String> vueltas, Map<String, String> patrocinios) {
		//Completar
	}

}
