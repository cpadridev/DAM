package application5.model;

import java.util.Calendar;

public class Empleado {
	private String nombre;
	private String dni;
	private int ano;
	private double sueldo;

	// Getters.
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getAno() {
		return ano;
	}

	public double getSueldo() {
		return sueldo;
	}

	// Setters.
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setAno(int ano) {
		if (ano < 0) {
			throw new IllegalArgumentException("Se requiere un valor positivo: " + ano);
		}

		this.ano = ano;
	}

	public void setSueldo(double sueldo) {
		if (sueldo < 0) {
			throw new IllegalArgumentException("Se requiere un valor positivo: " + sueldo);
		}

		this.sueldo = sueldo;
	}

	// Constructor.
	public Empleado(String nombre, String dni, int ano, double sueldo) {
		this.nombre = nombre; // this.setNombre(nombre);
		this.dni = dni; // this.setDni(dni);
		this.setAno(ano);
		this.setSueldo(sueldo);
	}

	// Antiguedad.
	// Otros metodos.
	public int antiguedad() {
		int actual = Calendar.getInstance().get(Calendar.YEAR);
		int antig;
		
		if (actual > ano) {
			antig = actual - ano;
		} else {
			antig = 0;
		}
		
		return antig;
	}

	public void incrementarSueldo(double porcentaje) {
		sueldo = sueldo + sueldo * porcentaje / 100;
// 		setSueldo(sueldo + sueldo * porcentaje / 100);
	}

	public String toString() {
		return "Nombre: " + nombre + 
				"\nDNI: " + dni +
				"\nAno de ingreso: " + ano + 
				"\nSueldo bruto anual: " + sueldo;
// 		return String.format("Nombre: %s%nDNI: %s%nAno de ingreso: %d%nSueldo: %f", nombre,dni,ano,sueldo);
	}

//	public String toString() {
//		return  nombre + " - "  + dni + " - "  + ano + " - "  + sueldo;
//		
//		//return String.format("Nombre: %s%nDNI: %s%nAño de ingreso: %d%nSueldo: %f", nombre,dni,ano,sueldo);
//	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Empleado))
			return false;

//		Empleado e = (Empleado) o;
//		if (this.dni.equals(e.dni)) {
//			return true;
//		} else {
//			return false;
//		}
		return this.dni.equals(((Empleado) o).dni);
	}

	public int compareTo(Empleado e) {
		if (this.dni.compareTo(e.dni) < 0)
			return -1;
		else if (this.dni.compareTo(e.dni) > 0)
			return 1;
		else
			return 0;
// 		return this.dni.compareTo(e.dni);
	}

	public static double calcularIRPF(double salarioMensual) {
		double irpf;

		if (salarioMensual < 800)
			irpf = 3;
		else if (salarioMensual < 1000)
			irpf = 10;
		else if (salarioMensual < 1500)
			irpf = 15;
		else if (salarioMensual < 2100)
			irpf = 20;
		else
			irpf = 30;

		return irpf;
	}
}
