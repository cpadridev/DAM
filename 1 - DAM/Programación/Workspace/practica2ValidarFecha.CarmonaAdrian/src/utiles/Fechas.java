package utiles;

/**
 * Esta es una clase de utilidad, con metodos static. Se trata de metodos utiles
 * para trabajar con fechas.
 * 
 * @author Adrián Carmona Peña
 *
 */
public class Fechas {

	/**
	 * Determina si un ano es o no bisiesto.
	 * 
	 * @param ano el ano.
	 * @return true si el ano es bisiesto y false en caso contrario.
	 */
	public static boolean esBisiesto(int ano) {
		return (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0);
	}

	/**
	 * Devuelve el numero de dias que tiene un mes de determinado anyo. El ano es
	 * necesario porque el mes de febrero puede tener un numero distinto de dias
	 * dependiendo de si el ano es o no bisiesto.
	 * 
	 * @param mes El mes. Estara entre 1 y 12.
	 * @param ano El ano. Valor positivo.
	 * @return el numero de dias que tiene el mes.
	 */
	public static int diasDelMes(int mes, int ano) {
		// Llama al metodo esBisiesto cuando el mes sea febrero, para averiguar el
		// numero de dias.
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 2:
			if (esBisiesto(ano)) {
				return 29;
			} else {
				return 28;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			break;
		}
		return 0;
	}

	/**
	 * Devuelve el nombre de un mes: "Enero", "Febrero", ...
	 * 
	 * @param mes El mes del que se pide el nombre. Estara entre 1 y 12
	 * @return el nombre del mes correspondiente.
	 */
	public static String nombreDelMes(int mes) {
		switch (mes) {
		case 1:
			return "Enero";
		case 2:
			return "Febrero";
		case 3:
			return "Marzo";
		case 4:
			return "Abril";
		case 5:
			return "Mayo";
		case 6:
			return "Junio";
		case 7:
			return "Julio";
		case 8:
			return "Agosto";
		case 9:
			return "Septiemnre";
		case 10:
			return "Octubre";
		case 11:
			return "Noviembre";
		case 12:
			return "Diciembre";
		default:
			break;
		}
		return "";
	}

	/**
	 * Dado un String que contiene una fecha en formato dd/mm/aaaa devuelve un
	 * entero con el dia de la fecha.
	 * 
	 * @param fecha String con formato dd/mm/aaaa. La longitud del string no tiene
	 *              por que ser 10, pues el dia y el mes se pueden expresar con uno
	 *              o dos digitos.
	 * @return el dia de la fecha.
	 */
	public static int extraerDia(String fecha) {
		return Integer.parseInt(fecha.substring(0, 2));
	}

	/**
	 * Dado un String que contiene una fecha en formato dd/mm/aaaa devuelve un
	 * entero con el mes de la fecha.
	 * 
	 * @return el mes de la fecha.
	 */
	public static int extraerMes(String fecha) {
		return Integer.parseInt(fecha.substring(3, 5));
	}

	/**
	 * Dado un String que contiene una fecha en formato dd/mm/aaaa devuelve un
	 * entero con el ano de la fecha.
	 * 
	 * @param fecha String con formato dd/mm/aaaa. La longitud del string no tiene
	 *              por que ser 10, pues el dia y el mes se pueden expresar con uno
	 *              o dos digitos.
	 * @return el ano de la fecha.
	 */
	public static int extraerAno(String fecha) {
		return Integer.parseInt(fecha.substring(6, fecha.length() - 1));
	}

	/**
	 * Dada una fecha expresada con tres valores (dia, mes y ano), devuelve si la
	 * fecha es valida o no. Para que una fecha sea correcta: - El dia tiene que ser
	 * mayor que cero. - El dia tiene que ser menor o igual que el numero de dias
	 * que tiene el mes. - El mes tiene que estar entre 1 y 12. - El ano tiene que
	 * ser positivo.
	 * 
	 * @param dia  El dia de la fecha.
	 * @param mes  El mes de la fecha.
	 * @param anyo El ano de la fecha.
	 * @return true si la fecha es válida y false si no lo es.
	 */
	public static boolean esFechaValida(int dia, int mes, int ano) {
		// Este metodo llama a diasDelMes para averiguar cuantos
		// dias tiene el mes de la fecha que nos dan y así comprobar
		// si el dia es correcto o no.
		if (dia <= diasDelMes(mes, ano) && dia >= 1 && mes >= 1 && mes <= 12 && ano > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Compara dos fechas para averiguar cual de ellas es la menor. Cada fecha
	 * vendra expresada por tres valores (dia, mes y ano).
	 * 
	 * @param d1 Dia de la primera fecha.
	 * @param m1 Mes de la primera fecha.
	 * @param a1 Ano de la primera fecha.
	 * @param d2 Dia de la segunda fecha.
	 * @param m2 Mes de la segunda fecha.
	 * @param a2 Ano de la segunda fecha.
	 * 
	 *           -1 si la primera fecha es menor (anterior) que la segunda. 0 si las
	 *           dos fechas son iguales. +1 si la primera fecha es mayor (posterior)
	 *           que la segunda.
	 */
	public static int compararFechas(int d1, int m1, int a1, int d2, int m2, int a2) {
		int num1 = a1 * 365 + m1 * 30 + d1;
		int num2 = a2 * 365 + m2 * 30 + d2;

		if (num1 < num2)
			return -1;
		else if (num2 < num1)
			return 1;
		else
			return 0;
	}
}
