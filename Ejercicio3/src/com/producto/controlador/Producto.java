package com.producto.controlador;

import com.calculadora.interfaz.Interfaz;

public class Producto  implements Interfaz{
	
	public static void main(String[] args) {
		Producto pro = new Producto();
		System.out.println("Producto enviado: "+nomproProducto);
		System.out.println("Categoria: "+categoria);
		System.out.println("El precio fue de: "+pro.calcularEnvio());
	}
	
	/*private double precio = 2.5;*/

	@Override
	public double calcularEnvio() {
		return precio;
		
	}
	
}
