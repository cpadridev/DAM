package examen;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		double porcentaje;
		double temperaturaAdecuada = 0;
		boolean adecuada = false;
		boolean menor = false;
		boolean mayor = false;

		System.out.print("Temperatura: ");
		double temperatura = tec.nextDouble();
		tec.nextLine();
		System.out.print("Invierno o verano?: ");
		String estacion = tec.nextLine().toUpperCase();

		switch (estacion) {
		case "INVIERNO":
			System.out.print("Dia o noche?: ");
			String hora = tec.nextLine().toUpperCase();

			switch (hora) {
			case "DIA":
				if (temperatura <= 21) {
					adecuada = true;
				} else {
					mayor = true;
					temperaturaAdecuada = 21;
				}
				break;
			case "NOCHE":
				if (temperatura <= 17) {
					adecuada = true;
				} else {
					mayor = true;
					temperaturaAdecuada = 17;
				}
				break;
			default:
				System.out.println("Datos incorrectos");
				break;
			}
			break;
		case "VERANO":
			if (temperatura >= 25) {
				adecuada = true;
			} else {
				menor = true;
			}
			break;
		default:
			System.out.println("Datos incorrectos");
			break;
		}

		if (menor) {
			temperatura = 25 - temperatura;
			porcentaje = temperatura * 3;
			System.out.printf(
					"La temperatura es demasiado baja. Subala %.2f grados. Con ello ahorrara un %.2f por ciento en su factura",
					temperatura, porcentaje);
		} else if (mayor) {
			temperatura = temperatura - temperaturaAdecuada;
			porcentaje = temperatura * 3;
			System.out.printf(
					"La temperatura es demasiado alta. Bajela %.2f grados. Con ello ahorrara un %.2f por ciento en su factura",
					temperatura, porcentaje);
		} else if (adecuada) {
			System.out.println("La temperatura es adecuada");
		}

		tec.close();
	}
}
