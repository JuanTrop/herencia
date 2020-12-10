package com.clearminds.jsoa.herencia.test;

import com.clearminds.jsoa.herencia.impl.PersonaManager;
import com.clearminds.jsoa.herencia.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona = new Persona("Juan", 23, "Turbaco");
		PersonaManager pmanager = new PersonaManager();
		pmanager.insertarPersona(persona); //Debe imprimir el mensaje de insertar en 
	}

}
