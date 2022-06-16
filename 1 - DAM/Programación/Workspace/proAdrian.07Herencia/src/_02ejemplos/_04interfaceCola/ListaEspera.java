package _02ejemplos._04interfaceCola;

import java.util.ArrayList;

import _02ejemplos._01alumnos.Persona;

public class ListaEspera implements Cola {
	private ArrayList<Persona> lista;
	
	public ListaEspera() {
		lista = new ArrayList<Persona>();
	}

	
	public void encolar(Object o) {
		//lista.add(o);
		lista.add((Persona)o);
	}

	@Override
	public Object desencolar() {
		Persona p = lista.get(0);
		lista.remove(0);
		return p;
		//return lista.remove(0);
	}

	@Override
	public int getTamanyo() {
		return lista.size();
	}

}
