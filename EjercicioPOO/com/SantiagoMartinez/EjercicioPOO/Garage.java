package com.SantiagoMartinez.EjercicioPOO;
import java.util.ArrayList;
import java.util.List;

import com.SantiagoMartinez.EjercicioPOO.Vehiculo;

//La clase Garage manejará los métodos de ordenamiento y el almacenamiento de todos
//los objetos clase Vehículo en un ArrayList, a la vez que tambíen se encarga del
//instanciamiento de los mismos. Todo esto tiene el fin de aplicar una patrón de
//diseño Factory para descongestionar lo más posible a la clase Main y especializar
//eficientemente el proyecto en capas.
public class Garage {
	
	private ArrayList<Vehiculo> vehiculos;
	
	//constructor con instanciamiento de la lista
	public Garage () {
		this.vehiculos = new ArrayList<Vehiculo>();
	}
	
	//Métodos agregar, que instancian el Vehículo en Auto o Moto dependiendo de los
	//parametros ingresados.
	public void agregar(String marca, String modelo, String precio, String cilindrada) {
		Vehiculo moto = new Moto(marca,modelo,precio,cilindrada);
		this.vehiculos.add(moto);
	}
	
	public void agregar(String marca, String modelo, String precio, int puertas) {
		Vehiculo auto = new Auto(marca,modelo,precio,puertas);
		this.vehiculos.add(auto);
	}
	
	private static String separador = "=============================";
	
	//método listar, imprimer el ArrayList
	public void listar() {
		for (Vehiculo vehiculo: this.vehiculos) {
			vehiculo.imprimir();
			
		}
		System.out.println(separador);
	}
	//Método ordenarListar. Mediante Bubble Sort organizo el ArrayList de mayor a menor,
	
	 public void ordenarListar() {  
	        int n = this.vehiculos.size();  
	        Vehiculo temp = null;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(this.vehiculos.get(j-1).parseo() < this.vehiculos.get(j).parseo()){  
	                                 temp = this.vehiculos.get(j-1);  
	                                 this.vehiculos.set(j-1, this.vehiculos.get(j));
	                                 this.vehiculos.set(j, temp);	                                
	                         }  	                          
	                 }  
	         }  
	         //Diferencio entre más caro y más barato de acuerdo al índice de
	         //cada elemento en el array ordenado
	         Vehiculo mayor = this.vehiculos.get(0);
	         Vehiculo menor = this.vehiculos.get(n-1);
	         Vehiculo y = null;
	         //Si un Vehículo contiene "y" en el modelo, lo almaceno
	         for (Vehiculo vehiculoAux: this.vehiculos) {	        	
	 			if ( vehiculoAux.modelo.toLowerCase().indexOf("y")!= -1) {
	 				y = vehiculoAux;
	 			}
	 			
	 			
	 		}
	         System.out.println("Vehículo más caro: " + mayor.marca + " " + mayor.modelo);
	         System.out.println("Vehículo más barato: " + menor.marca  + " " + menor.modelo);
	         System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "
	         + y.marca + " " + y.modelo + " $" + y.precio);
	 		 System.out.println(separador);	         
	         System.out.println("Vehículos ordenados por precio de mayor a menor:");
	         for (Vehiculo vehiculo: this.vehiculos) {
	 			System.out.println(vehiculo.marca + " " + vehiculo.modelo);
	 			
	 		}
	    }  
	
	
}
