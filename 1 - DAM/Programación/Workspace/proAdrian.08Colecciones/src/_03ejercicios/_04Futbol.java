package _03ejercicios;

import java.util.Arrays;
import java.util.TreeSet;

public class _04Futbol {
	public static void main(String[] args) {
		String[] equipos = { "Madrid", "Valencia", "Barcelona", "Sevilla" };
		String[][] partidosDisputados = { 
				{ "Madrid"   , "Valencia"  }, 
				{ "Barcelona", "Valencia"  },
				{ "Valencia" , "Madrid"    }, 
				{ "Valencia" , "Barcelona" } 
		};

		System.out.println(Arrays.toString(equipos));
		System.out.println(Arrays.toString(nombreEquiposLocales(equipos, partidosDisputados)));
		System.out.println(Arrays.toString(noHanJugadoFuera(equipos, partidosDisputados)));
	}

	public static String[] nombreEquiposLocales(String[] equipos, String[][] partidosDisputados) {
		TreeSet<String> local = new TreeSet<>();

		for (int i = 0; i < partidosDisputados.length; i++) {
			local.add(partidosDisputados[i][0]);
		}

		return local.toArray(new String[0]);
	}

	public static String[] noHanJugadoFuera(String[] equipos, String[][] partidosDisputados) {
		TreeSet<String> noFuera = new TreeSet<>(Arrays.asList(equipos));

		for (int i = 0; i < partidosDisputados.length; i++) {
			noFuera.remove(partidosDisputados[i][1]);
		}

		return noFuera.toArray(new String[0]);
	}
}
