package _03ejercicios._02reservaslibreria;

public class Reserva implements Comparable<Reserva>{
	private String nif;
	private String nombre;
	private String telefono;
	private int codigo;
	private int ejemplares;
	
	//Constructores
	public Reserva (String nif, String nombre, String telefono, int codigo, int ejemplares){
		this.nif = nif;
		this.nombre = nombre;
		this.telefono = telefono;
		this.codigo = codigo;
		this.ejemplares = ejemplares;
	}
	public Reserva (String nif, String nombre, String telefono, int codigo){
//		this.nif = nif;
//		this.nombre = nombre;
//		this.telefono = telefono;
//		this.codigo = codigo;
//		this.ejemplares = 1;
		
		//this usado como método, llama a otro de los constructores de la clase
		this(nif, nombre, telefono, codigo,1);
	}
	
	public String getNif(){
		return this.nif;
	}
	public String getNombre(){
		return this.nombre;
	}
	public String getTelefono(){
		return this.telefono;
	}
	public int getCodigo(){
		return this.codigo;
	}
	public int getEjemplares(){
		return this.ejemplares;
	}
	
	public void setEjemplares(int ejemplares){
		this.ejemplares = ejemplares;
	}
	
	//equals
	public boolean equals(Object o){
		if (this == o) return true;
		if(!(o instanceof Reserva)) return false;
		
//		return this.nif.equals(((Reserva)o).nif) 
//				&& this.codigo == ((Reserva)o).codigo;
		
		Reserva r = (Reserva) o;
		return this.nif.equals(r.nif) && this.codigo == r.codigo;
	}

	public int compareTo(Reserva r) {
		if(this.codigo < r.codigo) return -1;
		else if(this.codigo > r.codigo) return 1;
		else { //this.codigo == r.codigo
			if(this.nif.compareTo(r.nif) < 0) return -1;
			else if(this.nif.compareTo(r.nif) > 0) return 1;
			return 0;
		}
	}

	public int compareToV2(Reserva r) {
		if(this.codigo < r.codigo) return -1;
		else if(this.codigo > r.codigo) return 1;
		else return this.nif.compareTo(r.nif);
	}
	
	public int compareToV3(Reserva r){
		if(this.codigo == r.codigo) return this.nif.compareTo(r.nif);
		else return this.codigo - r.codigo;
	}
	
	public String toString(){
		return String.format("Nif: %s\nNombre: %s \nTelefono: %s \nCodigo: %d \nEjemp: %d",
				nif,nombre,telefono,codigo,ejemplares);
	}

}