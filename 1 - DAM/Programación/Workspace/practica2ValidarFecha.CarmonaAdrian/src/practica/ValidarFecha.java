package practica;

import java.util.Scanner;

import utiles.Fechas;

/**
 * Clase de programa que hara uso de la clase de utilidad Fechas para averigurar
 * si una fecha que introduce el usuario es correcta o no.
 * 
 * @author Adrian Carmona Pena
 *
 */
public class ValidarFecha {
	// Definimos el objeto Scanner tec fuera de los metodos. Al hacerlo asi
	// podemos usar tec tanto en el metodo main como en el resto de metodos.
	static Scanner tec = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;

		do {
			System.out.println("Introduce una opcion: ");
			System.out.println("0. Cancelar");
			System.out.println("1. Validar una fecha.");
			System.out.println("2. Comparar dos fechas");
			System.out.println("3. Diferencia entre fechas");

			opcion = elegirOpcionMenu();

			System.out.println("");

			switch (opcion) {
			case 0:
				System.out.println("Fin del programa");
				break;
			case 1:
				opcion1();
				break;
			case 2:
				opcion2();
				break;
			case 3:
				opcion3();
				break;
			}
		} while (opcion != 0); // Cuando es 0 termina el bucle.
	}

	/**
	 * Muestra el menu descrito en el enunciado y permite al usuario elegir una
	 * opcion. Si el usuario pone una opcion incorrecta, le avisa y le deja volver a
	 * seleccionar una opcion.
	 * 
	 * @return la opcion elegida por el usuario: 0, 1, 2, ....
	 */
	public static int elegirOpcionMenu() {
		// Bucle que muestre el menu y lea la opcion que elija el usuario.
		// El bucle se repetira mientras que el usuario elija una opcion incorrecta.
		int opcion;

		do {
			opcion = tec.nextInt();
			tec.nextLine();
		} while (opcion != 0 && opcion != 1 && opcion != 2 && opcion != 3);

		return opcion;
	}

	// Metodo para responder a la opcion 1 del menu. Lee una fecha y le dice al
	// usuario si es correcta o incorrecta.
	public static void opcion1() {
		int dia, mes, ano;

		// Pedir y Leer una fecha como String.
		System.out.println("Fecha (dd/mm/aaaa): ");
		String fecha = tec.nextLine();

		// Descompomner la fecha en dia, mes y ano.
		dia = Fechas.extraerDia(fecha);
		mes = Fechas.extraerMes(fecha);
		ano = Fechas.extraerAno(fecha);

		// Comprobar si es valida y mostrar el mensaje correspondiente.
		System.out.println("");

		if (Fechas.esFechaValida(dia, mes, ano)) {
			System.out.println(dia + " de " + Fechas.nombreDelMes(mes) + " de " + ano + ": Fecha correcta");
		} else {
			System.out.println("Dia: " + dia + ", Mes: " + mes + ", Ano: " + ano + ": Fecha incorrecta");
		}

		System.out.println("");
	}

	public static void opcion2() {
		int d1, m1, a1, d2, m2, a2;

		// Bucle que lea la primera fecha mientras el usuario introduzca una fecha
		// incorrecta.
		do {
			System.out.println("Fecha 1 (dd/mm/aaaa): ");
			String fecha1 = tec.nextLine();

			d1 = Fechas.extraerDia(fecha1);
			m1 = Fechas.extraerMes(fecha1);
			a1 = Fechas.extraerAno(fecha1);
		} while (!(Fechas.esFechaValida(d1, m1, a1)));

		// Bucle que lea la segunda fecha mientras el usuario introduzca una fecha
		// incorrecta.
		do {
			System.out.println("Fecha 2 (dd/mm/aaaa): ");
			String fecha2 = tec.nextLine();

			d2 = Fechas.extraerDia(fecha2);
			m2 = Fechas.extraerMes(fecha2);
			a2 = Fechas.extraerAno(fecha2);
		} while (!(Fechas.esFechaValida(d2, m2, a2)));

		// Comprobar cual es la menor, usando el me<todo Fechas.compararFechas y mostrar
		// el mensaje correspondiente.
		int comparar = Fechas.compararFechas(d1, m1, a1, d2, m2, a2);

		if (comparar == -1) {
			System.out.println("La menor fecha es: " + d1 + "/" + m1 + "/" + a1);
		} else if (comparar == 1) {
			System.out.println("La menor fecha es: " + d2 + "/" + m2 + "/" + a2);
		} else {
			System.out.println("Fechas iguales");
		}

		System.out.println("");
	}

	public static void opcion3() {
		int d1, m1, a1, d2, m2, a2, mes1 = 0, anyo1 = 0, mes2 = 0, anyo2 = 0;

		// Bucle que lee la primera fecha mientras el usuario introduzca una fecha
		// incorrecta.
		do {
			System.out.println("Fecha 1 (dd/mm/aaaa): ");
			String fecha1 = tec.nextLine();

			d1 = Fechas.extraerDia(fecha1);
			m1 = Fechas.extraerMes(fecha1);
			a1 = Fechas.extraerAno(fecha1);
		} while (!(Fechas.esFechaValida(d1, m1, a1)));

		// Bucle que lee la segunda fecha mientras el usuario introduzca una fecha
		// incorrecta.
		do {
			System.out.println("Fecha 2 (dd/mm/aaaa): ");
			String fecha2 = tec.nextLine();

			d2 = Fechas.extraerDia(fecha2);
			m2 = Fechas.extraerMes(fecha2);
			a2 = Fechas.extraerAno(fecha2);
		} while (!(Fechas.esFechaValida(d2, m2, a2)));

		// Pasamos meses y anos a dias.
		for (int i = 1; i <= m1; i++) {
			mes1 += Fechas.diasDelMes(i, a1);
		}
		for (int i = 1; i <= m2; i++) {
			mes2 += Fechas.diasDelMes(i, a2);
		}

		for (int i = 1; i < a1; i++) {
			if (Fechas.esBisiesto(i)) {
				anyo1 += 366;
			} else {
				anyo1 += 365;
			}
		}
		for (int i = 1; i < a2; i++) {
			if (Fechas.esBisiesto(i)) {
				anyo2 += 366;
			} else {
				anyo2 += 365;
			}
		}

		int dias = Math.abs(d1 - d2) + Math.abs(mes1 - mes2) + Math.abs(anyo1 - anyo2);

		if (mes1 != mes2) {
			dias += -1;
		}

		System.out.println("Hay " + dias + " dias de diferencia");
		System.out.println("");
	}
}
