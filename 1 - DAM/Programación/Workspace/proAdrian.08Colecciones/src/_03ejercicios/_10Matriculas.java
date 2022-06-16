package _03ejercicios;

import java.util.LinkedHashMap;
import java.util.Map;

public class _10Matriculas {
	/*
	 * Tenemos un Map<String, Integer> que contiene parejas (matrícula, año de
	 * matriculación), Mostrar cuántos vehículos se han matriculado cada año.
	 *
	 */
	public static void main(String[] args) {
		Map<String, Integer> m = new LinkedHashMap();
		m.put("BMV0", 2000);
		m.put("BMV1", 2005);
		m.put("BMV2", 2000);
		m.put("BMV3", 2003);
		m.put("BMV4", 2000);
		m.put("BMV5", 2002);
		m.put("BMV6", 2002);
		m.put("BMV7", 2000);

		Map<Integer, Integer> m2 = new LinkedHashMap<>();

		for (Map.Entry<String, Integer> entry : m.entrySet()) {
			Integer anyo = entry.getValue();

			if (m2.containsKey(anyo)) {
				m2.put(anyo, m2.get(anyo) + 1);
			} else {
				m2.put(anyo, 1);
			}
		}

		System.out.println(m2);
	}
}
