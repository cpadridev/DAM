package practica;

import java.util.ArrayList;

public class Boleto {
	private static final int MAXAPUESTAS = 5;
	private ArrayList<Object> boleto = new ArrayList<>();

	public Boleto(int numApuestas, int numNumeros, int numEstrellas, int maxValorNumeros, int maxValorEstrellas)
			throws IllegalArgumentException {
		if (numApuestas > MAXAPUESTAS || numApuestas <= 0) {
			throw new IllegalArgumentException("No es posible realizar la apuesta");
		}

		for (int i = 0; i < numApuestas; i++) {
			boolean iguales = false;
			do {
				Apuesta a = new Apuesta(numNumeros, numEstrellas, maxValorNumeros, maxValorEstrellas);
				if (!boleto.contains(a)) {
					boleto.add(a);
					iguales = true;
				}
			} while (!iguales);
		}
	}

	@Override
	public String toString() {
		String apuestas = "";

		for (int i = 0; i < boleto.size(); i++) {
			apuestas += String.format("  %d: %s%n", i + 1, boleto.get(i));
		}

		String texto = String.format("	EUROMILLONES \n" + "%d apuesta (s) \n" + "=============================== \n"
				+ "%s" + "===============================", this.boleto.size(), apuestas);

		return texto;
	}
}
