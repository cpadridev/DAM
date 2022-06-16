package _02ejemplos._02tiempo;

/**
 * Clase para representar un instante de tiempo del dia, con precisión de segundos 
 * (hora, minuto y segundos)
 * 
 */
public class Tiempo {
	//Atributos: Los atributos son información que tienen cada uno de los objetos
	//pertenecientes a una clase.
	private int hora;
	private int minuto;
	private int segundo;
	
	//Metodos de la clase
	
	//Métodos constructores: 
	// - Se ejecutan al crear un objeto.
	// - Puede haber varios constructores si quiero que los objetos de la clase se puedan
	//   crear de varias formas
	// - El constructor es un metodo que tiene el mismo nombre que la clase, no devuelve nada
	//   PERO no se pone la palabra "void" en su cabecera
	
	/**
	 * Crea un objeto Tiempo dados una hora, un minuto y un segundo
	 * @param hora la hora
	 * @param minuto el minuto
	 * @param segundo el segundo
	 */
	public Tiempo(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	/**
	 * Crea un objeto Tiempo dados los segundos transcurridos desde las 00:00:00
	 * @param segundosTranscurridos
	 */
	
	public Tiempo (int segundosTranscurridos) {
		this.hora = segundosTranscurridos / 3600;
		this.minuto = (segundosTranscurridos % 3600) / 60;
		this.segundo = segundosTranscurridos % 60;
	}
	
	
	/*
	 * Devuelve un String representativo del objeto
	 */
	public String toString() {
		//return hora + ":" + minuto + ":" + segundo;
		//System.out.format("%02d:%02d:%02d", hora,minuto,segundo);
		return String.format("%02d:%02d:%02d", hora,minuto,segundo);
	}
	
	//Metodos getter
	public int getHora() {
		return this.hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public int getSegundo() {
		return segundo;
	}
	
	
	//Métodos setter
	public void setHora(int hora) {
		if(hora < 0 || hora > 23) throw new IllegalArgumentException();
		this.hora = hora; //El uso de this es necesario 
	}
	public void setMinuto(int m) {
		if(m < 0 || m > 59) throw new IllegalArgumentException();
		this.minuto = m; //El uso de this NO es necesario
	}
	public void setSegundo(int s) {
		if(s < 0 || s > 59) throw new IllegalArgumentException();
		segundo = s; //El uso de this NO es necesario
	}

}
