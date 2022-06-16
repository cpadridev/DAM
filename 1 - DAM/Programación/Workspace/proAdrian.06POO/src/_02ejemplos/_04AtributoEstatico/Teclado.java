package _02ejemplos._04AtributoEstatico;

import java.util.Scanner;

public class Teclado {
	private static Scanner t = new Scanner(System.in);
	public static Scanner getInstance() {
		return t;
	}
	private Teclado() {
		
	}

}
