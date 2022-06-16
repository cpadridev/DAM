package _03ejercicios;

import java.util.Random;

public class _08CaraOCruz {
	public static void main(String[] args) {
		Random r = new Random();
		int lanzamientos = 0, caras = 0, cruces = 0;
		double porcCaras = 0, porcCruces = 0;

		do {
			boolean esCara = r.nextBoolean();

			lanzamientos++;

			if (esCara)
				caras++;
			else
				cruces++;

			porcCaras = ((double) caras / lanzamientos) * 100;
			porcCruces = 100 - porcCaras;

			System.out.println();
			System.out.println("Caras: " + caras);
			System.out.println("Cruces: " + cruces);
			System.out.println("Porc. caras: " + porcCaras);
			System.out.println("Porc. cruces: " + porcCruces);
		} while (Math.abs(porcCaras - porcCruces) > 0.001);
	}
}
