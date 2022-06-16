package _03ejercicios;

public class _01ValidarFecha {
	public static void main(String[] args) {
		System.out.println(esFechaValida("10/1/2000"));
		System.out.println(esFechaValida("10/14/2000"));
		System.out.println(esFechaValida("10 1 2000"));
		System.out.println(esFechaValida("10/1-2000"));
		System.out.println(esFechaValida("10-1/2000"));
		System.out.println(esFechaValida("10/ene/2000"));
		System.out.println(esFechaValida("10-1-2000"));

	}

	public static boolean esFechaValida(String fecha) {
		boolean valida;
		// Separamos dia mes y anyo
		int barra1 = fecha.indexOf('/');
		int barra2 = fecha.lastIndexOf('/');

		try {
			String sDia = fecha.substring(0, barra1);
			String sMes = fecha.substring(barra1 + 1, barra2);
			String sAnyo = fecha.substring(barra2 + 1);

			// Convertimos en numeros
			int dia = Integer.parseInt(sDia);
			int mes = Integer.parseInt(sMes);
			int anyo = Integer.parseInt(sAnyo);

			// Validamos
			if (dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && anyo >= 1) {
				valida = true;
			} else {
				valida = false;
			}
//		} catch (StringIndexOutOfBoundsException e) {
//			valida = false;
//		} catch (NumberFormatException e) { 
//			valida = false;
//		} 
		} catch (StringIndexOutOfBoundsException | NumberFormatException  e) {
			valida = false;
		}
		
		return valida;
	}
}
