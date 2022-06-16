package _02ejemplos._01tiempo;

/**
 * Clase para representar un instante de tiempo del dia, con precisión de segundos 
 * (hora, minuto y segundos)
 * 
 */
public class Tiempo {
	//Atributos: Los atributos son información que tienen cada uno de los objetos
	//pertenecientes a una clase.
	int hora;
	int minuto;
	int segundo; 
	
	/*
	 * Devuelve un String representativo del objeto
	 */
	public String toString() {
		//return hora + ":" + minuto + ":" + segundo;
		//System.out.format("%02d:%02d:%02d", hora,minuto,segundo);
		return String.format("%02d:%02d:%02d", hora,minuto,segundo);
	}
	
	public String pepe() {
		return hora + " - " + minuto + " - " + segundo;
	}
	
}
