package _02ejemplos._02tiempo;

/**
 * La versión 1 tiene un problema: no tenemos control
 * sobre que valores toman los atributos
 *
 */
public class Test {
	public static void main(String[] args) {
		Tiempo entrada = new Tiempo(7,55,0);
		System.out.println(entrada);
		
		Tiempo prueba = new Tiempo(3661);
		System.out.println(prueba);
		
		//entrada.hora = entrada.hora + 1;
		entrada.setHora(entrada.getHora() + 1);

		System.out.println(entrada);

		//Esta instrucción provocará una excepción
		entrada.setHora(18938);
		

		
	
		
	}
}
