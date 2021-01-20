package com.SantiagoMartinez.EjercicioPOO;

//Vehiculo es superclase abstracta de Moto y Auto. Contiene atributos en común
//y un método de parseo para el atributo "precio", ya que para una fácil representación
//del precio con puntos y comas como en la consigna decidí representarlo en un campo
//"String" y luego parsear ese campo a la hora de realizar calculos comparativos.

public abstract class Vehiculo {
	
	protected String marca;
	protected String modelo;
	protected String precio;
	
		
	public Vehiculo(String marca, String modelo, String precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	//método abstracto que sobreescriben las subclases para imprimir por consola
	//sus atributos
	public abstract void imprimir();
	
	public double parseo() {
		String precioAux = this.precio.replace(".", "");
		String precioAux2 = precioAux.replace(",", ".");
		
		double precioDouble = Double.parseDouble(precioAux2);
		return precioDouble;
	}
}
