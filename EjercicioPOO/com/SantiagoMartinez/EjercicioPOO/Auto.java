package com.SantiagoMartinez.EjercicioPOO;

public class Auto extends Vehiculo {

	private int puertas;
	
	public Auto (String marca, String modelo, String precio,int puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}
	
	@Override
	public void imprimir() {
		System.out.println("Marca: " + this.marca + " // Modelo: " + this.modelo + " // Puertas: " + this.puertas + " // Precio: $" + this.precio);
	}
}
