package _03ejercicios._07gestorcorreo;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Carpeta {
	private String nombre;
	private ArrayList <Mensaje> lista ;
	
	public Carpeta (String nombre) {
		this.nombre = nombre;
		this.lista = new ArrayList<>();
	}
	
	public void anyadir(Mensaje m) {
		this.lista.add(m);
	}
	
	public void borrar(Mensaje m) {
		if(!lista.remove(m)) {
			throw new NoSuchElementException("El mensaje no esta en la carpeta");
		}
	}
	public void borrar2 (Mensaje m) {
		if(!lista.contains(m)) {
			throw new NoSuchElementException("El mensaje no esta en la carpeta");
		} else {
			lista.remove(m);
		}
	}
	
	public Mensaje buscar (int codigo) {
		//Recorre la lista de mensajes
		for(Mensaje m: lista) {
			if(m.getCodigo() == codigo) {
				return m;
			}
		}
		return null;
	}
	public Mensaje buscar2 (int codigo) {
		//Recorre la lista de mensajes
		for(int i = 0; i < lista.size(); i++) {
			Mensaje m = lista.get(i);
			if(m.getCodigo() == codigo) {
				return m;
			}
		}
		return null;
	}
	
	
	public static void moverMensaje(Carpeta origen, Carpeta destino, int codigo) {
		Mensaje m = origen.buscar(codigo);
		if(m != null) {
			origen.borrar(m);
			destino.anyadir(m);
		}
	}
	
	public String toString () {
		String result = "Carpeta: " + nombre;
		for (Mensaje mensaje : lista) {
			result += "\n-------\n" + mensaje.toString();
		}
		return result;
	}
	
}









