package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _15PropagarComprobada {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		
		String nombreFichero = "";
		do {
			System.out.println("Nombre de fichero");
			nombreFichero = tec.nextLine();
			if (!nombreFichero.equals("")) {
				System.out.println("Vamos a sumar los numeros de " + nombreFichero);
				try {
					int suma = sumarFichero(nombreFichero);
					System.out.println("Suma: " + suma);
				} catch (FileNotFoundException e) {
					System.out.println("El nombre del fichero es incorrecto");
					System.out.println("Vuelve a introducirlo");
				}
			}
		}  while (!nombreFichero.equals(""));
	}
	public static int sumarFichero(String nombreFichero) throws FileNotFoundException {
		Scanner f = null;
		int suma = 0;
		try {
			f = new Scanner(new File(nombreFichero));
			while(f.hasNextInt()) {
				int numero = f.nextInt();
				suma += numero;
			}
		}  finally {
			if(f != null) f.close();
		}
		return suma;
	}
	
}
