package com.clearminds.jsoa.herencia.model;

public class Persona {
	private String nombre;
	private int edad;
	private String direccion;
	public Persona(String nombre, int edad, String direccion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + "]";
	}
	
	
}
