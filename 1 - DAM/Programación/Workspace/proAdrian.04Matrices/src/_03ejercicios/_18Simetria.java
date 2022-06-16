package _03ejercicios;

import java.util.Scanner;

public class _18Simetria {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la matriz");
		int a = tec.nextInt();
		
		int m[][] = new int [a][a];
		
		System.out.println("Introduce una matriz");
		for (int i=0; i < a; i++) {
			for (int j=0; j < a; j++) {
				System.out.println("Introduzca el elemento [" + i + "," + j + "]");
				m[i][j] = tec.nextInt();
			}
		}
		
		boolean resultado = esSimetrica(m);
		
		if (resultado == true) {
			System.out.println("La matriz es simétrica");
		} else {
			System.out.println("La matriz no es simétrica");
		}
	}
	
	public static boolean esSimetrica (int m[][]) {
		boolean resultado = false;
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				if (m[i][j] == m[j][i]) {
					resultado = true;
				} else {
					resultado = false;
					break;
				}
			}
		}
		
		return resultado;
	}
}
