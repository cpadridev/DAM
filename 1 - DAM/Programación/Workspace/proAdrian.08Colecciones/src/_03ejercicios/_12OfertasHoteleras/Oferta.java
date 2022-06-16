package _03ejercicios._12OfertasHoteleras;

public class Oferta {
	private Hotel hotel;
	private double precio;
	public Oferta(Hotel hotel, double precio) {
		this.hotel = hotel;
		this.precio = precio;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public double getPrecio() {
		return precio;
	}
	public String toString() {
		return hotel + " - " + precio + " euros";
	}
}
