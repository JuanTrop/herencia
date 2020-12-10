package com.clearminds.jsoa.herencia.interfaces;

import com.clearminds.jsoa.herencia.model.Persona;

public interface ServicioPersona {
	public abstract boolean insertar(Persona persona);
	public abstract boolean actualizar (Persona persona);
	public abstract boolean eliminar (Persona persona);
}
