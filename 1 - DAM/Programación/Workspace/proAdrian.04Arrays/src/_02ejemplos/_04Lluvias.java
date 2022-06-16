package _02ejemplos;

import java.util.Scanner;

public class _04Lluvias {
	public static void main(String[] args) {
		Scanner tec  = new Scanner(System.in);
		
		System.out.println("¿Cuántos días tiene el mes?");
		int diasMes = tec.nextInt();
		
		//El tamaño de un array se puede decidir durante la ejecución.
		double[] lluvia = new double[diasMes];
		
		for(int dia = 0; dia < diasMes; dia++) {
			System.out.println("Lluvia del dia " + (dia + 1) + ": ");
			lluvia[dia] = tec.nextInt();
		}
	}
}
