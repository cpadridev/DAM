package _03ejercicios._05televisores;

public class TestTV {
	public static void main(String[] args) {
		TVTubo t1 = new TVTubo("LG", "White", 50, 20.2, 600);
		TVLCD t2 = new TVLCD("SAMSUNG", "LED", 100, 26, 1920, 1080);
		
		System.out.println(t1);
		System.out.println(t2);
	}
}
