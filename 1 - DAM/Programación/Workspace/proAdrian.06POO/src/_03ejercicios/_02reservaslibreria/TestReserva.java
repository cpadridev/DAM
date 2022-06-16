package _03ejercicios._02reservaslibreria;

import java.util.Scanner;

public class TestReserva {
	static Scanner tec = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce datos reserva: ");
		Reserva r1 = leerReserva();
		Reserva r2;
		do{
			System.out.println("Introduce datos reserva: ");
			r2 = leerReserva();
			if(r1.equals(r2)){
				System.out.println("ERROR: Reserva duplicada");
			}
		} while ( r1.equals(r2));
//	    } while (r1.compareTo(r2) == 0); //También sería válido
		
		//Incrementar numero de ejemplares de las reservas
		r1.setEjemplares(r1.getEjemplares() + 1);
		r2.setEjemplares(r2.getEjemplares() + 1);
		
		//Mostrar las reservas en orden
		if(r1.compareTo(r2) < 0){
			System.out.println(r1);
			System.out.println(r2);
		} else {
			System.out.println(r2);
			System.out.println(r1);
		}
	}
	public static Reserva leerReserva(){
		System.out.print("NIF: ");
		String nif = tec.nextLine();
		
		System.out.print("Nombre: ");
		String nombre = tec.nextLine();
		
		System.out.print("Telefono: ");
		String tel = tec.next();
		
		System.out.print("Codigo libro: ");
		int codigo = tec.nextInt();
		
		System.out.print("Ejemplares: ");
		int ejemplares = tec.nextInt(); tec.nextLine();
		
		return new Reserva(nif,nombre,tel,codigo,ejemplares);
		
	}

}
