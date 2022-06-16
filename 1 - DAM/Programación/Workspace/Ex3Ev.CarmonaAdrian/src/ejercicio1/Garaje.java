package ejercicio1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Garaje {
	private Map<String, Integer> vehiculosDentro;

	public Garaje() {
		vehiculosDentro = new LinkedHashMap<>();
	}

	public void registrarMatricula(String matricula, int instante) {
		if (vehiculosDentro.get(matricula) == null) {
			vehiculosDentro.put(matricula, instante);
			System.out.printf("-> Entrada del vehiculo %s en el instante %d%n", matricula, instante);
		} else {
			int tiempo = instante - vehiculosDentro.get(matricula);
			System.out.printf("<- Salida del vehiculo %s en el instante %d%n	Tiempo dentro: %d%n", matricula,
					instante, tiempo);
			vehiculosDentro.remove(matricula);
		}
	}

	public void entraronAntesDe(int segundos) {
		System.out.printf("--- Vehiculos que entraron antes del instante %d ---%n", segundos);

		for (Map.Entry<String, Integer> entry : vehiculosDentro.entrySet()) {
			String matricula = entry.getKey();
			int instante = entry.getValue();

			if (instante < segundos) {
				System.out.println("Matricula: " + matricula + " Instante de entrada " + instante);
			}
		}
	}
}
