package com.clearminds.jsoa.herencia.impl;

import com.clearminds.jsoa.herencia.exception.InstanceException;
import com.clearminds.jsoa.herencia.interfaces.ServicioPersona;
import com.clearminds.jsoa.herencia.model.Persona;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager() throws InstanceException {
		try {
		Class<?> clase =Class.forName("com.clearminds.jsoa.herencia.impl.ServicioPersonaBDD");
		serv = (ServicioPersonaBDD)clase.newInstance();
		} catch(Exception e){
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersonaBDD");
		}
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
}
