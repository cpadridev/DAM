package _03ejercicios;

public class _15Notas {
	public static void main(String[] args) {
		int[][] notas = { { 8, 8, 8, 8 }, { 4, 8, 2, 9 }, { 9, 7, 8, 6 }, { 5, 5, 5, 5 }, { 6, 2, 8, 5 } };

		System.out.println("Imprimir las notas alumno por alumno");
		mostrarPorAlumno(notas);

		System.out.println("Imprimir las notas asignatura por asignatura");
		mostrarPorAsignaturas(notas);

		System.out.println("Imprimir la media de cada alumno");
		mediasPorAlumno(notas);
		
		System.out.println("Imprimir la media de cada asignatura");
		mediasPorAsignatura(notas);
		
		System.out.println("Indicar cual es la asignatura más fácil");
		
		
		System.out.println("¿Hay algún alumno que suspenda todas las asignaturas?");
		
		
		System.out.println("¿Hay alguna asignatura que suspendan todos los alumnos?");
	}

	public static void mostrarPorAlumno(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println("Alumno " + (i + 1) + ": ");

			for (int j = 0; j < n[i].length; j++) {
				System.out.println("Asignatura " + (j + 1) + ": " + n[i][j]);
			}
		}
	}

	public static void mostrarPorAsignaturas(int[][] n) {
		for (int i = 0; i < n[i].length; i++) {
			System.out.println("Asignatura " + (i + 1) + ": ");

			for (int j = 0; j < n.length; j++) {
				System.out.println("Alumno " + (j + 1) + ": " + n[j][i]);
			}
		}
	}
	
	public static void mediasPorAlumno(int[][] n) {
		double media = 0, suma = 0;
		
		for (int i = 0; i < n.length; i++) {
			System.out.println("Alumno " + (i + 1) + ": ");

			for (int j = 0; j < n[i].length; j++) {
				suma += n[i][j];
			}
			
			media = suma / n[i].length;
			
			System.out.println("Media: " + media);
			
			media = 0;
			suma = 0;
		}
	}
	
	public static void mediasPorAsignatura(int[][] n) {
		double media = 0, suma = 0;
		
		for (int i = 0; i < n[i].length; i++) {
			System.out.println("Asignatura " + (i + 1) + ": ");

			for (int j = 0; j < n.length; j++) {
				suma += n[j][i];
			}
			
			media = suma / n.length;
			
			System.out.println("Media: " + media);
			
			media = 0;
			suma = 0;
		}
	}
}
