package _02ejemplos._04AtributoEstatico;

import java.util.Scanner;

/**
 * Clase para representar un instante de tiempo del dia, con precisión de
 * segundos (hora, minuto y segundos)
 * 
 */
public class Tiempo implements Comparable <Tiempo>{
	// Atributos: Los atributos son información que tienen cada uno de los objetos
	// pertenecientes a una clase.
	private int hora;
	private int minuto;
	private int segundo;
	private static char separador = ':'; //Este atributo es compartido por todos los objetos
	//de la clase

	// Metodos de la clase

	// Métodos constructores:
	// - Se ejecutan al crear un objeto.
	// - Puede haber varios constructores si quiero que los objetos de la clase se
	// puedan
	// crear de varias formas
	// - El constructor es un metodo que tiene el mismo nombre que la clase, no
	// devuelve nada
	// PERO no se pone la palabra "void" en su cabecera

	/**
	 * Crea un objeto Tiempo dados una hora, un minuto y un segundo
	 * 
	 * @param hora    la hora
	 * @param minuto  el minuto
	 * @param segundo el segundo
	 */
	public Tiempo(int hora, int minuto, int segundo) {
		// Desde el constructor puedo llamar a los setter
		this.setHora(hora);
		this.setMinuto(minuto);
		this.setSegundo(segundo);
	}

	/**
	 * Crea un objeto Tiempo dados los segundos transcurridos desde las 00:00:00
	 * 
	 * @param segundosTranscurridos
	 */

	public Tiempo(int segundosTranscurridos) {
		int h = segundosTranscurridos / 3600;
		int m = (segundosTranscurridos % 3600) / 60;
		int s = segundosTranscurridos % 60;
		this.setHora(h);
		this.setMinuto(m);
		this.setSegundo(s);
	}

	/**
	 * Crea un objeto Tiempo a partir de un String con formato hh:mm:ss Si el
	 * formato no es correcto se producirá excepcion. Si la hora, minuto o segundo
	 * no son correctos, se producirá excepcion
	 * 
	 * @param s el String
	 */
	public Tiempo(String s) {
		int pos1 = s.indexOf(":");
		int pos2 = s.lastIndexOf(":");
		int h = Integer.parseInt(s.substring(0, pos1));
		int m = Integer.parseInt(s.substring(pos1 + 1, pos2));
		int sg = Integer.parseInt(s.substring(pos2 + 1));
		setHora(h);
		setMinuto(m);
		setSegundo(sg);
	}

	/*
	 * Devuelve un String representativo del objeto
	 */
	public String toString() {
		// return hora + ":" + minuto + ":" + segundo;
		// System.out.format("%02d:%02d:%02d", hora,minuto,segundo);
		return String.format("%02d%c%02d%c%02d", hora, separador, minuto, separador,segundo);
	}

	// Metodos getter
	public int getHora() {
		return this.hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	// Métodos setter
	public void setHora(int hora) {
		if (hora < 0 || hora > 23)
			throw new IllegalArgumentException();
		this.hora = hora; // El uso de this es necesario
	}

	public void setMinuto(int m) {
		if (m < 0 || m > 59)
			throw new IllegalArgumentException();
		this.minuto = m; // El uso de this NO es necesario
	}

	public void setSegundo(int s) {
		if (s < 0 || s > 59)
			throw new IllegalArgumentException();
		segundo = s; // El uso de this NO es necesario
	}

	// Metodo equals
	public boolean equals(Object o) {
		// Hay que comparar la hora, minuto y segundo de this con la hora, minuto y
		// segundo de o

		// Si this y o son el mismo objeto (misma direccion de memoria), los objetos son
		// igualesString
		if (this == o)
			return true;

		// Si o no es de tipo Tiempo, los objetos no serán iguales
		if (!(o instanceof Tiempo))
			return false;

		// Comparamos hora minuto y segundo
//		if(this.hora == ((Tiempo)o).hora && this.minuto == ((Tiempo)o).minuto && this.segundo == ((Tiempo)o).segundo) return true;
//		else return false;
		Tiempo t = (Tiempo) o;
		if (this.hora == t.hora && this.minuto == t.minuto && this.segundo == t.segundo)
			return true;
		else
			return false;
		// return (this.hora == t.hora && this.minuto == t.minuto && this.segundo ==
		// t.segundo)

	}
	public int compareTo(Tiempo t) {
		if(this.hora < t.hora) return -1;
		else if(this.hora > t.hora) return 1;
		else if(this.minuto < t.minuto) return -1;
		else if(this.minuto > t.minuto) return 1;
		else if(this.segundo < t.segundo) return -1;
		else if(this.segundo > t.segundo) return 1;
		else return 0;
	}
	//De otra forma
	public int compareTo2(Tiempo t) {
		if(this.hora != t.hora) return this.hora - t.hora;
		else if(this.minuto != t.minuto) return this.minuto - t.minuto;
		else return this.segundo - t.segundo;
	}
	public int compareTo3(Tiempo t) {
		int n1 = this.hora * 3600 * this.minuto * 60 + this.segundo;
		int n2 = t.hora * 3600 * t.minuto * 60 + t.segundo;
		return n1-n2;
	}
	
	public static Tiempo leerTiempo() {
		Scanner tec = Teclado.getInstance();
		System.out.println("Hora: ");
		int h = tec.nextInt();
		System.out.println("Minuto: ");
		int m = tec.nextInt();
		System.out.println("Segundo: ");
		int s = tec.nextInt();
		return new Tiempo(h,m,s);
	}
}
