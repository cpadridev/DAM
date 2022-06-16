package _03ejercicios._01conjunto;

import java.util.ArrayList;

public class TestConjunto {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<>();
		l.add("a");
		l.add("b");
		
		Conjunto<String> c = new Conjunto(l);
		System.out.println(c);
	}
}
