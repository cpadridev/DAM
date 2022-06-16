package _03ejercicios._07gestorcorreo;

public class Test {
	public static void main(String[] args) {
		Carpeta recibidos = new Carpeta("recibidos");
		Carpeta eliminados = new Carpeta("eliminados");
		
		recibidos.anyadir(new Mensaje("yo@ies.es","el@ies.es","saludo","hola"));
		recibidos.anyadir(new Mensaje("yo@ies.es","el@ies.es","despedida","adios"));
		System.out.println(recibidos);
		System.out.println("----------------");
		
		Carpeta.moverMensaje(recibidos, eliminados, 1);
		System.out.println(recibidos);
		System.out.println("----------------");
		System.out.println(eliminados);
		System.out.println("----------------");
	}
	
}
