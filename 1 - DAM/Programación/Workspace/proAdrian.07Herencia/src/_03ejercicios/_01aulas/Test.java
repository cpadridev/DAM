package _03ejercicios._01aulas;

public class Test {
	public static void main(String[] args) {
		Aula a = new Aula (1,10,14);
		System.out.println(a);
		
		AulaMusica am1 = new AulaMusica(2,10,14,false);
		AulaMusica am2 = new AulaMusica(3,10,14,true);
		System.out.println(am1);
		System.out.println(am2);
		
		AulaInformatica ai = new AulaInformatica(4, 10, 14, 10);
		System.out.println(ai);
	}
}
