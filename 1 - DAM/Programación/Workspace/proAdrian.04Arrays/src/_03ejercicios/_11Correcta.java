package _03ejercicios;

public class _11Correcta {
	public static void main(String[] args) {
		int[] v = { 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 2 };
		
		System.out.println(haypares(v));
	}
	
	public static boolean haypares (int v[]) {
		int par = 0;
		
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				par++;
				break;
			}
		}
		
		if (par == 1) {
			return true;
		} else {
			return false;
		}
	}
}
