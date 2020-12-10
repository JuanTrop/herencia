package com.clearminds.jsoa.herencia.impl;

import com.clearminds.jsoa.herencia.interfaces.ServicioPersona;
import com.clearminds.jsoa.herencia.model.Persona;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager(){
		serv = new ServicioPersonaBDD();
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
}
