package practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Apuesta {
	private ArrayList<Integer> numeros = new ArrayList<>();
	private ArrayList<Integer> estrellas = new ArrayList<>();

	public Apuesta(int numNumeros, int numEstrellas, int maxValorNumeros, int maxValorEstrellas) {
		// Generador de numeros.
		int aleatorio = (int) (Math.random() * 52 + 1);

		for (int i = 0; i < numNumeros; i++) {
			while (this.numeros.contains(aleatorio)) {
				aleatorio = (int) (Math.random() * 52 + 1);
			}

			this.numeros.add(aleatorio);
		}

		// Generador de estrellas.
		aleatorio = (int) (Math.random() * 12 + 1);

		for (int i = 0; i < numEstrellas; i++) {
			while (this.estrellas.contains(aleatorio)) {
				aleatorio = (int) (Math.random() * 12 + 1);
			}

			this.estrellas.add(aleatorio);
		}

		// Ordenar de menor a mayor.
		Collections.sort(this.numeros);
		Collections.sort(this.estrellas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Apuesta))
			return false;
		Apuesta other = (Apuesta) obj;
		return Objects.equals(this.estrellas, other.estrellas) && Objects.equals(this.numeros, other.numeros);
	}

	@Override
	public String toString() {
		return String.format("%02d %02d %02d %02d %02d - (%02d %02d)", this.numeros.get(0), this.numeros.get(1),
				this.numeros.get(2), this.numeros.get(3), this.numeros.get(4), this.estrellas.get(0),
				this.numeros.get(1));
	}

//	public int calcularPremio (ArrayList<Integer> números, ArrayList<Integer> estrellas) {
//		
//	}
}
