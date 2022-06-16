package _02ejemplos._01alumnos;

public class Alumno extends Persona {
	private int nia;
	private String grupo;
	
	public Alumno(String dni, String nombre, int nia, String grupo) {
		super(dni,nombre);
		this.nia = nia;
		this.grupo = grupo;
	}
	

	public int getNia() {
		return nia;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setNia(int nia) {
		this.nia = nia;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	public String toString() {
		//Reescritura total
		return dni + " - " + getNombre() + " - " + nia + " - " + grupo ;
		//Reescritura parcial
		//return super.toString() + " - " + nia + " - " + grupo;
	}
}
