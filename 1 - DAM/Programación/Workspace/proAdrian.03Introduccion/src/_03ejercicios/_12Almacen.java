package _03ejercicios;

import java.util.Scanner;

public class _12Almacen {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		int pedido, stock = 500;

		do {
			System.out.println("Introduce el pedido: ");
			pedido = tec.nextInt();

			if (pedido == 0) {
				break;
			}

			if (pedido > stock) {
				System.out.println("Stock insuficiente: ");
			}

			stock -= pedido;

			if (stock < 100) {
				stock = 500 - stock;
				System.out.println("Rebasado stock mínimo. Se compra " + stock + " unidades.");
				stock = 500;
			} else {
				System.out.println("Pedido servido.");
				System.out.println("Queda en el almacén: " + stock);
			}
		} while (pedido != 0);

		System.out.println("Fin del programa");
	}
}
