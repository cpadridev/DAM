package ejercicio3;

import java.util.ArrayList;

import ejercicio2.Conductor;
import ejercicio2.Seguro;

public class Presupuestos {
	private ArrayList<Seguro> listaSeguros;

	public Presupuestos() {
		listaSeguros = new ArrayList<>();
	}

	@SuppressWarnings("unlikely-arg-type")
	public void anadir(Seguro s) {
		int cantidadSeguros = 0;

		for (int i = 0; i < listaSeguros.size(); i++) {
			if (listaSeguros.contains(s.getMatricula())) {
				cantidadSeguros++;
			}
		}

		if (cantidadSeguros == 3) {
			throw new IllegalArgumentException("No se permiten más seguros a la matricula");
		} else {
			listaSeguros.add(s);
		}
	}

	public boolean esCliente(Conductor c) {
		for (int i = 0; i < listaSeguros.size(); i++) {
			if (listaSeguros.get(i).getConductor().equals(c)) {
				return true;
			}
		}

		return false;
	}

	public double incrementoPrecios(int ano1, int ano2) {
		double preciosAno1 = 0;
		int numAno1 = 0;
		double preciosAno2 = 0;
		int numAno2 = 0;

		for (int i = 0; i < listaSeguros.size(); i++) {
			if (listaSeguros.get(i).getAno() == ano1) {
				preciosAno1 += listaSeguros.get(i).calcularPrecio();
				numAno1++;
			}
			if (listaSeguros.get(i).getAno() == ano2) {
				preciosAno2 += listaSeguros.get(i).calcularPrecio();
				numAno2++;
			}
		}

		return Math.abs((preciosAno1 / numAno1) - (preciosAno2 / numAno2));
	}
}
