package ejercicio4;

public class DarFormacion {
	public static void main(String[] args) {
		Persona[] v = { 
				new Desempleado(), 
				new EstudianteCCFF(), 
				new EstudianteCCFF(), 
				new EstudianteCCFF(),
				new Desempleado(), 
				new Desempleado(), 
				new EstudianteCCFF(), 
				new Desempleado(), 
				new Desempleado(),
				new EstudianteCCFF() 
				};

		darFormacion(v);
	}

	// Añadir aquí el método darFormacion que se pide en el enunciado y llamalo
	// desde el main.
	public static void darFormacion(Persona[] v) {
		for (int i = 0; i < v.length; i++) {
			((Formable) v[i]).formar(100);
		}
	}
}
