package com.SantiagoMartinez.EjercicioPOO.Main;
import com.SantiagoMartinez.EjercicioPOO.*;
import java.util.List;
public class Program {
//El main solo se encarga de instanciar Garage e invocar sus métodos
	public static void main(String[] args) {
		Garage garage = new Garage();
		garage.agregar("Peugeot","206", "200.000,00", 4);
		garage.agregar("Honda","Titan", "60.000,00", "125cc");
		garage.agregar("Peugeot","208", "250.000,00", 5);
		garage.agregar("Yamaha","YBR", "80.500,50", "160cc");
		garage.listar();
		garage.ordenarListar();
	}

}
