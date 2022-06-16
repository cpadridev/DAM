package ejercicio4;

public class Oferta {
	private String hotel;
	private double precio;

	public Oferta(String hotel, double precio) {
		this.hotel = hotel;
		this.precio = precio;
	}

	public String getHotel() {
		return hotel;
	}

	public double getPrecio() {
		return precio;
	}
}
