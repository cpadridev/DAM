package _03ejercicios._05televisores;

public class TVLCD extends Televisor {
	private int pixHor;
	private int pixVer;
	
	public TVLCD(String marca, String modelo, double precio, double pulgadas, int pixHor, int pixVer) {
		super(marca, modelo, precio, pulgadas);
		this.pixHor = pixHor;
		this.pixVer = pixVer;
	}

	@Override
	public String toString() {
		return "TVLCD [" + super.toString() + resolucion() + "]";
	}
	
	public String resolucion() {
		return pixHor + " x " + pixVer + " pixels";
	}
}
