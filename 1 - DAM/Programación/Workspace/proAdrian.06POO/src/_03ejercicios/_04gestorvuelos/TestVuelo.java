package _03ejercicios._04gestorvuelos;

import _02ejemplos._03Tiempo.Tiempo;

public class TestVuelo {
	public static void main(String[] args) {
		Vuelo v = new Vuelo("IB101","Valencia","Madrid", new Tiempo(10,0,0), new Tiempo(11,30,0),200);

		v.reservarAsiento("miguel", "11111111A");
		v.reservarAsiento("luis", "22222222B");
		v.reservarAsiento("pablo", "33333333C");
		
		v.reservarAsiento("VICTOR", "444444444D",'V');
		v.reservarAsiento("PATRICIA", "555555555D",'P');
		System.out.println(v);
	}
}
