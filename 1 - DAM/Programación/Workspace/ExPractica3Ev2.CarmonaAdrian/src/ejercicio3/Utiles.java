package ejercicio3;

public class Utiles {
	public static <T> void combinarArrays(T[] v1, T[] v2, T[] r, Operador<T> operador) {
		for(int i = 0; i < r.length; i++) {
			r[i] = operador.operar(v1[i], v2[i]);
		}
	}

}
