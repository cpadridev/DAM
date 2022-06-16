package _03ejercicios._01conjunto;

import java.util.ArrayList;

public class Conjunto <T> implements Coleccion <T>{
	private ArrayList<T> lista;
	
	public Conjunto(ArrayList<T> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Conjunto [lista=" + lista + "]";
	}

	@Override
	public void agregar(T t) {
		if (!lista.contains(t)) {
			lista.add(t);
		}
	}

	@Override
	public void eliminar(T t) {
		if (lista.contains(t)) {
			lista.remove(t);
		}
	}

	@Override
	public boolean estaVacia() {
		if (lista.size() > 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public int talla() {
		return lista.size();
	}

	@Override
	public boolean contiene(T t) {
		if (lista.contains(t)) {
			return true;
		} else {
			return false;
		}
	}
}
