package com.clearminds.jsoa.herencia.test;

import com.clearminds.jsoa.herencia.exception.InstanceException;
import com.clearminds.jsoa.herencia.impl.PersonaManager;
import com.clearminds.jsoa.herencia.model.Persona;

public class TestManager {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Juan", 23, "Turbaco");
		PersonaManager pmanager;
		try {
			pmanager = new PersonaManager();
			pmanager.insertarPersona(persona); //Debe imprimir el mensaje de insertar en 
		} catch (InstanceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
