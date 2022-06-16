package _02ejemplos._01alumnos;

public class Test {
	public static void main(String[] args) {
		Alumno a = new Alumno("1","luis",1,"1SMR");
		a.setDni("3434k");
		a.setNombre("pepe");
		a.setNia(1);
		a.setGrupo("1DAM");
		a.dni = "";

		Persona p = new Persona("348484M", "Rosa");
		
		System.out.println("Persona p: " + p);
		System.out.println("Alumno a: " + a);
		
		if(a.equals(p)) {
			System.out.println("a y p son iguales");
		} else {
			System.out.println("a y p no son iguales");
		}
	}
}
