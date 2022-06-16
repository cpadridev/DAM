package _03ejercicios._02reservaslibreria;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ListaReservas {
	private ArrayList<Reserva> l;
	
	public ListaReservas(){
		l = new ArrayList<>();
	}
	
	public void reservar(String nif, String nombre, String telefono, int codigo, int ejemplares) throws IllegalArgumentException {
		Reserva r = new Reserva(nif,nombre,telefono,codigo,ejemplares);
		
		if(l.contains(r)){
			throw new IllegalArgumentException("Reserva duplicada");
		} else {
			l.add(r);
		}
	}
	public void cancelar (String nif, int codigo) throws NoSuchElementException {
		Reserva r = new Reserva (nif,"","",codigo,0);
		if(!l.remove(r)){
			throw new NoSuchElementException("La reserva no existe");
		}
		/* Menos eficiente, pero también funciona lo siguiente: 
		Reserva r = new Reserva (nif,"","",libro,0);
		if(l.contains(r)){
			l.remove(r);
		} else {
			throw new NoSuchElementException("La reserva no existe");
		}
		*/
		
	}
	//con for
	public String toString(){
		String result = "";
		for(int i = 0; i < l.size(); i++){
			result = result + l.get(i).toString()+ "\n------\n";
		}
		return result;
	}
	//con for-each
	public String toStringV2(){
		String result = "";
		for(Reserva r: l){
			result += r.toString()+ "\n------\n";
		}
		return result;
	}
	//con for	
	public int numEjemplaresReservadosLibro(int codigo){
		int cont = 0;
		for (int i = 0; i < l.size(); i++){
			Reserva r = l.get(i);
			if (r.getCodigo() == codigo){
				cont += r.getEjemplares();
			}
		}
		return cont;
	}
	//Con for-each
	public int numEjemplaresReservadosLibro2(int codigo){
		int cont = 0;
		for (Reserva r: l){
			if (r.getCodigo() == codigo){
				cont += r.getEjemplares();
				
			}
		}
		return cont;
	}
	public void reservasLibro(int codigo){
		for(Reserva r: l){
			if (r.getCodigo() == codigo){
				System.out.println(r.getNombre() + " - " + r.getTelefono());
			}
		}
	}

}
