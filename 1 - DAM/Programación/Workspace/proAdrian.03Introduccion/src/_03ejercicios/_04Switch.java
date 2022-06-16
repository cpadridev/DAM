package _03ejercicios;

public class _04Switch {
	public static void main(String[] args) {
		System.out.println(nombreMes(4));
		System.out.println(estacionDelAnyo(4));
		System.out.println(numeroDiaSemana("lunes"));
		System.out.println(nombreDiaSemana(6));
		System.out.println(diasDelMes(12));
		System.out.println(diasDelMes(2, 2000));
	}

	public static String nombreMes(int mes) {
		String resultado = "";
		switch (mes) {
		case 1:
			resultado = "enero";
			break;
		case 2:
			resultado = "febrero";
			break;
		case 3:
			resultado = "marzo";
			break;
		case 4:
			resultado = "abril";
			break;
		case 5:
			resultado = "mayo";
			break;
		case 6:
			resultado = "junio";
			break;
		case 7:
			resultado = "julio";
			break;
		case 8:
			resultado = "agosto";
			break;
		case 9:
			resultado = "septiembre";
			break;
		case 10:
			resultado = "octubre";
			break;
		case 11:
			resultado = "noviembre";
			break;
		case 12:
			resultado = "diciembre";
			break;
		}

		return resultado;
	}

	public static String estacionDelAnyo(int mes) {
		String resultado = "";
		switch (mes) {
		case 1:
		case 2:
		case 3:
			resultado = "invierno";
			break;
		case 4:
		case 5:
		case 6:
			resultado = "primavera";
			break;
		case 7:
		case 8:
		case 9:
			resultado = "verano";
			break;
		case 10:
		case 11:
		case 12:
			resultado = "otoño";
			break;

		}

		return resultado;
	}

	public static int numeroDiaSemana(String dia) {
		int resultado = 0;
		switch (dia.toLowerCase()) {
		case "lunes":
			resultado = 1;
			break;
		case "martes":
			resultado = 2;
			break;
		case "miercoles":
			resultado = 3;
			break;
		case "jueves":
			resultado = 4;
			break;
		case "viernes":
			resultado = 5;
			break;
		case "sabado":
			resultado = 6;
			break;
		case "domingo":
			resultado = 7;
			break;
		}

		return resultado;
	}

	public static String nombreDiaSemana(int dia) {
		String resultado = "";
		switch (dia) {
		case 1:
			resultado = "lunes";
			break;
		case 2:
			resultado = "martes";
			break;
		case 3:
			resultado = "miercoles";
			break;
		case 4:
			resultado = "jueves";
			break;
		case 5:
			resultado = "viernes";
			break;
		case 6:
			resultado = "sabado";
			break;
		case 7:
			resultado = "domingo";
			break;
		}

		return resultado;
	}

	public static int diasDelMes(int mes) {
		int resultado = 0;
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			resultado = 30;
			break;
		case 2:
			resultado = 28;
			break;
		default:
			resultado = 31;
		}

		return resultado;
	}

	public static int diasDelMes(int mes, int anyo) {
		int resultado = 0;
		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			resultado = 30;
			break;
		case 2:
			if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 400 == 0) {
				resultado = 29;
			} else {
				resultado = 28;
			}
			break;
		default:
			resultado = 31;
		}

		return resultado;
	}
}
