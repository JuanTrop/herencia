package com.clearminds.jsoa.herencia.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.clearminds.jsoa.herencia.exception.InstanceException;
import com.clearminds.jsoa.herencia.interfaces.ServicioPersona;
import com.clearminds.jsoa.herencia.model.Persona;

public class PersonaManager {
	
	private ServicioPersona serv;
	
	public PersonaManager(String implementacion) throws InstanceException {
		try {
		if(implementacion.equalsIgnoreCase("implemetacion2")){
		Class<?> clase =Class.forName(seleccionar(new FileReader("config.properties"), implementacion));
		serv = (ServicioPersonaArchivos)clase.newInstance();
		} else {
			Class<?> clase =Class.forName(seleccionar(new FileReader("config.properties"), implementacion));
			serv = (ServicioPersonaBDD)clase.newInstance();
		}
		} catch(Exception e){
			e.printStackTrace();
			throw new InstanceException("Error al obtener una instancia de ServicioPersonaBDD");
		}
	}
	
	public void insertarPersona(Persona persona){
		serv.insertar(persona);
	}
	
	//Metodo para obtener implementacion de archivo de configuraciones
	public String seleccionar(FileReader fr, String implementacion){
		String implementaciones = null;
		BufferedReader b = new BufferedReader(fr);
		
		try {
		String linea;
		while((linea = b.readLine()) != null){
			String[] propiedad = linea.split(":",2);
			System.out.println(propiedad[0]);
			if(propiedad[0].equalsIgnoreCase(implementacion))
			implementaciones = propiedad[1];
			return implementaciones;
		}
		} catch(IOException e){
			e.printStackTrace();
		}
		
		return null;
	}
}
