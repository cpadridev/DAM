package ejercicio3;

import java.util.Comparator;
import java.util.TreeSet;

public class Ejercicio3 {
	public static void main(String[] args) {
		TreeSet<Vehiculo> ts1 = new TreeSet<>();
		ts1.add(new Vehiculo("BCB3848", 1600));
		ts1.add(new Vehiculo("BBA3248", 1200));
		ts1.add(new Vehiculo("BBB1248", 1200));
		ts1.add(new Vehiculo("BAD4448", 1800));

		System.out.println("ts1: " + ts1);

		TreeSet<Vehiculo> ts2 = new TreeSet<>(new Comparator<Vehiculo>() {

			@Override
			public int compare(Vehiculo o1, Vehiculo o2) {
				if (o1.getCilindrada() == o2.getCilindrada()) {
					return o1.getMatricula().compareTo(o2.getMatricula());
				} else {
					return o1.getCilindrada() - o2.getCilindrada();
				}
			}

		});

		ts2.add(new Vehiculo("BCB3848", 1600));
		ts2.add(new Vehiculo("BBA3248", 1200));
		ts2.add(new Vehiculo("BBB1248", 1200));
		ts2.add(new Vehiculo("BAD4448", 1800));

		System.out.println("ts2: " + ts2);
	}
}
