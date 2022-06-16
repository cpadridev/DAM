package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _12LanzarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		boolean ok = false;
		do {
			try {
				System.out.println("Numero de mes: ");
				int mes = tec.nextInt();
				System.out.println("Dias del mes: " + diasDelMes(mes));
				ok = true;
//			} catch (InputMismatchException e) {
//				System.out.println("El mes debe ser un entero");
//				tec.nextLine();
			} catch (IllegalArgumentException e) {
				System.out.println("Mes incorrecto");
				System.out.println( e.getMessage() );
			}
		} while (!ok);
	}

	public static int diasDelMes(int mes) {
		int dias = 0;
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
		case 2:
			dias = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		default: 
			throw new IllegalArgumentException("Mes " + mes + " incorrecto");
			
		}
		return dias;
	}
}
