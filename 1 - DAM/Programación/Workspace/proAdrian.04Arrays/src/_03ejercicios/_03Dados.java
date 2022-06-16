package _03ejercicios;

import java.util.Arrays;

public class _03Dados {
	final static int LANZAMIENTOS = 20000000;
	final static int MOSTRAR_CADA = 1000000;

	public static void main(String[] args) {
		int numLanzamientos = 0;
		// Array veces para contar cuantas veces ha salido cada dado.
		int[] veces = new int[13];

		while (numLanzamientos < LANZAMIENTOS) {
			int dado = 1 + (int) (Math.random() * 6); // <-- 5
			dado = dado + 1 + (int) (Math.random() * 6); // <-- 5
//			switch(dado) {
//			case 1: veces[1]++; break;
//			case 2: veces[2]++; break;
//			case 3: veces[3]++; break;
//			case 4: veces[4]++; break;
//			case 5: veces[5]++; break;
//			case 6: veces[6]++; break;
//			}
			veces[dado]++;
			numLanzamientos++;

			if (numLanzamientos % MOSTRAR_CADA == 0) {
//				System.out.println(Arrays.toString(veces));
//				System.out.println("Lanzamientos : " + numLanzamientos);
//				System.out.format("1: %5.2f %% %n", 100.0 * veces[1] / numLanzamientos);
//				System.out.format("2: %5.2f %% %n", 100.0 * veces[2] / numLanzamientos);
//				System.out.format("3: %5.2f %% %n", 100.0 * veces[3] / numLanzamientos);
//				System.out.format("4: %5.2f %% %n", 100.0 * veces[4] / numLanzamientos);
//				System.out.format("5: %5.2f %% %n", 100.0 * veces[5] / numLanzamientos);
//				System.out.format("6: %5.2f %% %n", 100.0 * veces[6] / numLanzamientos);

				System.out.println("Lanzamientos : " + numLanzamientos);

				for (int i = 1; i < veces.length; i++) {
					System.out.printf("%d: %5.2f %% %n", i, 100.0 * veces[i] / numLanzamientos);
				}
			}
		}
	}
}
