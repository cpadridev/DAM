package _02ejemplos._05ordenacion;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] v = {6, 2, 1, 20, 40, 8};
		Ordenacion.ordenar(v);
		System.out.println(Arrays.toString(v));
		
		double v2[] = {20.5, 12.3, 18.4};
		Ordenacion.ordenar(v2);
		System.out.println(Arrays.toString(v2));

		String v3[] = {"casa","coche","armario"};
		Ordenacion.ordenar(v3);
		System.out.println(Arrays.toString(v3));
		
		Vehiculo v4[] = {
				new Vehiculo("4348BBC","Seat","Ibiza"),
				new Vehiculo("1122BBD","Opel","Vectra"),
				new Vehiculo("2233CDF","Citroen","C3"),
		};
		Ordenacion.ordenar(v4);
		System.out.println(Arrays.toString(v4));
	}

}
