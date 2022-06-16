package ejercicio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Ejercicio1 {
	private static Map<String, Integer> contarPuntos(Set<Partido> partidos) {
		Map<String, Integer> m = new TreeMap<>();

		for (Partido p : partidos) {
			int puntosLocal = 0;
			int puntosVisitante = 0;

			if (p.getGolesLocal() == p.getGolesVisitante()) {
				puntosLocal = 1;
				puntosVisitante = 1;
			} else if (p.getGolesLocal() > p.getGolesVisitante()) {
				puntosLocal = 3;
			} else {
				puntosVisitante = 3;
			}

			if (!m.containsKey(p.getLocal())) {
				m.put(p.getLocal(), puntosLocal);
			} else {
				m.put(p.getLocal(), m.get(p.getLocal()) + puntosLocal);
			}

			if (!m.containsKey(p.getVisitante())) {
				m.put(p.getVisitante(), puntosVisitante);
			} else {
				m.put(p.getVisitante(), m.get(p.getVisitante()) + puntosVisitante);
			}
		}

		return m;
	}

	private static void mostrarGanador(Map<String, Integer> puntos) {
		String equipoGanador = null;
		int max = 0;

		for (Entry<String, Integer> entry : puntos.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			if (val > max) {
				equipoGanador = key;
				max = val;
			}
		}

		System.out.printf("El ganador es %s con %d puntos", equipoGanador, max);
	}

	// -------------------------------------
	public static void main(String[] args) {
		Set<Partido> partidos = leerFichero();
		System.out.println(partidos);
		Map<String, Integer> puntos = contarPuntos(partidos);
		System.out.println(puntos);
		mostrarGanador(puntos);
	}

	private static Set<Partido> leerFichero() {
		HashSet<Partido> p = new HashSet<>();
		try (Scanner f = new Scanner(new File("resultadosLiga.txt"))) {
			while (f.hasNext()) {
				p.add(new Partido(f.next(), f.nextInt(), f.next(), f.nextInt()));
			}
		} catch (FileNotFoundException e) {
			System.err.println("Falta el fichero de resultados");
			System.err.println("PONTE EN CONTACTO CON EL PROFESOR");
			System.exit(0);
		} catch (Exception e) {
			System.err.println("Error al leer fichero de resultados");
			System.err.println("PONTE EN CONTACTO CON EL PROFESOR");
			System.exit(0);
		}
		return p;
	}
}
