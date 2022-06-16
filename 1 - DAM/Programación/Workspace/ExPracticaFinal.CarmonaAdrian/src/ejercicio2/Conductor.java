package ejercicio2;

public class Conductor {
	private String nombre;
	private int edad;
	private int anoCarnet;

	public Conductor(String n, int e, int a) {
		nombre = n;
		edad = e;
		anoCarnet = a;
	}

	public String toString() {
		return nombre + " - " + edad + " anyos - Carnet de " + anoCarnet;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAnoCarnet() {
		return anoCarnet;
	}

	public void setAnoCarnet(int anoCarnet) {
		this.anoCarnet = anoCarnet;
	}
}
