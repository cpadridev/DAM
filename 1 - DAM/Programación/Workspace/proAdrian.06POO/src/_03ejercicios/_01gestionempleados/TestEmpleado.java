package _03ejercicios._01gestionempleados;

public class TestEmpleado {
	public static void main(String[] args) {
		Empleado e1 = new Empleado("juan","11111111A",2010,20000);
		Empleado e2 = new Empleado("miguel","22222222B",2020,10000);
		
		//Incrementar 20% sueldo del que menos cobre
		if(e1.getSueldo() < e2.getSueldo()) {
			e1.incrementarSueldo(20);
			//e1.setSueldo(e1.getSueldo () * 1.2);
		} else if(e1.getSueldo() > e2.getSueldo()) {
			e2.incrementarSueldo(20);
		}
		
		//Incrementar 10% sueldo del mas antiguo
		if(e1.antiguedad() > e2.antiguedad()) {
			e1.incrementarSueldo(10);
		} else if(e1.antiguedad() < e2.antiguedad()) {
			e2.incrementarSueldo(10);
		}
		
		//Incrementar 10% sueldo del mas antiguo (sin repetir calculos)
		int a1 = e1.antiguedad();
		int a2 = e2.antiguedad();
		if(a1 > a2) {
			e1.incrementarSueldo(10);
		} else if(a2 > a1) {
			e2.incrementarSueldo(10);
		}
		
		//Mostrar irpf de los dos empleados
		System.out.println(Empleado.calcularIRPF(e1.getSueldo() / 12));
		System.out.println(Empleado.calcularIRPF(e2.getSueldo() / 12));
		
		//Mostrar el ifpf que corresponde al doble de salario
		//de lo que cobra e1
		System.out.println(Empleado.calcularIRPF(2 * e1.getSueldo() / 12));
		
		
		
	}
}
