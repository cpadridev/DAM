package _03ejercicios;

import java.util.Scanner;

public class _06Containers {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int contenedores = 0, toneladas = 0;
		
		do {
			System.out.println("Introduce un número de contenedores: ");
			contenedores += tec.nextInt();
			System.out.println("Introduce el peso de los contenedores: ");
			toneladas += tec.nextInt();
		} while (contenedores < 100 || toneladas < 700);
		
		System.out.println("Has cargado " + contenedores + " contenedores");
	}
}
