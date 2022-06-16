package _03ejercicios;

import java.util.Scanner;

public class _21Comercio {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		System.out.println("Importe comprado: ");
		double comprado = tec.nextInt();

		double porcentajeDescuento = 0, descuento = 0;

		if (comprado > 40) {
			porcentajeDescuento = 8;
			descuento = comprado * porcentajeDescuento / 100;
			if (descuento > 12) {
				descuento = 12;
			}
		}

		System.out.println("Porcentaje descuento aplicado: " + porcentajeDescuento);
		System.out.println("Descuento aplicado: " + descuento);
		System.out.println("Cantidad a pagar: " + (comprado - descuento));
	}
}
