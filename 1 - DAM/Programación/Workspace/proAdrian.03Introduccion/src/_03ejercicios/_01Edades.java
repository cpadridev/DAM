package _03ejercicios;

public class _01Edades {
	public static void main(String[] args) {
		int m = 21, j = 20, p = 19, v = 18;

		// Apartado a: Miguel menor de edad.
		boolean a = m < 18;
		System.out.println("Miguel menor de edad: " + a);

		// Apartado b: Miguel es mayor que Julio.
		boolean b = m > j;
		System.out.println("Miguel es mayor que Julio: " + b);

		// Apartado c: Miguel es el más viejo.
		boolean c = m < j && m < p && m < v;
		System.out.println("Miguel es el más viejo: " + c);

		// Apartado d: Miguel no es el más joven.
		boolean d = m > j || m > p || m > v;
				d = !(m < j || m < p || m < v);
		System.out.println("Miguel no es el más joven: " + d);

		// Apartado e: Miguel y Julio son menores de edad.
		boolean e = m < 18 && j < 18;
		System.out.println("Miguel y Julio son menores de edad: " + e);

		// Apartado f: Alguno de ellos es mayor de edad.
		boolean f = m >= 18 || j >= 18 || p >= 18 || v >= 18;
		System.out.println("Alguno de ellos es mayor de edad: " + f);

		// Apartado g: Miguel y Julio son los más jovenes.
		boolean g = m < p && m < v && j < p && j < v;
		System.out.println("Miguel y Julio son los más jovenes: " + g);

		// Apartado h: Entre todos tienen más de 100 años.
		boolean h = (m + j + p + v) > 100;
		System.out.println("Entre todos tienen más de 100 años: " + h);

		// Apartado i: Entre Miguel y Julio suman más edad que Pablo.
		boolean i = (m + j) > p;
		System.out.println("Entre Miguel y Julio suman más edad que Pablo: " + i);

		// Apartado j: Entre Miguel y Julio suman más edad que Pablo y Vicente juntos.
		boolean j1 = (m + j) > (p + v);
		System.out.println("Entre Miguel y Julio suman más edad que Pablo y Vicente juntos: " + j1);

		// Apartado k: Si los ordenamos por edades de menor a mayor, Julio es el segundo.
		boolean k = (p < j && v < j && m > j) || (m < j && v < j && p > j) || (m < j && p < j && v > j);
		System.out.println("Si los ordenamos por edades de menor a mayor, Julio es el segundo: " + k);

		// Apartado l: Al menos uno de ellos es menor de edad.
		boolean l = m < 18 || j < 18 || p < 18 || v < 18;
		System.out.println("Al menos uno de ellos es menor de edad: " + l);

		// Apartado m: Todos son menores de edad.
		boolean m1 = m < 18 && j < 18 && p < 18 && v < 18;
		System.out.println("Todos son menores de edad: " + m1);

		// Apartado n: Solo dos de ellos son menores de edad.
		boolean n = (m < 18 && j < 18) || (m < 18 && p < 18) || (m < 18 && v < 18) || (j < 18 && p < 18) || (j < 18 && v < 18) || (p < 18 && v < 18);
		System.out.println("Solo dos de ellos son menores de edad: " + n);

		// Apartado o: Al menos dos de ellos nacieron el mismo año.
		boolean o = m == j || m == p || m == v || j == p || j == v || p == v;
		System.out.println("Al menos dos de ellos nacieron el mismo año: " + o);

		// Apartado p: Al menos uno de ellos es menor que Julio.
		boolean p1 = m > j || p > j || v > j;
		System.out.println("Al menos uno de ellos es menor que Julio: " + p1);
	}
}
