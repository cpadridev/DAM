package _02ejemplos._01tiempo;

public class Test {
	public static void main(String[] args) {
		Tiempo entrada = new Tiempo();
		entrada.hora = 7;
		entrada.minuto = 55;
		entrada.segundo = 0;
		
		Tiempo salida = new Tiempo();
		salida.hora = 14;
		salida.minuto = 50;
		salida.segundo = 0;
		
		System.out.println("Entrada: " + entrada);
		System.out.println("Salida: " + salida);
		
		//equivale a 
		System.out.println("Entrada: " + entrada.toString());
		System.out.println("Salida: " + salida.toString());
		
		
		System.out.println("Entrada " + entrada.pepe());
		
		//Usamos un objeto como si fuera un String
		
		String periodo1 = entrada + " - " + salida;
		String periodo2 = entrada.toString() + " - " + salida.toString();
		System.out.println(periodo1);
		System.out.println(periodo2);
		
	}
}
