package ejercicio2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EjercicioMaps {
	public static void main(String[] args) {
		List<String> vueltas = Arrays.asList("Arturo", "Encarna", "Maria", "Fran", "Carlos", "Daniel", "Miguel",
				"Maria", "Encarna", "Maria", "Fran", "Carlos", "Daniel", "Miguel", "Maria", "Antonio", "Pablo", "Maria",
				"Fran", "Pablo", "Daniel", "Miguel", "Maria", "Encarna", "Maria", "Fran", "Carlos", "Daniel", "Miguel",
				"Maria", "Antonio", "Pablo");

		Map<String, String> patrocinios = new HashMap<>();
		patrocinios.put("Arturo", "Javi");
		patrocinios.put("Encarna", "Javi");
		patrocinios.put("Maria", "Esther");
		patrocinios.put("Fran", "Esther");
		patrocinios.put("Carlos", "Monica");
		patrocinios.put("Daniel", "Monica");

		mostrarPagos(vueltas, patrocinios);
	}

	private static void mostrarPagos(List<String> vueltas, Map<String, String> patrocinios) {
		Map<String, Integer> pagos = new HashMap<>();

		for (Map.Entry<String, String> entry : patrocinios.entrySet()) {
			String value = entry.getValue();

			pagos.put(value, 0);
		}

		pagos.put("No patrocinado", 0);

		for (String s : vueltas) {
			if (patrocinios.containsKey(s)) {
				pagos.put(patrocinios.get(s), pagos.get(patrocinios.get(s)) + 1);
			} else {
				pagos.put("No patrocinado", pagos.get("No patrocinado") + 1);
			}
		}

		System.out.println(pagos);
	}
}
