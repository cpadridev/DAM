package _03ejercicios;

public class _13Subsecuencia {
	public static void main(String[] args) {
		int[] numeros = { 23, 8, 12, 6, 7, 9, 10, 11, 2 };
		
		System.out.println(numConsecutivos(numeros));
	}
	
	public static int numConsecutivos(int[] numeros) {
		int posicion = -1;
		
		for (int i = 2; i < numeros.length; i++) {
			if (numeros[i] - 1 == numeros[i - 1] && numeros[i] - 2 == numeros[i - 2]) {
				posicion = i - 2;
				break;
			}
		}
		
		return posicion;
	}
}
