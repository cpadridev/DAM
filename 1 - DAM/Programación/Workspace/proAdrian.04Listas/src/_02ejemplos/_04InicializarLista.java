package _02ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _04InicializarLista {
	public static void main(String[] args) {
		Scanner tec = new Scanner("20 30 40");

		System.out.println("Introduce numero");
		int num = tec.nextInt();

		System.out.println(num);

		num = tec.nextInt();

		System.out.println(num);

		num = tec.nextInt();

		System.out.println(num);

		ArrayList<String> l1 = new ArrayList<>(10);

		l1.add("luis");
		l1.add("pablo");
		l1.add("vicente");

		System.out.println(l1);

		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("luis", "pablo", "vicente"));

		System.out.println(l2);

		String v[] = { "a", "b" };

		ArrayList<String> l3 = new ArrayList<>(Arrays.asList(v));
	}
}
