package com.clearminds.jsoa.herencia.impl;

import com.clearminds.jsoa.herencia.interfaces.ServicioPersona;
import com.clearminds.jsoa.herencia.model.Persona;

public class ServicioPersonaBDD implements ServicioPersona{

	public boolean insertar(Persona persona) {
		System.out.println("Insertando persona en base de datos");
		return false;
	}

	public boolean actualizar(Persona persona) {
		System.out.println("Actualizando persona en base de datos");
		return false;
	}

	public boolean eliminar(Persona persona) {
		System.out.println("Eliminando persona en base de datos");
		return false;
	}
	
}