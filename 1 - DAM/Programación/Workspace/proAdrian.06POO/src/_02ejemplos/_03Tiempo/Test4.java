package _02ejemplos._03Tiempo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		ArrayList<Tiempo> horario = new ArrayList<>();
	
		Scanner tec = new Scanner(System.in);
		String s = "";
		do {
			System.out.println("hh:mm:ss");
			s = tec.nextLine();
			if(!s.equals("")) {
				Tiempo t = new Tiempo(s);
				//Lo añadimos al horario si no está repetido
				if(!horario.contains(t)) {
					horario.add(t);
				}
			}
		} while (!s.equals(""));
		
		System.out.println(horario);
		
		Collections.sort(horario);
		System.out.println(horario);
	}

}
